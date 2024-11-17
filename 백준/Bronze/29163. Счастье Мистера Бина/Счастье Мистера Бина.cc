#include <iostream>

int main(void) {
    int n;
    int odd = 0, even = 0;
    std::cin >> n;
    while(n--) {
        int a;
        std::cin >> a;
        odd += (a & 1);
        even += !(a & 1);
    }
    if (odd < even) std::cout << "Happy";
    else std::cout << "Sad";
    return 0;
}