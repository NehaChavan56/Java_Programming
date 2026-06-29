//write a program to find the largest digit in a given number

class Logic
{
    void findLargestDigit(int iNum)
    {
        int iCnt = 0;
        int iDigit = 0;
        int iLarge = 0;
        
        while (iNum > 0)
        {
            iDigit = iNum % 10;
            if (iDigit > iLarge )
            {
                iLarge = iDigit;
            }
            iNum = iNum / 10;
        }
        System.out.println("The largest digit in given number is : "+iLarge);
    }
}

class P94
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}
