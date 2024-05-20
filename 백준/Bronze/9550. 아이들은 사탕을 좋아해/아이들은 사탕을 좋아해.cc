#include <iostream>

int main(void) {
  int T;
  std::cin >> T;
  while (T-->0) {
    int N, K, result = 0;
    std::cin >> N >> K;
    while (N-->0) {
      int t;
      std::cin >> t;
      result += t/K;
    }
    std::cout << result << "\n";
  }
  return 0;
}
