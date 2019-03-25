package com.java.springboot.hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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
		//String[] cmd = { "bash", "-c", "~/usr/test.sh test test test test test" };;
		 Process p;
		 StringBuffer line = new StringBuffer();
	        try {
	            
	            List<String> cmdList = new ArrayList<String>();
	            // adding command and args to the list
	            cmdList.add("sh");
	            cmdList.add("/usr/test.sh");
	            cmdList.add("1");
	            cmdList.add("2");
	            cmdList.add("2");
	            cmdList.add("4");
	            cmdList.add("5");
	            ProcessBuilder pb = new ProcessBuilder(cmdList);
	            p = pb.start();
	                
	            p.waitFor(); 
	            BufferedReader reader=new BufferedReader(new InputStreamReader(
	             p.getInputStream())); 
	           String line1;
	            while((line1 = reader.readLine()) != null) { 
	                line.append(line1);
	            } 
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		 return line.toString();
	}
}
