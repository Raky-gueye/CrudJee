<%@include file="/inc/header.jsp" %>
<h1>Authentification d'un utilisateur</h1>
<C:if test="${isConnected == true}">
<p class="erreur">Login et/ou mot de passe incorrect!</p>
</C:if>
<form action="login" method="post">
<fieldset>
<legend>Authentification d'un utilisateur</legend>
<label for="nom">Login</label><br>
<input type="text" name="login" id="login" value="${login }"><br>
<label for="password">Password</label><br>
<input type="password" name="password" id="password"><br><br>
   <input type="submit" value ="Connexion"></input>
</fieldset>
</form>
<%@include file="/inc/footer.jsp" %>
