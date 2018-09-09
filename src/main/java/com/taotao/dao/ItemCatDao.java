package com.taotao.dao;

import java.util.List;

import com.taotao.pojo.TbItemCat;

public interface ItemCatDao {

	/**根据TbItemCat商品类目的parentId查找分类列表*/
	public List<TbItemCat> findTbItemCatListByParentId(long parentId);
}
