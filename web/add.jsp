<%-- 
    Document   : add
    Created on : 4 déc. 2022, 18:14:44
    Author     : Mohamed Nabil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pannier Simple</title>
    </head>
    <body>
        <fieldset>
            <legend>
                Ajouter Produit
            </legend>
            <form action="AddProduit" method="POST" enctype="multipart/form-data">
                <table>
                    <tr>
                        <td>Désignation :</td>
                        <td><input type="text" name="designation"></td>
                    </tr>
                    <tr>
                        <td>Prix :</td>
                        <td>
                            <input type="number" name="prix">
                        </td>
                    </tr>
                    <tr>
                        <td>Image :</td>
                        <td><input type="file" name="img"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Ajouter"></td>
                    </tr>
                </table>
            </form>
        </fieldset>
    </body>
</html>