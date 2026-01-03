public class Hello {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Tonly");
        System.out.println(person.getName());

        person.setAge(27);
        System.out.println(person.getAge());

        BankAccount myAccount = new BankAccount();

        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.withdraw(400.0);

        System.out.println("Final Balance: $" + myAccount.getBalance());
    }
}

class Person {
    private String name;
    private int age;

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {
            this.age = newAge;
        } else {
            System.out.println("invalid age !");
        }
    }

}

class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount !");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("withdraw : " + amount);
        } else {
            System.out.println("Invalid withdrawal amount !");
        }
    }
}