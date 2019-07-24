<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<h2 style = "color:#009900; 
                    
                    font-style:italic; 
                    text-align:center;">Welcome to registration page</h2>
                     <center>
                    <form method ="post" action="registervalid">
                   <div class="col-xs-3">
                    <label>Enter your username</label>
                    <input type="text"  name="uname" class ="form-control">
                    <br>
                     <br>
                      <br>
                    <lable>Enter your password</lable>
                    <input type="text" name="pwd" class ="form-control">
                    <br>
                     <br>
                      <br>
                      
                    <input type="submit" value="Register" class="btn btn-success">
                    </div>
                    </form>
                    </center>
</body>
</html>