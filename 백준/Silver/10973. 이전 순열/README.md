# [Silver III] 이전 순열 - 10973 

[문제 링크](https://www.acmicpc.net/problem/10973) 

### 성능 요약

메모리: 20008 KB, 시간: 276 ms

### 분류

조합론, 구현, 수학

### 문제 설명

<p>1부터 N까지의 수로 이루어진 순열이 있다. 이때, 사전순으로 바로 이전에 오는 순열을 구하는 프로그램을 작성하시오.</p>

<p>사전 순으로 가장 앞서는 순열은 오름차순으로 이루어진 순열이고, 가장 마지막에 오는 순열은 내림차순으로 이루어진 순열이다.</p>

<p>N = 3인 경우에 사전순으로 순열을 나열하면 다음과 같다.</p>

<ul>
	<li>1, 2, 3</li>
	<li>1, 3, 2</li>
	<li>2, 1, 3</li>
	<li>2, 3, 1</li>
	<li>3, 1, 2</li>
	<li>3, 2, 1</li>
</ul>

### 입력 

 <p>첫째 줄에 N(1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄에 순열이 주어진다.</p>

### 출력 

 <p>첫째 줄에 입력으로 주어진 순열의 이전에 오는 순열을 출력한다. 만약, 사전순으로 가장 처음에 오는 순열인 경우에는 -1을 출력한다.</p>


 ## 리뷰
상당히 상당히 매우 매우 어려웠다 그냥 하는 방법을 몰랐다. <br>
처음 생각난것은 list에다가 N번째 수 까지 다 저장한 후 사칙연산으로 입력 받은 순열이 몇번째인지 구한 다음<br>
이 값을 통해 역으로 순열을 구하는데 이미 나온 숫자는 list에서 지워버리는 뭐 말로 설명하기도 힘든 엉터리 방법으로 구현했다.<br>
테스트케이스도 통과하고 직접 다른 케이스도 구해서 돌려봤는데 정답이길래 제출했더니 1% 넘기고 바로 틀려버렸다.<br>
<br>
1시간 이상 씨름하다가 결국 답지를 봤는데 답지를 봐도 모르겠더라. <br>
그래서 직접 논리적으로 생각해보고 정리해서 글을 써본다.<br>
<br><br>

1 2 3 4 5 라는 순열이 주어졌을때 오른쪽부터 오름차순으로 정렬된게 순열의 시작이다 <br>
<br>
만약에 <br>
5 1 2 3 4 는 50000 번대의 첫번째 순열이고 (순열의 시작이고) <br>
5 3 1 2 4 는 53000 번대의 첫번째 순열이 된다. <br><br>

5 3 <b>1</b> 2 4 의 이전순열을 구해보자<br>
우선 기준을 오름차순이 시작되는 곳으로 잡는다. (1 이 되겠죠) <br>
<br>
1의 왼쪽의 수 3과 1부터 순열 끝까지 수 중에 3보다 작지만 제일 큰 수 2 를 찾고, 3과 2의 위치를 서로 바꿔준다.<br>
-> 이는 53000번대 이전 순열중 직전 순열의 처음값을 구하는것이다. <br>
5 <b>3</b> 1 <b>2</b> 4 => 5 <b>2</b> 1 <b>3</b> 4 == 52000번대의 첫번째 순열이된다<br>
여기서 3보다 작은 수 중에 제일 큰 수와 스왑 했으니 여전히 오름차순이므로 첫번째 순열이 되는것이다.<br>
<br>
오름차순이 시작되는 기준부터 순열 끝까지 뒤집어주면 순열의 최대값이 된다. (오름차순으로 최소값이니까 뒤집어주면 최대값이 됨)<br>
5 2 <b>1 3 4</b> => 5 2 <b>4 3 1</b> == 52000번대의 마지막 순열이 된다.<br>
<br>
5 3 1 2 4 는 53000번대 순열의 처음값(최소값) 이고 5 2 4 3 1은 52000번대 순열의 마지막 값(최대 값)이 되므로<br>
5 3 1 2 4 의 이전 순열이라고 볼 수 있겠다.<br>
<br>
<br>
이 문제는 이해 하는것도 힘들었다. 내가 제대로 이해한것이 맞는지 10972번 다음 순열 문제(https://www.acmicpc.net/problem/10972) 를 풀어봐야겠다.

