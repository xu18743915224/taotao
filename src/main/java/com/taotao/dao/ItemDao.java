package com.taotao.dao;

import java.util.List;

import com.taotao.pojo.TbItem;

public interface ItemDao {
	
	/**��ȡ������Ʒ*/
	public List<TbItem> findTbItems();
	/**����TbItem��ƷId������Ʒ��Ʒ*/
	public TbItem geTbItemById(Long itemId);
}
