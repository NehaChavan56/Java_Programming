//write a program to find the maximum of two numbers

class Logic
{
    void printTable(int iNum)
    {
        int iCnt = 0;
        int iMul = 1;
        if(iNum <0)
        {
            iNum = -iNum;
        }

        iCnt=1 ;
        while( iCnt<=10)
        {
            iMul = iNum*iCnt;
            System.out.println(iMul+" \t");
            
            iCnt++;
        }
    }
}

class P80
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}