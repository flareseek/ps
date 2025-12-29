#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int T, N;
  cin >> T;
  while(T-->0) {
    cin >> N;
    int t = N/3;
    const int A = (t*1.5)*(t+1);
    t = N/7;
    const int B = (t*3.5)*(t+1);
    t = N/21;
    const int C = (t*10.5)*(t+1);
    cout << (A+B-C) << "\n";
  }

  return 0;
}
