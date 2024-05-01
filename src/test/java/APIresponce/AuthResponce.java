package APIresponce;

public class AuthResponce {
public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getValidaty() {
		return validaty;
	}
	public void setValidaty(String validaty) {
		this.validaty = validaty;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGuidId() {
		return guidId;
	}
	public void setGuidId(String guidId) {
		this.guidId = guidId;
	}
	public String getExpiredTime() {
		return expiredTime;
	}
	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}
protected String token;
protected String userName;
protected String validaty;
protected String refreshToken;
protected String id;
protected String emailId;
protected String guidId;
protected String expiredTime;
}
