<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/menu.js"></script>
	<script type="text/javascript" src="js/slideshow.js"></script>
	<script type="text/javascript" src="js/cufon-yui.js"></script>
	<script type="text/javascript" src="js/Arial.font.js"></script>
	<script type="text/javascript" src="js/registroCurso.js"></script>
	
	<link rel="stylesheet" href="css/main.css" type="text/css" />
	


<title>Registrar curso</title>
</head>
<body>
<div id="bg">
		<div class="wrap">
			
			<!-- logo -->
			<h1><a href="controladorVista?opcion=1">MATRICULAS</a></h1>
		
			<!-- /logo -->
			
			<!-- menu -->
				<div id="mainmenu">
			
				<ul id="menu">
					<li><a class="current" href="controladorVista?opcion=1">Inicio</a></li>
					<li><a href="#">REGISTRO</a>
						<ul><li><a href="controladorVista?opcion=4">Registrar nuevo Profesor</a></li>
						    <li><a href="controladorVista?opcion=2">Registrar nuevo Alumno</a></li>
						    <li><a href="controladorVista?opcion=3">Registrar nuevo Curso</a></li>
						</ul>
					</li>
					<li><a href="#">MODIFICAR</a>
					    <ul>
					        <li><a href="controladorVista?opcion=10">Modificar datos de Profesor</a></li>
						    <li><a href="controladorVista?opcion=8">Modificar datos de Alumno</a></li>
						    <li><a href="controladorVista?opcion=9">Modficar datos de Curso</a></li>
						</ul>
					</li>
					   <li><a href="#">REMOVER</a>
					         <ul>
					        <li><a href="controladorVista?opcion=7">Datos de  un Profesor</a></li>
						    <li><a href="controladorVista?opcion=5">Datos de un Alumno</a></li>
						    <li><a href="controladorVista?opcion=6">Datos de un Curso</a></li>
						</ul>
					   </li>	
					  <li><a href="#">MOSTRAR</a>
					         <ul>
					        <li><a href="relacionProfesor">Lista de  un Profesor</a></li>
						    <li><a href="relacionAlumnos">Lista de un Alumno</a></li>
						    <li><a href="relacionCurso">Lista de un Curso</a></li>
						</ul>
					  </li>
					 
					  <li><a href="index.html" action="cerrar">Salir</a></li>
				</ul>
			</div>
			<!-- /menu -->
			
			<!-- presentacion -->
			<div id="pitch">
				<div id="slideshow">
					
					<!-- 1st frame -->
					<div class="active">
						<img src="images/cabeza.jpg" alt="" />
						<div class="overlay transparent">
							<h2>Estudios prefesionales</h2>
							<p>Ampliando el desarrollo de nuestros alumnos con trabajo unificado</p>
						</div>
						<p class="arrow"><a href="#"></a></p>
					</div>
					<!-- /1st frame -->
					
					<!-- 2nd frame -->
					<div>
						<img src="images/cabeza.jpg" alt="" />
						<div class="overlay transparent">
							<h2>Calidad de enseñanza</h2>
							<p>Contrato de Docentes con metodologia de la enseñanza.</p>
						</div>
						<p class="arrow"><a href="#"></a></p>
					</div>
					<!-- /2nd frame -->
					
					<!-- 3rd frame -->
					<div>
						<img src="images/cabeza.jpg" alt="" />
						<div class="overlay transparent">
							<h2>Becas del extranjero</h2>
							<p>Informe de las becas que la escuela profesional otorga al alumno mejor calificados.</p>
						</div>
						<p class="arrow"><a href="#"></a></p>
					</div>
					<!-- 3rd frame -->
					
				</div>
			</div>
			<!-- /presentacion -->
			
			<!-- menu -->	
			
			<div id="main">
				 <div id="cuerpo" >
                   <a style=" font-family: Calibri; font-size: 40px ">REGISTRO DE CURSO</a><br>
                 </div><br>
	
				<!-- bits -->
				<div id="x">
				  <form action="registroCurso" id="registroCurso" method="post">
		
			   <div id="formulario">
			
				  <div class="fila">
					<div class="etiqueta">
						<label for="name">Nombre de Curso :</label>
					</div>
					<div class="control">
						<input type="text" id="nomcurso" name="nomcurso" maxlength="20" required/>
					</div>
				  </div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="name">Numero de creditos :</label>
					</div>
					<div class="control">
						<input type="number" id="creditos" name="creditos" maxlength="2" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="name">Codigo del Curso :</label>
					</div>
					<div class="control">
						<input type="number" id="codigo" name="codigo"  maxlength="25" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="name">Semestre: </label>
					</div>
					<div class="control">
						<input type="text" id="semestre" name="semestre"  maxlength="25" required/>
					</div>
				</div>
				
				
				<div class="fila">
					<div class="etiqueta">
						<label for="name">Departamento academico de procedencia :</label>
					</div>
					<div class="control">
						<input type="text" id="deptacademico" name="deptacademico" maxlength="30" required/>
					</div>
				</div>
				
				
				
				<div class="fila">
					<div class="etiqueta">
						<label for="name">Horas:</label>
					</div>
					<div class="control">
						<input type="number" name="horas" id="horas" maxlength="10" required/>
					</div>
				</div>
				
				
				<div class="fila">
					<div id="action">
						<input type="submit" value="Guardar" id="registroCurso"/>
					</div>
				</div>
				
			</div>
		</form>
		</div>
				<!-- /bits -->
		
			</div>
			<!-- /main -->
			
			<!-- side -->
			<div id="side">
				<h4>Ultimas noticias</h4>
				
				<div class="news">
					<h5><a href="#">Consejo estudiantil</a></h5>
					<p>Presentamos aqui las desciciones que dan a conocer nuestra autoridades universitarias.</p>
				</div>
				
				<div class="news">
					<h5><a href="#">Fechas importantes </a></h5>
					<p>Anuncia eventos importantes de interes publico en nuestra universidad .</p>
				</div>
				
				<div class="news">
					<h5><a href="#">Anuncios academiscos</a></h5>
					<p>Informa del proceso del año academico, fechas de inicio y fin.</p>
				</div>

			</div>
			<!-- /side -->
		</div>
			
		<!-- footer -->
		<div id="footer">
			<div id="footerbg">
				<div class="wrap">
				
					<!--links -->
					<p id="footer_menu">
						<a href="#">develop_link @ gmail.com</a>
						<a href="#">google</a>
						<a href="#">UNSA</a>
									
			
					</p>
					<!-- /credit links -->
					
					<p id="copy">Desarrolladores<span>professional developers</span></p>
					
					<div class="clear"></div>
				</div>
			</div>
		</div>
		<!-- /footer -->
		
	</div>



</body>
</html>