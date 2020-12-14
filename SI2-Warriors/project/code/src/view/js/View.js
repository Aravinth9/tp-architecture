$.ajax({
    url: "localhost:9191/",
    context: document.body
}).done(function() {
    $( this ).addClass( "done" );
});