<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des utilisateur</title>
<link rel="stylesheet" href="<C:url value='/css/main.css'/>">
<script src=":url value='/js/script.js'/>"></script>
</head>
<body>
<header> 
			<nav>
				<div class="logo">
					<p><a href=""><span>GESTION DES UTILISATEURS</span></a></p>
				</div>
				<div class="menu">
					<ul>
					<C:choose>
					
					<C:when test="${sessionScope.isConnected }">
					       <a href="<C:url value='/list'/>"><li>Lister</li></a>
						   <a href="<C:url value='/add'/>"><li>Ajouter</li></a>
						   <a href="<C:url value='logout'/>"><li>Déconnection</li></a>
					    </C:when>
					       <C:otherwise>
					           <a href="<C:url value='/logout'/>"><li>Connexion</li></a>
					       </C:otherwise>
					    </C:choose>
					</ul>
				</div>
			</nav>
		</header>