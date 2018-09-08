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
		//0.根据配置文件获取spring容器
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/spring-*.xml");		
		//1.获得mapper代理对象
		ItemDao tbItemDao=(ItemDao) applicationContext.getBean("TbItemDao");
		//2.设值分页
		PageHelper.startPage(1, 30);	//x页,每页显示x个
		//3.执行查询
		List<TbItem> tbItemList=tbItemDao.findTbItems();
		//4.取分页后结果
		PageInfo<TbItem> pageInfo=new PageInfo<TbItem>(tbItemList);
		System.out.println(pageInfo.getTotal());
	}
}
