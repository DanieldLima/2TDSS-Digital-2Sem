<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="titulo" required="true"%>
<%@ attribute name="tituloPagina" required="true"%>
<%@ attribute name="scripts" fragment="true"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${titulo}| Spring MVC</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap.min.css"/>">

</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light"> <a
		class="navbar-brand" href="<c:url value="/home" />">Home</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> Convidados </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="<c:url value="/home/cadastrar"/>">Cadastrar</a>
					<a class="dropdown-item" href="<c:url value="/home/listar"/>">Listar</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Cadastro de produto</a>
				</div></li>
			<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
			</li>
		</ul>
		<form method="get" action="<c:url value="/produto/pesquisa"/>" class="form-inline my-2 my-lg-0">
			<input name="buscaProduto" class="form-control mr-sm-2" type="search"
				placeholder="Search" aria-label="Search">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>
	</div>
	</nav>
	<div class="dropdown-divider"></div>
	<div class="container mt-5 mb-5">
		<h1 class="mb-5">${tituloPagina}</h1>

		<jsp:doBody />
	</div>
			
	<div class="dropdown-divider"></div>	
	<footer class="text-center card-header ">
		<p>Todos os direitos reservados 2018&copy;</p>
	</footer>

	<script src="<c:url value="/resources/js/jquery-3.3.1.min.js"/>"></script>
	<jsp:invoke fragment="scripts" />
</body>
</html>