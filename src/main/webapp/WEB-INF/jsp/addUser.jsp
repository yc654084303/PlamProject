    <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
    <%  
    String path = request.getContextPath();  
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
    %>  
      
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
    <html>  
      <head>  
        <base href="<%=basePath%>">  
          
        <title>My JSP 'addUser.jsp' starting page</title>  
          
        <meta http-equiv="pragma" content="no-cache">  
        <meta http-equiv="cache-control" content="no-cache">  
        <meta http-equiv="expires" content="0">      
        <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
        <meta http-equiv="description" content="This is my page">  
        <!-- 
        <link rel="stylesheet" type="text/css" href="styles.css"> 
        -->  
      
      </head>  
        
      <body>  
        <form id="addUser" action="user/addUser" method="post">   
            userName: <input id="name" name="name" /><br/>   
            password: <input id="password" name="password" /><br/>   
            age: <input id="age" name="age"/><br/>   
            <input type="submit" value="添加新用户"/>   
        </form>  
      </body>  
    </html>  