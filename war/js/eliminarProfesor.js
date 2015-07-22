$(document).ready(function(){

$("#eliminarProfesor").submit(function(event) {
	alert("ELIMINADO CON EXITO");
	event.preventDefault();
		
		var $form = $( this ),
			DNI = $form.find( "input[name='DNI']" ).val(),
		    
		    url = $form.attr( "action" );
		$.ajax({
            type: "POST",
            url: url,
            data: {"DNI": DNI},
            success: function(data){
            	$("#x").html(data);
            }
        });
	});
});
