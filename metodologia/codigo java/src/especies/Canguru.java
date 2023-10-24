package especies;

public class Canguru extends Mamifero {

    public Canguru(float peso, int idade, String membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    public void usarBolsa() {
        System.out.println("O canguru esta usando a bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("O canguru esta pulando");
    }
    @Override
    public String toString() {
        return "Canguru [peso= " + peso + ", idade= " + idade + ",  membros= " + membros + ", cor do pelo= " + corPelo
                + "]";
    }
}