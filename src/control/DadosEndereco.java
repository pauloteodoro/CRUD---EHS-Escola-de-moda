
package control;


public class DadosEndereco {
    public String logradouro;      
    public String bairro;
    public String cidade;
    public String uf;
    public String cep;
    
      public DadosEndereco (String logradouro, String bairro,  String cidade,String uf) {
          
          this.logradouro = logradouro;
          this.bairro = bairro;
          this.cidade = cidade;
          this.uf = uf;
        
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getUf() {
        return uf;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
}
