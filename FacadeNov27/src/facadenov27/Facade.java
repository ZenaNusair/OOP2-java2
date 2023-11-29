package facadenov27;

class Facade {

    private Subsystem subsystem1;
    private Subsystem2 subsystem2;

    public Facade() {
        this.subsystem1 = new Subsystem();
        this.subsystem2 = new Subsystem2();

    }

    public void operate() {
        System.out.println("Facade:");
        subsystem1.operation1();
        subsystem2.operation2();

    }
}
