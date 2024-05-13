# 해커톤: With Board
[WithBoard-Project](https://github.com/WithBoard-Project)

---

## 1️⃣ 주제 : 
스케이트파크를 사람들과 공유하고 함께 타러갈 수 있는 커뮤니티 웹 서비스

[위드 보드 초기 기획서](https://www.notion.so/6efa677fa5084e1cbc8147a1fefec9fd?pvs=21)

## 구현 기능 LIST

### 1.  Map에 스케이트 파크 표시

보드 타기 좋은 장소를 공유하는 게시판

- 기본적인 CRUD (admin / uesr 구분)
- 좋아요 기능

### 1-1. Detail 파크에 대한 같이 타러 가요 게시판

게시자는 보드타러갈 장소, 시간, 최대 인원을 정한다.

- 기본적인 CRUD
- 댓글 기능
- + 최대 인원 제한 기능

### 2. 보드 자랑 게시판

새로운 보드를 구매하거나, 보드 타기 좋은 장소를 발견했을 때 자랑할 수 있는 게시판

- 기본적인 CRUD
- 댓글 기능
- 좋아요 기능

### 관련 기술, 상식 백과사전

숙련도별 배우면 좋은 기술 , 기본 상식, 장비들

- 기본적인 CRUD
- 단 추가, 삭제, 수정 기능의 경우 일정 등급 이상의 사용자만 권한을 가짐

### 관리자 선정 금주의 HOT PLACE

- 카카오 지도 API를 활용해서 스케이트보드 파크를 표시한다.
- 기본적인 CRUD
- 관리자 등급만 생성, 수정, 삭제할 수 있음

https://drumble.tistory.com/33 ← 기본적인 보드 종류

https://bolyee.tistory.com/25 ← 스케이트 보드 기본 기술 

https://blog.naver.com/jjpark314/222029341486` ← 스케이트 보드 상식

---

## 2️⃣ Wire Flow

Main Flow

![123.jpg](https://prod-files-secure.s3.us-west-2.amazonaws.com/a49328a7-2cfc-4af9-866d-f60a075dc2a3/d3abead7-7926-4ee4-aad5-f8123a9a8cef/123.jpg)

보드 자랑 게시판 Flow

![1.jpg](https://prod-files-secure.s3.us-west-2.amazonaws.com/a49328a7-2cfc-4af9-866d-f60a075dc2a3/5945282d-6333-404f-9675-3692942a342c/1.jpg)

---

## 3️⃣ ERD

[위드 보드 모임 ERD](https://www.erdcloud.com/d/jxRfYMettuv8w9yvX)

# V1. 확장성의 문제가 생길 수 있다.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/a49328a7-2cfc-4af9-866d-f60a075dc2a3/38fbbf2a-ab34-4066-996e-f80c19c758de/Untitled.png)

## V1의 문제점 발생

### ﹗동일한 내용을 포함한 테이블이 생성된다면 확장성에 큰 문제가 생길 수 있다.

- 위의 ERD 내에서는 게시판의 성격을 띄는 테이블에서 중복되는 컬럼 뿐 아니라 (좋아요, 이미지, 리뷰) 등 겹치는 부분들이 많다.
- 테이블마다 약간 차이가 있어 서로 공유 불가능한 테이블이라고 판단해 각각의 테이블을 생성하는 실수
- 만약 비슷한 성격을 띈 게시판이 100개, 30000000개 늘어난다면 ?
    
     → 게시판, 좋아요, 이미지, 리뷰 등 비슷한 구조를 가진 테이블들이 배로 늘어나 문제가 발생한다.
    
- 이때 같은 성격을 띄는 테이블들을 한번에 묶어 놓고 차이를 가지는 부분들을 각각의 테이블로 분류하여 ERD를 설계한다면 동일한 부분들은 재사용하며 쓸모 없는 테이블을 줄여낼 수 있다.

### 기존의 테이블 → 사용자 : 뽐내기 게시글 = 1:N / 사용자 : 같이타요 게시글 = 1:N ……
⇒ 사용자 : 뽐내기 : 게시글 = 1:N:1 / 사용자 : 같이타요 : 게시글 = 1:N:1 ……

중복된 내용(게시글 + 이미지 + 좋아요 + 댓글…)을 묶어놓고 다른 부분들을 생각한다면??

### 변경후 →  사용자 : [뽐내기] = 1 : N / [뽐내기] : [게시글+…] = 1 : 1 로 묶일 수 있다.

# v2. V1의 문제점을 해결한 ERD

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/a49328a7-2cfc-4af9-866d-f60a075dc2a3/aa2ae15e-b904-4d35-a00e-705a3ca3a27c/Untitled.png)

---

- 4️⃣기능 명세
    
    [페이지 구현](https://www.notion.so/22a41c7854a24bc3b344f05c6e942480?pvs=21)
    

---

## 5️⃣ 기술 스택

[Notice API 명세서](https://www.notion.so/ded9790642da458481dff36113e171a6?pvs=21)

**🛠 Front-end Stack**

- Next.js-14
- React
- JavaScript

---

**🗂 Dev tools**

- IntelliJ IDEA
- VSCode
- Swagger
- Git
- Github Actions
- Notion
- Postman

**🛠 Back-end Stack**

- Java -  ver.17
- Spring boot -  ver.3.2.4
- Spring Data JPA
- Lombok
- MySQL

---

**🌐 Deployments**

- Vercel
- AWS EC2
- AWS RDS

---

## 6️⃣ 프로젝트 시스템 구상도

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/a49328a7-2cfc-4af9-866d-f60a075dc2a3/5696a5b4-82e6-40aa-add2-ce1749458432/Untitled.png)

---

## 6️⃣ 깃 컨벤션

## **Branch Type**

`main`: 배포 브랜치

`dev`: 배포 전 병합 브랜치

`feat/#{기능명}`: 기능 브랜치

`fix/#{기능명}`: 버그 수정 브랜치

`refactor/#{기능명}`: 리팩토링 브랜치

## **Commit message**

```java
{type}:작업 내용 

// 기능 추가 관련 브랜치인 feat/ 보드게시판에 대한 내용을 commit 하는 경우 
**ex) feat: 보드 자랑 게시판 생성 기능**  
```

## **Commit Type**

| Type | Mean |  |
| --- | --- | --- |
| Feat | 새로운 기능 추가 |  |
| Fix | 버그 수정 |  |
| Docs | 문서 수정 |  |
| Refactor | 코드 리팩토링 |  |
| Test | 테스트 코드, 리팩토링 테스트 코드 추가 |  |
| Chore | 자잘한 수정에 대한 커밋 |  |
| Comment | 필요한 주석 추가 및 변경 |  |
| Urgent | 긴급 처리 요망 (치명적인 에러발생 시) |  |
| Rename | 파일 또는 폴더 명을 수정하거나 옮기는 작업만인 경우 |  |
| Setting | 개발 환경 세팅 |  |

---

## 회고!!!!!!

- 보여지는 것은 매우 중요하다 →  “마무리를 어떻게 하냐보다 어떻게 보여질까”를 고민해보자
- 시간 기한은 매우 중요하다.
- 어떤 것을 배웠는지 꼭 남길 수 있을까
- 각자 진행한 작업 + 이번 프로젝트로 배운점 + 앞으로 어떻게 할까욤(회고)

---

### 상우
(회고 작성 완료 → 기억 나는 데로 더 추가 가능)

### 🌟 **KPT 회고**

- **Keep**
    - 스스로 문제 해결을 위해 노력하다가 너무 오래 걸리면 끊고 꼭 질문하기. (문제 해결을 위해 어떻게든 혼자 끙끙 앓고 살던 시절이 이제는 좀 지난 것 같다.)
    - 질문을 했으면 그 질문에 대해 요약으로라도 빠르게 정리하는 것.
    - DB 구성도 → 불필요한 테이블이나
    - JPA를 사용하면서 DB 테이블에 접근하는 방식을 좀 더 수월하게 문장화하여 이해가 가능해졌다.
    - 대부분 String 또는 Long, ResponseEntity 로 반환하는 컨트롤러 Mapping을 했었는데 이번 프로젝트로 DTO를 반환하는 API를 만드는 습관을 계속 들여야 겠다.
    - 
- **Problem**
    - 본인이 하고자하는 또는 하고 싶어하는 기능들 좀 더 빠르게 선택이 필요할 것 같다. (팀원들의 기다림)
    아직 팀원과의 원활한 소통 연습이 더 필요. + **모르는 용어 기록 (이해 X라면 다시 물어보기 위해)**
    - git pull → 자꾸 이게 문제다.  문제점은 다음과 같다.
        - 일단 push를 하지 않고 pull을 한다는 점. git reset을 한다는 점. 차라리 git revert를 하자. (그나마 낫다.)
        - [브랜치명]|Merging  이라고 나오면 항상 당황한다.
        - 정말로 반드시 commit 이후 **push**까지 하고 그 다음 merge를 하자.
    - 개발 시 **생각**이 좀 더 필요하다. 그렇다고 너무 어렵게 생각하지 말자. 생각보다 해답은 그리 어렵지 않다. → review 조회할 때 테이블 연관 관계때문에 하다가 아무렇게 작성하는 경향이 있는 것 같다는 생각이 들었다.
    
- **Try**
    - 질문을 통해 기능 구현을 할 때 내가 하고자 하는 바를 **문장화** 해보자. (”그냥 나 이 기능을 구현하기 위해 ~~를 할 거야” 가 아닌 **순서도**가 필요.) 그러면 이슈 해결에 좀 더 쉽게 접근이 가능하더라!
    - 정적 팩토리 메서드를 통해 DTO을 응답 하는 Mapping 이슈들 해결을 위해 ERD 다이어그램을 통한 데이터 find에 대해 고민했다. (팀원의 도움과 함께) 그래서 글 목록에 대한 CRUD를 완성했다.
    - 팀원과 함께 ERD 다이어그램을 만들면서 하나의 게시글에 대한 테이블에 부록처럼 리뷰, 좋아요, 위치 테이블이 연결되어 있어 게시글이 추가되면 다른 부록들도 같이 3개씩 추가가 되는 문제점 때문에 우리 프로젝트에서는 뽐내기와 같이 타요 게시글 → 게시글 → 이 게시글에 따라 다른 리뷰들 이런 방식으로 연관 관계 매핑으로 진행하여 테이블 매핑이 훨씬 간편해졌다.
    - ERD를 보면 User와 Post, Review 테이블이 연결되어 있다. 여기서 User 테이블과 Post 테이블을 통해 Review를 조회하려고 했는데 생각을 문장화하여 이해하여 AffectionPostId를 `findById()`하여 `getPost().getReviewList()` 를 통해 review를 조회하는 방식으로 했다.   정적 팩토리 메서드 of에는 (List) 하나만 담아서 반환.
    - URL을 보면 `~~~/{affectionPostId}/{revieId}` 나는 여기서 review 테이블이 있어서 꼭 {reviewId}로 @Pathvariable 해서 할려고 했었다. 하지만 하지만 그럴 필요 없이 위처럼 `~~~/{affectionPostId}/review` 이렇게 해주면 끝난다.
    - 이어서 Put 수정을 할 때 URL도 반드시 {reviewId} 가 아니라 @RequestBody ~~Dto 를 파라미터로 넘겨서 Service 단에 수정하는 메서드를 넣고 실행해도 문제가 없다.
    (뭔 소린지 기억이 안 날 경우 @PutMapping한 코드를 다시 살펴보기)
    

### ❤️‍🔥 **시간내서 봐야할 코드들**

- 스프링에서 POST할 때 순환을 위한 퍼사드 패턴
- 도커 배포 (RDS), Vercel 배포하는 방법 → 기록 필요
- 프론트에서 fetch → 8080 ~~~
- 카카오 map API
- 내가 했던 get, put 다시 복습

### 🌟 **느낀점**

- 기능 하나 구현할 때마다 주기적으로 계속 push 를 하는 것을 **습관화** 필요. **(**🤬 **다른 건 몰라도 정말 해결해야 할 나만의 이슈)**
- 이번에 나의 작업들이 날라가면서 정신 상태가 돌았다. 그래도 팀원을 위해 좀 더 빠르게 멘탈 복구를 해서 팀 프로젝트에 참여가 필요 했었다.
- 이번 기회에 RDS를 사용한 도커 배포도 같이 팀원들과 보면서 해결하고 질문하고 싶었는데 거기까지 함께하지 못해 아쉬웠다.
- 사실 강의도 많이 보고 Spring 공부 경험도 있어서 어렵지 않게 CRUD를 금방 끝낼 수 있을 거라 생각했는데 테이블 연관 관계, 응답 반환할 DTO, JPA 활용 수준이 많이 아쉬웠다. **(복습 필요.)**
- 앞으로 기업 프로젝트하면서 사이트 프로젝트도 할 생각이니 JPA 복습, Query DSL, AOP, 도커 등 계속 포기하지 말고 공부하자



---

## 작업 결과

### 완료

- 프로젝트 설정
- 폴더 구조
- DataBase RDS 연결 완료(enviroments valuse 설정해야 함)
- Dummy Data 생성 후 RDS 연결
- Front-end → Home page 연결
- Entity 설계 완료

### 진행 결과

- Front-end
    - ~~Home Page 내 지도 표시 → Spot 위치 서버에게 받아와서 표시 성공! (승근)~~
    - ~~Home Page 밑 부분 HotSpot 내림차순 정렬 받은 데이터 받아와서 5개 표시 성공 ! (승근)~~
    - 
- Back-end
    - GET
        - ~~뽐내기 게시글 List 조회~~
        - ~~뽐내기  게시글 Detail 조회~~
        - 뽐내기 게시글 내 댓글 조회
        - ~~스팟 List 전체 조회~~
        - ~~인기 스팟 List 조회~~
        - ~~같이 타요 게시글 List 조회~~
        - 같이 타요 게시글 Detail 조회
        - 같이 타요 게시글 내 댓글 조회
        - 같이 타요 게시글 내 좋아요 수 조회
        - 뽐내기 게시글 내 좋아요 수 조회
    - POST
        - ~~뽐내기 게시글 등록~~
        - ~~뽐내기 게시글 내 댓글 등록~~
        - 같이 타요 게시글 등록
        - 같이 타요 게시글 내 댓글 등록
        - 좋아요 생성/삭제
    - PUT
        - ~~뽐내기 게시글 수정~~
        - ~~뽐내기 게시글 내 댓글 수정~~
        - 같이 타요 게시글 내 댓글 수정
        - 같이 타요 게시글 수정
    - DELETE
        - ~~뽐내기 게시글 삭제~~
        - 같이 타요 게시글 삭제
        - ~~댓글 삭제~~
        - Spot 위치 삭제
