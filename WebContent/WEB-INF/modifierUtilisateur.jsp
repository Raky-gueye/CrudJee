<%@include file="/inc/header.jsp" %>

<%@ page import="beans.Utilisateur" %>

<h1>Modification d'un utilisateur</h1>
<form action="update" method="post">
<fieldset>
<legend>Modification d'un utilisateur</legend>
<label for="nom">Nom</label><br>
<input type="text" name="nom" id="nom" value="${utilisateur.nom }"><br>
<label for="prenom">Prenom</label><br>
<input type="text" name="prenom" id="prenom" value="${utilisateur.prenom}"><br>
<label for="login">Login</label><br>
<input type="text" name="login" id="login" value="${utilisateur.login }"><br>
<label for="password">Password</label><br>
<input type="password" name="password" id="password" value="${utilisateur.password }"><br>
<input type="submit" value ="Modifier"></input>
</fieldset>
</form>
	<%@include file="/inc/footer.jsp" %>
