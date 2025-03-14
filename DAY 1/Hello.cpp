#include<iostream>
namespace var1{
    int a=10;

}
namespace var2{
    int a=20;
}
using namespace var2;
int main()

{
    // std::cout<<"hello World";
    // std::cout<<var1::a;
    std::cout<<a;

return 0;
}   