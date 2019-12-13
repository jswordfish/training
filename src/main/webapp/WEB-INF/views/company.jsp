<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
    </head>
    <body>
        <h3>Create Company</h3>
        <form name="companyForm"  method="post" modelAttribute="company" action="saveCompany">
             <table>
                <tr>
                    <td> <label>Company Name</label></td>
                    <td><form:input path="company.companyName"/></td>
                </tr>
                 <tr>
                    <td> <label>Company ID</label></td>
                    <td><form:input path="company.companyId"/></td>
                </tr>
                <tr>
                    <td> <label>Company Location</label></td>
                    <td><form:input path="company.companyLocation"/></td>
                </tr>
                 <tr>
                    <td> <label>Company Email</label></td>
                    <td><form:input path="company.singlePointOfContactEmail"/></td>
                </tr>
				<tr>
                    <td> <label>Company Phone</label></td>
                    <td><form:input path="company.singlePointOfContactPhone"/></td>
                </tr>
				<tr>
                    <td> <label></label></td>
                    <td><input class="save" type="submit" value="Save"></td>
                </tr>
				 
            </table>
        </form>
    </body>
</html>