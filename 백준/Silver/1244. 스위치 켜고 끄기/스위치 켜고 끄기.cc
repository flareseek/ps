#include <iostream>

using namespace std;

bool switches[101];

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int S;
  cin >> S;

  for (int i = 1; i <= S; i++)
    cin >> switches[i];

  int N;
  cin >> N;

  while(N--) {
    int s, n;
    cin >> s >> n;

    if (s == 1) {
      for (int i = n;i <= S; i += n) switches[i] = !switches[i];
    } else {
      switches[n] = !switches[n];
      for (int i = 1; i < n; i++) {
        const int l = n-i;
        const int r = n+i;
        if (l <= 0 || S < r || switches[l] != switches[r]) break;
        switches[l] = !switches[l];
        switches[r] = !switches[r];
      }
    }
  }

  for (int i = 1; i <= S; i++) {
    cout << (int)switches[i] << " ";
    if (!(i%20)) cout << "\n";
  }

  return 0;
}
