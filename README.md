# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 문자열 덧셈 계산기 기능목록
- [x] 빈 문자열 또는 null을 입력할 경우 0을 반환한다
- [x] 기본 구분자(, 또는 :)로 구분된 숫자들을 입력할 경우 숫자들의 합을 반환한다
  - 숫자 하나를 입력할 경우 해당 숫자를 반환한다
- [x] 커스텀 구분자를 지정하면 해당 구분자로 구분된 숫자들의 합을 반환한다
  - 커스텀 구분자는 문자열 앞부분의 //와 \n 사이에 위치하는 문자이다
- [x] 숫자 이외의 값 또는 음수를 입력할 경우 RuntimeException이 발생한다

## 로또(자동) 기능목록
- [ ] 구입금액을 입력받는다
  - 구입금액은 1000의 배수여야 한다
- [ ] 구입금액으로 여러장의 로또를 구입한다
  - 로또 1장의 가격은 1000원이다
  - 개수 = 구입금액 / 1000
- [x] 로또의 번호를 자동으로 선택한다
  - 번호는 1~45의 숫자 중 임의의 6개를 선택한다
- [x] 로또의 각 번호는 1~45의 숫자이다
- [x] 로또를 생성한다
  - 번호는 중복되지 않은 6개의 숫자이다
- [ ] 선택된 로또의 번호를 출력한다
  - 번호는 오름차순으로 정렬된다
- [ ] 지난 주 당첨 번호를 입력받는다
  - 1~45의 숫자 중 중복되지 않는 6개의 숫자를 입력받는다
  - 각 숫자는 쉼표로 구분한다
- [ ] 지난 주 당첨 번호와 로또를 비교하여 몇개의 숫자가 일치하는 지 확인한다
- [ ] 일치한 개수에 따라 당첨금을 받는다
  - 6개 일치 (2,000,000,000 원)
  - 5개 일치 (150,000 원)
  - 4개 일치 (50,000 원)
  - 3개 일치 (5,000 원)
- [ ] 당첨금의 합과 구입금액으로 총 수익률을 계산한다
  - 총 수익률 = 구입금액 / 당첨금의 합
- [ ] 당첨 통계를 출력한다