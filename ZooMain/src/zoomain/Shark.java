package zoomain;

public class Shark extends Fish {
    public Shark(String name, String scaleColor) {
        super(name, scaleColor);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " Shark swimming in the deep.");
    }
}
