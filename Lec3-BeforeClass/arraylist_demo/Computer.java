package arraylist_demo;

//used in Lec 3 in class discussion
public class Computer {
    private String brand;
    private double cpuSpeed;
    private double ramSize;

    public Computer(String brand, double cpuSpeed, double ramSize){
        this.brand = brand;
        this.cpuSpeed = cpuSpeed;
        this.ramSize = ramSize;
    }

    public double computePower(){
        return cpuSpeed * ramSize;
    }


    @Override
    public String toString(){
        String compInfo = "Brand: " + brand + ", cpuSpeed: " + cpuSpeed
                + ", ramSize: " + ramSize;
        return compInfo;
    }

}
