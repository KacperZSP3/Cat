import java.time.LocalDate;

class Cat{

    private String name;
    private LocalDate birthday;
    private double weight;
    private String master;

    public Cat(String name, LocalDate birthday, double weight, String master) {
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String introduceMyMaster() {
        return "My master's name is: " + master.toUpperCase();
    }

}

public class Main {
    public static void main(String[] args) {
        Cat pulpecik = new Cat("Pulpecik", LocalDate.of(2021, 10, 10), 3.6, "Casper");
        System.out.println("Cat's name: " + pulpecik.getName().toUpperCase() + " " + "Date of birth: " + pulpecik.getBirthday() + " " + "Cat's weigh: " + pulpecik.getWeight() + " " + "Master's name: " + pulpecik.getMaster() );
        System.out.println(pulpecik.introduceMyMaster());

    }
}