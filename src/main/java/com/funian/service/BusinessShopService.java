package com.funian.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.funian.model.BusinessShopEntity;

@Service("businessShopService")
public interface BusinessShopService {
	int add(BusinessShopEntity businessShopEntity );
	void delete(Integer business_id);
	int update(BusinessShopEntity businessShopEntity );
	List<BusinessShopEntity> select(Integer business_id );
}
