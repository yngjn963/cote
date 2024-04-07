class Ponkemon
{
    public int solution(int[] nums)
    {
        int answer = 0;

        int[] sel = new int[200000]; // 폰켓몬 종류(번호)를 담기 위해 폰켓몬 종류 수만큼의 배열 생성

        for (int i = 0; i < nums.length; i++)
        {
            int elm = nums[i];

            if (sel[elm - 1] == 0)
            {
                sel[elm - 1]++;

                answer++;
            }

            if (answer == nums.length / 2)
            {
                break;
            }
        }

        return answer;
    }
}