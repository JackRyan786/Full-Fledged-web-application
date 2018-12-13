package com.learncodingwithjack.Controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(name = "sanjay", path = "/sanjay")
public class WelcomeController {

	@RequestMapping(path = "/chauhan")
	public ModelAndView getServletName(String name, HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		System.out.println("just entered in home controller.");

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("sanjay", "you just successed !");

		modelAndView.setViewName("sanjay");
		return modelAndView;
	}

}
