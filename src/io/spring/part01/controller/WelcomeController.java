package io.spring.part01.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome(Model model) {
		Date today = new Date();
		model.addAttribute("today", today);
		return "welcome";
	}
}
