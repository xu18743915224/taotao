package com.taotao.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taotao.dao.ItemCatDao;
import com.taotao.dto.EasyUITreeNode;
import com.taotao.pojo.TbItemCat;
import com.taotao.service.ItemCatService;

@Service("itemCatService")
@Transactional
public class ItemCatServiceImpl implements ItemCatService{

	@Autowired
	private ItemCatDao itemCatDao;
	
	@Override
	public List<EasyUITreeNode> getItemCatList(long parentId) {
		//1.����TbItemCat��Ʒ��Ŀ��parentId���ҷ����б�
		List<TbItemCat> tbItemCatList=itemCatDao.findTbItemCatListByParentId(parentId);
		//2.ת����EasyUITreeNode�б�	
		List<EasyUITreeNode> resultList=new ArrayList<EasyUITreeNode>();
		for(TbItemCat itemCat:tbItemCatList) {
			//����һ���ڵ����
			EasyUITreeNode treeNode =new EasyUITreeNode();
			treeNode.setId(itemCat.getId());
			treeNode.setText(itemCat.getName());
			treeNode.setState(itemCat.getIsParent()?"closed":"open");	//����Ǹ��ڵ�closed �ӽڵ�open
			//���ӵ��б���
			resultList.add(treeNode);
		}		
		return resultList;
	}

}
