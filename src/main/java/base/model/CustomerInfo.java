/**
 *
 */
package base.model;

@lombok.Data
public class CustomerInfo {
	private String id;
	private String insuranceId;
	private String charName;
	private String kanaName;
	private String phoneNum;
	private String birth;
	private String onseiWait;
	private String applicationLock;
	private String onseiReleas;
	private String emergencyPhoneNum;
	private String emergencyCharName;
	private String token;
	private String smsNum;

	private String insCompany;
	private String insCharName;
	private String insPhoneNum;
	private String insMail;

	public String getInsCompany() {
		return insCompany;
	}
	public void setInsCompany(String insCompany) {
		this.insCompany = insCompany;
	}
	public String getInsCharName() {
		return insCharName;
	}
	public void setInsCharName(String insCharName) {
		this.insCharName = insCharName;
	}
	public String getInsPhoneNum() {
		return insPhoneNum;
	}
	public void setInsPhoneNum(String insPhoneNum) {
		this.insPhoneNum = insPhoneNum;
	}
	public String getInsMail() {
		return insMail;
	}
	public void setInsMail(String insMail) {
		this.insMail = insMail;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(String insuranceId) {
		this.insuranceId = insuranceId;
	}
	public String getCharName() {
		return charName;
	}
	public void setCharName(String charName) {
		this.charName = charName;
	}
	public String getKanaName() {
		return kanaName;
	}
	public void setKanaName(String kanaName) {
		this.kanaName = kanaName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getOnseiWait() {
		return onseiWait;
	}
	public void setOnseiWait(String onseiWait) {
		this.onseiWait = onseiWait;
	}
	public String getApplicationLock() {
		return applicationLock;
	}
	public void setApplicationLock(String applicationLock) {
		this.applicationLock = applicationLock;
	}
	public String getOnseiReleas() {
		return onseiReleas;
	}
	public void setOnseiReleas(String onseiReleas) {
		this.onseiReleas = onseiReleas;
	}
	public String getEmergencyPhoneNum() {
		return emergencyPhoneNum;
	}
	public void setEmergencyPhoneNum(String emergencyPhoneNum) {
		this.emergencyPhoneNum = emergencyPhoneNum;
	}
	public String getEmergencyCharName() {
		return emergencyCharName;
	}
	public void setEmergencyCharName(String emergencyCharName) {
		this.emergencyCharName = emergencyCharName;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getSmsNum() {
		return smsNum;
	}
	public void setSmsNum(String smsNum) {
		this.smsNum = smsNum;
	}
}
