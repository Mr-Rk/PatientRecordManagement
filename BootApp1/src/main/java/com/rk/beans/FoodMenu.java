package com.rk.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("foodManu")
public class FoodMenu {
	
	private List<String> itemsList;
	
	public FoodMenu() {
		itemsList=new ArrayList<>(10);
		
		itemsList.add("Puri");
		itemsList.add("Uppama");
		itemsList.add("Ideli");
		itemsList.add("RashMalai");
	}
	
	public String getItemInfo(String itemName) {
		if(itemName.equalsIgnoreCase("Puri")) {
			return "Puri \n ------"
					+ "\n Rs.25 "+" 10 Minutes it will take to prepare.";
		}
	else if(itemName.equalsIgnoreCase("Uppama")) {
				return "Uppama \n ------"
						+ "\n Rs.20 "+" 12 Minutes it will take to prepare.";
					
		}
	else if(itemName.equalsIgnoreCase("Ideli")) {
		return "Ideli \n ------"
				+ "\n Rs.30 "+" 15 Minutes it will take to prepare.";
	}
	else {
		return "RashMalai \n ------"
				+ "\n Rs.45 "+" wait for 5 minutes ,I will bring to you.";
	}
	
	}//method
}
