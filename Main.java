public class Main {
    public static void main(String[] args){
        MotoBike m1 = new Honda(01, 2023, 1500, "Honda", "Wave");
        MotoBike m2 = new Yamaha(02, 2022, 2500, "Yamaha", "NMAX");
        MotoBike m3 = new Suzuki(03, 2021, 2000, "Suzuki", "Smast");

        MotoBike[] bikes = {m1, m2, m3};

        for(MotoBike bike : bikes){
            bike.display();
            bike.startEngine();
            bike.drive();
            bike.stopEngine();
            System.out.println(" ");
        }
    }
}
