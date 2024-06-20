#include <cstdio>
#include <iostream>

int main(void) {
  int ct = 0, st = 0, tt;
  char t;
  std::cin >> tt >> t;
  ct += tt*60*60;
  std::cin >> tt >> t;;
  ct += tt*60;
  std::cin >> tt;
  ct += tt;

  std::cin >> tt >> t;
  st += tt*60*60;
  std::cin >> tt >> t;
  st += tt*60;
  std::cin >> tt;
  st += tt;

  int diff = 0;
  if (ct < st) {
    diff = st - ct;
  } else {
    diff = 60*60*24 - (ct - st);
  }   
 
  int h = diff/60/60;
  int m = diff%(60*60)/60;
  int s = diff%60;

  printf("%02d:%02d:%02d", h, m, s);

  return 0;
}
