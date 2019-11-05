package view;

import control.autenticacao;
import control.loginSenha;
import java.awt.Color;
import java.awt.Font;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;





public class telaLoginESenha extends JFrame implements ActionListener{
    
    JLabel login,senha;
    JTextField entradaLogin;
    JPasswordField entradaSenha;
    JButton botaoLogin;
   
    
    public telaLoginESenha (){ 
        
        
        
       
        setSize(300,435);
        setTitle("EHS Escola de Moda");
        this.getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);       
        init();
        setVisible(true);        
    }

    
    JLabel fundo = new JLabel();
     
    private void init() {
        
    fundo.setBounds(90, 20, 150, 120);
    add(fundo);
        
    ImageIcon icon = new ImageIcon("C:\\Users\\paulo\\Documents\\NetBeansProjects\\EHS escola de moda\\src\\imagens\\logo.png");
    icon.setImage(icon.getImage().getScaledInstance(fundo.getHeight(),fundo.getHeight(),Image.SCALE_SMOOTH));
    fundo.setIcon(icon);
        
        login = new JLabel();
        login.setBounds(80,170, 40, 20);
        login.setText("Login");
        add(login);
        
        entradaLogin = new JTextField();
        entradaLogin.setBounds(login.getX(), login.getY()+10 + login.getHeight(),
                login.getWidth()+100,login.getHeight());
        
        add(entradaLogin);
        
        senha =  new JLabel();
        senha.setText("Senha");
        senha.setBounds(entradaLogin.getX(), entradaLogin.getY()+20 + entradaLogin.getHeight(),
                entradaLogin.getWidth(),entradaLogin.getHeight());
        
        add(senha);
        
        entradaSenha =  new JPasswordField();       
        entradaSenha.setBounds(senha.getX(), senha.getY() + senha.getHeight(),
                senha.getWidth(),senha.getHeight());
        
        add(entradaSenha);
        
        botaoLogin =  new JButton();
        botaoLogin.setText("ENTRAR");
        botaoLogin.setBounds(entradaSenha.getX ()+ entradaSenha.getWidth()/2-50 +10,
                entradaSenha.getY()+entradaSenha.getHeight()+50,80,30);     
        
        add(botaoLogin);        
        
        
        
        
        
        botaoLogin.addActionListener(this);
        
    }

    public boolean testeLogin;
    @Override
    public void actionPerformed(ActionEvent arg) {
        
        loginSenha acesso = new loginSenha (entradaLogin.getText(),entradaSenha.getText());

        autenticacao aut = new autenticacao(acesso);
        
        
        
        

        
        
        
        
    }
    
}
