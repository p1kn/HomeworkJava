import devices.Car;

import java.util.Date;

public class Human {

    public String firstName;
    public String lastName;
    public Animal pet;
    private Car car;
    private Double salary = 3010.0;
    private Date salaryCheckDate = null;

    public void setSalaryCheckDate() {
        this.salaryCheckDate = new Date();
    }

    public void setCar(Car car) {
        if (salary > car.value) {
            System.out.println("Stać Cię by kupić to auto za gotówkę");
            this.car = car;
        } else if (salary > car.value / 12) {
            System.out.println("Udało Ci się kupić to auto na raty (pod zastaw domu)");
            this.car = car;
        }else {
            System.out.println("#niestaccie");
            System.out.println("Idź do providenta, bociana, lombardu...albo...");
            System.out.println("Ogarnij finanse, a potem myśl o zakupie automobila");
        }
    }

    public Car getCar() {
        return car;
    }

    public Double getSalary() {
        System.out.println("Dane o twoim wynagrodzeniu sprawdzano: " + salaryCheckDate);
        System.out.println("Twoje wynagrodzenie to: " + salary);
        setSalaryCheckDate();
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Szefie, to Ty masz mi płacić, nie ja Tobie");
        } else {
            System.out.println("Zaktualizowana wysokość wynagrodzenia została wysłana do systemu księgowego");
            System.out.println("Idź do kadr - Hania da Ci do podpisania aneks do umowy");
            System.out.println("ZUS i Skarbówka już wiedzą ile zarabiasz, nie myśl o zatajaniu dochodów");
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }
}
