package com.main.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.main.spring.entity.Conversion;
import com.main.spring.entity.Menu;

@Controller
public class conversionController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	
	public String viewIndex(Map<String, Object> model) {
		
		Menu myMenu = new Menu(); 
		
		model.put("conversionMain", myMenu); 
		
		List<String> Fromlist = new ArrayList<>();
		Fromlist.add("pound");
		Fromlist.add("kilogram");
		Fromlist.add("miligram");
		
		
		model.put("listFrom", Fromlist);
		
		List<String> tolist = new ArrayList<>();
		tolist.add("pound");
		tolist.add("kilogram");
		tolist.add("miligram");
	
		
		model.put("listTo", tolist);
		
model.put("conversionMain", myMenu); 
		
		return "index";
	}
		
		@RequestMapping(value="convert",method = RequestMethod.POST) 
		public String Results (@ModelAttribute("conversionMain") Menu mMenu,Map<String, Object> model) {
			
			System.out.println("processing");
			System.out.println("user is converting from :"+mMenu.getConvFrom());
			System.out.println("user is converting to :"+mMenu.getConvTo());
		
			
			
			Conversion myConveterClass = new Conversion();
			double results=myConveterClass.calculate(mMenu.getConvFrom(), mMenu.getConvTo(), mMenu.getUserOutput());
			System.out.println("result :"+results);
			
			model.put("resultholder", results);
			return "convert";
		}
		
		
	

}
