package com.kh.springhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.entity.BoardDto;
import com.kh.springhome.repository.BoardDao;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardDao boardDao;
	
	@GetMapping("/write")
	public String write() {
		return "board/write";
	}
	@PostMapping("/write")
	public String write(@ModelAttribute BoardDto boardDto) {
		boardDao.write(boardDto);
		return "redirect:writeFinish";
	}
	@GetMapping("/writeFinish")
	public String writeFinish() {
		return "board/writeFinish";
	}
	@GetMapping("/list")
	public String list(Model model, 
			@RequestParam(required = false) String type, 
			@RequestParam(required = false) String keyword) {
		boolean isSearch = type != null && keyword  != null;
		if(isSearch) {
			model.addAttribute("list", boardDao.selectList(type, keyword));
		}
		else {
		model.addAttribute("list",boardDao.selectList());
	}
		return "board/list";
}
}
