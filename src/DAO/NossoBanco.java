
package DAO;

import java.util.ArrayList;


public class NossoBanco {
    
    private static NossoBanco repositorio =null;
	ArrayList<alunoDAO> produtos;
	private long id = 1;
	private NossoBanco(){
		produtos = new ArrayList<alunoDAO>();
	}
	
	public static NossoBanco getInstance(){
		if(repositorio == null){
			repositorio =
					new NossoBanco();
		}
		return repositorio;
	}
	
    
}
