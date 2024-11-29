package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Item;

import java.util.List;
import java.util.ArrayList;
@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String getIndex()
	{ 
		return "index";
	}
	
	@RequestMapping("/viewitems")
 public ModelAndView getAllItems()
 { 
     
		ArrayList<Item> itemlist=new ArrayList<>();
		Item item=new Item();
		item.setItemId(1);
		item.setItemName("Coffee");
		item.setPrice(200);
		item.setQuantityInStock(30);
		
		Item item1=new Item();
		item1.setItemId(2);
		item1.setItemName("Espresso");
		item1.setPrice(250);
		item1.setQuantityInStock(34);
		
		
		itemlist.add(item);
		itemlist.add(item1);
		
		
		
	
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("itemlist");
	
		mv.addObject("itemlist",itemlist);
		return mv;
		  
 }
	
}
