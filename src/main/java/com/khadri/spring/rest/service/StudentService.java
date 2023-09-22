package com.khadri.spring.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.khadri.spring.rest.entity.Student;

@Service
public class StudentService {

	@Autowired
	private RestTemplate restTemplate;

	public void getAllStudentInformation() {


		ResponseEntity<Student> responseEntity = restTemplate
				.getForEntity("http://localhost:8080/A2022_Spring_REST_Collection_Producer/view/student", Student.class);
		Student std = responseEntity.getBody();

		System.out.println(std);
	}
}
