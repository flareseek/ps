#include <iostream>

bool ff(int f, int s, int t) {
  return ((1 <= f && f <= 12) && (0 <= s && s<= 59) && (0 <= t && t <= 59));
}

int main(void) {
  int f, s, t, r = 0;
  char c;
  std::cin >> f >> c >> s >> c >> t;
  if (ff(f, s, t)) r++;
  if (ff(f, t, s)) r++;
  if (ff(s, f, t)) r++;
  if (ff(s, t, f)) r++;
  if (ff(t, f, s)) r++;
  if (ff(t, s, f)) r++;
  std::cout << r;
  return 0;
}
