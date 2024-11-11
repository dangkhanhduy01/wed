<%-- 
    Document   : changepass
    Created on : 11 thg 11, 2024, 21:02:50
    Author     : duyne
--%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Hoa"%>
<%@page import="dao.HoaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
    <form action="LoginServlet" method="post">
        <h2>change password</h2>
        <div>
            <label>old password</label>
            <input type="password" name="oldpassword" value="" required="" class="form-control">
        </div>
        <div>
            <label>new Password</label>
            <input type="password" name="newpassword" value="" required="" class="form-control">
        </div>
        <div>
            <label>confirm new Password</label>
            <input type="password" name="confirmnewpassword" value="" required="" class="form-control">
        </div>
        <div class="mt-2">
            <button type="submit" class="btn btn-primary">save</button>
        </div>
        <%
            if (request.getAttribute("error") != null) {
        %>
        <div class="text-danger mb-3">
            <%=request.getAttribute("error")%>
        </div>
        <%
            }
        %>
    </form>
</div>
<jsp:include page="shared/footer.jsp" />
