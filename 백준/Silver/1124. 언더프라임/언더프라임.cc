#include <iostream>
#define P_N 318

using namespace std;

bool isnt_p[P_N] = {true, true, };

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int A, B;
  cin >> A >> B;

  for (int i = 2; i < P_N; i++)
    if (!isnt_p[i])
      for(int j = i+i; j < P_N; j += i)
        isnt_p[j] = true;

  int result = 0;
  for(int i = A; i <= B; i++) {
    int cnt = 0, n = i;
    for (int p = 2; p * p <= n; p++) {
      if (isnt_p[p] || n%p) continue;
      while(!(n%p)) {
        cnt ++;
        n /= p;
      }
    }
    if (n > 1) cnt ++;
    if (!isnt_p[cnt]) result ++;
  }
  cout << result;

  return 0;
}
