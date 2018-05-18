<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script> 
<title>Insert title here</title>  
</head>

<script>  
 
   function channel(){
     var data = new Object();
        data["JK"] = "44";
        var jsonString = JSON.stringify(data);
   $.ajax({
            url:"http://127.0.0.1:8080/PlamProject/Api/Handler",
            type:"post",
            data:jsonString,
            dataType:"json",
            contentType: "application/json; charset=utf-8", 
            success:function(res){
                alert("success"+res);
            },
            error:function(error){
             alert("Error"+error);
            } 
        });
          }
</script>  
<body>
<h2>Hello World!</h2>
<input type="button" value="检测" onclick="channel()">  

</body>
</html>
