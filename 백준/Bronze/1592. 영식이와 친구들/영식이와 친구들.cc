#include <iostream>

int main(void) {
  int N, M, L, cur = 0, cnt = 0;
  int S[50] = {0};
  std::cin >> N >> M >> L;
  S[0] ++;
  while(1) {
    if (S[cur] >= M) break;
    if (S[cur] % 2 != 0) {
      cur = (cur+L)%N;
      S[cur] ++;
    } else {
      cur = ((cur-L)+N)%N;
      S[cur] ++;
    }
    cnt ++;
  }
  std::cout << cnt;
  return 0;
}
