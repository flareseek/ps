#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N;
  cin >> N;

  int MIN = 10001, MAX = 0;
  bool len[10001] = {false};
  for (int i = 0; i < N; i++) {
    int x,y;
    cin >> x >> y;
    if (x < MIN) MIN = x;
    if (MAX < y) MAX = y;
    for (; x < y; x++) len[x] = true;
  }

  int result = 0;
  for (int i = MIN; i <= MAX; i++)
    if (len[i]) result ++;
  cout << result;
  return 0;
}
