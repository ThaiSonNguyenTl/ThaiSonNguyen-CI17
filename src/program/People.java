package program;

import java.sql.SQLOutput;

public class People {
    String name; // non-static : duoc tao moi kem theo doi tuong  //thuoctinh
    int age;

    //    static int count; // static : duoc tao kem theo class
//    public People() {
//        count ++;
//        name = "anhson";
//        age = 12;
//    }

    public People(String name, int age) {    //hamtao
//        count ++;
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        People person1 = new People("John", 20);
        System.out.println(person1.name);

    }
}

class Student extends People {
    double average;
    public Student(String name ,int age){
        super(name,age); // tro den ham tao o lop cha tuc la hai dong code dc chay this.name va this.age



    }

}
