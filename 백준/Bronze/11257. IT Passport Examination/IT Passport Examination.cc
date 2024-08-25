#include <iostream>

int main(void) {
    int n;
    int B = 35*0.3+1;
    int C = 25*0.3+1;
    int D = 40*0.3;
    std::cin >> n;
    while(n--) {
        int a, b, c, d;
        std::cin >> a >> b >> c >> d;
        std::cout << a << " " << (b+c+d) << " ";
        if (b >= B && c >= C && d >= D && (b+c+d) >= 55) {
            std::cout << "PASS";
        } else {
            std::cout << "FAIL";
        }
        std::cout << std::endl;
    }
    return 0;
}