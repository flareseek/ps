#include <iostream>

int main(void) {
  int t;
  std::cin >> t;
  while (t-->0) {
    int s, n;
    std::cin >> s >> n;
    while (n-->0) {
      int q, p;
      std::cin >> q >> p;
      s += (q*p);
    }
    std::cout << s << std::endl;
  }
  return 0;
}
