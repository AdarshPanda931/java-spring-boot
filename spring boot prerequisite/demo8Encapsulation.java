class human{
    //note- everytime u create a instance variable make it private
    private int age;//private means this variable can only be accessible in the same class
    private String name;
    //we can access the private data only through methods, this way we encapsulate data in method and this is encapsulation
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}

public class demo8Encapsulation {
    public static void main(String[] args){

        human obj = new human();
        obj.setAge(11);
        obj.setName("navin");

        System.out.println(obj.getName()+","+obj.getAge());

    }
}