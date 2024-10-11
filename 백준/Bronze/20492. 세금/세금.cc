#include <iostream>

int main(void) {
    int a;
    std::cin >> a;
    std::cout << (a*78/100) << " " << (a*8/10 + (a*156/1000));
    return 0;
}