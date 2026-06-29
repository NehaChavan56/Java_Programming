//write a program to display all the factors of a given number

class Logic
{
    void displayFactors(int iNum)
    {
        int iCnt = 0;
        
        for (iCnt = 1 ; iCnt <=(iNum/2) ; iCnt++)
        {
            if(iNum % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class P98
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}
