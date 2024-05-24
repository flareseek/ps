#include <iostream>

int main(void) {
  int n, m, r;
  std::cin >> n >> m;
  r = m;
  
  while(n-->0) {
    int a, b;
    std::cin >> a >> b;
    r = r + a - b;
    if (r < 0) {
      m = 0;
      break;
    }
    if (r > m) m = r;
  }
  std::cout << m;
}
