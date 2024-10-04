#include <iostream>

int main(void) {
    int n, cnt = 0;
    std::cin >> n; n++;
    while(n--) cnt += n*n*n;
    std::cout << cnt;
    return 0;
}
