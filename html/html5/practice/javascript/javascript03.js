//삼항 연산자
// (논리값) ? 논리값이 true 일때 실행 할 문장 : 논리값이 false 일때 실행할 문장


// 짧은 조건문 (논리값) || 논리값이 false 일때만 실행할 문장
// 논리 연산자가 가지고 있는 특성을 조건문으로 사용


// var input = prompt('0을 제외한 숫자 입력하세요.');
// var numberInput = Number(input);

// numberInput = numberInput || 100;   // 100으로 치환해준다. 

// console.log('입력 값 => ', numberInput);

// true || alert('실행될까요..A');
// false || alert('실행될까요..B');

// 논리합 연산자
// (불 표현식) || (거짓일때 실행할 문장)
// (불 표현식) && (참 일때 실행할 문장)

//배열 : 많은 변수를 묶음으로 처리할 수 있는 객체
// 요소 타입의 제한이 없다! -> 모든 타입의 데이터가 요소가 될 수 있다!

var array = []; // 배열 생성 : []

array = [1, 4, 8, 10, 77, 34] // 숫자데이터 들을 요소로 가지는 배열

console.log('---------------------------------');
console.log(array);

array = [100, '손흥민', false, function(){}, {}, [1, 77]];
console.log(array);

// 배열의 요소 참조
console.log('array[1] : ', array[1]);

console.log('---------------------------------');
// 배열 => 인덱스값을 이용해서 반복문 활용 -> 알괄 처리
for(let i = 0; i < array.length; i++) {
    console.log(i, array[i]);
}

///////////////////////////////////////
var num = 0;
while(num < 5){
    num ++; // 탈출을 위한 증가식
}

while(true){
    // 무한반복 시에는 탈출할수 있는 코드를 심어야 한다.
    // 탈출코드 : break;

    if(num == 10){
        break;
    }

    num++;

}

console.log('--------------------------------------');
for(let item in array){
    console.log(item, typeof(item), array[item]);
} // 0부터 마지막까지 참조하는 방식

for(let i = 0; i < 9; i++){
    let str = '';
    for(let j = 0; j < i+1; j++){
        str += '*';
    }
    console.log(str);
}


/////////////////////////////////////
console.log('continue 실행 예제');
for(let i = 1; i < 11; i++){

    if(i % 2 == 1){
        continue;
    }
    
    console.log(i);
}

