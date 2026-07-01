#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int factorial(int n)
{
    if(n==0)
        return 1;
    else
        return n*factorial(n-1);
}
int main() 
{
   int num;
   scanf("%d",&num);
   int res=factorial(num);
   printf("%d",res);
    return 0;
}