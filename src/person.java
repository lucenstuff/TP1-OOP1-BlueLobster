import java.util.Random;
public class person {

    private String name;
    private int age;
    private String dni;
    private double weight;
    private double height;

    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public person(String name, int age, Account account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //DNI Generator

    public String getDNI() {
        if (dni == null) {
            dni = generateDNI();
        }
        return dni;
    }

    private String generateDNI() {
        Random random = new Random();
        int number = random.nextInt(100000000); // Generates a
        String formattedNumber = String.format("%08d", number);

        return formattedNumber;
    }

    //IMC Calculator

    public double calculateIMC() {
        double imc = this.weight / (this.height * this.height);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc < 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public int getIMC() {
        return (int) this.calculateIMC();
    }

    //Check if person is adult

    public boolean isAdult() {
        int age = this.getAge();
        return age >= 18;
    }

    //Print all person's data to console

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", dni='" + dni + "', weight=" + weight + ", height=" + height + "}";
    }



}



