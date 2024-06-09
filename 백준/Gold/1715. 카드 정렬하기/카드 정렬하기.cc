#include <iostream>
#include <queue>

int main(void) {
  int N, result = 0;
  std::priority_queue<int> pq;
  std::cin >> N;
  while(N-->0) {
    int t;
    std::cin >> t;
    pq.push(-t);
  }
  if (pq.size() == 1) {
    std::cout << 0;
    return 0;
  }
  while(pq.size() > 1) {
    int n1 = pq.top();
    pq.pop();
    int n2 = pq.top();
    pq.pop();

    int r = n1+n2;
    result += r;
    pq.push(r);
  }
  std::cout << -result;
  return 0;
}
