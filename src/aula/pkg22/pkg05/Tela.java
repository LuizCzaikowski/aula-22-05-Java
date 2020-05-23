/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg22.pkg05;

import java.util.Scanner;

/**
 *
 *
 */
public class Tela extends Cadastro {
    
    public void Menu() {
    
                     Cadastro cadastro = new Cadastro();
                     
                    Scanner nome = new Scanner(System.in);
                    Scanner senha = new Scanner(System.in);
                    Scanner idade = new Scanner(System.in);
                    
                     
                     System.out.println("Digite seu nome: ");
                     cadastro.setNome(nome.nextLine());
                     System.out.println("Digite sua senha: ");
                     cadastro.setSenha(senha.nextLine());
                     System.out.println("Digite sua idade: ");
                     cadastro.setSenha(idade.nextLine());
                    
    }
}
