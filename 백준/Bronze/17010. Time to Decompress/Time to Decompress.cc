#include <iostream>

int main(void) {
    int n;
    std::cin >> n;
    while(n--) {
        int a;
        char b;
        std::cin >> a >> b;
        while(a--) std::cout << b;
        std::cout << "\n";
    }
    return 0;
}