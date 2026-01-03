public class Hello {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Tonly");
        System.out.println(person.getName());
    }
}

class Person {
    private String name;

    // getter
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

}