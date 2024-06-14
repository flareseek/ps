#include <iostream>
#include <cmath>

int main(void) {
  int D, H, W;
  std::cin >> D >> H >> W;
  double t = sqrt(D*D / (double)(H*H + W*W));
  std::cout << (int)(t*H) << " " << (int)(t*W);
  return 0;
}
