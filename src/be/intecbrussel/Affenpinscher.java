package be.intecbrussel;

public class Affenpinscher extends HomelyDog {
    //* this dog always has a German nickname


    private String color;

    private String nickName;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void dance(){
        System.out.println("Aff dog is dancing");
    }


    @Override
    public String toString() {
        return "Affenpinscher{" +
                "color='" + color + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
