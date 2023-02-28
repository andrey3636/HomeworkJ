public class Homework1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Bob",15);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}

class Person{
    private String fullName;
    private int age;

    public Person(){
        System.out.println("Hello from the first constructor");
    }

    public Person(String name,int age){
        this.fullName = name;
        this.age = age;
        System.out.println("Hallo from the second constructor");
    }

    public void move(){
        System.out.println(fullName + " is moving");
    }
    public void talk() {
        System.out.println(fullName + " is talking");
    }


}

