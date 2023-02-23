package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Spring_Name {

		
		@Value("Sethu")
		private String name;


		@GetMapping("/name")
		public String show()
		{
			return name;
		}
	
}
