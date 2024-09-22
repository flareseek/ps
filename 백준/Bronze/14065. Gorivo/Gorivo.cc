#include <iostream>

int main(void) {
    const double G = 3.785411784L;
    const double M = 1.609344L;
    double m;
    std::cin >> m;
    double km = 100/(M/G*m);
    printf("%.6f", km);
    
    return 0;
}
