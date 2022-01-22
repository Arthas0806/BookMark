// 브라우저 객체
// 브라우저에 내장된 객체를 브라우저 객체라고 합니다. window는 브라우저 객체의 최상위 객체이다

// window 객체의 메서드 종류

// open('URL', '새 창 이름', '새 창 옵션') : URL 페이지를 새 창으로 나타내기
// alert(data) : 경고 창을 나타내고 데이터를 보여준다. 확인을 누르면 다음 위치의 코드를 수행한다.
// prompt('질문', '답변') : 질문과 답변으로 질의 응답 창을 보여준다.
// confirm('질문 내용') : 
// moveTo(x, y)
// resizeTo(width, height)
// setinterval(function(){자바스크립트 코드}, 일정시간 간격)
// setTimeout(function() {자바스크립트 코드}, 일정 시간 간격)

// open('URL', '새 창 이름', '새 창 옵션')
// 팝업 창 예제

// window.open("http://www.naver.com/", "easy", "width = 700, height = 600, left = 50, top = 10. scrollbars = no");

// alert() : 경고 창을 나타낼때 사용 window 객체를 따로 작성하지 않아도 된다.

// prompt() : 질의 응답 창을 나타낸다.

// confirm() : 확인 취소 창을 나타낼때 사용 true, false를 반환한다.

// setInterVal() / clearInterVal()

// setInterVal() : 일정시간 간격으로 코드를 실행하고 
// clearInterVal() : setInterVal()를 취소합니다.

// setInterVal('코드', 시간 간격(ms));
// clearInterVal(참조변수);

var i = 0;

// 1초마다 1을 출력하게 하고 10번 나왔을때 경고창과 함계 멈춘다.

// var auto = setInterval(function(){
//     document.write('1');
//     i++;

//     if(i > 10){
//         alert('종료');
//         clearInterval(auto);
//     }

// }, 1000);

// setTimeout() : 일정 시간이 지나면 코드를 실행하고 종료합니다.
// clearTimeout() : setTimeout()을 제거합니다.

// -----------------------------------------------------------------------

// screen 객체 : 사용자의 모니터 정보(속성)를 제공하는 객체

// screen.width - 화면의 너비값을 구합니다.
// screen.height - 화면의 높이값을 구합니다.
// screen.availWidth - 작업 표시줄을 제외한 화면의 너비값을 구합니다.
// screen.availHeight - 작업 표시줄을 제외한 화면의 높이값을 반환합니다.
// screen.colorDepth - 사용자가 모니터가 표현 가능한 컬러 bit 값을 반환합니다.

///////////////////////////////////////////////////////////////////////////

// local 객체는 사용자 브라우저와 괂련된 속성과 메서드를 제공하느 객체입니다.

// location.속성;
// location.메서드();

/*

location.href : 주소 영역의 참조 주소를 설정하거나 URL 반환합니다.
location.hash : URL의 해시값(#에 명시된 값)을 반환합니다.
location.hostname : URL의 호스트 이름을 설정하거나 반환합니다.
location.host : URL의 호스트 이름과 포트 번호를 반환합니다.
location.protocal : URL의 프로토콜을 반환합니다.
location.search : URL의 쿼리(요청값)를 반환합니다.
location.reload() : 새로고침의 효과를 가집니다.

//////////////////////////////////////////////////////////////////////////////

history 객체
사용자가 방문한 사이트의 기록을 남기고 이전 방문 사이트와 다음 방문 사이트로 다시 돌아갈 수 있는 속성과 메서드를 제공

1. history.속성
2. history.메서드
3. history.메서드(n)

객체의 속성 종류

history.back() : 이전 방문 사이트로 이동합니다.
history.forward() : 다음 방문 사이트로 이동합니다.
history.go(이동 숫자) : 이동 숫자에 -2를 입력하면 2단계 이전의 방문 사이트로 이동합니다.
history.length : 방문 기록이 저장된 목록의 개수를 반환합니다.

navigator 객체 : 현재 방문자가 사용하는 브라우저 정보롸 운영체제 정보를 제공하는 객체입니다.

// navigation.속성


*/


// 방문자의 브라우저와 운영체제 정보를 제공하는 예제
// document.write(navigator.userAgent);
// Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.99 Safari/537.36

// navigator.appCodeName : 현재 브라우저의 코드명을 반환 -> Mozilla
// navigator.appName : 현재 브라우저의 이름을 반환 -> Netscape
// navigator.appVersion : 현재 브라우저의 버전 정보를 반환합니다. -> 5.0(Win-dows)
// navigator.language : 현재 브라우저가 사용하고 있는 언어를 반환합니다. 한국어는 'ko'를 반환
// navigator.product : 현재 브라우저의 엔진 이름을 반환합니다 크롬의 경우 'gecko'
// navigator.platform : 현재 컴퓨터의 운영체제 정보를 제공합니다. 32비트면 Win32
// navigator.onLine : 온라인 상태 여부에 대한 정보를 제공합니다.연결되있으면 true
// navigator.userAgent : 브라우저와 운영체제의 종합 정보를 제공합니다.

console.log(navigator.appCodeName); // 사라진다
console.log(navigator.appName); // 사라진다
console.log(navigator.appVersion); // 사라진다
console.log(navigator.language);
console.log(navigator.platform); // 사라진다
console.log(navigator.onLine);
console.log(navigator.userAgent);





