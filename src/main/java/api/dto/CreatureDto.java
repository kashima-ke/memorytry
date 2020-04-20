package api.dto;

import java.util.List;

public class CreatureDto {
	 //プロパティ
	   private List<String> name;
	   private List<String> type;
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public List<String> getType() {
		return type;
	}
	public void setType(List<String> type) {
		this.type = type;
	}

}