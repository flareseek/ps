#include <iostream>

int main(void) {
    long long a, b = 0;
    std::cin >> a;
    while((b*b) <= a) b ++;
    std::cout << "The largest square has side length " << (b-1) << ".";
    return 0;
}
