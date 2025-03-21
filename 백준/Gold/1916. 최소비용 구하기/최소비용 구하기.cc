#include <iostream>
#include <queue>
#include <vector>
#include <functional>
#include <utility>
#include <climits>
#include <algorithm>

#define MAX_V 1001
#define MAX_E 100001

using namespace std;

int N, M;
int START, END;
int graph[MAX_V][MAX_V] = {};
int dist[MAX_V] = {};
priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  cin >> N >> M;
  for (int i = 1; i <= N; i++) {
    for (int j = 1; j <= N; j++) {
      graph[i][j] = INT_MAX;
    }
  }

  for (int i = 0; i < M; i++) {
    int node1, node2, dist;
    cin >> node1 >> node2 >> dist;
    graph[node1][node2] = min(graph[node1][node2], dist);
  }

  for (int i = 1; i <= N; i++) dist[i] = INT_MAX;
  cin >> START >> END;

  dist[START] = 0;
  pq.push(make_pair(0, START));

  while(!pq.empty()) {
    auto MIN = pq.top();
    pq.pop();
    const int d1 = MIN.first;
    const int n1 = MIN.second;

    if (n1 == END) {
      cout << dist[END];
      return 0;
    }

    for (int i = 1; i <= N; i++) {
      const int v = i;
      const int w = graph[n1][v];

      if (w == INT_MAX) continue;

      if (d1 + w < dist[v]) {
        dist[v] = d1+w;
        pq.push(make_pair(d1+w, v));
      }
    }
  }

  return 0;
}
