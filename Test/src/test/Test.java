//Constroctor overlode signiture
//public method to prevent 
//parimiterized input
//privite input
//finallize cominlly used instance
package test;


public class Test {

    public static void main(String[] args) {
        Circle c=new Circle(10);//ref new constr
        System.out.println(c.getRound());
        
        Circle c2=new Circle();
        c2.setRad(20);
        System.out.println(c2.getArea());
    }
    
}
