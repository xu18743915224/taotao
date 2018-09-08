package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.dao.ItemDao;
import com.taotao.dto.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
@Service("itemService")
@Transactional
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemDao itemDao;
	@Override
	public TbItem geTbItemById(Long itemId) {		
		return itemDao.geTbItemById(itemId);
	}

	@Override
	public EasyUIDataGridResult getItemList(int page, int rows) {
		//��ҳ����
		PageHelper.startPage(page, rows);
		//ִ�в�ѯ
		List<TbItem> tbItemList=itemDao.findTbItems();
		//ȡ��ҳ��Ϣ
		PageInfo<TbItem> pageInfo=new PageInfo<TbItem>(tbItemList);
		//���ش�����
		EasyUIDataGridResult result=new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(tbItemList);
		return result;
	}

}
