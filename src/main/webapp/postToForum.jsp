<%-- 
    Document   : postToForum
    Created on : Jun 15, 2016, 7:25:02 PM
    Author     : Andrew T
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Post to the Forum</title>
    </head>
    <body>
        <h1>Create a Post</h1>
        <h2><a href="viewPosts.jsp">View Previous Posts</a></h2>
            <br>
            <form action="createPost" method=""POST>
                <br>
                <textarea name="content">Enter Post here...</textarea>
                <br>
                <input type="button" value="Submit">
            </form>
    </body>
</html>
