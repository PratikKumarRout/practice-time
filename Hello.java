// challenge 1
public class Hello {

    public static void main(String[] args) {
        int num = 13;
        int score = 98;
        int day = 1;

        System.out.println("Challenge 1");
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        System.out.println("Challenge 2");

        if (score >= 90 && score <= 100) {
            System.out.println("Grade A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Grade B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Grade C");
        } else if (score < 70 && score >= 0) {
            System.out.println("Grade F");
        } else {
            System.out.println("Not valid score.");
        }

        System.out.println("challenge 3");
        switch (day) {
            case 1:
                
                break;
        
            default:
                break;
        }

    }
}