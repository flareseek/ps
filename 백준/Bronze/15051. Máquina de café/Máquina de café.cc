#include <iostream>

int main(void) {
    int a1, a2, a3;
    std::cin >> a1 >> a2 >> a3;

    int f = (a2*2) + (a3*4);
    int s = (a1 + a3) * 2;
    int t = (a1*4) + (a2*2);

    int min = 0;
    if (f <= s && f <= t) min = f;
    else if (s <= f && s <= t) min = s;
    else if (t <= f && t <= s) min = t;
    std::cout << min;
    return 0;
}
