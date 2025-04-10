class calculator{
    int a;
    public int add(int n1, int n2){
        System.out.println("adding");
        int r = n1 + n2;
        return r;
    }
}
public class demo1 {
    public static void main(String[] args){
        int n1=4;
        int n2=5;
        //int result = n1+ n2;
        //System.out.println(result);
        calculator cal = new calculator();
        cal.add(n1, n2);
        int res = cal.add(n1, n2);
        System.out.println(res);
    }
}
