package com.taotao.controller;

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

	@Autowired
	private ItemService itemService;
	
	/**后台首页http://localhost:8080/taotao/ */
	@RequestMapping("/")
	public String showIndex() {
		return "houtai/index";
	}
	/**后台首页--请求和页面的名称一致.可以统一处理 http://localhost:8080/taotao/{page} */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return "houtai/"+page;
	}
	/**后台首页--查询商品 请求  http://localhost:8080/taotao/item/list*/
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGridResult getItemList(Integer page,Integer rows) {
		//根据 page页数 和 rows页面显示个数 通过PageHelp插件查询出所有数据
		EasyUIDataGridResult result =itemService.getItemList(page, rows);
		return result;
	}
}
