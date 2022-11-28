<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page import ="beans.Utilisateur "  %>
<%@ page import ="java.util.ArrayList "  %>
<%@taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/inc/header.jsp" %>
<%--  <jsp:include page="/inc/header.jsp"/> --%>
<h1>Liste des utilisateurs</h1>
<C:choose>
<C:when test="${empty utilisateurs }">
<p>La liste des utilisateurs est vide !</p>
</C:when>
<C:otherwise>
	<table id="customers">
	<tr>
	<th>ID</th>
	<th>Nom</th>
	<th>Prenom</th>
	<th>Login</th>
	<th>Password</th>
	<th colspan="2">Actions</th>
	</tr>
	<C:forEach var="utilisateur" items="${utilisateurs }">
	<tr>
	    <td><C:out value=" ${utilisateur.id }"></C:out></td>
		<td><C:out value=" ${utilisateur.nom }"></C:out></td>
		<td><C:out value=" ${utilisateur.prenom }"></C:out></td>
		<td><C:out value=" ${utilisateur.login }"></C:out></td>
		<td><C:out value=" ${utilisateur.password }"></C:out></td>
	    <td><a href="update?id=${utilisateur.id }">Modifier</a></td>
	    <td><a href="delete?id=${utilisateur.id }" onclick="return confirm('Etes-vous sur ??')">Supprimer</a></td>
	    
	</tr>
	</C:forEach>
	</table>
</C:otherwise>
</C:choose>
<%@include file="/inc/footer.jsp" %>
	
	
