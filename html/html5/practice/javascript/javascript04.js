// 함수 
// 필요한 데이터를 받아서
// -> 데이터를 처리 
// -> 필요에 따라 결과를 반환하는 기능을 정의하는 코드의 집합

//함수의 생성은 function 키워드를 이용해서 생성
// 1. 익명함수 : 함수 건언시에 이름을 생략해서 생성
//      -> 변수를 통해서 정의할 때
//      -> 매개변수에 함수를 전달하는 경우
// 2. 명시적 선언 함수 : 함수 선언시에 이름을 지정해서 생성

// 익명함수 선언
// var fn1 = function(){
//     alert('익명함수 호출');
// };

// 함수 호출
// 익명 함수는 선언 후에 호출이 가능해서 선언 뒤에 적어야하지만
// 명시적 함수는 먼저 실행이 되면서 앞에서 호출이 가능하다.
// fn1();
// fn2();

// 함수가 호이스팅으로 함수가 미리 만들어지고 코드가 위에서 아래로 실행
// function fn2(){
//     alert('명시적 함수 선언 함수 호출');
// }

// 익명 함수 재정의
var fn3 = function(){
    alert('fn3');
};

// fn3();

var fn3 = function(){
    alert('new fn3');
};

// fn3();

// 명시적 함수 재정의
// 호이스팅을 가지고 있는 명시적 함수는 미리 만들어져서
// 마지막에 재정의된 함수가 저장되있다.
// function fn4(){
//     alert('fn4');
// }
// fn4();

// function fn4(){
//     alert('new fn4');
// }

// fn4();

////////////////////////////////////////////////

// 매개변수, 반환값이 있는 함구 정의
//매개변수 선언시에는 var 키워드를 사용하지 않는다.

function add(num1, num2){
    return num1 + num2;
}

var result = add(10, 20);

console.log('10 + 20 = ', add(10, 20));


var hello = function(name, age){
    console.log('안녕하세요, 저는 ' + name + '입니다. 나이는 ' + age + '살 입니다.');
};

hello('손흥민', 30);
hello('손흥민', 30, 300, '안녕');   // 매개변수가 만항도 오류가 나지 않는다.
 

// 가변 매개변수 인자의 사용법
// function 은 기본적으로 arguments 배열을 가진다.
// arguments를 이용하면 가변 매개변수의 인자를 사용할 수 있다.
var sum = 0;
function sumAll(){
    for(let i = 0; i < arguments.length; i++){
        // console.log(i, arguments[i]);
        sum += arguments[i];
    }
    console.log('합 :', sum);
}

// sumAll(10, 30, 'String', false, {}, []);
sumAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


////////////////////////////////////
// return
// 1. 함수 종료
// 2. 값을 반환

// 함수 종료
function returnFn(){
    console.log('AAA');
    return; //함수 종료
    console.log('BBB');
}

returnFn();


//////////////////////////////////////////

// 콜백 함수 -> 매개변수로 전달 받은 함수

// 콜백함수를 받아서 10번 실행하는 함수

function callTenTimes(callBackFn){

    // callBackFn = function(){
    //     console.log('callback 함수 실행');
    // };

    for(let i = 0; i < 10; i++){
        callBackFn();
    }
}

var cbFn = function(){
    console.log('callback 함수 실행');
};

callTenTimes(cbFn);

////////////////////////////////////////////////////

// setInterval(함수(){};, 1000); : 일정 시간마다 함수를 반복해서 실행한다.
// setTimeout(함수(){};, 1000); : 일정 시간 후 함수를 한번 실행한다.

// clearInterval(id) : setInterval함수를 취소시킨다.
// cleartimeout(id) : setTimeout메서드를 제거시킨다.

// 1초마다 화면에 시간 출력
const id = setInterval(function(){
    document.body.innerHTML = '<h1>' + new Date() + '</h1>';
}, 1000);

// 15초 이후에 시간 출력을 멈추게 하는 기능
//clearInterVal(ID)
setTimeout(function(){
    clearInterval(id);
}, 1000 * 15);

///////////////////////////////////////

// javascript 문법을 적용한 문자열 생성
// eval() : 문자열을 자바스크립트 코드로 실행하는 함수

var jsStr = '';
jsStr += 'var num11 = 1000;';
jsStr += 'alert(num11);';

// eval(jsStr);

////////////////////////////////////////

// parseInt, parseFloat => 변환 가능한 부분까지 숫자를 변환해서 반환

// parseInt : String을 정수로 변환
// parseFloat : String을 유리수로 변환
var won = '10000원';
var dollar = '1.5$';
var percent = '10.5%';


console.log("-------------------------------------");

console.log('Number(won) :', Number(won));
console.log('Number(dollar) :', Number(dollar));

console.log('parseInt(won :', parseInt(won));
console.log('parseInt(dollar) :', parseInt(dollar));

console.log("-------------------------------------");

console.log('parseFloat(won :', parseFloat(won));
console.log('parseFloat(dollar) :', parseFloat(dollar));











