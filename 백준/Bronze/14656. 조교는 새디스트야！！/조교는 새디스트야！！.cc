#include <iostream>

int main(void) {
  int n, result = 0;
  std::cin >> n;

  for (int i = 1; i <=n; i++) {
    int t;
    std::cin >> t;

    if (i != t) result ++;
  }

  std::cout << result;
  return 0;
}
