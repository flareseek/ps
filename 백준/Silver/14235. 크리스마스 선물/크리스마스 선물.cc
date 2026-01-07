#include <iostream>
#include <queue>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int n;
  cin >> n;

  priority_queue<int> pq;
  while(n--) {
    int t;
    cin >> t;
    if (t == 0) {
      if(pq.empty()) cout << -1 << "\n";
      else {
        cout << pq.top() << "\n";
        pq.pop();
      }
    } else {
      while(t--) {
        int c;
        cin >> c;
        pq.push(c);
      }
    }
  }
  return 0;
}
