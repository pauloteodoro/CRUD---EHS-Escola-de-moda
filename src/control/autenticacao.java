/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import view.telaInicialAdmin;

/**
 *
 * @author paulo
 */
public class autenticacao {

    

    public  autenticacao(loginSenha autenticaUsuario) {
        
        if (("admin".equals(autenticaUsuario.getLogin())) && ("admin".equals(autenticaUsuario.getSenha())) 
                || ("anahelo".equals(autenticaUsuario.getLogin())) && ("anaapucarana".equals(autenticaUsuario.getSenha()))) {
            
            telaInicialAdmin inicialMenus = new telaInicialAdmin();
        }
        
        else {
            JOptionPane.showMessageDialog(null, " Senha Inválida !");
        }
        
    }
    
    
    
    
}
