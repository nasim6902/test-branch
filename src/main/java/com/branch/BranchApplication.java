package com.branch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BranchApplication {
	  String c = "git";
	  int x = 150;
	boolean isEmp = true;
	public static void main(String[] args) {
		SpringApplication.run(BranchApplication.class, args);
	}

}
