//write a program to print all even numbers upto N

class Logic
{
    void printEvenNumbers(int N)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= N; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.print(iCnt+"\t");
            }
        }

    }
}

class P82
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}
