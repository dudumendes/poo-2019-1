public class Main {
    public static void main(String[] args) {
        Empregado1  emp1 = new Peao();
        Empregado1  emp2 = new Gerente();    
        Empregado1  emp3 = new Chefe();   
        
        Empregado emp4 = new Empregado(1);
        
        emp1.trabalhar();
        emp1.getTipo();
    
    }

}