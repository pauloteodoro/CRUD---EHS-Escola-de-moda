/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public class Repositorio {
    
    
	private static Repositorio repositorio =null;
	ArrayList<alunoDAO> produtos;
	
	private Repositorio(){
		produtos = new ArrayList<alunoDAO>();
	}
	
	public static Repositorio getInstance(){
		if(repositorio== null){
			repositorio =
					new Repositorio();
		}
		return repositorio;
	}
    
}
