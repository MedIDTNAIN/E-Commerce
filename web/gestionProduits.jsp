<%-- 
    Document   : gestionProduits
    Created on : Nov 20, 2022, 11:15:56 PM
    Author     : MOHAMED
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<<!DOCTYPE html>
<html lang="en">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/gestionprdts.css" rel="stylesheet" type="text/css"/>
        <title>Product</title>
   

    <body>
        <nav>
            <div class="container">
                <form onsubmit="saveProduct(this);
                    return false" class="productForm" method="post" action="GestionProduit">
                    <div id="SuccessMessage"></div>

                    <div class="wrapper">

                        <div class="inputs">

                            <!-- Product name -->
                            <div class="inputField">
                                <label for="productName">Product Name :</label>
                                <input name="productName" type="text" id="productName" required><span class="required">*</span>
                            </div>
                             <div class="inputField">
                                <label for="prix">Prix (DHs) :</label>
                                <input name="prix" type="text" id="prix" required><span class="required">*</span>
                            </div>
                            <div class="inputField">
                                <label for="description">Description :</label>
                                <input name="description" type="text"  id="description" required><span class="required">*</span>
                            </div>
                            <div class="inputField">
                                <label for="designation">Désignation :</label>
                                <input name="designation" type="text" id="designation" required><span class="required">*</span>
                            </div>
                             <div class="inputField">
                                <label for="unite">Qantité :</label>
                                <input name="unite" type="text" id="unite" required><span class="required">*</span>
                            </div>
                            
                             <div class="inputField">
                                <label for="marque">Marque de produit :</label>
                                <select name="marque" id="marque" required>
                                </select><span class="required">*</span>
                            </div>
                             <div class="inputField">
                                <label for="categorie">Catégorie de produit :</label>
                                <select name="categorie" id="categorie" required>
                                </select><span class="required">*</span>
                                
                            </div>

                        </div>

                        <div class="btnForm">

                            <input class="btn" type="submit" value="Save">

                        </div>

                </form>
            </div>
        </nav>
    </body>

</html>
