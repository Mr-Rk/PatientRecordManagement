package com.rk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("waiterBot")
public class WaiterBot {
	
	
	private FoodMenu menu;
	
	@Autowired
	public void setMenu(FoodMenu menu) {
		this.menu = menu;
	}
	
	public String getMenuDeails(String itemName) {
		return menu.getItemInfo(itemName);
	}
	

}
