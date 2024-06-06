#include <iostream>
#include <map>
#include <string>
#include <utility>

int main(void) {
  std::map<std::string, std::pair<long, long> > info;
  info["black"] = std::make_pair(0, 1);
  info["brown"] = std::make_pair(1, 10);
  info["red"] = std::make_pair(2, 100);
  info["orange"] = std::make_pair(3, 1000);
  info["yellow"] = std::make_pair(4, 10000);
  info["green"] = std::make_pair(5, 100000);
  info["blue"] = std::make_pair(6, 1000000);
  info["violet"] = std::make_pair(7, 10000000);
  info["grey"] = std::make_pair(8, 100000000);
  info["white"] = std::make_pair(9, 1000000000);

  std::string f, s, t;
  std::cin >> f >> s >> t;
  std::cout << (info[f].first * 10 + info[s].first) * info[t].second;
  return 0;
}
