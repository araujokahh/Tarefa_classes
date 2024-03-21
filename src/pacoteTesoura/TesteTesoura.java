package pacoteTesoura;

public class TesteTesoura {
    String marca;
    boolean afiada;

    public TesteTesoura(String marca, int tamanho) {
        this.marca = marca;
        this.afiada = true; 
    }

    public void cortar() {
        if (afiada) {
            System.out.println("A tesoura cortou o papel.");
        } else {
            System.out.println("A tesoura não está afiada o suficiente para cortar.");
        }
    }

    public void afiar() {
        afiada = true;
        System.out.println("A tesoura foi afiada.");
    }

    public static void main(String[] args) {
    	TesteTesoura minhaTesoura = new TesteTesoura("Mundial", 8);
        
     // Tentar cortar antes de afiar
        minhaTesoura.cortar(); 
        
     // Afiar a tesoura
        minhaTesoura.afiar();  
        
     // Cortar após afiar
        minhaTesoura.cortar(); 
    }
}