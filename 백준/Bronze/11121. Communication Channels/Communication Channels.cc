#include <iostream>
#include <string>

int main(void) {
    int n;
    
    std::cin >> n;
    while(n--) {
        std::string a, b;
        std::cin >> a >> b;
        std::cout << (a == b ? "OK\n" : "ERROR\n");
    }
    return 0;
}