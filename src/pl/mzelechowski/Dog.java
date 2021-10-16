package pl.mzelechowski;

public class Dog extends Animal implements Canine{


    public Dog(int id, String name, float weight) {
        super(id, name, weight);
    }

    @Override
    void introduce() {
        System.out.println("I'm dog. My name is " + this.getName()+
                ". I weigh "+ this.getWeight() + " kg.");
    }

    @Override
    public void bark() {

    }
}
