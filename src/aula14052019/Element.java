package aula14052019;

public class Element {
    private int dangerFactor;
    private int damage;
    private boolean radioactive;

    public Element(int dangerFactor, 
                    int damage,
                    boolean radioactive) {
        this.dangerFactor = dangerFactor;
        this.damage = damage;
        this.radioactive = radioactive;
    }

    public int getDangerFactor() {
        return dangerFactor;
    }

    public int getDamage() {
        return damage;
    }
    
    public boolean isRadioactive() {
        return radioactive;
    }
 }