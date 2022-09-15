package com.kh.spring12;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring12.entity.Student;

@SpringBootTest
public class Test08 {
@Test
	public void test() {
	Student s= new Student();
	s.setName("피카츄");
	s.setScore(50);
	System.out.println(s.getName()+" / "+s.getScore());
}
}
