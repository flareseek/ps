#include <iostream>

int main(void) {
    int n;
    std::cin >> n;
    while(n--) {
        int a, b;
        std::cin >> a >> b;
        std::cout << ((a*b)/2) << std::endl;
    }
    return 0;
}
