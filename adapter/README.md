# Adapter
- 호환성이 없는 인터페이스 때문에 함께 동작할 수 없는 클래스들을 함께 동작하도록 해주는 패턴
- 기존 시스템에 새로운 써드파티 라이브러리를 추가하는 경우나, 레거시 인터페이스를 교체하는 경우에 재사용성을 높일 수 있는 방법

# Class Diagram
<img src="doc/adapter.png">

# Example Code
- 예제 코드에서는 Client 에서 사용중이던 WebRequester 를 변경하는 경우를 정의했다.
- `WebRequest` 인터페이스를 구현한 OldWebRequest 에서 인터페이스가 없는(호환되지 않는) `NewWebRequester` 로 변경하려 한다.
- `NewRequest` 는 호환성이 없기 때문에 Adapter 클래스를 정의한 후, 메소드 체인을 통해 유연하게 Requester 를 교체했다.

