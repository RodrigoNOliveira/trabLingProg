package especies;

public class Tartaruga extends Reptil {

    public Tartaruga(float peso, int idade, String membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    public void locomover() {
        System.out.println("O canguru esta se locomovendo");
    }

    
    @Override
    public String toString() {
        return "Tartaruga [peso= " + peso + ", idade= " + idade + ",  membros= " + membros + ", cor da escama= " + corEscama
                + "]";
    }
}