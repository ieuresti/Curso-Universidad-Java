function desplegar (categoria) {
    var menu = document.getElementById(categoria);
    if (menu.className == "ver_menu") {
        menu.className = "ocultar_menu";
    }
    else {
        menu.className = "ver_menu";
    }
}