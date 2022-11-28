/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.sun.webkit.graphics.WCImage;
import static com.sun.webkit.graphics.WCImage.getImage;
import entities.Produit;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.persistence.Transient;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.hibernate.Session;
import service.CategorieService;
import service.MarqueService;
import service.ProduitService;

/**
 *
 * @author MOHAMED
 */
@MultipartConfig(maxFileSize = 169999999)
@WebServlet(name = "GestionProduit", urlPatterns = {"/GestionProduit"})
public class GestionProduit extends HttpServlet {

    ProduitService ps = new ProduitService();
    MarqueService ms = new MarqueService();
    CategorieService cs = new CategorieService();

    private String path;
    private String UPLOAD_DIRECTORY;
//Source : www.exelib.net

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.sendRedirect("gestionProduits.jsp");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Transient

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nom = request.getParameter("productName");
        double prix = Double.parseDouble(request.getParameter("prix"));
        String description = request.getParameter("description");
        String designation = request.getParameter("designation");
        int unite = Integer.parseInt(request.getParameter("unite"));
        int id1 = Integer.parseInt(request.getParameter("marque"));
        int id2 = Integer.parseInt(request.getParameter("categorie"));

        ps.create(new Produit(nom, designation, prix, null, unite, description, ms.findById(id1), cs.findById(id2)));

         

//        File file = new File(request.getParameter("image"));
//        FileInputStream input = new FileInputStream(file);
//        byte[] bFile = new byte[(int) file.length()];
//        
        }
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
