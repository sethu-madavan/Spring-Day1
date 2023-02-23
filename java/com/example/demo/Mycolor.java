package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycolor {
	@Value("Red")
	private String Myfav;
	
	
	@GetMapping("/")
	public String getMyFav(String FavColor)
	{
		return "MyFavColor is " + Myfav;
	}
}
