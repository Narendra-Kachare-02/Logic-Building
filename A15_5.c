/*
    Accept number rows and columns from user and display below pattern

    Input : iRow = 4            iCol = 3

    Output :    1   1   1   1
                2   2   2   2
                3   3   3   3
                4   4   4   4
                
                

*/
/////////////////////////////////////////////////
// Header
/////////////////////////////////////////////////

#include<stdio.h>

/////////////////////////////////////////////////
// Hwlper function
/////////////////////////////////////////////////

void Pattern(int iRow, int iCol)
{
    int i = 0, j = 0;
    for ( i = 0; i <= iRow; i++)
    {
        for ( j = 1; j <= iCol; j++)
        {
            printf("%d\t",(i+1));
        }
        printf("\n\n");
        
    }
    
}

/////////////////////////////////////////////////
// Entry point function
/////////////////////////////////////////////////

int main()
{
    int iValue1 = 0, iValue2 = 0;
    

    printf("Enter number of Rowa\n");
    scanf("%d",&iValue1);

    printf("Enter the number of columns\n");
    scanf("%d",&iValue2);

    Pattern(iValue1, iValue2);

    return 0;
}