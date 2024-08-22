#include <iostream>

int main(void) {
    int n;
    std::cin >> n;

    while(n != 0) {
        int arr[1000] = {0};
        int result = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            std::cin >> arr[i];
            result += arr[i];

            if (i >= 3)
                result -= arr[i-3];
            if (max < result)
                max = result;
        }
        std::cout << max << std::endl;
        std::cin >> n;
    }
    return 0;
}
