#include <iostream>
#include <string>

int main(void) {
  int o, w;
  int case_ = 1;
  std::cin >> o >> w;
  while(o != 0 && w != 0) {
    char cmd;
    int n, state = w;
    while(1) {
      std::cin >> cmd >> n;
      if (cmd == '#' && n == 0) break;
      if (state <= 0) continue;

      if (cmd == 'F') state += n;
      else state -= n;
    }
    std::cout << case_ ++ << " " << ((state <= 0) ? "RIP": (o/2 < state) && (state < o*2) ? ":-)" : ":-(")<< std::endl;
    std::cin >> o >> w;
  }
  return 0;
}
