public class Opps {
    public static void main(String[] args) {
        // Object Oriented Programming System
        // Class and Object
        // Class is a blueprint of an object
        // Object is an instance of a class
        // Class is a template for creating objects
        // Object is a real world entity
        // Class is a logical entity
        // Object has state and behavior
        // Class has no state and behavior
        Student obj=new Student("Harikrishna",21,065,90);
//         obj.name="Harikrishna";
//         obj.age=21;
//         obj.rollno=065;
//         obj.mark=90;
        obj.display();
        Student obj2=new Student("Harish",22,066,80);
//         obj2.name="Harish";
//         obj2.age=22;    
//         obj2.rollno=066;
//         obj2.mark=80;
        obj2.display();
    }
    
}

// class Student {
//     String name;
//     int age;
//     int rollno;
//     int mark;

//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Roll No: " + rollno);
//         System.out.println("Mark: " + mark);

class Student {
    String name;
    int age;
    int rollno;
    int mark;

    Student(String a, int b, int c, int d) {
        name = a;
        age = b;
        rollno = c;
        mark = d;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollno);
        System.out.println("Mark: " + mark);
    }
}
