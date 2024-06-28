#include <iostream>

int main(void) {
  int N, l=0, lm=0, r=0, rm=0;
  int tr[50];
  std::cin >> N;
  for(int i = 0; i < N; i++)
    std::cin >> tr[i];

  for(int i = 0; i < N; i++) {
    if (tr[i] > lm) {
      lm = tr[i];
      l ++;
    }
    if (tr[N-i-1] > rm) {
      rm = tr[N-i-1];
      r ++;
    }
  }
  std::cout << l << "\n" << r;
  return 0;
}
