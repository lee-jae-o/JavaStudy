class Vehicle {
    void startEngine() {
        System.out.println("차량의 엔진을 가동합니다.");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("자동차의 엔진을 시동합니다.");
    }

    void drive() {
        System.out.println("자동차를 운전합니다.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("오토바이의 엔진을 가동합니다.");
    }

    void ride() {
        System.out.println("오토바이를 타고 이동합니다.");
    }
}

class Bicycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("자전거는 엔진이 없습니다. 무릎을 힘으로 가동합니다.");
    }

    void pedal() {
        System.out.println("자전거를 페달로 움직입니다.");
    }
}

public class Study24 {
    public static void main(String[] args) {
        Vehicle vehicle = new Bicycle();
        vehicle.startEngine();


    }
}