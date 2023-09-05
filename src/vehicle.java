
public class vehicle {
    private String brand;
    private String model;
    private int manufactureYear;
    private double motorVolume;
    private int doorCount;
    private double CV;
    private  int seatCount;
    private  double curSpeed;
    private  double maxSpeed;
    private person owner;
    private engine engine;
    private gearbox gearbox;
    private tires tires;

    public vehicle(String brand, String model, int manufactureYear, double motorVolume, int doorCount, double CV, int seatCount, double curSpeed, double maxSpeed, person owner){
        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.motorVolume = motorVolume;
        this.doorCount = doorCount;
        this.CV = CV;
        this.seatCount = seatCount;
        this.curSpeed = curSpeed;
        this.maxSpeed = maxSpeed;
        this.owner = owner;
    }

    public vehicle(String brand, String model, engine engine, gearbox gearbox, tires tires) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.gearbox = gearbox;
        this.tires = tires;
    }

    public person getOwener(){
        return owner;
    }

    public void setOwner(person owner) {
        this.owner = owner;
    }

    //Getters & Setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public double getMotorVolume() {
        return motorVolume;
    }

    public void setMotorVolume(double motorVolume) {
        this.motorVolume = motorVolume;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public double getCV() {
        return CV;
    }

    public void setCV(double CV) {
        this.CV = CV;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public double getCurSpeed() {
        return curSpeed;
    }
    public void setCurSpeed(double curSpeed) {
        if (curSpeed > maxSpeed) {
            System.out.println("Can't exceed maximum speed.");
        } else if (curSpeed < 0) {
            System.out.println("Current speed can't be negative.");
        } else {
            this.curSpeed = curSpeed;
        }
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    //accelerate
    public void  accelerate (double speed){
        System.out.println("------");
        setCurSpeed(curSpeed+speed);
        System.out.println("Accelerating...");
        System.out.println("------");
    }

    //decelerate

    public void decelerate (double speed) {
        System.out.println("------");
        System.out.println("Decelerating...");
        setCurSpeed(curSpeed - speed);
        if (curSpeed < 0) {
            curSpeed = 0;
        }
        System.out.println("------");
    }

    //break
    public void breaks(){
        System.out.println("------");
        System.out.println("Breaking...");
        setCurSpeed(0);
        System.out.println("------");
    }

    //calculate estimated time
    public double estimatedTime(double distance){
        return distance/curSpeed;
    }

    public void showAttributes(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Manufacturing year: " + manufactureYear);
        System.out.println("Motor: " + motorVolume+" liters");
        System.out.println("Doors: " + doorCount);
        System.out.println("Seats: " + seatCount);
        System.out.println("CV: " + CV+"cv");
        System.out.println("Max Speed: " + maxSpeed + " Km/h");
        System.out.println("Current Speed: " + curSpeed + " Km/h");

    }


    public tires getTires() {
        return tires;
    }
}
