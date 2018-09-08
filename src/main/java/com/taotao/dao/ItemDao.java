package com.taotao.dao;

import java.util.List;

import com.taotao.pojo.TbItem;

public interface ItemDao {
	
	/**获取所有商品*/
	public List<TbItem> findTbItems();
	/**根据TbItem商品Id查找商品商品*/
	public TbItem geTbItemById(Long itemId);
}
