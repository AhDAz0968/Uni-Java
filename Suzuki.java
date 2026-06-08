class Suzuki extends MotoBike {

    public Suzuki(int id, int year, int price, String brand, String model) {
        super(id, year, price, brand, model);
    }

    @Override
    
    void startEngine() {
        System.out.println("Suzuki is started !!!!");
    }

    void stopEngine() {
        System.out.println("Suzuki is stopped !!!!");
    }

    void drive() {
        System.out.println("Suzuki is driving !!!!");
    }
}