#include <iostream>

int main(void) {
    int t1, e1, f1, t2, e2, f2;
    std::cin >> t1 >> e1 >> f1 >> t2 >> e2 >> f2;
    int m1 = 3*t1 + 20*e1 + 120*f1;
    int m2 = 3*t2 + 20*e2 + 120*f2;
    std::cout << (m1 > m2 ? "Max" : m1 == m2 ? "Draw" : "Mel");
    return 0;
}