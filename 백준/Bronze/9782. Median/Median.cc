#include <iostream>

int main(void) {
    int n, c = 1;
    long long arr[100];
    while((std::cin >> n) && (n != 0)) {
        for (int i = 0; i < n; i++) {
            std::cin >> arr[i];
        }
        double result = n%2 ? arr[n/2] : (arr[n/2]+arr[n/2-1])/2.0;
        printf("Case %d: %.1f\n", c++, result);
    }
    return 0;
}
