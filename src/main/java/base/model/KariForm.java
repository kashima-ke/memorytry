/**
 *
 */
package base.model;

@lombok.Data
public class KariForm {
	private String shozoku;
	private String kari_status;
	private String sei_status;
	private String userId;
	private String password;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getShozoku() {
		return shozoku;
	}
	public void setShozoku(String shozoku) {
		this.shozoku = shozoku;
	}
	public String getKari_status() {
		return kari_status;
	}
	public void setKari_status(String kari_status) {
		this.kari_status = kari_status;
	}
	public String getSei_status() {
		return sei_status;
	}
	public void setSei_status(String sei_status) {
		this.sei_status = sei_status;
	}
}
