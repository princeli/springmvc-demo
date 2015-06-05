$(document).ready(function() {
    $('#example').dataTable( {
        "ajax": "list.json",
        "columns": [
            { "data": "id" },
            { "data": "name" },
            { "data": "password" },
            { "data": "birthday" },
            { "data": "salary" }
        ]
    } );
});

