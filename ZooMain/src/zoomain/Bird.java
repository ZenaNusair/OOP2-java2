package zoomain;

public class Bird extends Animal {
private String color;
private String name;

    public Bird(String name, String color) {
        super(name);
        this.color = color;
    }

    public void fly() {
        System.out.println(getName() + " Bird flying.");
    }

    @Override
    public void performActivity() {
        fly();
    }
  
}
    
    
    

