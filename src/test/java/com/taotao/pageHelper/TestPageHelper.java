package com.taotao.pageHelper;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.dao.ItemDao;
import com.taotao.pojo.TbItem;

public class TestPageHelper {

	@Test
	public void testPageHelper() throws Exception{
		//0.���������ļ���ȡspring����
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/spring-*.xml");		
		//1.���mapper�������
		ItemDao tbItemDao=(ItemDao) applicationContext.getBean("TbItemDao");
		//2.��ֵ��ҳ
		PageHelper.startPage(1, 30);	//xҳ,ÿҳ��ʾx��
		//3.ִ�в�ѯ
		List<TbItem> tbItemList=tbItemDao.findTbItems();
		//4.ȡ��ҳ����
		PageInfo<TbItem> pageInfo=new PageInfo<TbItem>(tbItemList);
		System.out.println(pageInfo.getTotal());
	}
}
