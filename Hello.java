// challenge 1
public class Hello {

    static void countdown(int num) {
        if (num > 0) {
            System.out.print(num + " ");
            countdown(num - 1);
        }
    }

    public static void main(String[] args) {
        countdown(10);
    }
}