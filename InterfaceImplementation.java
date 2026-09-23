import java.util.Scanner;

interface Car {
    void displaySpeed();
    void increaseSpeed(int speed);
}

class Suzuki implements Car {
    int currentSpeed;

    Suzuki(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void increaseSpeed(int speed) {
        currentSpeed = currentSpeed + speed;
    }

    public void displaySpeed() {
        System.out.println(currentSpeed);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentSpeed = sc.nextInt();
        int speed = sc.nextInt();

        Suzuki s = new Suzuki(currentSpeed);
        s.increaseSpeed(speed);
        s.displaySpeed();

        sc.close();
    }
}
