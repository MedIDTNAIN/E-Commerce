<%-- 
    Document   : index1
    Created on : 20 nov. 2022, 11:44:42
    Author     : LAASRI MOHAMED
--%>

<%@page import="entities.Produit"%>
<%@page import="java.util.List"%>
<%@page import="service.ProduitService"%>
<%
    ProduitService pd = new ProduitService();
    List<Produit> products = pd.findAll();

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/includes/head.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="/includes/navbar.jsp"%>
        <div class="container">
            <div class="card-header my-3">All Products</div>
            <div class="row">
                <%                    if (!products.isEmpty()) {
                        for (Produit p : products) {%>
                        <div class="col-md-3 my-3">
                            <div class="card w-100" style="width: 18rem;">
                                <img class="card-img-top" src="product-image/3-hat-png-image.png" alt="Card image cap">
                                <div class="card-body">
                                    <h5 class="card-title"><%= p.getNom()%></h5>
                                    <h6 class="price"><%= p.getPrix()%></h6>
                                    <h6 class="Category">Category= <%= p.getCategorie()%></h6>
                                    <div class="mt-3 d-flex justify-content-between">
                                        <a href="#" class="btn btn-dark">Add to Cart</a>
                                        <a href="#" class="btn btn-primary">Buy Now</a>
                                    </div>

                                </div>
                            </div>
                </div>
                <%}
                    }

                %>

            </div>
        </div>
        <%@include file="/includes/footer.jsp"%>
    </body>
</html>
