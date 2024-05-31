#include <iostream>

int main(void) {
  int T;
  std::cin >> T;
  while(T-->0) {
    int N, result = 0;
    std::cin >> N;
    while(N-->0) {
      int t;
      std::cin >> t;
      result += t;
    }
    std::cout << result << std::endl;
  }
  return 0;
}
