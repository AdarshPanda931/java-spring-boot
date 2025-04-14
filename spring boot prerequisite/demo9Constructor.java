class human2{
    private int age;
    private String name;
    public human2(){//default constructor
        age=12;
        name="john";
        System.out.println("in constructor");
    }
    public human2(int a, String name){//parameterized constructor
        age=a;
        this.name=name;
    }
    //getter and setter methods
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
public class demo9Constructor {
    public static void main(String[] args){
        human2 obj = new human2();
        human2 obj1 = new human2(18,"navin");//requires parameterised constructor
        System.out.println(obj.getName()+","+obj.getAge());
        System.out.println(obj1.getName()+","+obj1.getAge());
        obj.setAge(30);
        obj.setName("reddy");
        System.out.println(obj.getName()+","+obj.getAge());
    }
}
