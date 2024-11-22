<%@page import="Bean.khachHangBean"%>
<%@page import="Bo.giohangBo"%>
<%@page import="Bean.loaiBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gio Hang</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
<link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
    />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="menu1.css"> 
</head>
<style>
   .navbar-con{
display:flex;
margin-bottom: 8px;
   padding-top: 8px;
   padding-left:16px;
}
    </style>
<body><nav class="navbar navbar-expand-md navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="HomeController">Shoes</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault"></div>
			<ul class="nav navbar-nav">
				<!-- <li class="active"><a href="htgioController">Giỏ hàng</a></li>
				<li class="active"><a href="thanhtoanController">Thanh toán</a></li>
				<li class="active"><a href="lichsuController">Lịch sử mua hàng</a></li> -->

			</ul>
                    </ul>
                   
      <form method="post" action="HomeController">
				<div class="navbar-con">
					<input type="text" name="txttim" placeholder="Tìm kiếm"
						class="form-control"> <input type="submit"
						name="txtBtnSearch" value="Search"
						class="btn-primary">
						</div>
				</form>
				</div>
				<ul class="nav navbar-nav navbar-right">
				
				<%
				
				if (session.getAttribute("dn") == null) {	
				%>
				<li><a href="dangkyController"><span
						class="glyphicon glyphicon-user"></span> Đăng ký</a></li>
				<li><a href="dangnhapController"><span
						class="glyphicon glyphicon-user"></span> Đăng Nhập</a></li>
				
			<!-- 	<li>
					<button type="button" class="btn btn-info btn-lg"
						data-toggle="modal" data-target="#myModal">Đăng nhập</button> Modal
					
				</li> -->
				
				 <%
				} else {
					khachHangBean dn = (khachHangBean)session.getAttribute("dn");
				%> 
				<li class=" btn btn-info btn-lg" style="color: white"><%=dn.getHoten() %></li>
				<li><a href="dangxuatController"><span
						class="glyphicon glyphicon-log-in"></span> Đăng xuất</a></li>
				<%
				}
				%>
				</ul>
		</div>
	</nav>
	<div class="container">
	<section class="jumbotron text-center">
            <div class="container">
                <h2 class="jumbotron-heading">Thông tin giỏ hàng</h2>
                
            </div>
        </section>
      <div class="row">
        <div class="col-md-12">
            <div>
                <!-- <h2 style="text-align: center">THÔNG TIN GIỎ HÀNG</h2> -->
			<table align="center" border="1">
				<tbody>

					<%
					//Hien thi do trong session: gh
					if (session.getAttribute("gh") != null) {
					%>
					<tr style="text-align: center; font-weight: bold;height: 50px">
						<td>Mã giày</td>
						<td>Tên giày</td>
						<td>Ảnh bìa</td>
						<td>Số lượng</td>
						<td>Đơn giá</td>
						<td>Thành tiền</td>
						<td width="50px"></td>
						<td width="50px"></td>
						<td width="50px"></td>
					</tr>
					<%
					giohangBo gk = (giohangBo) session.getAttribute("gh");
					
					int sh = gk.ds.size();
					for (int i = 0; i < sh; i++) {
					%>

					<tr style="text-align: center; font-weight: bold; height: 120px">
						<form method="post"
							action="SuaController?ms=<%=gk.ds.get(i).getMagiay()%>">
							<td><%=gk.ds.get(i).getMagiay()%></td>
							<td><%=gk.ds.get(i).getTengiay()%></td>
							<td><img src=giay-adidas-grand-court-base-2-nam-xam-01-1000x1000.jpg
								style="width:90px; padding: 10px"></td>

							<td><input type="number" min="1" name="txtSoluong"
								style=" text-align: center"
								value=<%=gk.ds.get(i).getSoluongmua()%>></td>
							<td><%=gk.ds.get(i).getGia()%></td>
							<td><%=gk.ds.get(i).getThanhtien()%></td>
							<!-- <td><a href="#"> Chi tiết </a></td> -->
							<td><a href="XoaController?ms=<%=gk.ds.get(i).getMagiay()%>">Xóa</a></td>
							<td><input type="submit" value="Cập Nhật"></td>
						</form>
					</tr>

					<%
					}
					%>



					<tr style="font-weight: bold; text-align: center; color: red;height: 50px">
						<%-- <td colspan="4">Số lượng giày: <%=gk.Tong()%></td> --%>
						<td colspan="5">Tổng tiền: <%=gk.Tong()%></td>
					</tr>
					<tr style="font-weight: bold; color: blue; text-align: right;height: 50px">
						<td colspan="9"><a href="HomeController"
							style="padding-right: 10px"> Tiếp tục mua hàng</a> <a
							href="XoaAllController"> Xóa Giỏ Hàng </a></td>
					</tr>
				 <tr style="font-weight: bold; color: blue; text-align: right;height: 50px">
						<td colspan="9" align="center"><a href="xacnhanController?txtxacnhan=1">ĐẶT
								HÀNG</a></td>
					</tr> 
			            
                        <%
					}
			%>
          </div>
				</tbody>
			</table>
            </div>
        </div>
      </div>
    </div>
			 <!-- Footer -->
        <footer class="text-light">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-lg-4 col-xl-3">
                        <h5>About</h5>
                        <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                        <p class="mb-0">
                           Myshoes.vn được định hướng trở thành hệ thống thương mại điện tử bán giày chính hãng hàng đầu Việt Nam.
                        	<br>
                        	Showroom: 249 Xã Đàn, Đống Đa, Hà Nội
                        	<br>
                        	Hotline: 0398638555
	                     </p>
                    </div>

                    <div class="col-md-2 col-lg-2 col-xl-2 mx-auto">
                        <h5>Informations</h5>
                        <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                        <ul class="list-unstyled">
                            <li><a href="">Link 1</a></li>
                            <li><a href="">Link 2</a></li>
                            <li><a href="">Link 3</a></li>
                            <li><a href="">Link 4</a></li>
                        </ul>
                    </div>

                    <div class="col-md-3 col-lg-2 col-xl-2 mx-auto">
                        <h5>Others links</h5>
                        <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                        <ul class="list-unstyled">
                            <li><a href="">Link 1</a></li>
                            <li><a href="">Link 2</a></li>
                            <li><a href="">Link 3</a></li>
                            <li><a href="">Link 4</a></li>
                        </ul>
                    </div>

                    <div class="col-md-4 col-lg-3 col-xl-3">
                        <h5>Contact</h5>
                        <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                        <ul class="list-unstyled">
                            <li><i class="fa fa-home mr-2"></i> My company</li>
                            <li><i class="fa fa-envelope mr-2"></i> luutam2k2@gmail.com</li>
                            <li><i class="fa fa-phone mr-2"></i> + 0398638555 </li>
                            <li><i class="fa fa-print mr-2"></i> + 0333396426 </li>
                        </ul>
                    </div>
                    <div class="col-12 copyright mt-3">
                        <p class="float-left">
                            <a href="#">Back to top</a>
                        </p>
                        <p class="text-right text-muted">created with <i class="fa fa-heart"></i> by <a href="https://t-php.fr/43-theme-ecommerce-bootstrap-4.html"><i>t-php</i></a> | <span>v. 1.0</span></p>
                    </div>
                </div>
            </div>
        </footer>
</body>
</html>