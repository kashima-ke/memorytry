/**
 *
 */
package base.model;

@lombok.Data
public class InsuranceInfoForm {
	private String name;
	private String hokenId;
	private String company;
	private String phone;
	private String mailAddress;
	private String dispFlg;
	private String checkUserId;
	private String checkName;
	private String checkKana;
	private String checkHokenId;
	private String checkPhone;
	private String checkBirthday;
	private String checkOnseiWait;
	private String checkApplication;
	private String checkOnseiRelease;
	public String getCheckUserId() {
		return checkUserId;
	}
	public void setCheckUserId(String checkUserId) {
		this.checkUserId = checkUserId;
	}
	public String getCheckName() {
		return checkName;
	}
	public void setCheckName(String checkName) {
		this.checkName = checkName;
	}
	public String getCheckKana() {
		return checkKana;
	}
	public void setCheckKana(String checkKana) {
		this.checkKana = checkKana;
	}
	public String getCheckHokenId() {
		return checkHokenId;
	}
	public void setCheckHokenId(String checkHokenId) {
		this.checkHokenId = checkHokenId;
	}
	public String getCheckPhone() {
		return checkPhone;
	}
	public void setCheckPhone(String checkPhone) {
		this.checkPhone = checkPhone;
	}
	public String getCheckBirthday() {
		return checkBirthday;
	}
	public void setCheckBirthday(String checkBirthday) {
		this.checkBirthday = checkBirthday;
	}
	public String getCheckOnseiWait() {
		return checkOnseiWait;
	}
	public void setCheckOnseiWait(String checkOnseiWait) {
		this.checkOnseiWait = checkOnseiWait;
	}
	public String getCheckApplication() {
		return checkApplication;
	}
	public void setCheckApplication(String checkApplication) {
		this.checkApplication = checkApplication;
	}
	public String getCheckOnseiRelease() {
		return checkOnseiRelease;
	}
	public void setCheckOnseiRelease(String checkOnseiRelease) {
		this.checkOnseiRelease = checkOnseiRelease;
	}
	private String msg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHokenId() {
		return hokenId;
	}
	public void setHokenId(String hokenId) {
		this.hokenId = hokenId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getDispFlg() {
		return dispFlg;
	}
	public void setDispFlg(String dispFlg) {
		this.dispFlg = dispFlg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
