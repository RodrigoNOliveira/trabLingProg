package especies;

public class Goldfish extends Peixe {

    public Goldfish(float peso, int idade, String membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }
    @Override
    public String toString() {
        return "Goldfish [peso= " + peso + ", idade= " + idade + ",  membros= " + membros + ", cor da escama= " + corEscama
                + "]";
    }
}