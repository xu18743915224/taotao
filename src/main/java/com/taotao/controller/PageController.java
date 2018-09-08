package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**ҳ����תController*/
@Controller
public class PageController {

	/**��̨��ҳhttp://localhost:8080/taotao/ */
	@RequestMapping("/")
	public String showIndex() {
		return "houtai/index";
	}
	/**�����ҳ�������һ��.����ͳһ���� http://localhost:8080/taotao/{page} */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return "houtai/"+page;
	}
}
