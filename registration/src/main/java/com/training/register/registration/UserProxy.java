package com.training.register.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name="zuul-gateway")
@RibbonClient(name="database-service")
@Component
public interface UserProxy {
	
	@PostMapping("/database-service/add")
	public Boolean add(@RequestBody User user);
	
}
