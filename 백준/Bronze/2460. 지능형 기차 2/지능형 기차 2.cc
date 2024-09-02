#include <iostream>

int main(void) {
    int a, b;
    int cnt = 0;
    int max = 0;
    for(int i = 0; i < 10; i++) {
        std::cin >> a >> b;
        cnt += (b-a);
        if (max < cnt) max = cnt;
    }
    std::cout << max;
    return 0;
}
