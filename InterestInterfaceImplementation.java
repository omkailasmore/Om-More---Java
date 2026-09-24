import java.util.*;

interface Interest {
    static final int rate = 25;

    double simpleInterest();
    double compInterest();
}

class Bank implements Interest {
    int principal;
    float year;

    Bank(int principal, float year) {
        this.principal = principal;
        this.year = year;
    }

    public double simpleInterest() {
        return (principal * rate * year) / 100;
    }

    public double compInterest() {
        return principal * Math.pow((1 + rate / 100.0), year) - principal;
    }
}

class DriverMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int principle = s.nextInt();
        float year = s.nextFloat();

        Bank bank = new Bank(principle, year);

        System.out.println(String.format("%.2f", bank.simpleInterest()));
        System.out.println(String.format("%.2f", bank.compInterest()));

        s.close();
    }
}
