#include <iostream>

int main(void) {
    int n;
    std::cin >> n;
    int s1 = n*(n+1)/2;
    int s2 = s1*s1;
    std::cout << s1 << "\n" << s2 << "\n" << s2;
    
    return 0;
}