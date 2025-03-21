#include <iostream>
#include <utility>
#include <algorithm>

#define MAX_V 10001
#define MAX_E 100001

using namespace std;

int V, E;
pair<int, pair<int, int>> info[MAX_E];
int uf[MAX_V] = {};

int find(int x) {
  if (uf[x] != x) {
    int root = find(uf[x]);
    uf[x] = root;
  }

  return uf[x];
}


void uni(int x, int y) {
  int X = find(x);
  int Y = find(y);
  uf[X] = Y;
}

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  cin >> V >> E;
  for (int i = 1; i <= V; i++) uf[i] = i;

  for (int i = 0; i < E; i++) {
    int node1, node2, edge;
    cin >> node1 >> node2 >> edge;
    info[i] = make_pair(edge, make_pair(node1, node2));
  }
  
  sort(info, info+E);

  int cnt = 0;
  int wgt = 0;

  for (int i = 0; i < E; i++) {
    auto& data = info[i];
    int& x = data.second.first;
    int& y = data.second.second;
    if (find(x) != find(y)) {
      uni(x, y);
      cnt ++;
      wgt += data.first;
    }
  }
  cout << wgt;
  return 0;
}
