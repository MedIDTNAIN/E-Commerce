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
        <link href="style/css.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panier Simple</title>
    </head>
    <body>
        <div style="text-align: center;">
            <h2 >Votre Panier</h2>
            <img src="assets/images/github.png" style="width: 40px; height: 40px;"/>
        </div>
        <table border="1">
            <thead>
                <tr>
                    <th>Quantité</th>
                    <th>Désignation</th>
                    <th>Prix</th>
                    <th>Image</th>
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
                            total += p.getQte()*p.getProduit().getPrix();
                %>
                <tr>
                    <td><%= p.getQte()%></td>
                    <td><%= p.getProduit().getDesignation()%></td>
                    <td><%= p.getProduit().getPrix()%></td>
                    <td><img src=<%="assets/images/" + p.getProduit().getImage()%>></td>
                </tr>
                <%}
                    }%>
            </tbody>
        </table>
        <h2 style="text-align: center;">Total: <%=total%></h2>

    </body>
</html>
