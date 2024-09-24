#include <iostream>

int main(void) {
    
    int r, c;
    std::cin >> r >> c;
    while(r--) {
        for(int i = 0; i < c; i++) {
            std::cout << "*";
        }
        std::cout << "\n";
    }
    return 0;
}