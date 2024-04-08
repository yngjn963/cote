class NumberOfPAndY
{
    boolean solution(String s)
    {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        String[] arr = s.split("");
        
        int p = 0;
        int y = 0;
        
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].equalsIgnoreCase("p"))
            {
                p++;
            }
            else if (arr[i].equalsIgnoreCase("y"))
            {
                y++;
            }
        }
        
        if (p != y)
        {
            answer = false;
        }

        return answer;
    }
}
