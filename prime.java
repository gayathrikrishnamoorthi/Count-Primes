package sample;

public class prime {
	static boolean isPrime(int N)
    {
        for(int i = 2 ; i * i <= N ; i++)
            if(N % i == 0)
                return false;
        return true;
    }
    static int countPrimes(int N)
    {
        if(N < 3)
            return 0;
        int cnt = 1;
        for(int i = 3 ; i < N ; i += 2)
            if(isPrime(i))
                cnt++;
        return cnt;
    }
    public static void main(String args[])
    {
        int N = 10;
        System.out.println(countPrimes(N));
    }
}


