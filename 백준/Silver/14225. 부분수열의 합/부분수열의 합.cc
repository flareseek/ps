#include <iostream>
#include <algorithm>
#define MAX_ARR_LEN 100000*20+2

using namespace std;

int N, sum, S[20];
bool result[MAX_ARR_LEN];

void rc(int idx, int sum) {
  result[sum] = true;
  if (idx == N) return;
  rc(idx+1, sum);
  rc(idx+1, sum + S[idx]);
}

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  cin >> N;
  for(int i = 0; i < N; i++)
    cin >> S[i];

  rc(0, 0);
  for (int i = 0; i < MAX_ARR_LEN; i++) {
    if (!result[i]) {
      cout << i;
      return 0;
    }
  }

  return 0;
}
