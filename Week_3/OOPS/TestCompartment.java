//package Week_3.OOPS;

import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "This is First Class Compartment";
    }
}

class Ladies extends Compartment {
        @Override
        public String notice() {
            return "This is Ladies Compartment";
        }
    }

class General extends Compartment {
        @Override
        public String notice() {
            return "This is General Compartment";
        }
    }

class Luggage extends Compartment {
        @Override
        public String notice() {
            return "This is Luggage Compartment";
        }
    }

public class TestCompartment {
    public static void main(String[] abc) {
        Compartment[] compartments = new Compartment[10];
        Random random = new Random();
        for (int i = 0; i < compartments.length; i++) {
            int choice = random.nextInt(4) + 1;// Generate a random number between 1 and 4
            switch (choice) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }
        System.out.println("=== Railway Compartment: === ");
        for (Compartment compartment : compartments) {
            System.out.println(compartment.notice());
        }
    }
}