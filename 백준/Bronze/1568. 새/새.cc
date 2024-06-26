#include <iostream>

int main(void) {
  int N, cnt = 1, result = 0;
  std::cin >> N;
  while(N != 0) {
    if (N < cnt) {
      cnt = 1;
    } else {
      N -= cnt;
      result ++;
      cnt++;
    }
  }
  std::cout << result;
  return 0;
}
