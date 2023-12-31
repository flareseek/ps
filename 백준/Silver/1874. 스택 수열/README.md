# [Silver II] 스택 수열 - 1874 

[문제 링크](https://www.acmicpc.net/problem/1874) 

### 성능 요약

메모리: 29000 KB, 시간: 292 ms

### 분류

자료 구조, 스택

### 문제 설명

<p>스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다. 스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.</p>

<p>1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. 임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.</p>

### 입력 

 <p>첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다. 둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다. 물론 같은 정수가 두 번 나오는 일은 없다.</p>

### 출력 

 <p>입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다. push연산은 +로, pop 연산은 -로 표현하도록 한다. 불가능한 경우 NO를 출력한다.</p>





<br><br>
## 리뷰
<p>
나는 stack을 사용해서 풀었는데<br>
다른 사람의 풀이를 확인해 보니 수열의 크기가 주어지므로 정수형 배열을 사용해서 푸는 방법도 있었다.<br>
(https://www.acmicpc.net/source/53112904) <br>
해당 풀이를 읽어보니 처음에는 이해가 안됐는데 천천히 읽어보니 stack의 사용법에 대해 조금 이해 할 수 있었다.<br>
 
```java
for(int i = 1; i <= N; i++) {
  while(top != -1 && stack[top] == A[index]) {
    top--;
    index++;
    sb.append("-\n");
  }
  stack[++top] = i;
  sb.append("+\n");
}

while(top != -1 && stack[top] == A[index]) {
  top--;
  index++;
  sb.append("-\n");
}
 ```

첫번째로 헷갈렸던 부분이다.<br>
스택을 1부터 N까지 계속 쌓는데, 쌓기전에 제일 위에 쌓은 값이 A[index]의 값과 같으면 pop // 여기까지는 이해를 했다 <br>
그리고 A[index]값이 스택의 제일 위 값보다 작다면 stack을 계속 pop을 해서 해당 값을 찾아줘야 한다고 생각했다.<br>
그런데 이건 문제를 제대로 안읽어서 생긴 오해였다. 주어진 수열의 값은 중간에 빈 곳이 없이 1부터 N까지 연속된 수 라는것을 생각하지 않고 있었다. <br>
<br>
만약, stack의 값이 [1, 2, 3, 4, 5], A[index]가 5, stack[top]도 5라고 하자.<br>
그럼 pop을 해야 돼서 stack은 [1, 2, 3, 4]가 됨을 알 수 있다. <br> 
다음 A[index]가 3이라면 stack을 3까지 pop 해줘야 하는데 3까지 pop 하게 된다면 4가 사라지게 된다<br>
A[index]의 값이 나중에 4가 나오게 된다면 stack에는 4 값이 없으므로 "NO"를 출력하게 된다. <br>
<b>스택에 1부터 순차적으로 쌓을때</b>는 제일 위에 있는 값이 A[index]랑 같을때 pop 해줘야 하고, <b>쌓는 도중에</b> A[index]값과 stack[top]값의 차이가 1이상 난다면 위와 같은 문제가 생긴다. 다시말해 A[index] 값이 stack에 쌓는 값보다 작으면 문제가 된다는 말이다. <br>
그래서, 중간에 있는 4가 A[index]가 5인 순서보다 앞에 나오게 된다면... 이런 문제가 생기지 않게 된다.<br>

<br> 
스택에 다 쌓고 나서 pop을 해줄때는 스택을 쌓을때 A[0]에서 A[index]값이 N이 되는 범위의 값들을 스택에서 비웠기 때문에 스택의 제일 위 부터 순차적으로 반복해서 pop을 해준다. <br>
즉, A배열의 값중에 N 이후의 값들은 내림차순으로 정렬되어 있어야 한다는 것이다. 그렇지 않으면 위와 같은 문제가 발생한다.<br>
정상적인 수열일 경우, 반복이 끝나면 스택이 전부 비워진다. <br> 
<br>반복하는 도중에 pop 값과 A[index]값이 같지 않으면 다음에 나올 A[index]의 값들보다 작은 수 이므로, 이 값을 위해 스택을 계속 꺼내면 그 사이의 값들이 유실된다고 볼 수 있겠다.<br>
<br>그래서 위 코드에 top != -1 && stack[top] == A[index] 가 성립하지 않게 되므로, 스택에 데이터가 남아있게 된다.
<br>
<br>
정리를 하자면,<br>
주어진 배열이 처음부터 N값까지는 오름차순 정렬(1차이로 정렬이 안된 경우는 예외), N값부터 끝까지는 내림차순 정렬이 되어 있어야 한다. <br>
그래야 데이터 손실 없이 스택을 사용할 수 있다.<br><br>

사실 적으면서도 이해를 완벽하게 하지 못했다. 자료구조를 공부하고 다시 읽어봐야겠다.
</p>


