//write a program to check whether the number is palindrome or not

class Logic
{
    void checkPalindrome(int iNum)
    {
         int iDigit = 0;
        int iRev = 0;
        int iTemp = 0;

        iTemp = iNum;

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            iRev = (iRev * 10) + iDigit;
            iNum = iNum / 10;
        }

        if(iRev == iTemp)
        {
            System.out.println("The number is Palindrome");
        }
        else
        {
            System.out.println("The number is not Palindrome");
        }
    }
}

class P77
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}