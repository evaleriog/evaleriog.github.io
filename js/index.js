"use strict";
//Start of IIFE
(function (){
    //variable card to flip projects
    var card = document.querySelector('.card');
    card.addEventListener( 'click', function() {
        card.classList.toggle('is-flipped');
    });

})(); //End of IIFE
