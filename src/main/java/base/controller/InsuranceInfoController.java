package base.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import base.model.CustomerInfo;
import base.model.InsuranceInfoForm;
import base.service.InsuranceInfoService;

@Controller
public class InsuranceInfoController {
	@Autowired InsuranceInfoService insuranceInfoService;

	@RequestMapping("/insuranceInfo")
	private String index(@ModelAttribute("insuranceInfoForm") InsuranceInfoForm form, Model model, HttpServletRequest request, HttpServletResponse response) {
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
		return "insuranceInfo";
	}

	@RequestMapping("/insuranceInfoSearch")
	private String disp(@ModelAttribute("insuranceInfoForm") InsuranceInfoForm form, Model model, HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		model.addAttribute("role", session.getAttribute("role").toString());

		//--------------------------------------------
		// 検索処理
		//--------------------------------------------
		List<CustomerInfo> dataList = insuranceInfoService.select(form.getName(), form.getHokenId(), form.getCompany(),
				form.getPhone(), form.getMailAddress());

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

		return "insuranceInfo";
	}
}
