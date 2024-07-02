#include <iostream>
#include <cmath>

int main(void) {
  long A, B, C;
  std::cin >> A >> B >> C;
  if (C-B <= 0)
    std::cout << -1;
  else {
    double t = (double)A/(C-B);
    double t2 = ceil(t);
    std::cout << (t == t2 ? (int)t + 1 : (int)t2);
  }
  return 0;
}
