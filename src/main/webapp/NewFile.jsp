<%@page import="Bean.loaiBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Bean.khachHangBean"%>
<%@page import="Bo.giohangBo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous"
    />
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
      crossorigin="anonymous"
    ></script>
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
    />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="menu1.css"> 
  </head>

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
				<li class=" btn btn-info btn-lg" style="color: white">Xin chào <%=dn.getHoten() %></li>
				<li><a href="dangxuatController"><span
						class="glyphicon glyphicon-log-in"></span> Đăng xuất</a></li>
				<%
				}
				%>
				</ul>
		</div>
	</nav>
	
    <section class="h-100" style="background-color: #eee">
      <div class="container h-100 py-5">
        <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col-10">
            <div class="d-flex justify-content-between align-items-center mb-4">
              <h3 class="fw-normal mb-0 text-black">Shopping Cart</h3>
              
            </div>
			<%
					//Hien thi do trong session: gh
					if (session.getAttribute("gh") != null) {
						giohangBo gk = (giohangBo) session.getAttribute("gh");
						
						int sh = gk.ds.size();
						for (int i = 0; i < sh; i++) {
					
			%>
            <div class="card rounded-3 mb-4">
              <div class="card-body p-4">
                <div
                  class="row d-flex justify-content-between align-items-center"
                >
                <form method="post"
							action="SuaController?ms=<%=gk.ds.get(i).getMagiay()%>">
                  <div class="col-md-2 col-lg-2 col-xl-2">
                    <img
                      src=<%=gk.ds.get(i).getAnh()%>
                      class="img-fluid rounded-3"
                      alt=""
                    />
                  </div>
                  <div class="col-md-3 col-lg-3 col-xl-3">
                    <p class="lead fw-normal mb-2"><%=gk.ds.get(i).getTengiay() %></p>
                    <p>
                      <span class="text-muted">Giá:<%=gk.ds.get(i).getGia()%></span>
                      <span class="text-muted">Mã giày:<%=gk.ds.get(i).getMagiay()%></span>
                    </p>
                  </div>
                  <div class="col-md-3 col-lg-3 col-xl-2 d-flex">
                    <button
                      class="btn btn-link px-2"
                      onclick="this.parentNode.querySelector('input[type=number]').stepDown()"
                    >
                      <i class="fas fa-minus"></i>
                    </button>

                    <input
                      id="form1"
                      min="1"
                      name="txtSoluong"
                      value=<%=gk.ds.get(i).getSoluongmua()%>;
                      type="number"
                      class="form-control form-control-sm"
                      style="width: 70px;text-align: center;"
                    />

                    <button
                      class="btn btn-link px-2"
                      onclick="this.parentNode.querySelector('input[type=number]').stepUp()"
                    >
                      <i class="fas fa-plus"></i>
                    </button>
                  </div>
                  <div class="col-md-3 col-lg-2 col-xl-2 offset-lg-1">
                    
                 <h5 class="mb-0" style="font-size: 20px"><%=gk.ds.get(i).getThanhtien()%>$</h5> 
                  </div>
                  <div class="col-md-1 col-lg-1 col-xl-1 text-end" style="display: flex;align-content:center; align-items: center;">
                    <button type="submit" value="Cập nhật" style="border: none;background-color:#fff"
                      ><i
                        class="fas fa-wrench"
                        style="color: #1f4b51; margin-right: 10px;"
                      ></i
                    ></button>
                    <a href="XoaController?ms=<%=gk.ds.get(i).getMagiay()%>" class="text-danger"
                      ><i class="fas fa-trash fa-lg"></i
                    ></a>
                  </div>
                </div>
              </div>
              </form>
              <%
					}
			%>
			
            </div>
            

            <div class="card-body p-4">
              <div class="mb-0 me-5 d-flex align-items-center" style="position: relative;">
                <span class="small text-muted me-2" style="font-size: 15px">Số lượng giày:</span> 
                <span style="margin-top: 15px" class="lead fw-normal"><%=gk.Tong()%></span>
                  
                   <span class="small text-muted me-2" style="margin-left: 30px;font-size: 15px">Tổng tiền:</span> 
                   <span style="margin-top: 15px" class="lead fw-normal"><%=gk.Tong()%></span>
                  
                  <span style = "position: absolute;right: 0">
                  	<a href="HomeController"  class="btn btn-primary btn-lg">Tiếp tục mua hàng</a>
                  	<a href="XoaAllController" class="btn btn-danger btn-lg" style="margin-left: 10px">Xóa Giỏ Hàng</a>
                  </span>
              </div>
            </div>
            <div class="card">
              <a href="xacnhanController" class="btn btn-warning btn-block btn-lg">Đặt Hàng</a>
            </div>
                        <%
					}
			%>
          </div>
        </div>
      </div>
    </section>
    
    <div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">
			<!-- Modal content-->				
   %>
				
			</div>
		</div>
	</div>
  </body>
</html>
