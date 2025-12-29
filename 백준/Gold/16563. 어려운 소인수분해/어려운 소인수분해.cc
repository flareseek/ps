#include <iostream>

#define MAX_LEN 2240

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  bool pr[MAX_LEN] = {false};
  int prn[MAX_LEN] = {0};
  int prni = 0;
  for (int i = 2; i < MAX_LEN; i++) {
    if (pr[i]) continue;
    prn[prni++] = i;
    for (int k = i+i; k < MAX_LEN; k += i) {
      pr[k] = true;
    }
  }
  int N, K;
  cin >> N;
  while(N-->0) {
    cin >> K;
    for (int i = 0; i < prni; i++) {
      while(K % prn[i] == 0) {
        cout << prn[i] << " ";
        K /= prn[i];
      }
      if (K == 1) break;
    }
    if (K > 1) cout << K;
    cout << "\n";
  }
  return 0;
}
