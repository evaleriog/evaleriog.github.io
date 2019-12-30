"use strict";
//Start of IIFE
(function (){
    $('.display_menu').click(function () {
        $('.show').toggle();
    });

    $('.display_message').click(function () {
        $('.message').show();
    });

    $('.project_image').click(function () {
        $(this).next('.project_info').show();
        // $(this).hide();
    });

    $('.project_info').click(function () {
        // $(this).before('.project_image').show();
        $(this).hide();
    });

})(); //End of IIFE
