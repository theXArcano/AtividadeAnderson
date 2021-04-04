
package ex1;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contaespecial c1 = new Contaespecial(1000, "José", "15", 44);
        Contauniversitaria c2 = new Contauniversitaria(100,"Engenharia","Gabriel", "655",1000);
        Poupanca c3 = new Poupanca(600, "bolson","17", 55);
        
        
        //verdados() mostra o tipo de conta
        c1.verDados();
        c2.verDados();
        c3.verDados();
        
        c2.Depositar(100);
        c2.verDados();
        
        c1.Sacar(2.00);
        c1.Sacar(7);
        c1.verDados();
        
        c3.Sacar(2.00);
        c3.Sacar(7);
        c3.verDados();
        
    }
    
}