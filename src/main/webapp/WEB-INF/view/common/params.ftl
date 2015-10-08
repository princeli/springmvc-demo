<#include "/common/taglibs.ftl" />

<!-- js定义  导入方法 <@js name="jquery"/> -->
<#macro js name> 
	<#if name == "jquery"> 
		<!-- jQuery -->
    	<!--<script src="<@basePath/>/bower_components/jquery/dist/jquery.min.js"></script>-->
    	<script src="<@basePath/>/bower_components/jquery/dist/jquery-1.11.1.min.js"></script>
	</#if>
	
	<#if name == "bootstrap"> 
    	<!-- Bootstrap Core JavaScript -->
    	<script src="<@basePath/>/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	</#if>
	
	<#if name == "sbadmin"> 
    	<!-- Custom Theme JavaScript -->
    	<script src="<@basePath/>/assets/js/sb-admin-2.js"></script>
	</#if>
	
	<#if name == "html5"> 
    	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
    	<script src="<@basePath/>/assets/js/respond.min.js"></script>
    	<script src="<@basePath/>/assets/js/html5shiv.min.js"></script>
    	<![endif]-->
	</#if>
	
	<#if name == "metisMenu"> 
   		<!-- Metis Menu Plugin JavaScript -->
    	<script src="<@basePath/>/bower_components/metisMenu/dist/metisMenu.min.js"></script>
	</#if>
	
	<#if name == "morris"> 
    	<!-- Morris Charts JavaScript -->
    	<script src="<@basePath/>/bower_components/raphael/raphael-min.js"></script>
    	<script src="<@basePath/>/bower_components/morrisjs/morris.min.js"></script>
    	<script src="<@basePath/>/js/morris-data.js"></script>
	</#if>
	

	
	 <#if name == "flot">    
        <!-- Flot Charts JavaScript -->
    	<script src="<@basePath/>/bower_components/flot/excanvas.min.js"></script>
    	<script src="<@basePath/>/bower_components/flot/jquery.flot.js"></script>
    	<script src="<@basePath/>/bower_components/flot/jquery.flot.pie.js"></script>
    	<script src="<@basePath/>/bower_components/flot/jquery.flot.resize.js"></script>
    	<script src="<@basePath/>/bower_components/flot/jquery.flot.time.js"></script>
    	<script src="<@basePath/>/bower_components/flot.tooltip/js/jquery.flot.tooltip.min.js"></script>
    	<script src="<@basePath/>/js/flot-data.js"></script>
    </#if>
    
	<#if name == "dataTables"> 
    	<!-- DataTables JavaScript -->
    	<script src="<@basePath/>/bower_components/datatables/media/js/jquery.dataTables.min.js"></script>
    	<script src="<@basePath/>/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>
    	<script>
    	$(document).ready(function() {
        	$('#dataTables-example').DataTable({
                responsive: true
        	});
    	});
    	</script>
	</#if>
	
	<#if name == "user.list"> 
    	<!-- DataTables JavaScript -->
    	<script src="<@basePath/>/js/user/list-data.js"></script>
	</#if>
	

</#macro>

<!-- css定义 导入方法 <@css name="bootstrap"/> -->
<#macro css name> 
	<#if name == "bootstrap"> 
    	<!-- Bootstrap Core CSS -->
    	<link href="<@basePath/>/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
	</#if>
	
	<#if name == "metisMenu"> 
    	<!-- MetisMenu CSS -->
    	<link href="<@basePath/>/bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">
	</#if>	
	
	<#if name == "timeline"> 
		<!-- Timeline CSS -->
    	<link href="<@basePath/>/assets/css/timeline.css" rel="stylesheet">
	</#if>
	
	<#if name == "sbadmin">
    	<!-- Custom CSS -->
    	<link href="<@basePath/>/assets/css/sb-admin-2.css" rel="stylesheet">
	</#if>
		
	<#if name == "morris"> 
    	<!-- Morris Charts CSS -->
    	<link href="<@basePath/>/bower_components/morrisjs/morris.css" rel="stylesheet">
    </#if>
    
	<#if name == "fonts"> 
    	<!-- Custom Fonts -->
    	<link href="<@basePath/>/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    </#if>
    
	<#if name == "dataTables"> 
    	<!-- DataTables CSS -->
    	<link href="<@basePath/>/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet">

    	<!-- DataTables Responsive CSS -->
    	<link href="<@basePath/>/bower_components/datatables-responsive/css/dataTables.responsive.css" rel="stylesheet">
    </#if>
    
    <#if name == "social"> 
    	<!-- Social Buttons CSS -->
    	<link href="<@basePath/>/bower_components/bootstrap-social/bootstrap-social.css" rel="stylesheet">
    </#if>

</#macro>

<!-- js业务模块定义  导入方法 <@importjs module="index"/> -->
<#macro importjs module>
	<!-- 公共js-->
	<@js name="jquery"/>

	<@js name="bootstrap"/>

	<@js name="metisMenu"/>
	
	<@js name="sbadmin"/>	
	
	<@js name="html5"/>

	<#if module == "index">
		<@js name="morris"/>
	</#if>
	
	<#if module == "flot">		
		<@js name="flot"/>
	</#if>
	
	<#if module == "morris">
		<@js name="morris"/>
	</#if>
	
	<#if module == "tables">
		<@js name="dataTables"/>
	</#if>
	
	<#if module == "forms">
	</#if>
	
	<#if module == "user.list">
		<@js name="dataTables"/>
		<@js name="user.list"/>
	</#if>
	
</#macro>


<!-- css业务模块定义  导入方法 <@importjs module="index"/> -->
<#macro importcss module> 
	<!-- 公共css-->
	<@css name="bootstrap"/>

	<@css name="metisMenu"/>

	<@css name="timeline"/>

	<@css name="sbadmin"/>
	
	<@css name="fonts"/>
	
	<#if module == "index">
		<@css name="morris"/>
	</#if>
	
	<#if module == "flot">
		<@css name="fonts"/>
	</#if>
	
	<#if module == "morris">
		<@css name="morris"/>
	</#if>
	
	<#if module == "tables">
		<@css name="dataTables"/>
	</#if>
	
	<#if module == "forms">
	</#if>
	
	<#if module == "buttons">
		<@css name="social"/>
	</#if>
	
	<#if module == "tables">
		<@css name="dataTables"/>
	</#if>
	
</#macro>
