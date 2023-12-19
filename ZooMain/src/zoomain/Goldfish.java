package zoomain;

public class Goldfish extends Fish {
     public Goldfish(String name, String scaleColor) {
        super(name, scaleColor);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " Goldfish swimming in a bowl.");
    }
}
