class Twenty-sixteen
{
    public int solution(int a, int b)
    {
        String answer = "";

        int addDay = 0;

        int[] dayByMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < a - 1; i++)
        {
            addDay += dayByMonth[i];
        }

        addDay += b - 1;

        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        return day[addDay % 7];
    }
}