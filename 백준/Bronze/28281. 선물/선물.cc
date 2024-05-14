#include <iostream>
#include <string>
#include <climits>

int main(void) {
  int N, X, l, min = INT_MAX;
  std::cin >> N >> X;
  std::cin >> l;

  for (int i = 0; i < N-1; i ++) {
    int l2, cal;
    std::cin >> l2;
    cal = X*(l+l2);
    if (cal < min) min = cal;
    l = l2;
  }
  std::cout << min;
  return 0;
}
