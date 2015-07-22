$(document).ready(function(){

$("#registroProfesor").submit(function(event) {
	alert("GUARDADO CON EXITO");	
	event.preventDefault();
	
		var $form = $( this ),
			DNI = $form.find( "input[id='DNI']" ).val(),
		    Nombre = $form.find( "input[id='Nombre']" ).val(),
		    ApellidoPaterno = $form.find( "input[id='ApellidoPaterno']" ).val(),
		    ApellidoMaterno = $form.find( "input[id='ApellidoMaterno']" ).val(),
		    FechaNacimiento = $form.find( "input[id='FechaNacimiento']" ).val(),
		    Sexo = $form.find( "input[id='Sexo']" ).val(),
		    Direccion = $form.find( "input[id='Direccion']" ).val(),
		    Departamento = $form.find( "input[id='Departamento']" ).val(),
		    Provincia = $form.find( "input[id='Provincia']" ).val(),
		    Distrito = $form.find( "input[id='Distrito']" ).val(),
		    GradoAcademico = $form.find( "input[id='GradoAcademico']" ).val(),
		    DepartamentoAcademico = $form.find( "input[id='DepartamentoAcademico']" ).val(),
		    Telefono = $form.find( "input[id='Telefono']" ).val(),
		    url = $form.attr( "action" );
		$.ajax({
            type: "POST",
            url: url,
            
            data: {"DNI": DNI, "Nombre": Nombre, "ApellidoPaterno": ApellidoPaterno, "ApellidoMaterno": ApellidoMaterno,
            	"FechaNacimiento": FechaNacimiento, "Sexo": Sexo, "Direccion": Direccion, "Departamento": Departamento,
            	"Provincia": Provincia, "Distrito": Distrito, "GradoAcademico": GradoAcademico, 
            	"DepartamentoAcademico": DepartamentoAcademico, "Telefono": Telefono},
            success: function(data){
            	$("#x").html(data);
            }
        });
	});
});
