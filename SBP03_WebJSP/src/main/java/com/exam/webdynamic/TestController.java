package com.exam.webdynamic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
		@RequestMapping("/test")
		public  String test() {
			return "test";
		}
			@RequestMapping("/sample")
			public String sample() {
				return "subDir/sample";
			}
				
				
//			public String index() {
//				return "index";
//			}
}
