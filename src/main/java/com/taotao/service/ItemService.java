package com.taotao.service;

import com.taotao.dto.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {

	/**根据TbItem商品Id查找商品*/
	public TbItem geTbItemById(Long itemId);
	/**根据页数page和个数rows查找商品list*/
	public EasyUIDataGridResult getItemList(int page,int rows);
}
