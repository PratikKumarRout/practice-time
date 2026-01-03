// challenge 1
public class Hello {

    public static void main(String[] args) {
        Calculator newCal = new Calculator();
        System.out.println(newCal.add(5, 5));
        System.out.println(newCal.add(2, 3, 4));
        System.out.println(newCal.multiply(5, 5));
        System.out.println(newCal.multiply(5.2, 2.0));

        Printer newPrinter = new Printer();
        newPrinter.printInfo(50);
        newPrinter.printInfo("null");
        newPrinter.printInfo("Tony", 10);
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}

class Printer {
    void printInfo(String text) {
        System.out.println(text);
    }

    void printInfo(int number) {
        System.out.println(number);
    }

    void printInfo(String text, int number) {
        System.out.println(text + number);
    }
}
