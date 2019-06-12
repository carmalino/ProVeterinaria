package com.veterinaria.connection;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {
	
	public static Connection conectar() {
		Connection conn = null;
		Properties prop = new Properties();
	try {   
		    prop.load(Conexion.class.getResourceAsStream("/database.properties")); 
		} catch (IOException ex) {
		    ex.printStackTrace();
		}
		
        try {
            conn = DriverManager.getConnection(prop.getProperty("datasource.url"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
		return conn;
	}
}
