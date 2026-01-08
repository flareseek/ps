#include <iostream>
#include <queue>
#include <stack>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N;
  cin >> N;
  priority_queue<float> pq;
  while(N--) {
    float t;
    cin >> t;
    pq.push(t);
    if (pq.size() == 8) pq.pop();
  }
  stack<float> s;
  while(!pq.empty()) {
    s.push(pq.top());
    pq.pop();
  }
  cout << fixed;
  cout.precision(3);
  while(!s.empty()) {
    cout << s.top() << "\n";
    s.pop();
  }

  return 0;
}
