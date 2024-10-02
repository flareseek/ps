#include <iostream>

int main(void) {
    int N, A, B;
    int a = 1, b = 1;
    bool isA = true;
    std::cin >> N >> A >> B;


    while(N--) {
        if (isA) {
            a += A;
            b += B;
        } else {
            a += B;
            b += A;
        }
        
        if ((isA && a < b) || (!isA && a > b)) {
            isA = !isA;
        } else if (a == b) {
            if (isA) b--;
            else a--;
        }
    }
    std::cout << (isA ? a : b) << " " << (isA ? b : a);
    return 0;
}
