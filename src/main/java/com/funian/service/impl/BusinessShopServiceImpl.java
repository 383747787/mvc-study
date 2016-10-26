package com.funian.service.impl;
import java.util.List;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.funian.service.BusinessShopService;
import com.funian.dao.*;
import com.funian.model.*;

@Service
public class BusinessShopServiceImpl implements BusinessShopService{
	@Resource
	private BusinessShopDao businessShopDao ;

	@Override
	public int  add(BusinessShopEntity business){
		return businessShopDao.addBusinessShop(business);
	}

	@Override
	public void delete(Integer business_id){
		businessShopDao.deleteBusinessShop(business_id);
	}
	@Override
	public int update(BusinessShopEntity business){
		return  businessShopDao.updateBusinessShop(business);
	}
	@Override
	public List<BusinessShopEntity> select(Integer business_id){
		return businessShopDao.selectBusinessShop(business_id);
	}
}
