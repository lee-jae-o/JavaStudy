import java.util.Scanner;

class Elevator {
    private int currentFloor;

    public Elevator() {
        this.currentFloor = 1;
    }

    public void moveToFloor(int targetFloor) {
        System.out.println("Moving from Floor " + currentFloor + " to Floor " + targetFloor);
        this.currentFloor = targetFloor;
        System.out.println("Arrived at Floor " + currentFloor);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}

public class Study27 {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Current Floor: " + elevator.getCurrentFloor());
            System.out.print("Enter target floor (or -1 to exit): ");
            int targetFloor = scanner.nextInt();

            if (targetFloor == -1) {
                System.out.println("Exiting elevator simulation. Goodbye!");
                break;
            }

            if (targetFloor < 1 || targetFloor > 10) {
                System.out.println("Invalid floor. Please enter a floor between 1 and 10.");
                continue;
            }

            elevator.moveToFloor(targetFloor);
        }

        scanner.close();
    }
}