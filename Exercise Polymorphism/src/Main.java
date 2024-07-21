import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();

        System.out.println("===============|| Welcome to Vehicle rental system ||==================\n");
        int option;
        do {
            System.out.println("Vehicle Rental system: " + "\n"+
                                "1.Rent a car."+
                                "\n2.Rent a bike."+
                                "\n3.Rent a truck."+
                                "\n4.View Rented Vehicles."+
                                "\n5.Exit.");
            System.out.println("Enter your choice: ");
            option = input.nextInt();
            while (option>5 || option<=0){
                System.out.println("''wrong input''");
                option = input.nextInt();
            }

            if (option==1){
                System.out.println("Enter car model name: ");
                String carModel = input.nextLine();
                carModel = input.nextLine();
                System.out.println("Enter rental day: ");
                int rentalDays = input.nextInt();
                Vehicle cars = new Cars(carModel,rentalDays);
                cars.calculateRentalCost();
                cars.displayDetails();
                rentedVehicles.add(cars);
            }
            if (option==2){
                System.out.println("Enter bike brand name: ");
                String bikeBrand = input.nextLine();
                bikeBrand= input.nextLine();
                System.out.println("Enter rental hours: ");
                int rentalHours = input.nextInt();
                Vehicle bikes = new Bikes(bikeBrand,rentalHours);
                bikes.calculateRentalCost();
                bikes.displayDetails();
                rentedVehicles.add(bikes);
            }
            if (option==3){
                System.out.println("Enter truck type: ");
                String truckType = input.nextLine();
                truckType = input.nextLine();
                System.out.println("Enter rental weeks: ");
                int rentalweeks = input.nextInt();
                Vehicle truck = new Trucks(truckType,rentalweeks);
                truck.calculateRentalCost();
                truck.displayDetails();
                rentedVehicles.add(truck);
            }
            if (option==4){
                System.out.println("\n ||Rented vehicles: ||\n");
                for (Vehicle l:rentedVehicles){
                l.displayDetails();
                }
            }

        }while (option !=5);
    }
}