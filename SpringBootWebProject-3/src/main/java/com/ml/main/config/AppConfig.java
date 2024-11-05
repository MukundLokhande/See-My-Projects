package com.ml.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ml.main.beans.Student;

@Configuration
public class AppConfig {
	@Bean
	public CommandLineRunner cmdLineRunner()
	{
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				stdBean().displayStudentdetails();
				stdBean2().displayStudentdetails();
			}
		};
	}
	@Bean 
	public Student stdBean()
	{
		return new Student("Tushar", 101 , 95.5f);
	}
	@Bean
	public Student stdBean2()
	{
		return new Student("Rahul", 102 , 85.5f);
	}
	
	
}
