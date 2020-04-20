package base.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import base.model.LoginForm;
import base.model.Staff;
import base.model.UserInfoForm;
import base.service.StaffService;

@Controller
public class LoginController {
	@Autowired StaffService staffService;

	@RequestMapping("/login")
	private String login(Model model) {
		return "login";
	}

	@RequestMapping({ "/", "/auth" })
	private String auth(Model model) {
		return "success";
	}

	@RequestMapping("/error/400")
	private void missingParameter() throws MissingServletRequestParameterException {
		throw new MissingServletRequestParameterException("parameter error", "Missing request parameter");
	}


	@RequestMapping("/loginCheck")
	private String loginCheck(@ModelAttribute("loginForm") LoginForm loginForm, Model model, HttpServletRequest request, HttpServletResponse response) {
		//--------------------------------------------
		// 検索処理
		//--------------------------------------------
		Staff staff = staffService.select(loginForm.getUserId(), loginForm.getPassword());

		if (staff == null) {
			model.addAttribute("msg", "ユーザーID又はパスワードが違います。");
			return "login";
		}
		HttpSession session = request.getSession();
		session.setAttribute("role", staff.getRole());

		UserInfoForm form = new UserInfoForm();
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
		model.addAttribute("role", session.getAttribute("role").toString());

		return "userInfo";
	}

}
