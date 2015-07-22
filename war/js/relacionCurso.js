$(document).ready(function(){

$("#relacionCurso").submit(function(event) {
	alert("GUARDADO EXITOSAMENTE");	
	event.preventDefault();
		
		var $form = $( this ),
		
		    nombre = $form.find( "input[name='nomcurso']" ).val(),
		    creditos = $form.find( "input[name='creditos']" ).val(),
		    codigo = $form.find( "input[name='codigo']" ).val(),
		    profesor = $form.find( "input[name='profesor']" ).val(),
		    deptacademico = $form.find( "input[name='deptacademico']" ).val(),
		    horas = $form.find( "input[name='horas']" ).val(),
		    grupos = $form.find( "input[name='grupos']" ).val(),
		    
		    url = $form.attr( "action" );
		$.ajax({
            type: "POST",
            url: url,
            
            data: {"nomcurso": nombre, "creditos": creditos, "codigo": codigo,
            	"profesor": profesor, "deptacademico": deptacademico, "horas": horas, "grupos": grupos},
            success: function(data){
            	$("#x").html(data);
            	
            }
            	
        });
		
	});
}); 
