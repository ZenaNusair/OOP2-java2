package october30;

public class October30 {
    
    public static void main(String[] args) {
       int n1 = Util.readNumber("Pleas Enter n1");
        int n2 = Util.readNumber("Pleas Enter n2");
        boolean exit = false;
        while (!exit) {
            Util.println("1- Add");
            Util.println("2- Sub");
            Util.println("3- Mul");
            Util.println("4- Div");
            Util.println("5- Quit");
            Util.println("---------------------");
            int choice = Util.readNumber("Please enter your choice");

            switch (choice) {
                case 1:
                    Util.println(n1 + n2);
                    break;
                case 2:
                    Util.println(n1 - n2);
                    break;
                case 3:
                    Util.println(n1 * n2);
                    break;
                case 4:
                    Util.println(n1 / n2);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    Util.println("Invalid Input");

            }
        }
        Util.println("Thank you ,bye!!");
    }
    }
    

