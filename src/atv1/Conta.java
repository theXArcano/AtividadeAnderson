
package atv1;


public class Conta {
    
    protected String nome;
    protected String num;
    protected double saldo;
    

   public Conta (String nome, String num, double saldo){
   this.nome = nome;
   this.num = num;
   this.saldo = saldo;
   }

    public String getNome() {
        return nome;   
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getSaldo() {
        return saldo;
    }

    public void Sacar(double saldo) {
        if (saldo > this.saldo){
            System.out.println("Você não tem o valor requisitado em sua conta, saque indisponível");
        }
        else{
        this.saldo = this.saldo - saldo;
        
        }
        
    }
    public void Depositar(double saldo){
    this.saldo = this.saldo +saldo; 
    }
    
    //aqui mostra os dados da conta e o tipo que foi requisitado na questão
    public void verDados(){
        System.out.println("Nome : "+nome);
        System.out.println("Numero da conta: "+num);
        System.out.println("Saldo em conta: "+getSaldo());
        System.out.println("Tipo de conta: Conta regular");
        System.out.println("");
    }


}


