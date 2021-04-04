
package atv1;


public class Contaespecial extends Conta {
    
    private double saldoesp;
    

    public Contaespecial(double saldoesp, String nome, String num, double saldo) {
        super(nome, num, saldo);
        this.saldoesp = saldoesp;}
    
  @Override 
 public void verDados(){
        System.out.println("Nome : "+getNome());
        System.out.println("Numero da conta: "+getNum());
        System.out.println("Saldo em conta: "+getSaldo());
        System.out.println("Tipo de conta: Conta Especial");
        System.out.println("Saldo Especial: "+saldoesp);
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
  //saque do limite
    public void Sacar(int saldo) {
        if (saldo > this.saldoesp){
            System.out.println("Você não tem o valor requisitado em sua conta, saque indisponível");
        }
        else{
        this.saldoesp = this.saldoesp - saldo;
        
        }
        
    }
  
}

    
    
    

    
  
            
   
