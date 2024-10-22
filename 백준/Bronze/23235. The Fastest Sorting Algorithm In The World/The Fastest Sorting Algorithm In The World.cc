#include <iostream>

int main(void) {
    int index = 1;
    int a;
    while((std::cin >> a) && (a != 0)) {
        int t;
        while (a--) std::cin >> t;
        printf("Case %d: Sorting... done!\n", index++);
    }
    return 0;
}