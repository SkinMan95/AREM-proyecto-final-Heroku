var FormularioControllerModule = (function(){
    
    var init = function(){
        var num = 100000000;
        var wrapper         = $(".input_fields_wrap"); 
        var add_button      = $(".add_field_button");
        var x = 1;
        $(add_button).click(function (e) {
            e.preventDefault();
        if(x < num){ 
            x++; 
            $(wrapper).append('<br>');
            $(wrapper).append('<input>',{
                type:"text",
                id :"producto"+x,
                name:"producto"+x
                
            });
            $(wrapper).append('<br>');
        }
        });
        
    };
    
    return {
        init: init
    };
    
})();


