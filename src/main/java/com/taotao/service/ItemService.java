package com.taotao.service;

import com.taotao.dto.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {

	/**����TbItem��ƷId������Ʒ*/
	public TbItem geTbItemById(Long itemId);
	/**����ҳ��page�͸���rows������Ʒlist*/
	public EasyUIDataGridResult getItemList(int page,int rows);
}
