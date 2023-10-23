package especies;

public class Lobo extends Mamifero {

    public Lobo(float peso, int idade, String membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println("auuuuuuuuuuuuu!");
    }
    @Override
    public String toString() {
        return "Lobo [peso= " + peso + ", idade= " + idade + ",  membros= " + membros + ", cor do pelo= " + corPelo
                + "]";
    }
}