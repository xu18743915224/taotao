package com.taotao.service;

import java.util.List;

import com.taotao.dto.EasyUITreeNode;

public interface ItemCatService {

	//根据parentID来查询所有相关的子数据
	List<EasyUITreeNode> getItemCatList(long parentId);
}
