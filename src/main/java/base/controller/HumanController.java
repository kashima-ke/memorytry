package base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import api.dto.CreatureDto;
import base.service.StaffService;
@RestController
@RequestMapping("/human")
public class HumanController {
	@Autowired StaffService staffService;
	private static final String KAISHA_CD = "000001";
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST)
	private CreatureDto getHuman(@RequestBody CreatureDto creature) throws Exception{

		//判別結果を入れるリストを作成。
//		List<CreatureDto> resultList = new ArrayList<CreatureDto>();

		//人間かどうかを判定するプログラムを記述
		//・・・
//		for(int i = 0; i < creature.size(); ++i){
//		 	if (creature.get(i).getType().equals("human")) {
//		  		resultList.add(creature.get(i));
//		  	}
//		 }

//		return resultList;
		return creature;
	}


}
