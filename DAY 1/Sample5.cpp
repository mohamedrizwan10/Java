#include <iostream>
#include <ctime>
using namespace std;
int main()
{
    srand(time(0)); 

    int randnumber=rand()%10;
    cout<<randnumber;
    randnumber=rand()%10;
    cout<<randnumber;

    return 0;
}