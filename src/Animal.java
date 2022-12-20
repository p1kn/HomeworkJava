public class Animal {

    public final String species;
    public String name;
    private double weight;
    private boolean isAlive;

    public Animal(String species) {
        this.isAlive = true;
        this.species = species;

        switch (species) {
            case "canis":
                this.weight = 10.0;
                break;
            case "felis":
                this.weight = 2.0;
                break;
            case "eqqus":
                this.weight = 160.0;
                break;
            default:
                this.weight = 5.0;
                break;
        }
    }

    public double getWeight() {
        return this.weight;
    }

    public void feed() {
        if (isAlive) {
            weight += 0.5;
            System.out.println("Dzięki za jedzenie Człowiek!");
        }else {
            System.out.println("Zagłodziłeś swojego pupila Łachudro!");
        }
    }

    public void takeForAWalk() {
        if (!isAlive) {
            System.out.println("Halooo Policja!");
        } else {
            weight -= 0.5;
            if (weight <= 0.0) {
                isAlive = false;
            } else {
                System.out.println("Dzięki za spacer Człowiek!");
            }
        }

    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", isAlive=" + isAlive +
                '}';
    }
}
