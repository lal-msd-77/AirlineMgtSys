package com.lal.AirlineMgtSys.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lal.AirlineMgtSys.dao.AirlineRepo;
import com.lal.AirlineMgtSys.entity.Airline;


@Controller
public class AirlineController {
	@Autowired
	AirlineRepo  ar;
	
	@RequestMapping("/index")
	public String showIndex()
	{
		return "index.jsp";
	}
		
	@RequestMapping("/addair")
	@ResponseBody
	public String addAir(Airline a)
	{
		ar.save(a);
		return "Airline added";
	}
	
	@RequestMapping("/viewair")
	@ResponseBody
	public String viewBook(int id )
	{
		List<Airline> list = ar.findAll();
		for(Airline i:list)
		{
			if(i.getId()==id)
			{
				return i.toString();
			}
		}
		
		return "No Airline Found";
	}
	
	@RequestMapping("/viewallair")
	@ResponseBody
	public String viewAllItem()
	{
		List<Airline> list = ar.findAll();
		return list.toString();
	}
	
	@RequestMapping("/updateair")
	@ResponseBody
	public String updateItem(Airline b1)
	{
		List<Airline> list = ar.findAll();
		for(Airline b:list)
		{
			if(b.getId()==b1.getId())
			{
				ar.delete(b);
				break;
			}
		}
		ar.save(b1);
		return "Airline Updated";
	}
	
	@RequestMapping("/deleteair")
	@ResponseBody
	public String deleteItem(int id)
	{
		List<Airline> list = ar.findAll();
		for(Airline b:list)
		{
			if(b.getId()==id)
			{
				ar.delete(b);
				return "Airline Deleted";
			}
		}
		return "Airline Not available";
	}
}
