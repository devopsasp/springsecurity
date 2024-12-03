package com.controller;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Item;

@RestController
public class HomeRestController {
	List<Item> itemList;
	public HomeRestController() 
	{ 
		itemList=new ArrayList();
	}
   @GetMapping("/getitems")
	public List<Item> getRestHome()
	{ 
		
		
		itemList.add(new Item(1,"Coffee",20,10));
		itemList.add(new Item(2,"Ice Tea",25,14));
		return itemList;
	}
   
   @PostMapping("/addrestitem")
    public ResponseEntity<?> addItem(@RequestBody Item item)
    { 
	   
	   itemList.add(item);
	   
	   return new ResponseEntity("item added",HttpStatus.ACCEPTED);
    }

}






