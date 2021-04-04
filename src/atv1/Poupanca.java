
package atv1;


public class Poupanca extends Conta {
    private double saldopou;
  

    public Poupanca(double saldopou,String nome, String num,double saldo) {
        super(nome, num, saldo);
        this.saldopou = saldopou;
        
    }
    
    @Override 
 public void verDados(){
        System.out.println("Nome : "+getNome());
        System.out.println("Numero da conta: "+getNum());
        System.out.println("Saldo em conta: "+getSaldo());
        System.out.println("Tipo de conta: Conta poupança");
        System.out.println("Saldo Poupança: "+saldopou);
        System.out.println(""); 
    }

    
// SAque do saldo 
  public void Sacar(double saldo) {
        if (saldo > this.saldo){
            System.out.println("Você não tem o valor requisitado em sua conta, saque indisponível");
        }
        else{
        this.saldo = this.saldo - saldo;
        
        }
        
    }
  //saque da poupança
    public void Sacar(int saldo) {
        if (saldo > this.saldopou){
            System.out.println("Você não tem o valor requisitado em sua conta, saque indisponível");
        }
        else{
        this.saldopou = this.saldopou - saldo;
        
        }
        
    }

}
