
package view;

import DAO.CaadastrandoBD;
import DAO.Conexao;
import DAO.alunoDAO;
import DAO.listarDadosBanco;
import control.autenticacao;
import control.loginSenha;
import java.awt.Color;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class telaInicialAdmin  extends JFrame implements ActionListener,KeyListener{
    private Object logo;

    public telaInicialAdmin (){
        
        setSize(340,500);
        setTitle("Bem vindo EHS-Escola de moda");
        this.getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setResizable(true);
        setLocationRelativeTo(null);
        init();
        setVisible(true);
    }
    
    JLabel fundo = new JLabel();
    JButton botaoCadastrarUsuario,botaoExcluirUsuario,botaoListarUsuaios;
    
    JLabel imagemProfessores = new JLabel();
    
   

    private void init() {
        
    imagemProfessores.setBounds(110, 50, 300, 100);
    add(imagemProfessores);
        
    ImageIcon icon = new ImageIcon("C:\\Users\\paulo\\Documents\\NetBeansProjects\\EHS escola de moda\\src\\imagens\\logo.png");
    icon.setImage(icon.getImage().getScaledInstance(imagemProfessores.getHeight(),imagemProfessores.getHeight(),Image.SCALE_SMOOTH));
    imagemProfessores.setIcon(icon);
    
    
    botaoCadastrarUsuario = new JButton();
    botaoCadastrarUsuario.setBounds(65, 250 , 200, 30);
    botaoCadastrarUsuario.setText("Cadastrar Aluno ");
    add(botaoCadastrarUsuario);
    
    botaoListarUsuaios = new JButton();
    botaoListarUsuaios.setBounds(botaoCadastrarUsuario.getX(),botaoCadastrarUsuario.getY()+50 ,botaoCadastrarUsuario.getWidth(),
            botaoCadastrarUsuario.getHeight());
    botaoListarUsuaios.setText("Listar Alunos");
    add(botaoListarUsuaios);
    
    botaoExcluirUsuario = new JButton();
    botaoExcluirUsuario.setBounds(botaoListarUsuaios.getX(),botaoListarUsuaios.getY()+50 ,botaoListarUsuaios.getWidth(),
            botaoListarUsuaios.getHeight());
    botaoExcluirUsuario.setText("Excluir Aluno");
    add(botaoExcluirUsuario);
    
    
    botaoCadastrarUsuario.addActionListener(this);
    botaoListarUsuaios.addActionListener(this);
   
    }

   @Override
    public void actionPerformed(ActionEvent arg) {
        
        if(arg.getSource().equals(botaoCadastrarUsuario)){   
           
		
            
            TelaCadastroAlunos cadastrando = new TelaCadastroAlunos();
            cadastrando.setTitle("EHS-Cadastro Aluno");
            cadastrando.setLayout(null);
            cadastrando.setResizable(true);
            cadastrando.setLocationRelativeTo(null);
            cadastrando.setVisible(true);  
            
        }
        
        else if  (arg.getSource().equals(botaoListarUsuaios)){  
            
            
            
            
            
            
            TelaConsulta t = new TelaConsulta();
            t.setTitle("EHS-Consulta Alunos");
            t.setLayout(null);
            t.setResizable(false);
            t.setLocationRelativeTo(null);
            t.setVisible(true);
            
        
        }
        
        
    }
    
    
	
    
    

    @Override
    public void keyTyped(KeyEvent e) {
       // pesquisaPeloNome();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //pesquisaPeloNome();
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    
    
    
    
        
}
    
