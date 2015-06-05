<#include "/common/params.ftl" />
<#macro exampleLayout title module>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>${title}</title>

	
	<@importcss module="${module}"/>



    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <#include "/layout/example/top.ftl" />
        </nav>
        
    </div>
    <!-- /#wrapper -->
    
    <#include "/layout/example/left.ftl" />
    
    <div id="page-wrapper">
 			<#nested/>
    </div>
    <!-- /#page-wrapper -->

	<@importjs module="${module}"/>


</body>
</html>
</#macro>