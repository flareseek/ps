#include <iostream>

int main(void) {
    int p1, s1, s2, p2;
    std::cin >> p1 >> s1 >> s2 >> p2;
    
    if ((p1+p2) == (s1+s2)) {
        if (s1 > p2) {
            std::cout << "Esteghlal";
        } else if (s1 < p2) {
            std::cout << "Persepolis";
        } else {
            std::cout << "Penalty";
        }
    } else {
        if ((p1+p2) > (s1+s2)) {
            std::cout << "Persepolis";
        } else {
            std::cout << "Esteghlal";
        }
    }
    return 0;
}