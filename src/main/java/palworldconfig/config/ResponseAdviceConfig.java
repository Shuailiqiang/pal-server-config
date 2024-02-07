package palworldconfig.config;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.ResponseEntity;
import palworldconfig.model.ResponseCommonVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice
public class ResponseAdviceConfig implements ResponseBodyAdvice<Object> {


	private final Logger logger = LoggerFactory.getLogger(ResponseAdviceConfig.class);

	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		return true;
	}

	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
		String result = "";
		if (body == null) {
			result = "";
		} else if (body instanceof ResponseCommonVo) {
			String jsonString = JSONObject.toJSONString(body);
			logger.info("responseBody ===> " + jsonString);
			return jsonString;
		} else if (body instanceof JSONObject) {
			result = ((JSONObject) body).toString();
		} else {
			result = JSONObject.toJSON(body).toString();
		}

		ResponseCommonVo responseBody = new ResponseCommonVo();
		responseBody.setCode("0");
		responseBody.setResult(result);
		String jsonString = JSONObject.toJSONString(responseBody);
		logger.info("responseBody ===> " + jsonString);
		return jsonString;
	}


	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseCommonVo exceptionHandler(Exception e) {
		logger.error(e.getMessage(), e);

		StringBuffer sb = new StringBuffer(e.getMessage());
		for (StackTraceElement traceElement : e.getStackTrace()) {
			sb.append("\n\tat " + traceElement);
		}

		ResponseCommonVo responseBody = new ResponseCommonVo();
		responseBody.setCode("-1");
		responseBody.setResult(e.getMessage());
		responseBody.setStackTrace(sb.toString());
		return responseBody;
	}
}
