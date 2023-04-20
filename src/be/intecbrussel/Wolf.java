package be.intecbrussel;

public class Wolf {

    private String noise = "Auuuuwwwww";

    private String name;

    private int lifeSpan; // lifespan in years


    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    


    public void makeNoise(String noise) {

    }

    @Override
    public String toString() {
        return "Wolf{" +
                "noise='" + noise + '\'' +
                ", name='" + name + '\'' +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
