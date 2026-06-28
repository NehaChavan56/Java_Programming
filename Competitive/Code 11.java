//write a program to check whether the year is leap year or not

class Logic
{
    void checkLeapYear(int iNum)
    {
        if ((iNum % 4 == 0 && iNum % 100 != 0) || iNum % 400 == 0 )
        {
            System.out.println("the given year is leap year");
        } 
        else 
        { 
            System.out.println("the given year is not leap year");
        }
    }
}

class P86
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}
