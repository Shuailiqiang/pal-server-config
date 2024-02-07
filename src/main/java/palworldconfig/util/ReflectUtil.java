package palworldconfig.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

public class ReflectUtil {

	private static final Logger logger = LoggerFactory.getLogger(ReflectUtil.class);
	private static ReflectUtil instance = new ReflectUtil();

	private ReflectUtil() {

	}

	public static ReflectUtil getInstance() {
		return instance;
	}

	/**
	 * 根据方法名获得Method对象，注意，前提条件是方法不能重载
	 *
	 * @param aClass
	 * @param methodName
	 * @return
	 */
	public Method getMethodByName(Class aClass, String methodName) {
		if (methodName == null || "".equals(methodName.trim()) || aClass == null) {
			throw new NullPointerException();
		}

		Method[] methods = aClass.getMethods();
		for (Method method : methods) {
			if (methodName.equals(method.getName())) {
				return method;
			}
		}
		return null;
	}

	public Object getProperty(Object target, int num) {
		return getProperty(target, target.getClass().getDeclaredFields()[num].getName());
	}

	public Object getProperty(Object target, String propertyName) {
		String getterMethodName = "get" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
		try {
			Method getterMethod = getMethodByName(target.getClass(), getterMethodName);
			Object propertyValue = getterMethod.invoke(target, new Object[]{});
			return propertyValue;
		} catch (Exception e) {
			logger.info(e.getClass().getName() + " occured during call " + getterMethodName, e);
			return null;
		}
	}

	public void setProperty(Object target, String propertyName, String propertyValue) throws Exception {
		String setterMethodName = "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
		Method setterMethod = getMethodByName(target.getClass(), setterMethodName);
		if (setterMethod == null) {
			throw new Exception("在类" + target.getClass().getName() + "中未找到方法" + setterMethodName);
		}
		Class[] parameterTypes = setterMethod.getParameterTypes();
		Class propertyType = parameterTypes[0];

		Object propertyValueObj = null;
		if (propertyType.equals(String.class)) {
			propertyValueObj = propertyValue;
		} else if (propertyType.equals(BigDecimal.class)) {
			propertyValueObj = new BigDecimal(propertyValue);
			if (propertyValueObj == null) {
				propertyValueObj = BigDecimal.ZERO;
			}
		} else if (propertyType.equals(Integer.class)) {
			if (StringUtil.isNotEmpty(propertyValue)) {
				if (propertyValue.contains(".")) {
					propertyValue = propertyValue.split("\\.")[0];
				}
				propertyValueObj = Integer.parseInt(propertyValue);
			}
		} else if (propertyType.equals(Boolean.class)) {
			if (StringUtil.isNotEmpty(propertyValue)) {
				if ("false".equals(propertyValue) || "False".equals(propertyValue) || "FALSE".equals(propertyValue) || "N".equals(propertyValue)) {
					propertyValueObj = false;
				} else {
					propertyValueObj = true;
				}
			}
		}

		try {
			setterMethod.invoke(target, propertyValueObj);
		} catch (Exception e) {
			logger.info(e.getClass().getName() + " occured during call (" + setterMethodName + "," + propertyValueObj + ")", e);
		}
	}

	public void setPropertyList(Object target, String propertyName, List list) {
		String setterMethodName = "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
		Method setterMethod = getMethodByName(target.getClass(), setterMethodName);

		try {
			setterMethod.invoke(target, list);
		} catch (Exception e) {
			logger.info(e.getClass().getName() + " occured during call (" + setterMethodName + "," + list + ")", e);
		}
	}

}
