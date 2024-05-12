#include <iostream>

int main(void) {
  int by, bm, bd;
  int cy, cm, cd;
  std::cin >> by >> bm >> bd;
  std::cin >> cy >> cm >> cd;
  int a1 = cy - by;
  if (cm < bm || (cm == bm && cd < bd)) a1--;
  std::cout << a1 << std::endl;
  int a2 = cy - by + 1;
  std::cout << a2 << std::endl;
  std::cout << a2 - 1 << std::endl;
  return 0;
}

