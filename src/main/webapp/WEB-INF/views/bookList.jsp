<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-10-25
  Time: 오후 1:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--jstl: jsp태그 라이브러리, jsp 문법--%>
<html>
<head>
    <title>bookList.jsp</title>
</head>
<body>
<table>
<tr>
    <th>번호</th>
    <th>도서명</th>
    <th>저자</th>
    <th>가격</th>
    <th>출판사</th>
</tr>

<c:forEach items="${bookList}" var="book">
    <tr>
        <td> ${book.bookId}</td>
        <td> <a href="/book?bookId=${book.bookId}"> ${book.bookName} </a> </td>
        <td> ${book.bookAuthor}</td>
        <td> ${book.bookPrice}</td>
        <td>${book.bookPublisher}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
