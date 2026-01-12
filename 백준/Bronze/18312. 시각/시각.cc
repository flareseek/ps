#include <iostream>

using namespace std;

int N, K;

bool is(int num) {
  return num/10 == K || num%10 == K;
}

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);
  cin >> N >> K;

  int s = 0, m = 0, h = 0, cnt = 0;
  while(h <= N) {
    if(is(s) || is (m) || is(h)) cnt ++;

    s ++;
    if (s >= 60) {
      m ++;
      s = 0;
    }
    if (m >= 60) {
      h ++;
      m = 0;
    }
  }

  cout << cnt;
  return 0;
}
