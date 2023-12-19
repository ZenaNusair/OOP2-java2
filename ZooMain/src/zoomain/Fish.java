package zoomain;

public class Fish extends Animal {
    private String scaleColor;

    public Fish(String name, String scaleColor) {
        super(name);
        this.scaleColor = scaleColor;
    }

    public void swim() {
        System.out.println(getName() + " Fish swimming.");
    }

    @Override
    public void performActivity() {
        swim();
    }
}
