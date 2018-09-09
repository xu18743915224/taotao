package com.taotao.controller.houTai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.dto.EasyUIDataGridResult;
import com.taotao.service.ItemService;

/**页面跳转Controller*/
@Controller
public class PageController {
	
	/**后台首页http://localhost:8080/ */
	@RequestMapping("/")
	public String showIndex() {
		return "houtai/index";
	}
	/**后台首页--请求和页面的名称一致.可以统一处理 http://localhost:8080/{page} */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return "houtai/"+page;
	}

}
