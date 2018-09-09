package com.taotao.controller.houTai;

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
	
	/**��̨��ҳhttp://localhost:8080/ */
	@RequestMapping("/")
	public String showIndex() {
		return "houtai/index";
	}
	/**��̨��ҳ--�����ҳ�������һ��.����ͳһ���� http://localhost:8080/{page} */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return "houtai/"+page;
	}

}
