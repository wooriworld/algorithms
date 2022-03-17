package recursion;

public class Main {
    public static int factorial(int n) {
        if(n > 0)
            return n * factorial(n-1);
        else
            return 1;
    }

    public static int gcd(int max, int min) {
        assert max > min;

        if(min == 0)
            return max;
        else
            return gcd(min, max%min);
    }

    public static int lcm(int max, int min) {
        assert max > min;
        return max*min / gcd(max, min);
    }

    public static void towersOfHanoi(int N, int from, int mid, int to) {
        if(N == 0)
            return;
        towersOfHanoi(N-1, from, to, mid);
        System.out.println("원반["+(N)+"]을 "+from+"기둥에서 "+to+"기둥으로 옮김");
        towersOfHanoi(N-1, mid, from, to);
    }

}
