#include <iostream>

int main(void) {
    int n;
    std::cin >> n;
    while(n--) {
        double a, b, c;
        std::cin >> a >> b >> c;
        printf("$%.2f\n", a*b*c);
    }
    return 0;
}