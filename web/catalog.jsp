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
        
        <%@include file="/includes/head.jsp"%>
        <link href="style/css.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panier Simple</title>
    </head>
    <body>
        
        <div class="container">
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
                    Panier :<a href="panier.jsp"> <img src="product-image/men-suits.PNG" alt="user" class="rounded" width="50"> <%= i%></a>
                </div>
                <div>
                    <%
                        ProduitService p = new ProduitService();
                        for (Produit pp : p.findAll()) {
                    %>
                    <figure>
                        <img src="product-image/3-hat-png-image.png" alt="user" class="rounded" width="150"><br/>
                        <strong>Désignation:&nbsp; <%= pp.getDesignation()%></strong>&nbsp;&nbsp;
                        <strong>Prix :&nbsp;<%= pp.getPrix()%>&nbspDH</strong><br>    

                        <button><a name="id" href="./cart?id=<%= pp.getId()%>" >Ajouter</a></button>
                    </figure>
                    <%}%>
                </div>
            </form>
        </fieldset>
                </div>
        <%@include file="/includes/footer.jsp"%>
    </body>
</html>
