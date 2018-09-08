package com.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.dto.EasyUIDataGridResult;
import com.taotao.service.ItemService;

/**ҳ����תController*/
@Controller
public class PageController {

	@Autowired
	private ItemService itemService;
	
	/**��̨��ҳhttp://localhost:8080/taotao/ */
	@RequestMapping("/")
	public String showIndex() {
		return "houtai/index";
	}
	/**��̨��ҳ--�����ҳ�������һ��.����ͳһ���� http://localhost:8080/taotao/{page} */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return "houtai/"+page;
	}
	/**��̨��ҳ--��ѯ��Ʒ ����  http://localhost:8080/taotao/item/list*/
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGridResult getItemList(Integer page,Integer rows) {
		//���� pageҳ�� �� rowsҳ����ʾ���� ͨ��PageHelp�����ѯ����������
		EasyUIDataGridResult result =itemService.getItemList(page, rows);
		return result;
	}
}
