//(n1 + 1)(n2 + 1)/(n12 + 1) - 1
    
#include <iostream>

int main(void) {
    int n1, n2, n12;
    
    std::cin >> n1 >> n2 >> n12;
    
    std::cout << (int)((n1 + 1)*(n2 + 1)/(float)(n12 + 1) - 1);
    return 0;
}