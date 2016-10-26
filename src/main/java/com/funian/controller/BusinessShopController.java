package com.funian.controller;
import com.funian.service.*;
import com.funian.model.BusinessShopEntity;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BusinessShopController {
	@Resource
	private BusinessShopService businessShopService;

	@ResponseBody
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public int add(@RequestBody BusinessShopEntity businessShopEntity){
//		System.out.println("添加成功");
		//添加一个实体
		businessShopService.add(businessShopEntity);
		return 200;
	}

	@ResponseBody
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public void update(@RequestBody BusinessShopEntity businessShopEntity){
		businessShopService.update(businessShopEntity);
	}

	@ResponseBody
	@RequestMapping(value = "/delete",method = RequestMethod.GET)
	public void delete(Integer business_id,String business_name){
		businessShopService.delete(business_id);
	}

	@ResponseBody
	@RequestMapping(value = "/select",method = RequestMethod.GET)
	public List<BusinessShopEntity> getBusinessList(Integer business_id){
		return businessShopService.select(business_id);
	}


}
