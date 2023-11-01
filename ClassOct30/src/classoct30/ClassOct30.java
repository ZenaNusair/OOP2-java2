package classoct30;

public class ClassOct30 {

    public static void main(String[] args) {
        Person p=new Person();//ref new constr
        p.name="zena";
        p.sayHello();
        
        Person p1=new Person();
        p1.name="monther";
        p1.sayHello();
        
        Person p2=new Person();//new const
        p2.name="nusair";
        p2.sayHello();
        
        Person p3=p1;//call other at
        p3.name="sari";
        p3.sayHello();
        
        Person p4=null;
        p4.name="mohz";
        p4.sayHello();
    }
    
}
