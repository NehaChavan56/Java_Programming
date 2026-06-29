//write a program to print numbers from N down to 1 in reverse order

class Logic
{
    void printReverse(int N)
    {
        int iCnt = 0;

        for(iCnt = N ;iCnt >= 1;iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}

class P92
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}