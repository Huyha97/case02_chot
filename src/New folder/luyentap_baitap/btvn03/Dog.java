package luyentap_baitap.btvn03;

public class Dog extends Animal implements AnimalMethod{

    public Dog() {
    }

    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 50;
    }

    @Override
    public String makeSound() {
        return "Go go..";
    }

    public void eatMeat(){
        System.out.println(" cho ko an thit bo...");
    }

    public void display() {
        System.out.printf("%-20s","Cat");
        System.out.printf("%-20s",super.getName());
        System.out.printf("%-20s",super.getAge());
        System.out.printf("%s",super.getWeight());
        System.out.println();
    }
}
