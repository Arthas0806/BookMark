// 사용자에게 숫자를 입력받아 양수, 0, 음수를 구분하는 프로그램
var input = prompt('숫자를 입력하세요.', '10'); // prompt로 받는다.
var numberInput = Number(input); // 문자열을 변환한다.

if(numberInput > 0){
    // 양수
    console.log('양수입니다 :', numberInput);
}else if(numberInput == 0){
    // 0
    console.log('0입니다 :', numberInput);
}else if(numberInput < 0){
    // 음수
    console.log('음수입니다 :', numberInput);
}else{
    // NaN
    console.log(numberInput);
}


// 사용자에게 숫자를 입력받아 홀수와 짝수를 구분하는 프로그램

var input = prompt('숫자를 입력하세요.', '7'); // prompt로 받는다.
var numberInput = Number(input); // 문자열을 변환한다.

if(numberInput % 2 == 0){
    // 짝수
    console.log("짝수입니다.", numberInput);
}else if(numberInput % 2 == 1){
    // 홀수
    console.log("홀수입니다.", numberInput);
}else{
    // NaN
    console.log(numberInput);
}

var msg = (numberInput > 0) ? '양수' : (numberInput < 0)? '음수' : '0';
console.log('입력된 숫자는 ', msg);
console.log('입력된 숫자는 ', (numberInput > 0) ? '양수' : (numberInput < 0) ? '음수' : '0' );