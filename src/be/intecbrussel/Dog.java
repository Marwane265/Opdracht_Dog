package be.intecbrussel;

public class Dog extends Wolf {


    private char size;


    public Dog() {

    }


    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void bark() {

        System.out.println("wow wow wow");
    }

    public void sit() {
        System.out.println("Dog is now sitting");
    }


    public void makeNoise() {
        System.out.println("wow wow wow");
    }


    @Override
    public String toString() {
        return "Dog{" +

                ", size=" + size +
                '}';
    }
}
