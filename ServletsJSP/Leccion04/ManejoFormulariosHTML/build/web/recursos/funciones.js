function validarForma(forma) {
    //Validamos el usuario
    var usuario = forma.usuario;
    if (usuario.value == "" || usuario.value == "Escribir usuario") {
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    //Validamos el password
    var password = forma.password;
    if (password.value == "" || password.value.length < 5) {
        alert("Debe proporcionar un password al menos de 5 caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    //Validamos las tecnologias de interes
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    
    //revisamos si se selecciono algun checkbox
    for (i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            checkSeleccionado = true;
        }
    }
    if (!checkSeleccionado) {
        alert("Debe proporcionar una Tecnologia");
        return false;
    }
    
    //Validamos el genero
    var generos = forma.genero;
    var radioSeleccionado = false;
    
    //revisamos si se selecciono algun radiobutton
    for (i = 0; i < generos.length; i++) {
        if (generos[i].checked) {
            radioSeleccionado = true;
        }
    }
    if (!radioSeleccionado) {
        alert("Debe seleccionar el Genero");
        return false;
    }
    
    //Validamos la ocupacion
    var ocupacion = forma.ocupacion;
    if (ocupacion.value == "") {
        alert("Debe seleccionar una Ocupacion");
        return false;
    }
    
    //Formulario validado
    alert("Formulario valido, enviando datos...");
    return true;
}
