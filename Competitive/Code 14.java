//write a program to print each digit of a number seperately

class Logic
{
    void printDigits(int iNum)
    {
        int iDigit = 0;
    
        while (iNum > 0)
        {
            iDigit = iNum % 10;
            System.out.println(iDigit);
            iNum = iNum / 10;
        }
    }
}

class P89
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}
