// 사칙연산 가능

// alert(10 + 10);

// alert(111);
// alert('<a href = "http://www.naver.com">');

console.log(111/11);
console.log('test \n tester'); // \n 줄바꿈 가능
console.log('age', 11);
console.log('errorCode', 404);

// "" '' 둘다 사용 가능하지만 일관되게 사용하자

console.log(25.123);

// 숫자연산을 위한 산술연산 가능
// 숫자는 정수와 실수를 구분하지 않는다.
console.log(25 + 82);
console.log(100 / 4);
console.log(80 - 22);

if(false){
    console.log('if => true');
}else {
    console.log('if => false');
}

console.log(true);
console.log(false);

// 논리값 true / false
// 비교연산 ( > < >= <= == !=)
// 논리연산 (&& || !)

// 문자열 비교
// 국어사전의 앞 쪽에 있을 수록 값이 작음

// true와 false도 1과 0으로 변환 후 비교 연산이 가능하다.
console.log('true > false', true > false);
console.log('true < false', true < false);

// 자바스크립의 변수 특징
// 호이스팅 -> 변수 선언과 동시에 초기화 하지 않는경우 자동으로 undefiend라는 키워드를 넣어놓는다.

//변수 선언 방법 => var 변수이름(식별자);
// var 생명주기 => 함수 단위로 생명주기가 발생
// 함수 밖에서 선언하면 전역 변수가 된다.

// 변수에 저장하는 데이터 타입 : 숫자, 문자열, bool, 함수, 객체(배열...)

var num; // 전역 변수

console.log('num => ', num);

// 함수 호출
fn();


// 함수 정의 : 코드 실행전에 function은 먼저 실행이 되서 위에 있어도 실행이 된다.
function fn(){
    num = 11;
    var age = 10;   // 함수 내에서 존재하는 변수
    console.log('age1 =>', age);
    console.log('num1 =>', num);

    // let :  생명주기가 블록({})을 기준으로 생성
    for(let i = 0; i < 5; i++){
        console.log(i);
    }
    // console.log('for문 밖에서 출력하는 i => ', i);

    // 상수를 만드는 const => 초기화 후 값을 대입하지 못한다!!!
    const no = 7;
    no = 777;

    
}

// 함수 호출
fn();

// console.log('age2 =>', age);
// console.log('num2 =>', num);

// 자바의 참조변수와 비슷
console.log();
console.log();

