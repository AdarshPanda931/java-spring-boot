class mobile{
    String brand;//instance variable
    int price;
    static String name;
    //by making static we make this name variable common to all the object
    public void show(){
        System.out.println(brand+","+price+","+name);
    }
    public static void show1(mobile obj){
        //static method can be called directly by class no need to create a object
        System.out.println("in static method");
        System.out.println(obj.brand+","+obj.price+","+name);
        //we cannot use non static variable inside a static method directly
        //but indirectly by passing the obj in this method and
    }
}

public class demo6StaticVariable {
    public static void main(String a[]){
        mobile obj1 = new mobile();
        obj1.brand = "apple";
        obj1.price = 1500;
        obj1.name ="smart phone";
        //we can call a static variable  by obj, but it should be called by their class.
        mobile.name="smart phone";//✅

        mobile obj2 = new mobile();
        obj2.brand = "samsung";
        obj2.price = 1700;
        obj2.name ="phone"; //since name is static, it is shared by all the object
        mobile.name="phone";//✅

        obj1.show();
        obj2.show();
        mobile.show1(obj1);//static method show1 called by class name
        mobile.show1(obj1);
        //you pass the object in the static method and catch it where the method is made
    }
}
