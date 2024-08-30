#include <iostream>

int main(void) {
    int a, b, c;
    std::cin >> a >> b >> c;
    int result = 9*1 + 7*3 + 8*1 + 0*3 + 9*1 + 2*3 + 1*1 + 4*3 + 1*1 + 8*3;
    result += (a*1 + b*3 + c*1);
    std::cout << "The 1-3-sum is " << result;
    return 0;
}