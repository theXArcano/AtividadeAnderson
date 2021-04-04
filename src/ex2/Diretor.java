
package ex2;


public class Diretor extends Funcionario {
    
public Diretor (String nome,double salario,String cargo){
super(nome,salario,cargo);
}

@Override
public void Bonificacao(){
this.salario = this.salario *1.1;
    System.out.println("A bonificação do "+cargo +" " +nome+" é: "+this.salario); 
}


}
