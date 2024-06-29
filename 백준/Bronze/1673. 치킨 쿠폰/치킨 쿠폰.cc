#include <iostream>

int main(void) {
  int N, K;
  while(std::cin >> N >> K) {
    int result = N;
    int t = N/K;
    int tt = N%K;
    while(t != 0) {
      int s = t + tt;
      result += t;
      t = s/K;
      tt = s%K;
    }
    std::cout << result << std::endl;
  }
  return 0;
}
