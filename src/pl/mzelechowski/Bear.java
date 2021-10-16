package pl.mzelechowski;

public class Bear extends Animal {
    private int furLength;

    public Bear( String name, float weight, int furLength) {
        super(name, weight);
        this.furLength = furLength;
    }

    @Override
    public void introduce() {
        System.out.println("I'm a bear. My name is " + this.getName()+
                ". I weigh "+ this.getWeight() + " kg and my fur length is " +this.furLength+".");

    }
}
