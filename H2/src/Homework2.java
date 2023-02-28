public class Homework2 {
    public static void main(String[] args) {
        Phone phone1 = new Phone(12345678912l,"Samsung",0.15);
        Phone phone2 = new Phone(28557575757l,"Nokia",0.2);
        Phone phone3 = new Phone(88888888374l,"Apple",0.25);

        System.out.println(phone1.getModel() +" "+ phone1.getNumber() +" "+ phone1.getWeight());
        System.out.println(phone2.getModel() +" "+ phone2.getNumber() +" "+ phone2.getWeight());
        System.out.println(phone3.getModel() +" "+ phone3.getNumber() +" "+ phone3.getWeight());

        System.out.println();

        phone1.receiveCall("John");
        phone2.receiveCall("Bob");
        phone3.receiveCall("Tom");

        System.out.println();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

    }

}

class Phone{
    private long number;
    private String model;
    private double weight;

    public Phone(long number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public long getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }


    public void receiveCall(String name){
        System.out.println("Звонит "+ name +" "+ getNumber());
    }
}

