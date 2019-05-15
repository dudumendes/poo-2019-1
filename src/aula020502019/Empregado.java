public class Empregado {
    //0 - Peao, 1 - Gerente, 2 - Chefe
    private int tipo;

    public Empregado(int tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        switch(tipo) {
            case 0:
                return "Peao";
                break;
            case 1:
                return "Gerente";
                break;
            case 2: 
                return "Chefe";
                break;
        }
    }

    public String trabalhar() {
        switch(tipo) {
            case 0:
                return "Trabalha como Peao";
                break;
            case 1:
                return "Trabalha como Gerente";
                break;
            case 2: 
                return "Trabalha como Chefe";
                break;
        }
    }
}