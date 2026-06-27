//write a program to find the maximum of two numbers

class Logic
{
    void findMax(int a, int b)
    {
        if (a > b)
        {
            System.out.println("The bigger number is: "+a);
        }
        else
        {
            System.out.println("The bigger number is: "+b);   
        }
    }
}

class P78
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findMax(20,15);
    }
}
