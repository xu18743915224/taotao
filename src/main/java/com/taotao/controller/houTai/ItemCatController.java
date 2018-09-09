package com.taotao.controller.houTai;

import java.util.List;
import java.util.concurrent.atomic.LongAccumulator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.dto.EasyUIDataGridResult;
import com.taotao.dto.EasyUITreeNode;
import com.taotao.service.ItemCatService;

/**后台首页--新增商品Controller*/
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

	@Autowired
	private ItemCatService iteamCatService;
	
	/**后台首页--新增商品--商品类目   请求  http://localhost:8080/item/cat/list*/
	@RequestMapping("/list")
	@ResponseBody
	public List<EasyUITreeNode> getItemCatList(@RequestParam(value="id",defaultValue="0")Long parentId) {
		List<EasyUITreeNode> treeNodeList=iteamCatService.getItemCatList(parentId);
		return treeNodeList;
	}
}
