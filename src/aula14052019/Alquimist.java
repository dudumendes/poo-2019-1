package aula14052019;

public class Alquimist {
    private Mixer mixer = new Mixer();

    public void create() {
        Element el1 = new Element(10, 10, false);
        Element el2 = new Element(4, 5, false);
        Element el3 = new Element(3, 11, true);
        Element el4 = new Element(10, 12, false);
        try {
            mixer.mix(el1, el2);
        } catch (Exception e) {
            System.out.println("Papocou el1 + el2");
        }
        try {
            mixer.mix(el1, el3);
        } catch (Exception e) {
            System.out.println("Papocou el1 + el3");
        }

        try {
            mixer.mix(el2, el4);
        } catch (Exception e) {
            System.out.println("Papocou el2 + el34");
        }

    }
}