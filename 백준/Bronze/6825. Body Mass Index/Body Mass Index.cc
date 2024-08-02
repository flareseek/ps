#include <iostream>

int main(void) {
  double w, h;
  std::cin >> w >> h;

  double result = w/(h*h);

  if (25 < result) std::cout << "Overweight";
  else if (18.5 <= result && result <= 25.0) std::cout << "Normal weight";
  else std::cout << "Underweight";
  return 0;
}
