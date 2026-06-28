//write a program to check whether a number is divisible by 5 and 11 or not

class Logic
{
    void checkDivisible(int iNum)
    {
        if (iNum % 5 ==0 && iNum %11 == 0)
        {
            System.out.println(iNum+" is divisible by 5 and 11");
        } 
        else 
        {
            System.out.println(iNum+" is not divisible by 5 and 11");  
        }
    }
}

class P88
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);
    }
}
