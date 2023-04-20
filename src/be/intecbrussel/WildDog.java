package be.intecbrussel;

public class WildDog extends Dog {


    private char size = 'L'; // size 'S' | 'M' | 'L'



    public char getSize() {
        return size;
    }


    public void setSize(char size) {
        this.size = size;
    }

    public void bark(int times) {
this.bark();
    }


    public void hunt() {

    }

    @Override
    public String toString() {
        return "WildDog{" +
                "size=" + size +
                '}';
    }
}
