  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
  
<table border="2" width="70%" cellpadding="2">  
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.userId}</td>  
    <td>${emp.firstName}</td>  
   <td>${emp.pwd}</td>
  <td>${emp.lastName}</td>
  <td>${emp.middleName}</td>
  <td>${emp.emailAddress}</td>
  <td>${emp.homePhone}</td>
  <td>${emp.workPhone}</td>
  <td>${emp.mobilePhone}</td>
  <td>${emp.fax}</td>
  <td>${emp.status}</td>
  
   </tr>  
   </c:forEach>  
   </table>  
     <td>${emp.firstName}</td> 