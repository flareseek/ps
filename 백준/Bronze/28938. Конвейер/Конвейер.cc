#include <iostream>

int main(void) {
    int n;
    int sum = 0;
    int t;
    std::cin >> n;
    while(n--) {
        std::cin >> t;
        sum += t;
    }
    if (sum < 0) std::cout << "Left";
    else if (sum == 0) std::cout << "Stay";
    else std::cout << "Right";
    return 0;
}