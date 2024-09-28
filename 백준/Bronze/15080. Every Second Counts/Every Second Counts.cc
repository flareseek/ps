#include <iostream>

int main(void) {
    int h1, m1, s1, h2, m2, s2;
    char t;
    std::cin >> h1 >> t >> m1 >> t >> s1;
    std::cin >> h2 >> t >> m2 >> t >> s2;
    
    int r1 = (h1*60*60) + (m1*60) + s1;
    int r2 = (h2*60*60) + (m2*60) + s2;
    
    if (r1 > r2) std::cout << (r2+(24*60*60-r1));
    else std::cout << (r2-r1);
    return 0;
}
