<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Edit Employee</h1>
       <form:form method="POST" action="/eretail-admin-web/getcategory.do">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="idx" /></td>
         </tr> 
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Salary :</td>  
          <td><form:input path="descr" /></td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td><form:input path="createdBy" /></td>
         </tr> 
           <tr>  
          <td>Designation :</td>  
          <td><form:input path="createDate" /></td>
         </tr> 
           <tr>  
          <td>Designation :</td>  
          <td><form:input path="modifiedBy" /></td>
         </tr> 
           <tr>  
          <td>Designation :</td>  
          <td><form:input path="modifiedDate" /></td>
         </tr>
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
