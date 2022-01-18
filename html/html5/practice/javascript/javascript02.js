/*
    변수에서 정의 할 수 있는 타입
    문자여, 숫자, 불리언, 함수, 객체, undefined
*/

console.log('-------------------------------------');
var stringVar = 'String';
console.log(stringVar, typeof(stringVar));
var numberVar = 100;
console.log(numberVar, typeof(numberVar));
var booleanVar = false;
console.log(booleanVar, typeof(booleanVar));
var functionVar = function (){};
console.log(functionVar, typeof(functionVar));
var objectVar = {}; // 객체 생성 -> {} 중괄호 블록을 사용
console.log(objectVar, typeof(objectVar));
var objArrayVar = []; 
console.log(objArrayVar, typeof(objArrayVar));
var value;
console.log(value, typeof(value));
if(typeof(value) == 'undefined'){
    console.log('연산 불가');
}else{
    // 연산
}
console.log('-------------------------------------');


// 브라우저가 HTML 문서의 모든 내용을 메모리에 올리는과정이 끝날 때 발생하는 이벤트 등록
// window.onload = function(){
//     var html = document.body.innerHTML;
//     var text = document.body.innerText; 

//     console.log('innerHTML : ', html);
//     console.log('innerHTML : ', text);

//     var list = '<ul>';
//     list += '   <li>HTML5</li>';
//     list += '   <li>CSS3</li>';
//     list += '   <li>Javascript</li>';
//     list += '</ul>';

//     // document.body.innerHTML = list;
//     document.body.innerText = list;  // 그냥 텍스트만 출력
// };

var name = '손흥민';
var name = '이강인';
console.log('name :', name);

var name = 123;
console.log('name :', name);

name = false;
console.log('name :', name);

// confirm() 함수 : 사용자에서 true/false 확인하는 함수
// var check = confirm('주무시겟습니끼?');
// console.log('check : ', check); 
// if(check){
//     alert('잡니다.');
// }else{
//     alert('안잡니다.');
// }

// 문자열의 덧셈 : 문자열 + anytype => 문자열 + 문자열 = 문자열
// console.log('"100 + 10"', '100+10'); // 문자열 + 문자열 = 문자열
// console.log('"100" + 10', '100' + 10); // 문자열 + 정수 = 문자열
// console.log('100 + "10"', 100 + "10"); // 문자열 * 정수 = 정수
// console.log('100 + 10', 100 + 10);
// console.log('"100" + "10"', "100" + "10");

// console.log('"100" * 10', "100" * 10);



////////////////////////////////////////////////////
// prompt(string, string) => string
// var input = prompt('숫자를 입력하세요.');
// console.log('input:', input, typeof(input));

// Number() 함수
// var numberInput = Number(input);    // Number()숫자로 바꿔준다.
// console.log('numberInput', numberInput, typeof(numberInput)); 

// String() 함수
// var numberStr = String(123);        // String() 문자로 바꿔준다.
// console.log('numberStr', numberStr, typeof(numberStr));

// Boolean() 함수 5가지 경우를 제외하고 전부 true가 나온다.
console.log('---------------------------------------');
console.log(Boolean(0));
console.log(Boolean(10));
console.log(Boolean(NaN));
console.log(Boolean(''));
console.log(Boolean('abc'));
console.log(Boolean(null));
console.log(Boolean(undefined));

value = 0;

if(value){
    console.log('0의 논리값', 'true 입니다.');
} else{
    console.log('0의 논리값', 'false 입니다.');
}
 
// console.log(!!0); // 논리 부정 연산자 사용했을때 자동으로 형 변환이 된다.
// console.log(!NaN);

console.log('---------------------------------------');
// 비교연산 시 자동 형변환

console.log(" ''== false => ",'' == false);
// 타입일치 여부도 확인 후 결과 반환
console.log(" ''=== false => ",'' === false);

console.log("'' == 0 => ",'' == 0);
console.log("'' === 0 => ",'' === 0);

console.log('0 == false => ', 0 == false);
console.log('0 === false => ', 0 === false);


