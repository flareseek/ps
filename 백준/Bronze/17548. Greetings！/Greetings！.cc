#include <iostream>

int main(void) {
    char t;
    int count = 0;
    std::cin >> t;
    while((std::cin >> t) && (t != 'y')) count ++;
    std::cout << "h";
    while(count --) std::cout << "ee";
    std::cout << "y";
    return 0;
}