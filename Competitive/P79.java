//write a program to find minimum of three numbers

class Logic
{
    void findMin(int a, int b,int c)
    {
        if (a < b && a < c)
        {
            System.out.println("The smallest number is: "+a);
        }
        else if(b < a && b < c)
        {
            System.out.println("The smallest number is: "+b);   
        }
        else
        {
            System.out.println("The smallest number is: "+c); 
        }
    }
}

class P79
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findMin(3 ,7, 2);
    }
}