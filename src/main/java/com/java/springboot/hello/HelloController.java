package com.java.springboot.hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	
	@RequestMapping("/exec")
	public String call() {
		String[] cmd = {"sh","/usr/test.sh"};
		String result = null;
		 ProcessBuilder pb = new ProcessBuilder(cmd); 
		 try
		 {
		 Process process = pb.start();
		 BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		 StringBuilder builder = new StringBuilder();
		 String line = null;
		 while ( (line = reader.readLine()) != null) {
		 builder.append(line);
		 }
		  result = builder.toString();
		 System.out.print(result);
		 System.out.println("end of script execution");
		 }
		 catch (IOException e)
		 { System.out.print("error");
		 e.printStackTrace();
		 }
		 return result;
	}
}
