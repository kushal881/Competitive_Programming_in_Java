package Assignment4;

public class Exercise12 {
    static final int MOD = 1_000_000_007;

    public static long modPow(long base, long exp, int mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    public static int countGoodStrings(long n) {
        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long evenChoices = modPow(5, evenPositions, MOD);
        long oddChoices = modPow(4, oddPositions, MOD);

        return (int)((evenChoices * oddChoices) % MOD);
    }

    public static void main(String[] args) {
        long n = 50;
        System.out.println(countGoodStrings(n));
    }
}
