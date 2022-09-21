package com.kh.springhome.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.kh.springhome.constant.SessionConstant;
//db를 가기 위해 만든 것은 아님
@Component
public class MemberBoardPermissionCheckInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//회원 검사기보다 늦게 실행 시킬 예정이므로 이 검사기에는 회원만 들어올수있게
		//목표 관리자가 아닌 회원이 공지사항을 등록할려고 하면 차단
		//1. 관리자인지 아닌지 검사 -관리자면 통과
		//2. 1번이 아니라면 boardHead라는 파라미터 값이 "공지"이면 차단, 아니면 허용
		//인터셉터는 허용과 차단을 해주긴 하지만 get과 post를 설정해주지 못 하는데
		
		
		//만약 POST방식이 아니라면 통과
				if(!request.getMethod().equals("POST")) {
					return true;
				}
				
				//1
				HttpSession session = request.getSession();
				//String memberGrade = (String)session.getAttribute("mg");
				String memberGrade = (String)session.getAttribute(SessionConstant.GRADE);
				if(memberGrade.equals("관리자")) {
					return true;
				}
				
				//2
				String boardHead = request.getParameter("boardHead");
				if(boardHead != null && !boardHead.equals("공지")) {
					return true;
				}
				
				//나머지는 다 차단
				response.sendError(403);
				//response.sendError(HttpServletResponse.SC_FORBIDDEN);
				return false;
			}
		}




