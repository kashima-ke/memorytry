package base.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import base.model.CustomerInfo;
import base.model.UserInfoForm;
import base.service.CustomerInfoService;
import base.service.OnseiRecordService;

@Controller
public class UserInfoController {
	@Autowired CustomerInfoService customerInfoService;
	@Autowired OnseiRecordService onseiRecordService;

	@RequestMapping("/userInfo")
	private String index(@ModelAttribute("userInfoForm") UserInfoForm form, Model model, HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		model.addAttribute("role", session.getAttribute("role").toString());

		form.setCheckUserId("1");
		form.setCheckName("1");
		form.setCheckKana("1");
		form.setCheckHokenId("1");
		form.setCheckPhone("1");
		form.setCheckBirthday("1");
		form.setCheckOnseiWait("1");
		form.setCheckApplication("1");
		form.setCheckOnseiRelease("1");

		model.addAttribute("form", form);
		return "userInfo";
	}

	@RequestMapping("/userInfoSearch")
	private String disp(@ModelAttribute("userInfoForm") UserInfoForm form, Model model, HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		model.addAttribute("role", session.getAttribute("role").toString());


		String birthday = "";
		if (form.getBirthday() != null && !StringUtils.isEmpty(form.getBirthday())) {
			birthday = form.getBirthday().replaceAll("-", "");
		}

		//--------------------------------------------
		// 検索処理
		//--------------------------------------------
		List<CustomerInfo> dataList = customerInfoService.select(form.getName(), form.getUserId(), form.getKana(), form.getHokenId(),
				form.getPhone(), birthday, form.getOnseiWait(), form.getApplication(), form.getOnseiRelease());

		List<CustomerInfo> customerInfoList = new ArrayList<CustomerInfo>();
		for (CustomerInfo data : dataList) {
			CustomerInfo customerInfo = new CustomerInfo();
			customerInfo.setId(data.getId());
			customerInfo.setCharName(data.getCharName());
			customerInfo.setKanaName(data.getKanaName());
			customerInfo.setInsuranceId(data.getInsuranceId());
			customerInfo.setPhoneNum(data.getPhoneNum());
			customerInfo.setBirth(data.getBirth());
			String onseiWait = "";
			if (data.getOnseiWait() != null && "1".equals(data.getOnseiWait().toString())) {
				onseiWait = "〇";
			}
			customerInfo.setOnseiWait(onseiWait);

			String applicationLock = "";
			if (data.getApplicationLock() != null && "1".equals(data.getApplicationLock().toString())) {
				applicationLock = "〇";
			}
			customerInfo.setApplicationLock(applicationLock);

			String onseiRelease = "";
			if (data.getOnseiReleas() != null && "1".equals(data.getOnseiReleas().toString())) {
				onseiRelease = "〇";
			}
			customerInfo.setOnseiReleas(onseiRelease);
			customerInfoList.add(customerInfo);
		}


		model.addAttribute("list", customerInfoList);
		model.addAttribute("form", form);

		return "userInfo";
	}

	@RequestMapping("/userDetail")
	private String detail(@ModelAttribute("userInfoForm") UserInfoForm form, Model model, String id, HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		model.addAttribute("role", session.getAttribute("role").toString());

		//--------------------------------------------
		// 検索処理
		//--------------------------------------------
		CustomerInfo data = customerInfoService.selectOne(id);

		model.addAttribute("form", data);

		return "userDetail";

	}


	@RequestMapping("/userDetailUpdate")
	private String update(@ModelAttribute("userInfoForm") UserInfoForm form, Model model, HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		model.addAttribute("role", session.getAttribute("role").toString());

		String onseiWait = "0";
		if (form.getOnseiWait() != null && !StringUtils.isEmpty(form.getOnseiWait())) {
			onseiWait = "1";
		}

		String lock = "0";
		if (form.getApplication() != null && !StringUtils.isEmpty(form.getApplication())) {
			lock = "1";
		}

		String onseiRelease = "0";
		if (form.getOnseiRelease() != null && !StringUtils.isEmpty(form.getOnseiRelease())) {
			onseiRelease = "1";
		}

		String finishFlg = "0";
		if (form.getFinishFlg() != null && !StringUtils.isEmpty(form.getFinishFlg())) {
			finishFlg = "1";
		}

		//--------------------------------------------
		// 更新処理
		//--------------------------------------------
		customerInfoService.update(form.getUserId(), onseiWait, lock, onseiRelease);

		//--------------------------------------------
		// 登録処理
		//--------------------------------------------
		onseiRecordService.insert(form.getUserId(), finishFlg, form.getContent());

		//--------------------------------------------
		// 検索処理
		//--------------------------------------------
		CustomerInfo data = customerInfoService.selectOne(form.getUserId());

		model.addAttribute("form", data);

		return "userDetail";

	}
}
