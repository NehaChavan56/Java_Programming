//write a program to count how many even and odd numbers are present between 1 to N

class Logic
{
    void countEvenOddRange(int N)
    {
        int iCnt = 0;
        int iEven = 0;
        int iOdd = 0;
        
        for(iCnt = 1;iCnt <=N ;iCnt++)
        {
            if(iCnt % 2 ==0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
        }

        System.out.println("There are "+iEven+"even numbers and "+iOdd+ "odd numbers");
    }
}

class P97
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}
