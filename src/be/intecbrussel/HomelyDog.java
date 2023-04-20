package be.intecbrussel;

public class HomelyDog extends Dog {


    private char size = 'M';  //* size 'S' | 'M' | 'L'


    private char coat;  //* coat 'L' | 'S'


    public char getSize() {
        return size;
    }


    public void setSize(char size) {
        this.size = size;
    }


    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }



    public String toString() {
        return "HomelyDog{" +
                "size=" + size +
                ", coat=" + coat +
                '}';
    }
}
