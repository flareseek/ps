#include <iostream>

int main(void) {
    int a, b;
    std::cin >> a >> b;
    while(a <= b) {
        std::cout << "All positions change in year " << a << std::endl;
        a += 60;
    }
    return 0;
}