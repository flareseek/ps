#include <iostream>

int main(void) {
    int n;
    std::cin >> n;
    
    while(n--) {
        int a, b, c;
        std::cin >> a >> b >> c;
        std::cout << (a*(c-1)+b) << "\n";
    }
    return 0;
}