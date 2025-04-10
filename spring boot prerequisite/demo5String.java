public class demo5String {
    public static void main(String a[]) {
        String str = "Luxon"; //handy way to declare string, this automatically creates the object for us

        //or by making an object, as String is a class
        String name = new String("Adarsh");//behind the seen this is created always
        System.out.println("hello " + name);
        //few method of string class
        System.out.println(name.charAt(1));
        System.out.println(name.concat("panda"));//concatenate 2 string

        //by default string are immutable
        String s = "navin";
        s = s + "raddy"; //catch is we are not changing the existing String
        //we are changing the address, and making a new data in string constant pool in heap
        System.out.println("hello"+ s);

        //if you want mutable string we have, for that we have 2 diff classes in java to use
        //instead of using string, you can use StringBuffer or StringBuilder
        //StringBuffer is "thread" safe but StringBuilder is not
        //<String buffer> //this gives a buffer size of 16 byte
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());//16 empty space extra

        StringBuffer sb2 = new StringBuffer("navin");//you can change this string later
        System.out.println(sb2.capacity());//21 = 16 + 5
        System.out.println(sb2.length());//5
        sb2.append(" reddy");
        System.out.println(sb2);//navin reddy
        String stri = sb2.toString();//convert string buffer data to string
        sb2.deleteCharAt(2);//delete the char at index 2 -> nain reddy
        sb2.insert(5, "java"); //add "java" at index 0 ->nain java reddy
        sb2.setLength(5);//save the data till the space given
        System.out.println(sb2);
        sb2.ensureCapacity(100);
    }
}
