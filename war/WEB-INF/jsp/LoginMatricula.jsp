<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="es">
<head>
	<title>Sistema de matriculas</title>
	<meta charset="utf-8">
	
	<link rel="stylesheet" href="css/estilo.css">
	<link rel="stylesheet" href="css/sesion.css">
	<link rel="stylesheet" href="css/animacion.css">
	<link rel="stylesheet" href="css/menu.css">
	<link rel="stylesheet" href="css/index.css">
	
</head>
<body>
	<div id="fb-root"></div>
	<script>(function(d, s, id) {
	  var js, fjs = d.getElementsByTagName(s)[0];
	  if (d.getElementById(id)) return;
	  js = d.createElement(s); js.id = id;
	  js.src = "//connect.facebook.net/es_ES/sdk.js#xfbml=1&version=v2.3";
	  fjs.parentNode.insertBefore(js, fjs);
	}(document, 'script', 'facebook-jssdk'));</script>
	<header id="cabecera">
		<div id="titulos">
			<div id="titulo">
				<h5>SISTEMA DE MATRICULAS</h5>
				<h1>NUEVA EDUCCION EPIS-UNSA</h1>
			</div>
			<div id="sesion">
				<h4>Iniciar Sesion: </h4>
				<form action="sessionadmin" method="post">
					<input type="text" required placeholder="Usuario" name='usuario' value='' class="in">
					<input type="password" required placeholder="Password" name='pass' value='' class="in">
					<input type="submit" value="ENTRAR" class="entrar">
				</form>
			</div>
		</div>
	</header>
	
	
	<nav id="menu">
		<div id="menuCenter">
			<div id="nav">
				<ul>
					<li><a href="index.html">INICIO</a></li>
					<li><a href="#">DESCRIPCION</a></li>
					<li><a href="Matricula.jsp">MATRICULA</a></li>
					<li><a href="pregrado.jsp">PREGRADO</a></li>
					<li><a href="noticias.jsp">NOTICIAS</a></li>
					<li><a href="mas.jsp">MAS</a></li>
				
				</ul>
						<!-- cuerpo--> 
	<center>
	     <div id="sesion" >
				<h4>Ingresar a matricula: </h4>
				<form action="sessionmatricula" method="post">
					<input type="text" required placeholder="Usuario" name='usuario' value='' class="in">
					<input type="password" required placeholder="Password" name='pass' value='' class="in">
					<input type="submit" value="ENTRAR" class="entrar">
				</form>
			</div>
	</center>
	<br>
	<!-- cuerpo--> 	
			</div>
			
		</div>
		

	
	</nav>


	<footer id="pie">
		<div id="pieCenter">
			<div id="masInformacion">
				<div class="menus">
					<h5>Corporativo</h5>
					<ul>
						<li><a href="#">Qui�nes Somos</a></li>
						<li><a href="#">Bienvenida</a></li>
						<li><a href="#">Mision</a></li>
						<li><a href="#">Vision</a></li>
					</ul>
				</div>
				<div class="menus">
					<h5>Servicios</h5>
					<ul>
						<li><a href="#">Escuelas</a></li>
						<li><a href="#">tutoriales</a></li>
						<li><a href="#">concursos</a></li>
						<li><a href="#">seminarios</a></li>
					</ul>
				</div>
				<div class="menus">
					<h5>Instituciones Relacionadas</h5>
					<ul>
						<li><a href="http://www.unsa.edu.pe/" target='_blank'>UNSA</a></li>
						<li><a href="http://www.episunsa.edu.pe/web/" target='_blank'>EPIS - UNSA</a></li>
						<li><a href="" target='_blank'>GITHUB</a></li>
						<li><a href="https://www.google.com.pe/maps/place/EPIS-UNSA/@-16.4063951,-71.5248655,17z/data=!3m1!4b1!4m2!3m1!1s0x0000000000000000:0x64eb10832094761c?hl=es-419" target='_blank'>MAPA</a></li>
						<li><a href="" target='_blank'>DOCUMENTOS</a></li>
					</ul>
				</div>
				<div class="menus">
					<h5>Sedes Arequipa</h5>
					<ul>
						<li><a href="#">Cercado</a></li>
					</ul>
					</div>
			</div>
			<div id="licencia">Derechos Reservados &copy; 2015 Sysdata</div>
		</div>
	</footer>
</body>
</html>