class Honda extends MotoBike {

    public Honda(int id, int year, int price, String brand, String model) {
        super(id, year, price, brand, model);
    }

    @Override
    
    void startEngine() {
        System.out.println("Honda click is started !!!!");
    }

    void stopEngine() {
        System.out.println("Honda click is stopped !!!!");
    }

    void drive() {
        System.out.println("Honda click is driving !!!!");
    }
}