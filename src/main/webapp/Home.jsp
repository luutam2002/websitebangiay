<%@page import="Bean.khachHangBean"%>
<%@page import="Bean.giayBean"%>
<%@page import="Bean.loaiBean"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ShoeShop</title>
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
        
<script></script>
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
       <!--begin of menu-->
        <nav class="navbar navbar-expand-md navbar-dark bg-dark">
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
				</nav>
				
        <section class="jumbotron text-center">
            <div class="container">
                <h1 class="jumbotron-heading">Siêu thị giày chất lượng cao</h1>
                <p class="lead text-muted mb-0">Uy tín tạo nên thương hiệu với hơn 10 năm cung cấp các sản phầm giày nhập từ Trung Quốc</p>
            </div>
        </section>
        <!--end of menu-->
        <div class="container">
            <div class="row">
                <div class="col">
                    <nav aria-label="breadcrumb">
                        <ol class="breadcrumb" style="padding:15px 15px">
                <li class="active"><a href="HomeController">Home</a></li> 
                
                
                	<%		khachHangBean dn = (khachHangBean)session.getAttribute("dn");
							if(dn == null){ %>
							  <li class="active"><a href="dangnhapController">Giỏ hàng</a></li>
							<%}else{ %>
						<li class="active"> <a href="htgioController">Giỏ hàng</a></li>
							<%} %>
							
            <%		/* khachHangBean dn = (khachHangBean)session.getAttribute("dn"); */
            khachHangBean dnn = (khachHangBean)session.getAttribute("dn");
							if(dnn == null){ %>
							  <li class="active"><a href="dangnhapController">Xác nhận mua hàng</a></li>
							<%}else{ %>
						<li class="active"><a href="xacnhanController">Xác nhận mua hàng</a></li>
							<%} %>
				
				    <%	 	khachHangBean dnhap = (khachHangBean)session.getAttribute("dn"); 
							if(dnhap == null){ %>
							  <li class="active"><a href="dangnhapController">Lịch sử mua hàng</a></li>
							<%}else{ %>
						<li class="active"><a href="lichsuController">Lịch sử mua hàng</a></li>
							<%} %>
				
				
                        </ol>
                    </nav>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-sm-3">
                    <div class="card bg-light mb-3">
                        <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i> Categories</div>
                        <ul class="list-group category_block">
                        <%
					ArrayList<loaiBean> dsloai = (ArrayList<loaiBean>) request.getAttribute("dsloai");
					for (loaiBean loai : dsloai) {
					%>
                            	<li class="list-group-item text-white">
                            	<a href="HomeController?ml=<%=loai.getMaloai()%>"><%=loai.getTenloai() %></a></li>
                            <% }%>
                            <%-- <c:forEach items="listCC}" var="o">
                                <li class="list-group-item text-white"><a href="HomeController"><%=o.cname}</a></li>
                            </c:forEach> --%>

                        </ul>
                    </div>
                    <%-- <div class="card bg-light mb-3">
                        <div class="card-header bg-success text-white text-uppercase">Last product</div>
                        <div class="card-body">
                             <img class="img-fluid" src="listP.image}" />
                            <h5 class="card-title">listP.name}</h5>
                            <p class="card-text">listP.title}</p>
                            <p class="bloc_left_price">listP.price} $</p> 
                        </div>
                    </div> --%>
                </div>

                <div class="col-sm-9">
                    <div class="row">
                    <%
                    ArrayList<giayBean> dsgiay = (ArrayList<giayBean>) request.getAttribute("dsgiay");
                   int n = dsgiay.size();
                    for(int i = 0;i < n ;i++){
                    	giayBean o = dsgiay.get(i);
                    %>
                    <div class="col-12 col-md-6 col-lg-4">
                                <div class="card">
                                    <img class="card-img-top" src="<%=o.getAnh() %>" alt="Card image cap">
                                    <div class="card-body">
                                        <h4 class="card-title show_txt" style="font-size:13px;"><a href="#" title="View Product"><%=o.getTengiay()%></a></h4>
                                        <%-- <p class="card-text show_txt"><%=o.get%></p> --%>
                                        <div class="row">
                                            <div class="col">
                                                <p class="btn btn-danger btn-block"><%=o.getGia()%></p>
                                            </div>
                                            <div class="col">
                                            <a href="gioController?ms=<%=o.getMagiay()%>&ts=<%=o.getTengiay()%>&giatam=<%=o.getGia()%>&anh = <%=o.getAnh() %>&soluong=<%=o.getSoluong() %>" class="btn btn-success btn-block">Add to cart</a>
                                                
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <%}
                    %>

                    </div>
                </div>

            </div>
        </div><
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

