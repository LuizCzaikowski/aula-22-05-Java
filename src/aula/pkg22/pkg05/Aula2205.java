/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg22.pkg05;

/**
 *
 * @author Jackeline
 */
public class Aula2205 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Tela tela = new Tela();
        Cadastro dados = new Cadastro();
        
        tela.Menu();
        dados.mostrarDados();
        
        
        dados.teste();
    }
    
}
