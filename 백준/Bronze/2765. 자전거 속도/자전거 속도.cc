#include <iostream>
#include <cmath>
const double PI = acosl(-1);
int main(void) {
    for(int i = 1;; i++) {
        double a, c;
        int b;
        std::cin >> a >> b >> c;

        if (b == 0) break;
        double mile = a * PI * b / (1760 * 36);
        double mph = mile / (c/(60*60));
        std::cout << std::fixed;
        std::cout.precision(2);
        std::cout << "Trip #" << i << ": " << mile << " " << mph << std::endl;
    }
    return 0;
}
