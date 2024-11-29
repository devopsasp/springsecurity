package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Item;

@Controller
public class FormController {

	@RequestMapping("/additem")
   public String itemForm()
   { 
		return "itemform";
   }
	
//	@RequestMapping(method=RequestMethod.POST,value="/additem")
//	public ModelAndView getValues( Item item)
//	{ 
//		
//    ModelAndView mv=new ModelAndView("success");
//    mv.addObject("item",item);
//		System.out.println(item);
//		return mv;
//	}
//	
	@RequestMapping(method=RequestMethod.POST,value="/additem")
	public String getValuesIndividually(@RequestParam("itemId")int itemId,
			@RequestParam("itemName") String itemName,@RequestParam("price") float price,
			@RequestParam("quantityInStock") int quantity)
	{ 
 
	System.out.println(itemName);
	System.out.println(price);
	System.out.println(quantity);
		return "";
	}
	
	
	
	
}
