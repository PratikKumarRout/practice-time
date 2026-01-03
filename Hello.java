// challege 1
public class Hello {

    public static void main(String[] args) {
        Student s1 = new Student("Tony", 101);
        Student s2 = new Student("Stark");
        System.out.println(s1.name + s1.rollNumber);
        System.out.println(s2.name + s2.rollNumber);

        Employee e1 = new Employee(1091993);
        System.out.println(e1.salary);
    }
}

class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }
}

class Student {
    String name;
    int rollNumber;

    Student(String sName, int sRoll) {
        name = sName;
        rollNumber = sRoll;
    }

    Student(String sName) {
        name = sName;
        rollNumber = 0;
    }

}
