package com.classroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ClassManagementSystemApplication {

	public static ConfigurableApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(ClassManagementSystemApplication.class, args);
//		SaveDataTest savedata = new SaveDataTest();
//		savedata.saveTestData();

	}

}
