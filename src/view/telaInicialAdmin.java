
package view;

import DAO.CadastrandoBD;
import DAO.alunoDAO;
import control.autenticacao;
import control.loginSenha;
import java.awt.Color;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
      
        
    
    
    }

   @Override
    public void actionPerformed(ActionEvent arg) {
        
        if(arg.getSource().equals(botaoCadastrarUsuario)){        
            TelaCadastroAlunos cadastrando = new TelaCadastroAlunos();
            cadastrando.setVisible(true);  
        }
        if  (arg.getSource().equals(botaoListarUsuaios)){  
            
            //ArrayList<alunoDAO> dadosConsulta = new alunoDAO();
            
        
        }
        
        
    }
    
    
	private void atualizarListProdutos() {
		ArrayList<alunoDAO> produtos = 
				new alunoDAO().listar();

		DefaultListModel<alunoDAO> modelo =
				new DefaultListModel<alunoDAO>();
		for(alunoDAO p : produtos){
			modelo.addElement(p);
		}
		
		listaProdutos.setModel(modelo);
	}
	
	private void atualizarListProdutos(String nome) {
		ArrayList<CadastrandoBD> produtos = 
				new CadastrandoBD(null).listarByNome(nome);
		DefaultListModel<Produto> modelo =
				new DefaultListModel<Produto>();
		for(Produto p : produtos){
			modelo.addElement(p);
		}
		
		listaProdutos.setModel(modelo);
	}
	private void pesquisaPeloNome() {
		String texto = txtPesquisa.getText().trim();
		if(texto.length()==0){
			atualizarListProdutos();
		}else{
			atualizarListProdutos(texto);
		}
	}
    
    

    @Override
    public void keyTyped(KeyEvent e) {
        pesquisaPeloNome();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        pesquisaPeloNome();
    }

    @Override
    public void keyReleased(KeyEvent e) {}
        
}
    
