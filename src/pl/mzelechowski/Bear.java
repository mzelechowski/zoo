package pl.mzelechowski;

public class Bear extends Animal {
    private int furLength;

    public Bear(int id, String name, float weight, int furLength) {
        super(id, name, weight);
        this.furLength = furLength;
    }

    @Override
    void introduce() {
        System.out.println("I'm bear. My name is " + this.getName()+
                ". I weigh "+ this.getWeight() + " kg and my fur length is " +this.furLength);

    }
}
