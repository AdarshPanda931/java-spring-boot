class a extends Object{//every class in java extends to the object class even if you don't mention it
    public a(){
        super(); //every constructor always has this super method hidden even if you don't mention
        System.out.println("in a");
    }
    public a(int n){
        super();
        System.out.println("in a int");
    }
}
class b extends a{//inheritance , b is subclass and a is superclass
    public b(){
        super();
        System.out.println("in b");
    }
    public b(int n){
        this();
        System.out.println("in b int");
    }
}

public class demo10ThisAndSuperMethod {
    public static void main(String[] args) {
        b obj = new b(5);
    }
}
