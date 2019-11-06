/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulo
 */
public class listarDadosBanco {
    
    public ArrayList listarDadosBanco (){
      
        try {
            
            Connection con = Conexao.getConexao();
            String sql = "select * From cadastroalunos";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(); 
            //ArrayList<alunoDAO> alunos = new ArrayList<alunoDAO>();
            
            ArrayList<alunoDAO> listaAlunos = new	ArrayList<alunoDAO>();
			while(rs.next()){
                            
				alunoDAO p = new alunoDAO();
				p.setId(rs.getInt("id"));
				p.setCpf(rs.getString("cpf"));
				p.setNome(rs.getString("nome"));
                                p.setSexo(rs.getString("sexo"));
                                p.setEmail(rs.getString("email"));
                                p.setProfissao(rs.getString("profissao"));
                                p.setTelefoneCelular(rs.getString("telefonecelular"));
                                p.setCep(rs.getString("cep"));
                                p.setLogradouro(rs.getString("logradouro"));
                                p.setNumero(rs.getString("numero"));
                                p.setBairro(rs.getString("bairro"));
                                p.setComplemento(rs.getString("complemento"));
                                p.setCidade(rs.getString("cidade"));
                                p.setEstado(rs.getString("estado"));
                                p.setTelefoneFixo(rs.getString("telefonefixo"));
                                p.setDataNascimento(rs.getString("datanascimento"));
				listaAlunos.add(p);
                                System.out.println(p.nome);
			}
                        
                        return listaAlunos;
        }   catch (SQLException ex) {
            Logger.getLogger(listarDadosBanco.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
