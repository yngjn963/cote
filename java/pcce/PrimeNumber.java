class PrimeNumber {
    public int solution(int n) {
        int answer = 0;
        
        boolean[] notPrime = new boolean[n - 1];
        
        for (int i = 2; i <= n; i++)
        {
            if (notPrime[i - 2]) continue;
            
            for (int j = i * 2; j <= n; j += i)
            {
                notPrime[j - 2] = true;
            }
        }
        
        for (int i = 0; i < notPrime.length; i++)
        {
            if (!notPrime[i])
            {
                answer++;
            }
        }
        
        return answer;
    }
}
