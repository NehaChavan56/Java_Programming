//write a program to print all odd numbers upto N

class Logic
{
    void printOddNumbers(int N)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= N; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.print(iCnt+"\t");
            }
        }

    }
}

class P83
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}
