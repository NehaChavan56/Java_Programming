//write a program to find the sum of digits of a number

class Logic
{
    void sumOfDigits(int iNum)
    {
        int iDigit = 0, iSum = 0;
        
        while(iNum > 0)
        {
            iDigit = iNum % 10;     
            iSum   = iSum + iDigit; 
            iNum   = iNum / 10;     
        }

        System.out.println("Sum of digits is : "+iSum);
    }
}

class P76
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}