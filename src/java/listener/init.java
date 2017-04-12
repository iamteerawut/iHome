/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

/**
 * Web application lifecycle listener.
 *
 * @author JAPP
 */
public class init implements ServletContextListener {

    private Connection conn;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            conn = getIHomeDB().getConnection();
            sce.getServletContext().setAttribute("conn", conn);
        } catch (Exception e) {
// ต้องทำอัลไลว้ะ อิอิ เว้นไว้ก่อน
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private DataSource getIHomeDB() throws NamingException {
        Context c = new InitialContext();
        return (DataSource) c.lookup("java:comp/env/iHomeDB");
    }

}
