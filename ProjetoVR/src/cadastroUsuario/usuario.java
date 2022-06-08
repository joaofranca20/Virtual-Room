package cadastroUsuario;


public class usuario {

    
    //atributos
    private String nome = "";
    private String senha = "";
    private String email = "";
   
    //GET e SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void limpaUsuário(){
       nome = "";
       senha = "";
       email = "";
    }   
    
}
    
