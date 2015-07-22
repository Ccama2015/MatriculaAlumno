$(document).ready(function(){

$("#eliminarCurso").submit(function(event) {
	alert("ELIMINADO CON EXITO");
	event.preventDefault();
		
		var $form = $( this ),
			codigo = $form.find( "input[name='codigo']" ).val(),
		    
		    url = $form.attr( "action" );
		$.ajax({
            type: "POST",
            url: url,
            data: {"codigo": codigo},
            success: function(data){
            	$("#x").html(data);
            }
        });
	});
});