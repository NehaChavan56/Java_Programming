//write a program to sum of all even numbers upto N

class Logic
{
    void sumEvenNumbers(int N)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 0 ;iCnt <= N;iCnt++)
        {
            if(iCnt % 2 ==0)
            {
                iSum = iSum + iCnt;
            }
        }

        System.out.println("Sum of even numbers is: "+iSum);
    }
}

class P91
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}
