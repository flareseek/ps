#include <iostream>
#include <algorithm>

int main(void) {
  int N, Q;
  int l[101] = {0};
  std::cin >> N >> Q;
  for(int i = 1; i <= N; i++) {
    std::cin >> l[i];
    l[i] += l[i-1];
  }
  while(Q--) {
    int t;
    std::cin >> t;
    int* i = std::upper_bound(l, l+N, t);
    std::cout << i - l << "\n";
  }
  return 0;
}
