 $(document).ready( function () {
        $('#vliegtuigTable').DataTable({
            ajax: {
                "url": "http://localhost:8080/vliegtuig",
                "dataSrc": "_embedded.vliegtuigs"
            },
            "columns" : [
                {"data" : "vliegtuigNaam"},
                {"data" : "brandstof"},
                {"data" : "maatschappij"},


            ]
        });
        $('#vliegtuiglistbox').html = "";
        $('#vliegtuiglistbox').append("<option>"+nopeee+"</option>");

        fillListbox();//vul vliegtuig listbox


} );


var refreshTable = function(){
        $('#vliegtuigTable').DataTable().ajax.reload();
        console.log($('#vliegtuigTable'));

        var nope = "noppppeee";
        $('#vliegtuiglistbox').html = "";
        document.getElementById("vliegtuiglistbox").selectedIndex = -1;
        $("#vliegtuiglistbox").empty();

        $('#vliegtuiglistbox').append("<option>"+nope+"</option>");



 };


 var fillListbox = function(){

         //var nope = "noppppeee";
         //$('#vliegtuiglistbox').html = "";
         //document.getElementById("vliegtuiglistbox").selectedIndex = -1;
         $("#vliegtuiglistbox").empty();
         //$('#vliegtuiglistbox').append("<option>"+nope+"</option>");


        $.ajax({
             url: "http://localhost:8080/vliegtuig",
             type: "get",
             success: function (result){
                 console.log(result);
                 $("#vliegtuiglistbox").empty();
                 $.each(result._embedded.vliegtuigs,function(index,vliegtuig){


                       $('#vliegtuiglistbox').append("<option value=" + vliegtuig._links.self.href + ">"+vliegtuig.vliegtuigNaam+"</option>");

                       console.log(vliegtuig._links.self.href);
                 });


             },
             error: function(result){
                 console.log(result);
                 $('#vliegtuiglistbox').html(result.responseText);
             }

         })



  };

var fillPlaneFuel = function(){

         var nope = "noppppeee";
         $('#vliegtuiglistbox').html = "";
         //var vliegtuig = document.getElementById("vliegtuiglistbox").selectedIndex;


         //console.log(vliegtuig);
        //Pak de selected vliegtuig
         var e = document.getElementById("vliegtuiglistbox");
         var strUser = e.options[e.selectedIndex].value;

         console.log(strUser);

        //Zoek hem in de database
        //Doe een ajax insert op die locatie:
        $.ajax({
             url: strUser,
             type: "patch",
             data: JSON.stringify({
                "brandstof": 5000
             }),
             contentType: "application/json",
             success: function (result){
                 console.log(result);


             },
             error: function(result){
                 console.log(result);
                 $('#vliegtuiglistbox').html(result.responseText);
             }

         })



        //Maak van brandstof 5000 (insert)



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