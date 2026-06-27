//write a program to find the number is prime or not

class Logic
{
    void checkPrime(int iNum)
    {
        int iCnt = 0;
        boolean bFlag = true;

        for(iCnt = 2; iCnt <= (iNum / 2); iCnt++)
        {
            if((iNum % iCnt) == 0)
            {
                bFlag = false;
                break;
            }
        }

        if(bFlag == true)
        {
            System.out.println("the number is prime");
        }
        else
        {
            System.out.println("the number is not prime");
        }
    }
}

class P81
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}