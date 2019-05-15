public class Mixer {
    private static final int DANGER_LIMIT = 30;

    public int mix(Element el1, Element el2) throws Exception {
        if (el1.isRadioactive() || el2.isRadioactive()) {
            throw new Exception();
        }

        int total = el1.getDamage() + el1.getDangerFactor() 
                    + el2.getDamage() + el2.getDangerFactor();

        if (total > DANGER_LIMIT) {
            throw new Exception();
        }

        return total;
    }
}