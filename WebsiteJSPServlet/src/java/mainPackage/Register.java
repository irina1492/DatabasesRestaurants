/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

import java.io.IOException;
import java.io.PrintWriter;
import static java.math.BigDecimal.ZERO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Harjote
 */
public class Register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    public static final String DB_DRIVER = "org.postgresql.Driver";
    public static final String DB_CONNECTION = "jdbc:postgresql://localhost:5432/postgres?currentSchema=public";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "HelloworlD";
        
        
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String raterFirstName = request.getParameter("firstName");
        String raterLastName = request.getParameter("lastName");
        String raterEmail = request.getParameter("email");
        String raterType = request.getParameter("type");
        String joinDate = java.time.LocalDate.now().toString();
        int raterID;
        
        String raterName = raterFirstName + " " + raterLastName;
        String raterTypeCapital = "";
        
        if(raterType == "blog"){raterTypeCapital += "BLOG";}
        if(raterType == "critic"){raterTypeCapital += "CRITIC";}
        if(raterType == "online"){raterTypeCapital += "ONLINE";}
        if(raterType == null){raterTypeCapital += "BLOG";}
        
        try{
            Class.forName(DB_DRIVER);
            Connection con = (Connection) DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT max(user_id) as id FROM public.rater");
            rs.next();
            int max_id = rs.getInt(1);
            raterID = max_id + 1;
            System.out.println("ID: "+raterID);
            System.out.println(raterType);
            System.out.println(raterTypeCapital);
            
            String sql = "INSERT INTO public.rater VALUES(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, raterID);
            pst.setString(2, raterEmail);
            pst.setString(3, raterName);
            pst.setString(4, joinDate);
            pst.setString(5, raterTypeCapital);
            pst.setBigDecimal(6, ZERO);
            //String sql = "INSERT INTO public.restaurant VALUES ('" + restID + "','"+restName+"','"+restType+"','"+restURL+"')";
            
            pst.executeUpdate();
            System.out.println(raterTypeCapital + " " + joinDate);
            System.out.println("The values have been inserted!");
            con.close();
            
//            request.getRequestDispatcher("secondPage.jsp");
            
            RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/index.jsp");
            rd.forward(request,response);
        }
	catch(SQLException se){
            se.printStackTrace();
	}
	catch(Exception e){
            e.printStackTrace();
	}
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
