<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AJAX calls using Jquery in Servlet</title>
        <script src="http://code.jquery.com/jquery-latest.js">   
        </script>
        <script>
            $(document).ready(function() {                        
                $('#submit1').click(function(event) {  
                    var username=$('#user').val();
                 $.get('ActionServlet',{user:username},function(responseText) { 
                        $('#welcometext').text(responseText);     
                        console.log(responseText);
                    });
                });
                
                
                $('#submit').click(function(event) { 
                var jsonObjects = [{id:1, name:"amit"}, {id:2, name:"ankit"},{id:3, name:"atin"},{id:1, name:"puneet"}];

                jQuery.ajax({
                          url: 'ActionServlet',
                          type: "POST",
                          data: {students: JSON.stringify(jsonObjects) },
                          dataType: "json",
                          beforeSend: function(x) {
                            if (x && x.overrideMimeType) {
                              x.overrideMimeType("application/j-son;charset=UTF-8");
                            }
                          },
                          success: function(result) {
                        	  console.log('result from post>>>',result);
                          }
                	});
                });
            });
        </script>
</head>
<body>
<form id="form1">
<h1>AJAX Demo using Jquery in JSP and Servlet</h1>
Enter your Name:
<input type="text" id="user"/><br/>
<input type="button" id="submit" value="Ajax Submit"/>
<br/>
<div id="welcometext">
</div>
</form>
</body>
</html>