<%@page import="Bean.khachHangBean"%>
<%@page import="Bean.giohangBean"%>
<%@page import="Bo.giohangBo"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng ký</title><link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
      
</head>
<style>
   .navbar-con{
display:flex;
margin-bottom: 8px;
   padding-top: 8px;
   padding-left:16px;
}
    </style>
<body>
<%
	String t = request.getParameter("tb");
	if(t != null){%>
		<script>alert('Đăng ký sai!Thao tác lại');</script>
<%}%>
<nav class="navbar navbar-expand-md navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="HomeController">Shoes</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault"></div>
			<ul class="nav navbar-nav">

			</ul>
                    </ul>
                    </div>
                    </nav>
                    

		<div class="col-10">
				<form action="dangkyController" method="post">	
				
                 <h2 style="text-align:center">ĐĂNG KÝ THÀNH VIÊN</h2><table align="center">                
                        <div class="colum">
                        <tbody>
                            <tr style="height:40px">
                                <div class="col">
                                <td>
                                    <input id="HotenKH" name="HotenKH" type="text" value=""placeholder="Họ và Tên:">

                                </td>
                                </div>
                            </tr>
                            <tr style="height:40px">
                               <div class="col">
                                <td>
                                    <input id="TenDN" name="TenDN" type="text" value="" placeholder="Tên đăng nhập:">
                                </td>
                               </div>
                            </tr>
                            <tr style="height:40px">
                            <div class="col">
                                <td>
                                    <input id="Matkhau" name="Matkhau" type="password"placeholder="Mật khẩu:">
                                </td>
                                </div>
                            </tr>
                           
                            <tr style="height:40px">
                               
                                <td>
                                    <input id="Email" name="Email" type="text" value="" placeholder="Email: ">
                                </td>
                                
                            </tr>
                            <tr style="height:40px">
                                <div class="col">
                                <td>
                                    <input id="Diachi" name="Diachi" type="text" value="" placeholder="Địa chỉ:">
                                </td></div>
                            </tr>
                            <tr style="height:40px">
                                <div class="col">
                                <td>
                                    <input id="Dienthoai" name="Dienthoai" type="text" value=""placeholder="Số điện thoại:">
                                </td></div>
                            </tr>
                            <!-- <tr style="height:40px">
                                <td> Ngày sinh :</td>
                                <td>
                                    <input type="date" name="Ngaysinh">
                                    </td>
                            </tr> -->
                            <tr style="height:40px">
                              <div class="col">
                                <td>
                                	<button type="submit" value="dangky" name="action" >Đăng ký</button>
                                    <!-- <input type="Submit" value="Đăng ký"> -->
                                </td> </div>
                            </tr>
                        </tbody>
                       </div>
                    </table>
                     </form>
                </div>
                
         <div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h3>Đăng Nhập</h3>
					<form method="post" action="DangNhapController" class="form-flex">
						<div class="form-group">
							<label for="txttk">Tên Tài Khoản:</label> <input type="text"
								class="form-control" id="txtun" name="txtun"
								placeholder="Nhập Tài Khoản">
						</div>
						<div class="form-group">
							<label for="txtmk">Nhập Mật Khẩu:</label> <input type="password"
								class="form-control" id="txtpass" name="txtpass"
								placeholder="Nhập Mật Khẩu">
						</div>
						<br> <input type="submit" name="but" value="login"
							class="btn btn-primary btn-block btn-flat">
					</form>
					<%
                    String tb = (String)request.getAttribute("tbb");
                    if (tb != null) {
                    %>
					<script>alert('Đăng nhập sai');</script>
					<%
                    }
   %>
				</div>
			</div>
		</div>
	</div>
</body>
</html>