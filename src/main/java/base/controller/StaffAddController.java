package base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import base.model.StaffAddForm;
import base.service.StaffService;

@Controller
public class StaffAddController {
	@Autowired StaffService staffService;

	@RequestMapping("/staff")
	private String index(@ModelAttribute("staffAddForm") StaffAddForm form, Model model, HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		model.addAttribute("role", session.getAttribute("role").toString());

		return "staffAdd";
	}


	@RequestMapping("/staffAdd")
	private String disp(@ModelAttribute("staffAddForm") StaffAddForm form, Model model, HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		model.addAttribute("role", session.getAttribute("role").toString());

		//--------------------------------------------
		// 登録処理
		//--------------------------------------------
		staffService.insert(form.getName(), form.getUserId(), form.getPassword(), form.getRole());

		model.addAttribute("msg", "登録しました。");

		return "staffAdd";
	}
}
