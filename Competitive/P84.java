//write a program to find the sum of even and odd digits seperately in a number

class Logic
{
    void sumEvenOddDigits(int iNum)
    {
        int iDigit = 0;
        int iSumEven = 0;
        int iSumOdd = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        while(iNum > 0)
        {
            iDigit = iNum % 10;
            if (iDigit % 2 == 0)
            {
                iSumEven = iSumEven + iDigit;
            }
            else
            {
                iSumOdd = iSumOdd + iDigit;
            }            
            iNum = iNum / 10;
        }

        System.out.println("Sum of even digits is: "+iSumEven);
        System.out.println("Sum of odd digits is: "+iSumOdd);
    }
}

class P84
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}