#include<stdio.h>
int main()
{
    int t;
    scanf("%d", &t);
    while(t--)
    {
        int N, C, rem;
        scanf("%d %d", &N, &C);
        int candy[N];
        for(int i = 0; i < N; i++)
        {
            scanf("%d\n", &candy[i]);
        }
        int sum  = 0;
        N = sizeof(candy)/sizeof(candy[0]);
        for(int i = 0; i < N; i++)
        {
            sum = sum + candy[i];
        }
        rem = sum % C;
        printf("%d\n", rem);
    }
    return 0;
}
