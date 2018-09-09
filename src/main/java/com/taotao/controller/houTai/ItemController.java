package com.taotao.controller.houTai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.dto.EasyUIDataGridResult;
import com.taotao.service.ItemService;

/**后台首页--查询商品Controller*/
@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	/**后台首页--查询商品 请求  http://localhost:8080/item/list*/
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGridResult getItemList(Integer page,Integer rows) {
		//根据 page页数 和 rows页面显示个数 通过PageHelp插件查询出所有数据
		EasyUIDataGridResult result =itemService.getItemList(page, rows);
		return result;
	}
}
