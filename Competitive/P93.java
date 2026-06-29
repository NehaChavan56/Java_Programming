//write a program to check whether a number is perfect number or not

class Logic
{
    void checkPerfect(int iNum)
    {
        int iCnt = 0;
        int iSum = 0;
        
        for(iCnt = 1; iCnt < iNum; iCnt++)   
        {
            if(iNum % iCnt == 0)              
            {
                iSum = iSum + iCnt;          
            }
        }

        if(iSum == iNum)
        {
            System.out.println(iNum + " is a Perfect number");
        }
        else
        {
            System.out.println(iNum + " is not a Perfect number");
        }
    }
}

class P93
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}