package com.kh.spring12;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest // 이번 테스트6은 컨트롤러의 정상 작동 테스트
@AutoConfigureMockMvc //MockMvc(목업)에 대한 자동 설정
public class Test06 {
	//가짜 요청 생성 도구
	private MockMvc mockMvc;
	
	//가짜 테스트를 수행할 수 있도록 환경을 구성하는 도구. 즉 가짜 요청 생성 도구
	@Autowired
	private WebApplicationContext ctx;
	
	@BeforeEach
	public void before() {
		mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build(); //셋팅을 해줘야 컨트롤러 역활을 함
	}
	
	@Test
	public void test() throws Exception {
		mockMvc.perform(get("/pocketmon/insert"))//GET 요청 생성
//					.andExpect(status().is(200))//상태가 200번인 경우만 성공
					.andExpect(status().is2xxSuccessful())//상태가 2xx인 경우 성공
					.andDo(print())//추가로 프린트 해라
					.andReturn();//끝!
	
	}
}
//perform  요청을 제작하는 테스트에서는 개체 이름을 안적어도 작동은 함
//andExpert 상태가 200번인것을 기대
//andDo 끝나면 상태를 알려달라
