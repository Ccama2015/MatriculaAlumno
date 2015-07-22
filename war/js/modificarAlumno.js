$(document).ready(function(){

$("#modificarAlumno").submit(function(event) {
		alert("MODIFICACION EXITOSA");
	event.preventDefault();
		
		var $form = $( this ),
			cui = $form.find( "input[name='cui']" ).val(),
			dato=$form.find("input[name='dato']").val(),
		    nombre = $form.find( "input[name='nombre']" ).val(),
		    alert("hila");
		    url = $form.attr( "action" );
		$.ajax({
            type: "POST",
            url: url,
            
            data: {"cui": cui, "nombre": nombre},
            success: function(data){
            	$("#x").html(data);
            	alert("HOLA");	
            }
            	
        });
		
	});
});