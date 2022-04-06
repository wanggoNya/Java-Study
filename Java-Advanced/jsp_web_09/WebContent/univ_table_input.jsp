<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<% request.setCharacterEncoding("utf-8");%>
<%
	// JDBC 드라이버 로딩
Class.forName("com.mysql.jdbc.Driver");
// DB연결
String url = "jdbc:mysql://localhost:3306/university";
String id = "root";
String pw = "yeasd3676!";

Connection conn = null; // 디비 연결 객체
PreparedStatement pstmt = null; // 디비에 전달할 SQL 구문객체

conn = DriverManager.getConnection(url, id, pw);


// 테이블 데이터 넣는 SQL
String hakbun = request.getParameter("hakbun");
String name = request.getParameter("name");
String gender = request.getParameter("gender");
String year = request.getParameter("year");
String dept = request.getParameter("dept");
String addr = request.getParameter("addr");

// 테이블 만들기 SQL
String sql = "INSERT INTO student VALUES(?,?,?,?,?,?)";
pstmt = conn.prepareStatement(sql);
   pstmt.setString(1,hakbun);
   pstmt.setString(2,name);
   pstmt.setString(3,gender);
   pstmt.setString(4,year);
   pstmt.setString(5,dept);
   pstmt.setString(6,addr);
pstmt.executeUpdate();

//DB연결 종료
if (pstmt != null){
   pstmt.close();
}

if (conn != null){
   conn.close();
}


out.print("DB 데이터 삽입 성공 by 06김수연");

response.sendRedirect("univ_table_list.jsp");
%>