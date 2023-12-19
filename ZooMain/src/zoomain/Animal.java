package zoomain; 

public class Animal {
   private static Animal instance;
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void performActivity() {
        
        System.out.println(getName() + " Animal");
    }
}
