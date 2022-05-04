package ge.itvet.polymorphism;

public class Kitten extends Cat {

    @Override
    public String sayMeow() {
        return "meow" + super.sayMeow();
    }

}
