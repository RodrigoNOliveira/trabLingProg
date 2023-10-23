package especies;

public class Cobra extends Reptil {

    public Cobra(float peso, int idade, String membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public String toString() {
        return "Cobra [peso= " + peso + ", idade= " + idade + ",  membros= " + membros + ", cor da escama= " + corEscama
                + "]";
    }

}