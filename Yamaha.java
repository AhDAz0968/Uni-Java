class Yamaha extends MotoBike{
    public Yamaha(int id, int year, int price, String brand, String model) {
        super(id, year, price, brand, model);
    }

    @Override
    
    void startEngine() {
        System.out.println("Yamaha is started !!!!");
    }

    void stopEngine() {
        System.out.println("Yamaha is stopped !!!!");
    }

    void drive() {
        System.out.println("Yamaha is driving !!!!");
    }
}
