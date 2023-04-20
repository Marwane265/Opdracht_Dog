package be.intecbrussel;

public class Akita extends HomelyDog {


    //* Akita is very smart dog, and never obeys commands. It has a free soul.
    // You can never make him sit. Gender for this dog breed is very important.
    // If gender is 'F' then the size is 'M', if gender is 'M' then the size is 'L'


    private char gender;



@Override
    public void makeNoise() {
    super.makeNoise();
        System.out.println("akita is making some noise");
    }

@Override
    public void bark() {

        System.out.println("wow wow wow");
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (gender == 'F') {
            setSize('M');
        } else if (gender == 'M') {
            setSize('L');
        }

        this.gender = gender;
    }

    public boolean layDown() {
        if (layDown() == true) {

            System.out.println("impossible to make this dog laydown");


        }

        return false;
    }


    public void dance() {
        System.out.println("Akita dances");
    }

    public void sing() {
        System.out.println("Akita sings nice");
    }


    public void sit() {
super.sit();

    }

    @Override
    public void makeNoise(String noise) {
        super.makeNoise(noise);
        System.out.println("akitooo");
    }

    @Override
    public String toString() {
        return "Akita{" +
                "gender=" + gender +
                '}';
    }
}
