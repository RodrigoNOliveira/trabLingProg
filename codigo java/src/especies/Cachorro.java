package especies;

public class Cachorro extends Mamifero {

    private String carga;
    private String cronos;

    public Cachorro(float peso, int idade, String membros, String corPelo) {
        super(peso, idade, membros, corPelo);

    }

    public void enterrarOsso() {
        System.out.println("O cachorro enterrou o osso");
    }

    public void abanarRabo() {
        System.out.println("O cachorro esta abanando o rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("au au au au au au au");
    }

    public void reagir(String frase) {
        if (frase == "agradavel") {
            System.out.println("o cachorro esta abanando o rabo e latindo");
        } else if (frase == "agressiva") {
            System.out.println("O cachorro esta rosnando");
        }
    }

    public void reagir(int hora) {
        if (hora > 5 && hora < 12) {
            System.out.println("o cachorro esta abanando o rabo");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("o cachorro esta abanando o rabo e latindo");
        } else if (hora >= 18 || hora < 6) {
            System.out.println("o cachorro esta ignorando");
        }

    }

    public void reagir(boolean dono) {
        if (dono == true) {
            System.out.println("o cachorro esta abanando o rabo");
        } else {
            System.out.println("O cachorro rosnando e latindo");
        }
    }

    public void reagir(int idade, float peso) {

        if (peso <= 10) {
            carga = "leve";
        } else {
            carga = "pesado";
        }

        if (idade <= 5) {
            cronos = "novo";
        } else {
            cronos = "velho";
        }


        if (cronos == "novo" && carga == "leve") {
            System.out.println("o cachorro esta abanando o rabo");
        } else if (cronos == "novo" && carga == "pesado") {
            System.out.println("O cachorro está latindo");
        } else if (cronos == "velho" && carga == "leve") {
            System.out.println("O cachorro está rosnando");
        } else if (cronos == "velho" && carga == "pesado") {
            System.out.println("O cachorro ignorou");
        }
    }

    public String getCarga() {
        return carga;
    }

   
    public void setCarga(String carga) {
        this.carga = carga;
    }

 
    public String getCronos() {
        return cronos;
    }

  
    public void setCronos(String cronos) {
        this.cronos = cronos;
    }

    @Override
    public String toString() {
        return "Cachorro [peso= " + peso + ", idade= " + idade + ",  membros= " + membros + ", cor do pelo= " + corPelo
                + "]";
    }
}