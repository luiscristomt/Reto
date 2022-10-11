$("document").ready(function (){
    getClient();
});
function getClient(){
    $.ajax({
        url: "/api/Client/all",
        type: 'GET',
        dataType: 'json',
        success: function(client){
            $("#resultado").empty();
            for(i= 0; i< client.length; i++){
                $("#resultado").append(client[i].idClient+ " "+ client[i].name+ " "+ client[i].age+ " "+ client[i].email);
                $("#resultado").append("<br>");
            }
        },
        error: function (xhr, status){
            alert('Ha sucedido un problema');
        }
    });
}