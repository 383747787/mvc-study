package com.funian.dao;
import java.util.List;
import javax.annotation.Resource;
import com.funian.model.BusinessShopEntity;


@Resource
public interface BusinessShopDao {
	//添加商家 已经实现了
	int addBusinessShop(BusinessShopEntity business);
	//更新商家
	int deleteBusinessShop(Integer business_id);
	int updateBusinessShop(BusinessShopEntity business);
	//查找商家列表,已经实现了
	List<BusinessShopEntity> selectBusinessShop(Integer business_id);
}
