package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**页面跳转Controller*/
@Controller
public class PageController {

	/**后台首页http://localhost:8080/taotao/ */
	@RequestMapping("/")
	public String showIndex() {
		return "houtai/index";
	}
	/**请求和页面的名称一致.可以统一处理 http://localhost:8080/taotao/{page} */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return "houtai/"+page;
	}
}
