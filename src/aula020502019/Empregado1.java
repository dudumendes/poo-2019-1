public abstract class Empregado1 {
    public abstract String getTipo();
    public abstract String trabalhar();
}

class Peao extends Empregado1 {
    public String getTipo() {
        return "Peao";
    }

    public String trabalhar() {
        return  "Trabalhar como Peao";
    }
}

class Gerente extends Empregado1 {
    public String getTipo() {
        return "Gerente";
    }

    public String trabalhar() {
        return  "Trabalhar como Gerente";
    }
}

class Chefe extends Empregado1 {
    public String getTipo() {
        return "Chefe";
    }

    public String trabalhar() {
        return  "Trabalhar como Chefe";
    }
}

