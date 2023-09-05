import java.util.ArrayList;

public class main {
    public static void main(String[] args) {


        //VEHICLE

//        car  = new vehicle("Renault","12",1987,1.6,4,60,4,80,120);
//
//        car.showAttributes();
//
//        car.accelerate(40);
//
//        car.showAttributes();

        //ACCOUNT
//
//        Account pepe = new Account("Pepe",15000);
//
//        pepe.withdraw(400.44);
//
//        pepe.showAccount();
//
//        //PERSON
//
//        person juan = new person("Juan",23,85.3,1.87);
//
//        System.out.println("name: "+juan.getName());
//
//        System.out.println("age: "+juan.getAge());
//
//        System.out.println("iws adult?: "+juan.isAdult());
//
//        System.out.println("DNI: "+juan.getDNI());
//
//        System.out.println("IMC: "+juan.getIMC());
//
//        // BOOK
//
//        book book= new book("The Lord of The Rings","J.R.R. Tolkien");
//
//        book.setCopies(1);
//
//        System.out.println(book.borrowBook());
//
//        System.out.println(book.returnBook());
//
//        System.out.println(book.toString());
//
//        //CAR AND PERSON RELATIONSHIP
//
//        person personA = new person("Javier",32);
//
//        vehicle renault12  = new vehicle("Renault","12",1987,1.6,4,60,4,40,120, personA);
//
//        person PersonB = new person("Ramón",23);
//
//        vehicle falcon = new vehicle("Ford","Falcon",1975,2.0,4,100,4,100,150,PersonB);
//
//        //Car 1
//
//        System.out.println("Renault 12 in the city");
//        System.out.println("Current Speed: "+renault12.getCurSpeed());
//        renault12.breaks();
//        renault12.accelerate(40);
//        System.out.println("Current : "+renault12.getCurSpeed());
//
//        //Car 2
//
//        System.out.println("Ford Falcon in the road");
//        System.out.println("Current Speed: "+falcon.getCurSpeed());
//        falcon.accelerate(20);
//        System.out.println("Current Speed: "+falcon.getCurSpeed());
//
//        //Computer with components
//        cpu processor = new cpu("Intel","Core i7");
//        memory ram = new memory(16,"Ram");
//        peripherals mouse = new peripherals("Mouse","Logitech G203");
//
//
//        computer GamingBeast = new computer(processor,ram,mouse);
//
//            System.out.println("Computer details: ");
//            System.out.println("CPU: "+processor.getBrand()+" "+processor.getModel());
//            System.out.println("Memory: "+ram.getType()+" "+ram.getCapacity()+"GB");
//            System.out.println("Peripherals: "+mouse.getName());
//
//        //CAR WITH PARTS
//
//        //Creating objects from the classes
//        engine v8engine = new engine("Diesel",500);
//        gearbox gearbox1 = new gearbox(gearbox.GearboxType.MANUAL,5);
//        tires tires1 = new tires("alloy",18);
//
//        //Creating a car using the instances
//        vehicle car1 = new vehicle("Renault","12",v8engine,gearbox1,tires1);
//
////        System.out.println("Engine type: " + car1.getEngine().getType());
////        System.out.println("Engine power: " + car1.getEngine().getPower());
////        System.out.println("Number of gears: " + car1.getGearbox().getShifts());
////        System.out.println("Gearbox type: " + car1.getGearbox().getType());
////        System.out.println("Wheels material: " + car1.getTires().getMaterial());
////        System.out.println("Wheels diameter: " + car1.getTires().getDiameter());
////
//
//        //CIRCLE AND CENTER POINT
//
//        point point1 = new point(2, 3);
//
//        circumference circle = new circumference(5, point1);
//
//        System.out.println("The radius is: " + circle.getRadius());
//        System.out.println("The center point is: " + circle.getCenter().getX() + "," + circle.getCenter().getY());
//
//        //LINE AND POLYGON
//
//        point point2 = new point(4, 2);
//
//        point point3 = new point(6, 6);
//
//        point point4 = new point(8, 4);
//
//        line line1 = new line(point2, point3);
//
//
//        ArrayList<point> points = new ArrayList<>();
//
//        points.add(point2);
//        points.add(point3);
//        points.add(point4);
//
//        polygon triangle = new polygon("triangle",points);
//
//        System.out.println("The line slope is: " + line1.getSlope());
//
//        System.out.println("The line length is: " +line1.calculateLength());
//
//        System.out.println("The polygon name is: "+triangle.getName());
//
//        //X,Y coordinates for point inside array
//        triangle.getPoints().forEach((point -> {
//            System.out.println("X:"+point.getX()+" "+"Y:"+point.getY());
//        }));
//        }

        //Bidirectional relationship between Account and person
        Account account3 = new Account("Luis", 10000);
        person personC = new person("Luis", 72, account3);

        personC.setAccount(account3);
        account3.setPersona(personC);

        System.out.println(account3.getPersona());
        System.out.println(personC.getAccount());


    }
}
