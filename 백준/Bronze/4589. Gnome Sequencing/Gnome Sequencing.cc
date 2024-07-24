#include <iostream>

int main(void) {
  int n;
  std::cin >> n;
  std::cout << "Gnomes:\n";
  while(n--) {
    int a, b, c;
    std::cin >> a >> b >> c;
    if ((a <= b && b <= c) || (a >= b && b >= c)) std::cout << "Ordered\n";
    else std::cout << "Unordered\n";
  }
  return 0;
}
