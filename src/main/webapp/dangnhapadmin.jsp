<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>s
<title>Đăng nhập Admin</title>
<style>
.bg-image-vertical {
	position: relative;
	overflow: hidden;
	background-repeat: no-repeat;
	background-position: right center;
	background-size: auto 100%;
}

@media ( min-width : 1025px) {
	.h-custom-2 {
		height: 100%;
	}
}
</style>
</head>

<body>
	<section class="vh-100">
		<div class="container-fluid">
			<div class="row">
			<div class="col-sm-6 px-0 d-none d-sm-block">
					<img
						src="giay-adidas-grand-court-base-2-nam-xam-01-1000x1000.jpg"
						alt="Login image" class="w-100 vh-100"
						style="object-fit: cover; object-position: left;">
				</div>
				<div class="col-sm-6 text-black">

					<div class="px-5 ms-xl-4">
						<i class="fas fa-crow fa-2x me-3 pt-5 mt-xl-4"
							style="color: #709085;"></i> <span class="h1 fw-bold mb-0">Admin</span>
					</div>

					<div
						class="d-flex align-items-center h-custom-2 px-5 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5">

						<form style="width: 23rem;" action="admindangnhapController" method="post">

							<h3 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Log
								in</h3>

							<div class="form-outline mb-4">
								<input type="text" id="form2Example18"
									class="form-control form-control-lg"  name="txttk" /> <label
									class="form-label" for="form2Example18">Username</label>
							</div>

							<div class="form-outline mb-4">
								<input type="password" id="form2Example28"
									class="form-control form-control-lg"name="txtmk" /> <label
									class="form-label" for="form2Example28" >Password</label>
							</div>

							<div class="pt-1 mb-4">
								<button class="btn btn-info btn-lg btn-block" type="submit">Login</button>
							</div>						
						</form>

					</div>

				</div>
				
			</div>
		</div>
	</section>
</body>
</html>