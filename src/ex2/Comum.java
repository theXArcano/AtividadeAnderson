package ex2;


public class Comum extends Funcionario {

    public Comum(String nome, double salario, String cargo) {
        super(nome,salario,cargo); 
    }

 


@Override
public void Bonificacao(){  
this.salario = this.salario *1.05;
    System.out.println("A bonificação do "+cargo +" " +nome+" é: "+this.salario);
}

}
