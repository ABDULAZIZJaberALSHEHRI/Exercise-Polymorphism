public class Cars implements Vehicle{

        String model;
        int days;

        public Cars(String model, int days){
            this.model=model;
            this.days=days;
        }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double calculateRentalCost() {
        return 50 * days;
    }

    @Override
    public void displayDetails() {
        System.out.println("Rental details: "+"\nCar Model: "+getModel()+"\nDays: "+getDays()+"\nDaily Rental rate: 50$"+"\nRental cost: "
                +calculateRentalCost()+"$\n");
    }
}
