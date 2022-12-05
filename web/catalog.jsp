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
         <link rel="stylesheet" href="assets/vendor/bootstrap/css/bootstrap.min.css">
        <link href="assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
        <link rel="stylesheet" href="assets/libs/css/style.css">
        <link rel="stylesheet" href="assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
        <link rel="stylesheet" href="assets/vendor/charts/chartist-bundle/chartist.css">
        <link rel="stylesheet" href="assets/vendor/charts/morris-bundle/morris.css">
        <link rel="stylesheet" href="assets/vendor/fonts/material-design-iconic-font/css/materialdesignicons.min.css">
        <link rel="stylesheet" href="assets/vendor/charts/c3charts/c3.css">
        <link rel="stylesheet" href="assets/vendor/fonts/flag-icon-css/flag-icon.min.css">
        <title>Panier Simple</title>
    </head>
    <body>
        <a class="navbar-brand" href="index1.jsp">E-Commerce <i class="fa fa-fw fa-shopping-cart"></i></a>
        
        <div class="container">
            
            <fieldset>
                <div class="card-header my-3">Liste des produits</div>
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
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-cart" viewBox="0 0 16 16">
                        <path d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .491.592l-1.5 8A.5.5 0 0 1 13 12H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM3.102 4l1.313 7h8.17l1.313-7H3.102zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
                        </svg><a href="panier.jsp">  <%= i%></a>
                    </div>
                    <div>
                        <%
                            ProduitService p = new ProduitService();
                            for (Produit pp : p.findAll()) {
                        %>
                        <div class="card text-white bg-info mb-3" style="max-width: 18rem;">
                            <div class="card-body">
                                <img src="product-image/3-hat-png-image.png" alt="user" class="rounded" width="150"><br/>
                                <h6 class="card-text">Désignation: <%= pp.getDesignation()%></h6>
                                <h6 class="card-text">Prix : <%= pp.getPrix()%>&nbspDH</h6>   

                                <a class="mx-3 btn btn-primary" name="id" href="./cart?id=<%= pp.getId()%>" >Ajouter</a>
                            </div>
                        </div>
                        <%}%>
                    </div>
                </form>
            </fieldset>
        </div>
        <%@include file="/includes/footer.jsp"%>

    </body>
</html>
