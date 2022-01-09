package buoi07.thuchanh_lop_animal_va_interface_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck -cluck";
    }

    @Override
    public String howtoEat() {
        return "Could be Fried";
    }
}
