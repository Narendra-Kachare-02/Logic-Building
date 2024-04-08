/////////////////////////////////////////////////
// Header
/////////////////////////////////////////////////

import java.util.*;

/////////////////////////////////////////////////
// Entry point Class
/////////////////////////////////////////////////

class Assignment40_1
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string");
        String name = sobj.nextLine();

        Pattern obj1 = new Pattern(name.length()-1, name.length());

        obj1.pattern(name);
        obj1.Display();


        sobj.close();

    }
}


/////////////////////////////////////////////////
// Helper class
/////////////////////////////////////////////////

class Pattern
{
    public char Arr[][];

    public Pattern(int i, int j)
    {
        Arr = new char[i][j];
    }

   

    public void pattern(String str)
    {
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = str.charAt(j);
            }
            System.out.println();
        }
    }


    public void Display()
    {
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}