/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class CaadastrandoBD {

    public   CaadastrandoBD(alunoDAO aluno) {
        if(aluno==null);
                
	else{
			Connection conn = null;
			try {
				String sql = "INSERT INTO cadastroalunos "
						+ "(cpf,nome,datanascimento,sexo,email,profissao,telefonefixo,telefonecelular,cep,logradouro,numero,bairro,complemento,cidade,estado) VALUES "
                                        + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				
				conn = Conexao.getConexao();
				PreparedStatement pstm = conn.
						prepareStatement(sql);
				
				pstm.setString(1, aluno.getCpf());
                                pstm.setString(2, aluno.getNome());
                                pstm.setString(3, aluno.getSexo());
                                pstm.setString(4, aluno.getEmail());
                                pstm.setString(5, aluno.getProfissao());
                                pstm.setString(16, aluno.getDataNascimento());
                                pstm.setString(15, aluno.getTelefoneFixo());
                                pstm.setString(7, aluno.getTelefoneCelular());
                                pstm.setString(8, aluno.getCep());
                                pstm.setString(9, aluno.getLogradouro());
                                pstm.setString(10, aluno.getNumero());
                                pstm.setString(11, aluno.getBairro());
                                pstm.setString(12, aluno.getComplemento());
                                pstm.setString(13, aluno.getCidade());
                                pstm.setString(14, aluno.getEstado());
                                
				
				
				pstm.execute();
                                
                                
				
				
			} catch (Exception e) {
				System.err.println(e.getMessage());
                                
				
			}finally{
				Conexao.fechar(conn);
			}
			
//			produto.setId(NossoBanco.getInstance().getId());
//			NossoBanco.getInstance().
//			produtos.add(produto);
			
		}
        

    }

    
    public ArrayList<alunoDAO> listarByNome(String nome){
		ArrayList<alunoDAO> prod = 
				new ArrayList<alunoDAO>();
		for(alunoDAO p : listar()){
			if(p.getNome().
					toLowerCase().
					contains(nome.toLowerCase())){
				prod.add(p);
			}
		}
		return prod;
		
	}
	public ArrayList<alunoDAO> listar(){
		Connection conn  =null;
		try {
			String sql = "Select * from cadastroalunos";
			conn = Conexao.getConexao();
			PreparedStatement pstm =
					conn.prepareStatement(sql);
			ResultSet rs =pstm.executeQuery();
			ArrayList<alunoDAO> produtos = new
					ArrayList<alunoDAO>();
			while(rs.next()){
				alunoDAO p = new alunoDAO();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				
				produtos.add(p);
			}
			
			return produtos;
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}finally{
			Conexao.fechar(conn);
		}
//		return NossoBanco.getInstance().produtos;
	}

	public void remover(long id) {
		for(alunoDAO p :NossoBanco.getInstance().produtos){
			if(p.getId()==id){
				NossoBanco.getInstance().produtos.remove(p);
				break;
			}
		}
		
	}
	public void remover(alunoDAO p) {
		NossoBanco.getInstance().produtos.remove(p);
	}

	public void editar(alunoDAO produto) {
		for(alunoDAO p :NossoBanco.getInstance().produtos){
			if(p.getId()==produto.getId()){
				p.setNome(produto.getNome());
				
				break;
			}
		}
	}

}//final
    
  