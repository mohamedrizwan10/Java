#include<iostream>
using namespace std;
int main()
{
    int a=20;//assigning
    int b(20);//brace initializer
    int c(40);//function initializer
    cout<<a << endl;
    int d{};//garbage value;
    cout<<d;
    return 0;

}