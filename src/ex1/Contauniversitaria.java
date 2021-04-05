package ex1;


public class Contauniversitaria extends Conta{
    private double saldouni;
    private String curso;
    
    public Contauniversitaria (double saldouni,String curso,String nome, String num, double saldo){
    super(nome,num,saldo);
    this.saldouni = saldouni;
    this.curso = curso;
    }
     public void verDados(){
        System.out.println("Nome : "+getNome());
        System.out.println("Numero da conta: "+getNum());
        System.out.println("Saldo em conta: "+getSaldo());
        System.out.println("Tipo de conta: Conta Universitária");
        System.out.println("Curso: "+curso);
        System.out.println("Saldo Conta Universitária: "+saldouni);
        System.out.println("");} 
    
    @Override
   public void Depositar(double saldo){
    this.saldouni = this.saldouni + (saldo*0.05);
    }
    
}
