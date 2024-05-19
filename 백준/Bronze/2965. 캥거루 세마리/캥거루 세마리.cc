#include <iostream>

int main(void) {
  int a, b, c;
  std::cin >> a >> b >> c;

  int r1 = b - a - 1;
  int r2 = c - b - 1;
  std::cout << (r1 > r2 ? r1 : r2);
  return 0;
}
