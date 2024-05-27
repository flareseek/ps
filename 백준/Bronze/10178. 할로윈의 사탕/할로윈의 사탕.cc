#include <iostream>

int main(void) {
  int n;
  std::cin >> n;
  while(n-->0) {
    int c, v;
    std::cin >> c >> v;
    std::cout << "You get " << c/v << " piece(s) and your dad gets " << c % v << " piece(s).\n";
  }
  return 0;
}
