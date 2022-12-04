<%-- 
    Document   : catalog
    Created on : 4 déc. 2022, 18:38:41
    Author     : Mohamed Nabil
--%>

<%@page import="entities.Panier"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="entities.Produit"%>
<%@page import="service.ProduitService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="style/css.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panier Simple</title>
    </head>
    <body>
        <fieldset>
            <legend>Liste des produits</legend>
            <form action="AjouterPanier" method="GET">
                <%!int i = 0;%>
                <%
                    HttpSession sessio = request.getSession();
                    List<Panier> paniers = (List<Panier>) sessio.getAttribute("listpr");
                    if (paniers != null) {
                        i = paniers.size();
                    }
                %>
                <div style="text-align: right;">
                    Panier :<a href="panier.jsp"> <img src="ressource/images/images.png" style="width: 25px; height: 25px;" /> <%= i%></a>
                </div>
                <div>
                    <%
                        ProduitService p = new ProduitService();
                        for (Produit pp : p.findAll()) {
                    %>
                    <figure>
                        <img src=<%="ressource\\images\\" + pp.getImage()%>><br/>
                        <strong>Désignation:&nbsp; <%= pp.getDesignation()%></strong>&nbsp;&nbsp;
                        <strong>Prix :&nbsp;<%= pp.getPrix()%>&nbspDH</strong><br>    

                        <button><a name="id" href="./cart?id=<%= pp.getId()%>" >Ajouter</a></button>
                    </figure>
                    <%}%>
                </div>
            </form>
        </fieldset>
    </body>
</html>
