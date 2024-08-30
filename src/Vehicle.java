public class Vehicle {
    int numberOfWheels;
    String color;
    float engineSize;
    String fuelType;
public Vehicle(){
    numberOfWheels = -1;
    color = "null";
    engineSize = -1;
    fuelType = "null";
}

public Vehicle(int userWheels, String userColor, float userEngine, String userFuel){
    this.numberOfWheels = userWheels;
    this.color = userColor;
    this.engineSize = userEngine;
    this.fuelType = userFuel;
}

    public void setNumWheels(int userWheels){ this.numberOfWheels = userWheels;}
    public void setColor(String userColor){ this.color = userColor;}
    public void setEngine(float userEngine){ this.engineSize = userEngine;}
    public void setFuel(String userFuel){ this.fuelType = userFuel;}

    public int getWheels(){ return this.numberOfWheels; }
    public String getColor(){ return this.color; }
    public float getEngine(){ return this.engineSize; }
    public String getFuel(){ return this.fuelType;
}

}




