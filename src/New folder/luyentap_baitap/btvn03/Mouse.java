package luyentap_baitap.btvn03;

import com.sun.xml.internal.fastinfoset.stax.factory.StAXOutputFactory;

public class Mouse extends Animal implements AnimalMethod {

    public Mouse() {
    }

    public Mouse(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 10;
    }

    @Override
    public String makeSound() {
        return "chit chit";
    }

    public void display(){
        System.out.printf("%-20s", super.getName());
        System.out.printf("%-20s", super.getAge());
        System.out.printf("%-20s", super.getWeight());
        System.out.println();
    }

}
