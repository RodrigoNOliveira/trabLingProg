package especies;

public class Arara extends Ave {

    public Arara(float peso, int idade, String membros, String corPena) {
        super(peso, idade, membros, corPena);
    }

    @Override
    public String toString() {
        return "Arara [peso= " + peso + ", idade= " + idade + ",  membros= " + membros + ", cor da pena= " + corPena
                + "]";
    }

}