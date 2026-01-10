#include <iostream>
#include <climits>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N, B, H, W;
  cin >> N >> B >> H >> W;

  int min = INT_MAX;
  while(H--) {
    int p;
    cin >> p;
    int max = 0;
    for (int i = 0; i < W; i++) {
      int a;
      cin >> a;
      if (max < a) max = a;
    }

    if (p*N > B || min < p*N) continue;
    if (N <= max) min = p*N;
  }

  if (min == INT_MAX) cout << "stay home";
  else cout << min;
  return 0;
}
