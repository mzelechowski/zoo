package pl.mzelechowski;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Bear bear = new Bear("Yogi", 200, 40);
        Tiger tiger = new Tiger("Jataka", 150, 25);
        Wolf wolf = new Wolf("Howle",70,40);
        Dog dog = new Dog("Scooby", 30);
        animals.addAll(Arrays.asList(bear, tiger, wolf, dog));
        for (Animal a:animals){
            a.introduce();
        }
        List<Canine> howlers = new ArrayList<>();
        howlers.addAll(Arrays.asList(wolf, dog));

        for (Canine h:howlers){
            h.bark();
            if (h instanceof Dog){
                Dog d = (Dog) h;
                ((Dog) h).sitPretty();
            }
        }
    }
}
