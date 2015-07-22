$(document).ready(function(){

$("#modificarProfesor").submit(function(event) {
	alert("MODIFICACION EXITOSA");
	event.preventDefault();
		
		var $form = $( this ),
			DNIO = $form.find( "input[name='DNI']" ).val(),
			dato=$form.find("input[name='dato']").val(),
		    nombre = $form.find( "input[name='nombre']" ).val(),
		    alert("hila");
		    url = $form.attr( "action" );
		$.ajax({
            type: "POST",
            url: url,
            
            data: {"DNI": DNI, "nombre": nombre},
            success: function(data){
            	$("#x").html(data);
            	alert("HOLA");	
            }
            	
        });
		
	});
});
