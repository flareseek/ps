#include <iostream>

int main(void) {
  int n, c, s;
  c = s = 100;
  std::cin >> n;
  while (n-->0) {
    int a, b;
    std::cin >> a >> b;
    if (a > b) s -= a;
    else if (a < b) c -= b;
  }
  std::cout << c << "\n" << s;
  return 0;
}
