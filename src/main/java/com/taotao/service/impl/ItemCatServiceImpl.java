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
		//1.根据TbItemCat商品类目的parentId查找分类列表
		List<TbItemCat> tbItemCatList=itemCatDao.findTbItemCatListByParentId(parentId);
		//2.转换成EasyUITreeNode列表	
		List<EasyUITreeNode> resultList=new ArrayList<EasyUITreeNode>();
		for(TbItemCat itemCat:tbItemCatList) {
			//创建一个节点对象
			EasyUITreeNode treeNode =new EasyUITreeNode();
			treeNode.setId(itemCat.getId());
			treeNode.setText(itemCat.getName());
			treeNode.setState(itemCat.getIsParent()?"closed":"open");	//如果是父节点closed 子节点open
			//增加到列表中
			resultList.add(treeNode);
		}		
		return resultList;
	}

}
