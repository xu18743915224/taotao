package com.taotao.dao;

import java.util.List;

import com.taotao.pojo.TbItemCat;

public interface ItemCatDao {

	/**����TbItemCat��Ʒ��Ŀ��parentId���ҷ����б�*/
	public List<TbItemCat> findTbItemCatListByParentId(long parentId);
}
