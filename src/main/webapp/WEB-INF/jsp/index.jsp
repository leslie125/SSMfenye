<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="addUser" method="post" >
<input type="text" name="username">
<input type="text" name="password">
<input type="submit" value="提交">
</form>
<table border=1>
<tr>
<td>id</td>
<td>账号</td>
<td>密码</td>
<td>其他操作</td>
</tr>
<c:forEach items="${requestScope.pagemsg.lists}" var="item">
<tr>
<td>${item.id}</td>
<td>${item.username}</td>
<td>${item.password}</td>
<td><a href="delete?id=${item.id}">删除</a></td>
<td><a href="update?id=${item.id }">更新</a>
</tr>
</c:forEach>
</table>
<table  border="0" cellspacing="0" cellpadding="0"  width="900px">
<tr>
<td>
<span>第${requestScope.pagemsg.currPage }/${requestScope.pagemsg.totalPage}页</span>
  <span>总记录数：${requestScope.pagemsg.totalCount }&nbsp;&nbsp;每页显示:${requestScope.pagemsg.pageSize}</span>&nbsp;&nbsp;
   <span>
       <c:if test="${requestScope.pagemsg.currPage != 1}">
           <a href="${pageContext.request.contextPath }/index?currentPage=1">[首页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/index?currentPage=${requestScope.pagemsg.currPage-1}">[上一页]</a>&nbsp;&nbsp;
       </c:if>

       <c:if test="${requestScope.pagemsg.currPage != requestScope.pagemsg.totalPage}">
           <a href="${pageContext.request.contextPath }/index?currentPage=${requestScope.pagemsg.currPage+1}">[下一页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/index?currentPage=${requestScope.pagemsg.totalPage}">[尾页]</a>&nbsp;&nbsp;
       </c:if>
   </span>
</td>
</tr>
</table>
</body>
</html>