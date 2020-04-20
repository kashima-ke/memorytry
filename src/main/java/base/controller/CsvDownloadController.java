package base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import base.model.StaffAddForm;

@Controller
public class CsvDownloadController {

	@RequestMapping("/download")
	private String index(@ModelAttribute("staffAddForm") StaffAddForm form, Model model, HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		model.addAttribute("role", session.getAttribute("role").toString());

		return "csvDownload";
	}

}
