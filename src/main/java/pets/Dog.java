package pets;

public class Dog extends Mammal {
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Dog(String size) {
        this.size = size;
    }
}
