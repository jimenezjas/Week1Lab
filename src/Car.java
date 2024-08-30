public class Car extends Vehicle{

    String brand;

    public Car(){
        brand = "null";
    }
    public Car(String userBrand){this.brand = userBrand;}

    public void setBrand(String userBrand){ this.brand = userBrand;}
    public String getBrand(){ return this.brand; }

    public void honk(){
        System.out.println("Honk, honk!");
    }
    public void displayInfo(){
        System.out.println("Brand: " + this.brand);
        System.out.println("# of wheels: " + this.numberOfWheels);
        System.out.println("Car color: " + this.color);
        System.out.println("Engine size: "+ this.engineSize);
        System.out.println("Fuel type: " + this.fuelType);
    }

}
