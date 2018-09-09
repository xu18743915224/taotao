package com.taotao.controller.houTai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.dto.EasyUIDataGridResult;
import com.taotao.service.ItemService;

/**��̨��ҳ--��ѯ��ƷController*/
@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	/**��̨��ҳ--��ѯ��Ʒ ����  http://localhost:8080/item/list*/
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGridResult getItemList(Integer page,Integer rows) {
		//���� pageҳ�� �� rowsҳ����ʾ���� ͨ��PageHelp�����ѯ����������
		EasyUIDataGridResult result =itemService.getItemList(page, rows);
		return result;
	}
}
