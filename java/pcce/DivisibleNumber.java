import java.util.*;

class DivisibleNumber
{
    public int[] solution(int[] arr, int divisor)
    {
        int[] answer = {};

        int len = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % divisor == 0)
            {
                len++;
            }
        }

        if (len == 0)
        {
            answer = new int[1];
            answer[0] = -1;
        }
        else
        {
            answer = new int[len];
            len = 0;

            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] % divisor == 0)
                {
                    answer[len] = arr[i];

                    len++;
                }
            }

            Arrays.sort(answer);
        }

        return answer;
    }
}