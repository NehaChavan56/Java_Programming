//write a program to check whether the number is positive ,negative or zero

class Logic
{
    void checkSign(int iNum)
    {
        if(iNum < 0)
        {
            System.out.println("The number is negative");
        }
        else if(iNum > 0)
        {
            System.out.println("The number is positive");
        }
        else
        {
            System.out.println("The number is zero");
        }
    }
}

class P85
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}