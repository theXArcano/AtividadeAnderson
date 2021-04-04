/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;


public class Principal {
    public static void main(String[] args) {
          Comum jao = new Comum("Jao",100.0,"Engenheiro") ;
        Diretor gil = new Diretor("Gil", 100.0, "Diretor");
        Gerente mei = new Gerente ("mei", 100.0, "Gerente");
        jao.Bonificacao();
 
        gil.Bonificacao();
        mei.Bonificacao();
    }
    
}
