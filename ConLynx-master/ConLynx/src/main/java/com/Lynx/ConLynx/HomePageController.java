package com.Lynx.ConLynx;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomePageController {

	// ConLynx - Your One Stop Shop For All Your Conference Paper Needs

	@GetMapping(value = { "/homePage", "/", " " })
	// public String greeting(Model model) {
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "Hello") String name,
			Model model) {
		model.addAttribute("name", name);
		return "homePage";
	}

}
