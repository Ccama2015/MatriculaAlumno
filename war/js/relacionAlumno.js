$(document).ready(function(){

$("#relacionAlumno").submit(function(event) {
	alert("HOLA");	
	event.preventDefault();
		
		var $form = $( this ),
			cui = $form.find( "input[name='cui']" ).val(),
		    nombre = $form.find( "input[name='nombre']" ).val(),
		    apellidoPaterno = $form.find( "input[name='apellidoPaterno']" ).val(),
		    apellidoMaterno = $form.find( "input[name='apellidoMaterno']" ).val(),
		    dni = $form.find( "input[name='dni']" ).val(),
		    direccion = $form.find( "input[name='direccion']" ).val(),
		    ciudad = $form.find( "input[name='ciudad']" ).val(),
		    distrito = $form.find( "input[name='distrito']" ).val(),
		    numTelefono = $form.find( "input[name='numTelefono']" ).val(),
		    nacimiento = $form.find( "input[name='nacimiento']" ).val(),
		    sexo = $form.find( "input[name='sexo']" ).val(),
		    nombreAp = $form.find( "input[name='nombreAp']" ).val(),
		    direccionAp = $form.find( "input[name='direccionAp']" ).val(),
		    telefonoAp = $form.find( "input[name='telefonoAp']" ).val(),
		    url = $form.attr( "action" );
		$.ajax({
            type: "POST",
            url: url,
            
            data: {"cui": cui, "nombre": nombre, "apellidoPaterno": apellidoPaterno, "apellidoMaterno": apellidoMaterno,
            	"dni": dni, "direccion": direccion, "ciudad": ciudad, "distrito": distrito,
            	"numTelefono": numTelefono, "nacimiento": nacimiento
            	, "sexo": sexo, "nombreAp": nombreAp, "direccionAp": direccionAp, "telefonoAp": telefonoAp},
            success: function(data){
            	$("#x").html(data);
            	
            }
            	
        });
		
	});
});