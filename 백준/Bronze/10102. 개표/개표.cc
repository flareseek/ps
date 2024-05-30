#include <iostream>

int main(void) {
  int n;
  int A = 0, B = 0;
  std::cin >> n;
  while(n-->0) {
    char t;
    std::cin >> t;
    if (t == 'A') A++;
    else B++;
  }
  std::cout << (A > B ? "A" : (A < B ? "B" : "Tie"));
  return 0;
}
