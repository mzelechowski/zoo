package pl.mzelechowski;

public class Tiger extends Animal {
    public int clawLength;

    public Tiger( String name, float weight, int clawLength) {
        super( name, weight);
        this.clawLength = clawLength;
    }

    @Override
    public void introduce() {
        System.out.println("I'm a Tiger. My name is " + this.getName()+
                ". I weigh "+ this.getWeight() + " kg and my claw length is " +this.clawLength+".");
    }
}
