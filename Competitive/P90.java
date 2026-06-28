//write a program to calculate the power of a number using loops

class Logic
{
    void calculatePower(int iBase, int iExp)
    {
        int iResult = 1;
        int iCnt = 0;

        if(iExp < 0)                        
        {
            System.out.println("Exponent cannot be negative");
            return;
        }

        for(iCnt = 1; iCnt <= iExp; iCnt++)
        {
            iResult = iResult * iBase;       
        }

        System.out.println(iResult);
    
    }
}

class P90
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2,5);
    }
}