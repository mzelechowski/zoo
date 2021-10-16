package pl.mzelechowski;

public class Wolf extends Animal implements Canine{
    private int fangLength;

    public Wolf(String name, float weight, int fangLength) {
        super(name, weight);
        this.fangLength = fangLength;
    }


    @Override
    public void introduce() {
        System.out.println(this.getId() +" : I'm a wolf. My name is " + this.getName()+
                ". I weigh "+ this.getWeight() + " kg and my fang length is " +this.fangLength+".");
    }

    @Override
    public void bark() {
        System.out.println("My name is "+getName() + " and I am barking: bark bark bark");
    }
}
