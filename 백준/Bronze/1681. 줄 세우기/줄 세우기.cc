#include <iostream>

int main(void) {
  int N, L, result;
  std::cin >> N >> L;
  result = 0;
  while(N-->0) {
    result ++;
    int t = result;
    while(t != 0) {
      if (t%10 == L) {
        t = ++result;
        continue;
      }
      t /= 10;
    }
  }
  std::cout << result;
  return 0;
}
