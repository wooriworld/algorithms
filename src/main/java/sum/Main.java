package sum;

public class Main {
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumOfGauss(int n) {
        if(n%2 == 0)
            return (1+n)*(n/2);
        else
            return (1+n)*(n/2)+((1+n)/2);
    }
}