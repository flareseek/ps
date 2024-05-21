#include <iostream>

int main(void) {
  int T, result = 0;
  std::cin >> T;

  for (int i = 0; i < 9; i++) {
    int t;
    std::cin >> t;
    result += t;
  }

  std::cout << T - result;
  return 0;
}
