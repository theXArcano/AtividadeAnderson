
package atv1;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contaespecial c1 = new Contaespecial(1000, "José", "15", 44);
        Contauniversitaria c2 = new Contauniversitaria(100,"Engenharia","Gabriel", "655",1000);
        Poupanca c3 = new Poupanca(600, "bolson","17", 55);
        
        
        c2.verDados();
        
    }
    
}