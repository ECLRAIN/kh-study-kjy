package com.kh.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kh.spring10.repository.BookDao;

@Controller
public class BookController {
	@Autowired
	private BookDao bookDao;
/}
