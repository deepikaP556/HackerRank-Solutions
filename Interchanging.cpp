#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }  
    int max=0;
    for(int i=0;i<n;i++)
    {
        if(arr[max]<arr[i])
        max=i;
    }
    int min=0;
    for(int i=0;i<n;i++)
    {
        if(arr[min]>arr[i])
        min=i;
    }
    int temp=arr[min];
    arr[min]=arr[max];
    arr[max]=temp;
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    } 
    return 0;
}
