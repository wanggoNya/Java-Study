<%@page import="util.ConnectionPool"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.naming.NamingException"%>
<%@ page import = "jdbc.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String uid = request.getParameter("uid");
String upw = request.getParameter("upw");

UserDAO dao = new UserDAO();

int result = dao.login(uid, upw);

if (result ==1 ){ // 실패 케이스 1 아이디가 아예 없다.
	response.sendRedirect("useradd.jsp"); // 회원가입으로
} else if (result == 2) {
	response.sendRedirect("login.jsp"); // 비번이 틀린 케이스므로 다시 로그인
} else {
	// 세션 설정 -> 제품 목록으로 보내자
}


%>
