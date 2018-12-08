 $(document).ready( function () {
        $('#vliegtuigTable').DataTable({
            ajax: {
                "url": "http://localhost:8080/vliegtuig",
                "dataSrc": "_embedded.vliegtuigs"
            },
            "columns" : [
                {"data" : "vliegtuigNaam"},
                {"data" : "brandstof"},

            ]
        });
    } );

 var refreshTable = function(){
        $('#vliegtuigTable').DataTable().ajax.reload();
        console.log($('#vliegtuigTable'));



 };
/*
 var getData = function(){
         $.ajax({
             url: "http://localhost:8080/vliegtuig",
             type: "get",
             success: function (result){
                 console.log(result);
                 $('#vliegtuigTable').html("");
                 $.each(result._embedded.vliegtuigs,function(index,vliegtuig){
                     $('#vliegtuigen').append(
                         "<div>" + vliegtuig.title + "</div>"
                     );
                 });


             },
             error: function(result){
                 console.log(result);
                 $('#vliegtuigen').html(result.responseText);
             }

         })




     };

*/