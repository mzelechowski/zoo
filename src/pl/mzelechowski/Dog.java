package pl.mzelechowski;

public class Dog extends Animal implements Canine{


    public Dog(String name, float weight) {
        super( name, weight);
    }


    @Override
    public void introduce() {
        System.out.println(this.getId() +" : I'm a dog. My name is " + this.getName()+
                ". I weigh "+ this.getWeight() + " kg.");
    }

    @Override
    public void bark() {
        System.out.println("My name is "+getName() + " and I am barking: BARK BARK BARK");

    }
    void sitPretty(){
        System.out.println(getName()+ " sits pretty.");
    }
}
