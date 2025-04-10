class student{
    int roll;
    String name;
    int marks;
}
public class demo4ArrayOfObjects {
    public static void main(String a[]){
        student s1 = new student();
        s1.roll=1;
        s1.name="adp";
        s1.marks=99;
        student s2 = new student();
        s2.roll=2;
        s2.name="harsh";
        s2.marks=90;
        student s3 = new student();
        s3.roll=3;
        s3.name="navin";
        s3.marks=88;
        System.out.println(s1);//prints the address student@6acbcfc0
        System.out.println(s2.roll+"->"+s2.name+":"+s2.marks);
        //store these obj in an array
        student stud[]= new student[3];
        stud[0]=s1;
        stud[1]=s2;
        stud[2]=s3;
        //print the name and marks
        for(int i=0;i<stud.length;i++){
            System.out.println(stud[i].name+":"+stud[i].marks);
        }
        //using enhanced for loop
        for(student n:stud){
            System.out.println(n.name+":"+n.marks);
        }
    }
}
