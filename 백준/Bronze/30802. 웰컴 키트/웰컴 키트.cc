#include <iostream>
#define CAL(T, R) (R > 0 ? ((R-1)/T+1) : 0)
using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N;
  int S, M, L, XL, XXL, XXXL;
  int T, P;
  cin >> N;
  cin >> S >> M >> L >> XL >> XXL >> XXXL;
  cin >> T >> P;

  cout << (CAL(T, S) + CAL(T, M) + CAL(T, L) + CAL(T, XL) + CAL(T, XXL) + CAL(T, XXXL)) << "\n";
  cout << N/P << " " << N%P;
  return 0;
}
