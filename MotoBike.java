abstract class MotoBike {
    private int id;
    private int price;
    private int year;
    private String brand;
    private String model;

    public MotoBike(int id, int price, int year, String brand, String model){
        this.id = id;
        this.price = price;
        this.year = year;
        this.brand = brand;
        this.model = model;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //getters
    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    //abstract methods
    abstract void startEngine();
    abstract void stopEngine();
    abstract void drive();

    //non-abstract method
    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Price: " + price);
        System.out.println("Year: " + year);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
