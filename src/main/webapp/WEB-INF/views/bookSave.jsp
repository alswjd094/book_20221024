<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-10-24
  Time: 오후 4:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bookSave.jsp</title>
</head>
<body>
<form action="/save" method="post">
<input type="text" name="bookName" placeholder="도서명"> <br>
<input type="text" name="bookAuthor" placeholder="저자"> <br>
<input type="text" name="bookPrice" placeholder="도서가격"> <br>
<input type="text" name="bookPublisher" placeholder="출판사"><br>
<input type="submit" value="저장">
</form>
</body>
</html>
