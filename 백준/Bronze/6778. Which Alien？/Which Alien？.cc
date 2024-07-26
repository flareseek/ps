#include <iostream>

int main(void) {
  int a, b;
  std::cin >> a >> b;
  if (3 <= a && b <= 4) std::cout << "TroyMartian\n";
  if (a <= 6 && 2 <= b) std::cout << "VladSaturnian\n";
  if (a <= 2 && b <= 3) std::cout << "GraemeMercurian";
  return 0;
}
