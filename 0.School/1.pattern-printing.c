#include<stdio.h>

main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            for(int k = 0; k < n-i; k++)
            {
                printf("%d", n-j);
            }
        }
        printf("\n");
    }
}
