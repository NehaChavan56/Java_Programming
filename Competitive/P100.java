//write a program to print all numbers from 1 to N that are dividible by 2 and 3

class Logic
{
    void printDivisibleBy2and3(int N)
    {
        int iCnt = 0;
        
        for (iCnt = 1 ; iCnt <= N ; iCnt++)
        {
            if(iCnt % 2 == 0 && iCnt % 3 ==0 )
            {
                System.out.println(iCnt);
            }
        }
        
    }
}

class P100
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
    }
}