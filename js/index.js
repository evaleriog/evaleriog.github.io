"use strict";
//Start of IIFE
(function (){
    $('.display_menu').click(function () {
        $('.show').toggle();
    });

    $('.project_image').click(function () {
        $(this).fadeOut("slow");
    })

})(); //End of IIFE
