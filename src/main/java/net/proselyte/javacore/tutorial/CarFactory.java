package net.proselyte.javacore.tutorial;

public class CarFactory {

    private static int carAmount = 0;

    public static int getCarAmount() {
        return carAmount;
    }

    private static void buildCar() {
        carAmount++;
    }

    public CarFactory(){
        CarFactory.buildCar();
    }


    public static void main(String[] args) {
        System.out.println("Before working day on factory there is: " +  getCarAmount() + " cars");

        for(int i = 0; i<10; i++){
            new CarFactory();
        }

        System.out.println("After one working day on factory there are: " + getCarAmount() + " cars");
    }

}

/*    Before working day on factory there is: 0 cars
      After one working day on factory there are: 10 cars
*/









