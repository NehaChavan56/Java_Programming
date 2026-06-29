//write a program to find the smallest digit in a given number

class Logic
{
    void findSmallestDigit(int iNum)
    {
        int iCnt = 0;
        int iDigit = 0;
        int iSmall = 9;
        
        while (iNum > 0)
        {
            iDigit = iNum % 10;
            if (iDigit < iSmall )
            {
                iSmall = iDigit;
            }
            iNum = iNum / 10;
        }
        System.out.println("The smallest digit in given number is : "+iSmall);
    }
}

class P95
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}