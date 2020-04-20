/**
 *
 */
package base.model;

@lombok.Data
public class UserInfoForm {
	private String name;
	private String userId;
	private String kana;
	private String hokenId;
	private String phone;
	private String birthday;
	private String onseiWait;
	private String application;
	private String onseiRelease;
	private String checkUserId;
	private String checkName;
	private String checkKana;
	private String checkHokenId;
	private String checkPhone;
	private String checkBirthday;
	private String checkOnseiWait;
	private String checkApplication;
	private String checkOnseiRelease;
	private String hiddenUserId;
	private String content;
	private String finishFlg;


	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFinishFlg() {
		return finishFlg;
	}
	public void setFinishFlg(String finishFlg) {
		this.finishFlg = finishFlg;
	}
	public String getHiddenUserId() {
		return hiddenUserId;
	}
	public void setHiddenUserId(String hiddenUserId) {
		this.hiddenUserId = hiddenUserId;
	}
	private String msg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getKana() {
		return kana;
	}
	public void setKana(String kana) {
		this.kana = kana;
	}
	public String getHokenId() {
		return hokenId;
	}
	public void setHokenId(String hokenId) {
		this.hokenId = hokenId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getOnseiWait() {
		return onseiWait;
	}
	public void setOnseiWait(String onseiWait) {
		this.onseiWait = onseiWait;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getOnseiRelease() {
		return onseiRelease;
	}
	public void setOnseiRelease(String onseiRelease) {
		this.onseiRelease = onseiRelease;
	}
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
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
