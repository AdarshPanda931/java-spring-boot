import static java.lang.Class.forName;

class mobile2{
    String brand;
    int price;
    static String name;
    public mobile2(){//constructor to initialise some variable with default value
        brand="";
        price=200;
        //name = "phone";
        // every time we call a object the constructor will be called everytime
        //brand & price will be initialised everytime is okay
        // but why we need to name to initialised everytime as it is same
        // since name is static it should be initialised only once
        //for that lets make a "static block" below
        System.out.println("in constructor");
    }
    static{ //static blok is used to initialised static variable
        name = "phone";
        System.out.println("in static block");
    }
    //static block will be called first and only once irrespective of how many object
}
public class demo7StaticBlock {
    public static void main(String a[]) throws ClassNotFoundException {
        mobile obj = new mobile();
        obj.brand = "apple";
        obj.price = 1500;
        mobile2.name ="smart phone";

        mobile2 obj2 = new mobile2();
        //object with no value will get default value of constructor and static block

        //we can use class class to load only class without initialised object
        //used for testing
        Class.forName("mobile");
    }
}
