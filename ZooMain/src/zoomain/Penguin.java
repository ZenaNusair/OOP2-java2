package zoomain;

public class Penguin extends Bird{
    public Penguin(String name, String color) {
        super(name, color);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " Penguin cannot fly.");
    }
}
