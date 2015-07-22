$(document).ready(function(){

$("#modificarCurso").submit(function(event) {
		
	event.preventDefault();
		
		var $form = $( this ),
			codigo = $form.find( "input[name='codigo']" ).val(),
			
		    alert("hola");
		    url = $form.attr( "action" );
		$.ajax({
            type: "POST",
            url: url,
            
            data: {"codigo": codigo,},
            success: function(data){
            	$("#x").html(data);
            	alert("HOLA");	
            }
            	
        });
		
	});
});