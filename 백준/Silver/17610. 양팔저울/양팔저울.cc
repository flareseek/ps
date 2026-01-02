#include <iostream>
#include <algorithm>

#define MAX_G 200000
#define MAX_k 13

using namespace std;

int k;
int g[MAX_k];
int S;
bool result[MAX_G * MAX_k + 10] = {false};

void rc(int idx, int w) {
  if(idx == k) {
    if (w > 0) result[w] = true;
    return;
  }

  rc(idx+1, w);
  rc(idx+1, w+g[idx]);
  rc(idx+1, w-g[idx]);
}
int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  cin >> k;
  for(int i = 0; i < k; i++) {
    cin >> g[i];
    S += g[i];
  }
  rc(0, 0);
  sort(result, result + S + 1);
  int cnt = 0;
  for (int i = 1; i <= S; i++)
    if (!result[i]) cnt ++;

  cout << cnt;

  return 0;
}
