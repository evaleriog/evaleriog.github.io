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
    });

    $('.project_info').click(function () {
        $(this).hide();
    });

    $('#submit').click(function (e) {
        e.preventDefault();
        let name;
        let email;
        let message;

        if($('#name').val() !== ""){
            name = $('#name').val();
        }else{
            alert("Name cannot be empty");
        }

        if($('#email').val() !== ""){
            email = $('#email').val();
        }else {
            alert("Email cannot be empty");
        }

        if($('#message').val() !== ""){
            message = $('#message').val();
        }else {
            alert("Message cannot be empty");
        }

        alert(name + " " + email + " " + message);

        $('#name').val("");
        $('#email').val("");
        $('#message').val("");

        $('.message').hide();

    });

    $('#cancel').click(function (e) {
        e.preventDefault();

        $('#name').val("");
        $('#email').val("");
        $('#message').val("");

        $('.message').hide();
    });

})(); //End of IIFE
