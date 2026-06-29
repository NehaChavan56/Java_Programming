//write a program to calculate the product of digits of a number

class Logic
{
    void productOfDigits(int iNum)
    {
        int iCnt = 0;
        int iDigit = 0;
        int iMul = 1;
        
        while (iNum > 0)
        {
            iDigit = iNum % 10;
            iMul = iMul * iDigit;
            iNum = iNum / 10;
        }
        System.out.println("The product of digit in given number is : "+iMul);
    }
}

class P96
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}
