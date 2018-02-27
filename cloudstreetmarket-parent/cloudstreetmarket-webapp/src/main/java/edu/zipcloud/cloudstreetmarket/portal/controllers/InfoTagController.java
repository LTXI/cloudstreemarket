package edu.zipcloud.cloudstreetmarket.portal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ltx
 * @创建时间：2018年2月27日下午9:22:43
 */
@Controller
@RequestMapping("/info")
public class InfoTagController {
	public String helloController() {
		return "hello";
	}

}
