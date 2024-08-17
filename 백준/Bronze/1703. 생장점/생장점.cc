#include <iostream>

int main(void) {
    int n;
    std::cin >> n;
    while(n != 0) {
        int cnt = 1;
        for (int i = 0; i < 2*n; i++) {
            int t;
            std::cin >> t;
            if (i%2 == 0) cnt *= t;
            else cnt -= t;
        }
        std::cout << cnt << std::endl;
        std::cin >> n;
    }
    return 0;
}