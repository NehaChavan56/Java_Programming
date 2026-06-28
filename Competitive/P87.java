//write a program to display the grade of a student based on marks

class Logic
{
    void displayGrade(int iMarks)
    {
        if (iMarks > 90 )
        {
            System.out.println(" A+");
        } 
        else if(iMarks >80 && iMarks <90)
        { 
            System.out.println("A");
        }
        else if(iMarks >70 && iMarks <80)
        { 
            System.out.println("B");
        }
        else if(iMarks >60 && iMarks <70)
        { 
            System.out.println("C");
        }
        else if(iMarks >50 && iMarks <60)
        { 
            System.out.println("D");
        }
        else if(iMarks <50)
        { 
            System.out.println("F");
        }
    }
}

class P87
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}