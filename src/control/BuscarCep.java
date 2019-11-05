
package control;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import view.TelaCadastroAlunos;

public class BuscarCep  {
    
    String logradouro;      
    String bairro;
    String cidade;
    String uf;

    public  BuscarCep(String cep) {
       String json;        

        try {
            URL url = new URL("http://viacep.com.br/ws/"+ cep +"/json");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));
            json = jsonSb.toString();
            
            // JOptionPane.showMessageDialog(null, json);
            
            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");                       
            String array[] = new String[30];
            array = json.split("\n");
            
            // JOptionPane.showMessageDialog(null, array);
                             
            logradouro = array[7];            
            bairro = array[15];
            cidade = array[19]; 
            uf = array[23];           
            
            
            
            DadosEndereco buscaOK = new DadosEndereco(logradouro, bairro, cidade, uf);
            
            
            
            
            
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
 }

   
    
    
        

