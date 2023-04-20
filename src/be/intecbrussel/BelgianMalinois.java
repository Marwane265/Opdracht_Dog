package be.intecbrussel;

public class BelgianMalinois extends WildDog {


    private boolean dangerous;

    private double maxRunningSpeed;


    public boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }


    public double getMaxRunningSpeed() {
        return maxRunningSpeed;
    }

    public void setMaxRunningSpeed(double maxRunningSpeed) {
        this.maxRunningSpeed = maxRunningSpeed;
    }

    public boolean defend() {
return this.dangerous;
    }

    public boolean attack() {
        return this.dangerous;
    }

    @Override
    public String toString() {
        return "BelgianMalinois{" +
                "dangerous=" + dangerous +
                ", maxRunningSpeed=" + maxRunningSpeed +
                '}';
    }
}
