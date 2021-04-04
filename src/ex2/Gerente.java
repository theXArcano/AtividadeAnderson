
package ex2;


public class Gerente extends Funcionario {
    
public Gerente (String nome,double salario,String cargo){
super(nome,salario,cargo);
}

@Override
public void Bonificacao(){
this.salario = this.salario *1.15;  
    System.out.println("A bonificação do "+cargo +" " +nome+" é: "+this.salario);
}


}
