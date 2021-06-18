function validarForma(forma) {
    var usuario = forma.usuario;
    if(usuario.value =="" || usuario.value =="escribir usuario"){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;

    }
    var password = forma.password;
    if(password.value == "" || password.value.length <3){
        alert("Debe proporionar un password al menos de 3 caracteres");
        password.focus();
        password.select();
        return false;

    }
    var tecnologia = forma.tecnologias;
    var checkSeleccionado= false;
    //se itera porque hay varios checkbox y que se vuelven un arreglo
    for(var i =0; i< tecnologia.length;i++){
        if(tecnologia[i].checked){
            checkSeleccionado = true ;// seleccion de uno de los elementos del formulario

        }
    }
    if(!checkSeleccionado){
        alert("Debe Seleccionar una tecnologia");
        return false;
    }
//Validacion del elemento genero
    var generos = forma.genero;
    var radioSeleccionado = false;
    for (var i =0;i<generos.length; i++){
        if (generos[i].checked){
            radioSeleccionado= true;
        }
    }
    if(!radioSeleccionado){
        alert("Debe seleccionar un genero");
        return  false;
    }
    var ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        alert("debe Seleccionar una ocupacion");
        return false;
    }
    // formulario es valido
    alert("formulario valido, enviado datos al servidor");
    return true;
}