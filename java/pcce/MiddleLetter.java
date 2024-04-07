class MiddleLetter
{
    public int solution(String s)
    {
        String answer = "";

        if (s.length() % 2 == 0)
        {
            answer = String.valueOf(s.charAt(s.length() / 2 - 1)) + String.valueOf(s.charAt(s.length() / 2));
            // character 연산 후 String.valueOf 적용 시 유니코드 계산 값을 연산하므로 각 char를 변환 후 연산해야 한다.
        }
        else
        {
            answer = String.valueOf(s.charAt(s.length() / 2));
        }

        return answer;
    }
}