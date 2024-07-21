public class Trucks implements Vehicle{
    String type;
    int week;

    public Trucks(String type, int week){
        this.type=type;
        this.week=week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return week*500;
    }

    @Override
    public void displayDetails() {
        System.out.println("Rental details: "+"\nTruck type: "+getType()+"\nWeeks: "+getWeek()+"\nWeekly Rental rate: 500$"+"\nRental cost: "
                +calculateRentalCost()+"$\n");

    }
}
