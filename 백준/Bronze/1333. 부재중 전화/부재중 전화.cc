#include <iostream>

int main(void) {
  int N, L, D, time = 0, atime;
  std::cin >> N >> L >> D;
  atime = D;
  while(N-->0) {
    time += L;
    if (atime < time) while(atime < time) atime += D;

    if (time <= atime && atime < time+5) {
      std::cout << atime;
      return 0;
    }
    time += 5;
  }
  while(atime < time) atime += D;
  std::cout << atime;
  return 0;
}
