public class Bikes implements Vehicle{

    String brand;
    int hours;
    public Bikes(String brand, int hours){
        this.brand=brand;
        this.hours=hours;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        return hours*10;
    }

    @Override
    public void displayDetails() {
        System.out.println("Rental details: "+"\nbike brand: "+getBrand()+"\nhours: "+getHours()+"\nHourly Rental rate: 10$"+
                "\nRental cost: " +calculateRentalCost()+"$\n");

    }
}
