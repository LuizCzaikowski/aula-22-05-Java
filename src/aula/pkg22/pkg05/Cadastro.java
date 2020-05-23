package aula.pkg22.pkg05;



public class Cadastro extends Pessoa {
    private String nome;
    private String senha;
    private int idade;
    
    public void setNome(String nome){
        this.nome = nome;
    }
          
    public String getNome() {
        return nome;
    }   
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void mostrarDados() {
        System.out.println("Seu nome é: " + this.getNome());
        System.out.println("Sua senha é: " + this.getSenha());
        System.out.println("Sua idade é: " + this.getIdade());
    }
    
    
    @Override
    public void teste() {
    
        System.out.println("NAO E MAIS UMA CLASSE ABSTRATA");
    }
}