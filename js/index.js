"use strict";
//Start of IIFE
(function (){
    //variable card to flip projects
    const card = document.querySelector('.card');
    card.addEventListener( 'click', function() {
        card.classList.toggle('is-flipped');
    });

})(); //End of IIFE
