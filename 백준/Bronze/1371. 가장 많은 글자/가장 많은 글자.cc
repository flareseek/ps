#include <iostream>
#include <string>
#include <queue>
#include <utility>

int main(void) {
  std::string line;
  int temp['z'-'a'+1] = {0};
  while(std::getline(std::cin, line)) {
    int size = line.size();
    for(int i = 0; i < size; i++) {
      if (line[i] == ' ') continue;
      temp[(int)line[i]-'a'] ++;
    }
  }
  std::priority_queue< std::pair<int, char> > pq;
  for(int i = 0; i < 'z'-'a'+1; i++)
    pq.push(std::make_pair(temp[i], -(i+'a')));
  std::pair<int, char> p = pq.top();
  pq.pop();
  std::cout << (char)(-p.second);
  int t = p.first;
  while(1) {
    if (pq.empty()) break;
    p = pq.top();
    pq.pop();
    if (t != p.first) break;
    std::cout << (char)(-p.second);
    t = p.first;
  }
  return 0;
}
