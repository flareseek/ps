#include <iostream>

int main(void) {
    int cnt = 0;
    int max = 0;

    int a, b;

    for(int i = 0; i < 4; i++) {
        std::cin >> a >> b;
        cnt += (b-a);
        if (cnt > max) max = cnt;
    }
    std::cout << max;
    return 0;
}
