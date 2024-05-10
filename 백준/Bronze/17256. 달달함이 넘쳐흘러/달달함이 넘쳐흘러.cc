#include <iostream>
#include <stdio.h>

int main(void) {
  int ax, ay, az, cx, cy, cz;
  std::cin >> ax >> ay >> az;
  std::cin >> cx >> cy >> cz;

  printf("%d %d %d", cx-az, cy/ay, cz-ax);
  return 0;
}
