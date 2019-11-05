/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author paulo
 */
public class Conexao {
    
    public static Connection getConexao(){
		
		try {
			String servidor = "localhost:5432";
			String banco = "poo";
			String usuario = "postgres";
			String senha = "1234";
			
			Class.forName("org.postgresql.Driver");
			String path ="jdbc:postgresql://"+servidor+
					"/"+banco;
			
			return 
				DriverManager.getConnection(path,
						usuario,senha);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
		
	}
	
	
	public static void fechar(Connection conn){
		if(conn !=null){
			try {
				conn.close();
			} catch (Exception e) {
				System.err.println(e.getMessage());
				
			}
		}
	}
}
