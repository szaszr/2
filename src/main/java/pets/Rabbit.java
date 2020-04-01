package pets;

public class Rabbit extends Mammal{

    private boolean isDomesticated;

    public Rabbit(boolean isDomesticated) {
        this.isDomesticated = isDomesticated;
    }

    public boolean isDomesticated() {
        return isDomesticated;
    }

    public void setDomesticated(boolean domesticated) {
        isDomesticated = domesticated;
    }
}
