package palworldconfig.model.exp;

public class BizException extends Exception{
	private String errCode;
	private String message;

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public BizException() {
		super();
		this.errCode = "-1";
	}

	public BizException(String message) {
		super(message);
		this.errCode = "-1";
		this.message = message;
	}
	public BizException(String errCode, String message) {
		super(message);
		this.errCode = errCode;
		this.message = message;
	}
}
