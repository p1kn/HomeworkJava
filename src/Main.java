import devices.Car;

public class Main {


    public static void main(String[] args) {

        Animal dog = new Animal("canis");
        dog.name = "Diabeł";

        System.out.println(dog.getWeight());
        dog.takeForAWalk();
        System.out.println(dog.getWeight());
        dog.feed();
        System.out.println(dog.getWeight());
        dog.takeForAWalk();
        dog.takeForAWalk();

        Car car = new Car("Dodge", "Durango", 50000.0, 286, "Black", "AT", "Petrol", 100000.0);

        Car car1 = new Car("Dodge", "Durango", 50000.0, 286, "Black", "AT", "Petrol", 100000.0);

        Human maciek = new Human();
        maciek.firstName = "Maciek";
        maciek.lastName = "Plandowski";
        maciek.pet = dog;

        maciek.setSalary(10000.0);
        maciek.setCar(car);



        maciek.getSalary();
        maciek.getSalary();
        maciek.getSalary();

        System.out.println(car.equals(car1));

        System.out.println(car);
        System.out.println(car1);

        System.out.println(dog);

        System.out.println(maciek);

        System.out.println("-----------------------------------------");

        System.out.println(maciek.getCar());















    }
}