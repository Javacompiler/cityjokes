<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<meta charset="utf-8"/>
<title>city jokes search</title>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" >


function test(){
	
	$.ajax({
	    type : "GET",
	    url : "${pageContext.request.contextPath}/category",
	    
	    success: function(list){
	    	
	    	
	    	  var options = "";
	    	  for(i in list)
	    	  {
	    		
	    	     options += "<option value = "+list[i]+">"+list[i]+"</option>"; 
	    	  }
	    	  $('#typeList').append(options);
	     		  
	        
	    }
	});
}



</script>
</head>
<body onload="test()">
   <form method="POST" 
          action="/cityjokes/search" >
             <table>
             <tr><td> <a href="#"></a></td></tr>
                <tr>
                   <td> Category Type:  <select id="typeList" name="type"><option value=""  selected="selected">Select</option></select></td>
                   <td />
                    <td><input type="text" name="search" /></td>
                     <td><input type="submit" value="Search"/></td>
                </tr>
                 <tr>
                   
                    <td><input type="reset"  value="Reset"/></td>
                </tr>
                
                <tr>
                   
                </tr>
            </table>
        </form> 
        
       <table border="1">
       
        <c:forEach items='${cityJokes }' var="p">
       <tr>
       <td>${p.punchline }</td> 
       </tr>
       </c:forEach>
       </table>

</body>
</html>
