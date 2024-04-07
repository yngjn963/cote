import java.util.*;

public class ContinuousNumber
{
    public int[] solution(int[] arr)
    {
        int[] answer = {};

        Vector<Integer> list = new Vector<>();
        int prev = -1;

        for (int i = 0; i < arr.length; i++)
        {
            int elm = arr[i];

            if (elm != prev)
            {
                list.add(elm);
            }

            prev = elm;
        }

        for (int i = 0; i < list.size(); i++)
        {
            answer[i] = list.get(i);
        }

        return answer;
    }
}