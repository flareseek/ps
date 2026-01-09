#include <iostream>

using namespace std;

int answer[10];
int cur[10];
int result;

void bt(int idx) {
  if (idx == 10) {
    int cnt = 0;
    for(int i = 0; i < 10; i++) if (answer[i] == cur[i]) cnt ++;
    if (cnt >= 5) result ++;
    return;
  }
  for (int n = 1; n<= 5; n++) {
    if (idx >= 2 && n == cur[idx-1] && n == cur[idx-2]) continue;
    cur[idx] = n;
    bt(idx+1);
  }
}

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);
  for(int i = 0; i < 10; i++) cin >> answer[i];
  bt(0);
  cout << result;
  return 0;
}
