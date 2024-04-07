class BetweenTwoIntegers
{
    public long solution(int a, int b)
    {
        long answer = 0;
        
        if (a < b)
        {
            for (long i = (long) a; i <= (long) b; i++)
            {
                answer += i;
            }
        }
        else
        {
            for (long i = (long) b; i <= (long) a; i++)
            {
                answer += i;
            }
        }
        
        return answer;
    }
}