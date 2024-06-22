#include <iostream>

int main(void) {
  int N, cnt = 0;
  bool is[101] = {false};
  std::cin >> N;
  while(N--) {
    int t;
    std::cin >> t;
    if (is[t]) cnt++;
    else is[t] = true;
  }
  std::cout << cnt;
  return 0;
}
