<%-- 
    Document   : panier
    Created on : 4 déc. 2022, 18:53:06
    Author     : Mohamed Nabil
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="service.ProduitService"%>
<%@page import="entities.Panier"%>
<%@page import="java.util.List"%>
<%@page import="entities.Produit"%>
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
            
            <div class="d-flex py-3"><h3></h3><a class="mx-3 btn btn-primary" href="catalog.jsp">Back to your catalog</a></div>
            <div style="text-align: center;">
                <h2 >Votre Panier</h2>
                <img src="assets/images/github.png" style="width: 40px; height: 40px;"/>
            </div>
            <table table class="table table-loght">
                <thead>
                    <tr>
                        <th scope="col">Quantité</th>
                        <th scope="col">Désignation</th>
                        <th scope="col">Prix</th>
                        <th scope="col">Image</th>
                    </tr>
                </thead>
                <tbody>
                    <% double total = 0, sm = 0;%>
                    <%
                        HttpSession sessio = request.getSession();
                        ProduitService ps = new ProduitService();
                        List<Panier> paniers = (List<Panier>) sessio.getAttribute("listpr");
                        List<Produit> produits = ps.findAll();
                        if (paniers != null) {
                            for (Panier p : paniers) {
                                total += p.getQte() * p.getProduit().getPrix();
                    %>
                    <tr>
                        <td><%= p.getQte()%></td>
                        <td><%= p.getProduit().getDesignation()%></td>
                        <td><%= p.getProduit().getPrix()%></td>
                        <td><img src="product-image/3-hat-png-image.png" alt="user" class="rounded" width="45"></td>
                    </tr>
                    <%}
                    }%>
                </tbody>
            </table>
            <h2 style="text-align: center;">Total: <%=total%></h2>
        </div>
        
        <%@include file="/includes/footer.jsp"%>
    </body>
</html>
