package com.taotao.service;

import java.util.List;

import com.taotao.dto.EasyUITreeNode;

public interface ItemCatService {

	//����parentID����ѯ������ص�������
	List<EasyUITreeNode> getItemCatList(long parentId);
}
