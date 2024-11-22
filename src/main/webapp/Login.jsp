<%@page import="Bean.khachHangBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><title>ShoeShop</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        
<script></script>
<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
        <title>Login Form</title>
    </head>
    <body>
    <%
	String t = request.getParameter("tb");
	if(t != null){%>
		<script>alert('Tên đăng nhập hoặc mật khẩu không hợp lệ! ');</script>
	<%}%>
	       <!--begin of menu-->
       
    <nav class="navbar navbar-expand-md navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="HomeController">Shoes</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
                <ul class="navbar-nav">
                    <!-- <li class="nav-item active"><a class="nav-link" href="htgioController">Giỏ hàng</a></li>
                    <li class="nav-item active"><a class="nav-link" href="thanhtoanController">Thanh toán</a></li>
                    <li class="nav-item active"><a class="nav-link" href="lichsuController">Lịch sử mua hàng</a></li> -->
                </ul>
                <form class="form-inline my-2 my-lg-0" method="post" action="HomeController">
                    <input class="form-control mr-sm-2" type="text" name="txttim" placeholder="Tìm kiếm">
                    <button class="btn btn-primary my-2 my-sm-0" type="submit" name="txtBtnSearch">Search</button>
                </form>
            </div>
            
            <ul class="navbar-nav ml-auto">
                <%
                if (session.getAttribute("dn") == null) {	
                %>
                <li class="nav-item"><a class="nav-link" href="dangkyController"><span class="fas fa-user"></span> Đăng ký</a></li>
                <li class="nav-item"><a class="nav-link" href="dangnhapController"><span class="fas fa-user"></span> Đăng nhập</a></li>
                <%
                } else {
                    khachHangBean dn = (khachHangBean)session.getAttribute("dn");
                %>
                <li class="nav-item" style="color: white;"><%=dn.getHoten() %></li>
                <li class="nav-item"><a class="nav-link" href="dangxuatController"><span class="fas fa-sign-out-alt"></span> Đăng xuất</a></li>
                <%
                }
                %>
            </ul>
        </div>
    </nav>

    <!-- Rest of your page content -->

    

        <div id="logreg-forms" style="backgroud-color:#ead3d3" >
            <form class="form-signin" action="dangnhapController" method="post">
                <h1 class="h3 mb-3 font-weight-normal" style="text-align: center">Đăng nhập</h1>
                
                <input name="txttk"  type="text"  class="form-control" placeholder="Username" >
                <input name="txtmk"  type="password" id="inputPassword" class="form-control" placeholder="Password" required="">

                <div class="form-group form-check">
                    <input name="remember" value="1" type="checkbox" class="form-check-input" id="exampleCheck1">
                    <label class="form-check-label" for="exampleCheck1">Remember me</label>
                </div>

                <button class="btn btn-success btn-block" type="submit"><i class="fas fa-sign-in-alt"></i> Đăng nhập</button>
                <hr>
                <button class="btn btn-primary btn-block" type="button" id="btn-signup"><i class="fas fa-user-plus"></i> Đăng ký</button>
            </form>

            <form action="signup" method="post" class="form-signup">
                <h1 class="h3 mb-3 font-weight-normal" style="text-align: center"> Đăng nhập</h1>
                <input name="txttk" type="text" id="user-name" class="form-control" placeholder="User name" required="" autofocus="">
                <input name="txtmk" type="password" id="user-pass" class="form-control" placeholder="Password" required autofocus="">
                <input name="repass" type="password" id="user-repeatpass" class="form-control" placeholder="Repeat Password" required autofocus="">

                <button class="btn btn-primary btn-block" type="submit"><i class="fas fa-user-plus"></i> Đăng ký</button>
                <a href="#" id="cancel_signup"><i class="fas fa-angle-left"></i> Back</a>
            </form>
            <br>

        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        s
    </body>
</html>