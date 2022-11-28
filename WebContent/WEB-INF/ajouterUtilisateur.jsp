<%@include file="/inc/header.jsp" %>
<h1>Ajout d'un utilisateur</h1>
<p>${statusMessage }</p>
<form action="" method="post">
<fieldset>
<legend>Ajout d'un utilisateur</legend>
<label for="nom">Nom</label><br>
<input type="text" name="nom" id="nom" value="${ utilisateurs.nom }"><br>
<span class="erreur">${ erreurs.nom }</span>
<label for="prenom">Prenom</label><br>
<input type="text" name="prenom" id="prenom" value="${ utilisateurs.prenom }"><br>
<span class="erreur">${ erreurs.prenom }</span>
<label for="login">Login</label><br>
<input type="text" name="login" id="login" value="${ utilisateurs.login }"><br>
<span class="erreur">${ erreurs.login }</span>
<label for="password">Password</label><br>
<input type="password" name="password" id="password" value="${ utilisateurs.password }"><br>
<span class="erreur">${ erreurs.password }</span>
<label for="password">Confirmation Password</label><br>
<input type="password" name="passwordBis" id="passwordBis" value="${ utilisateurs.passwordBis }"><br>
<span class="erreur">${ erreurs.passwordBis }</span>
   <input type="submit" value ="Ajouter" ></input>
</fieldset>
</form>
	<%@include file="/inc/footer.jsp" %>
