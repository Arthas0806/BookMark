// 객체


// 수학 객체
// Math

var MaxNum = Math.max(10, 100, 23, 5);
var minNum = Math.min(100, -10, 8, 3);
var rNum = Math.random(); // 0 ~ 1 사이의 난수를 반환.
rNum *= 100;
rNum = Math.round(rNum); // == Math.floor(Math.random()*31);
var pi = Math.PI; // 원주율 상수 반환.

// document.write(MaxNum, '</br>');
// document.write(minNum, '</br>');
// document.write(rNum, '</br>');
// document.write(pi, '</br>');

// 배열 객체(Array Object)
// 1번 var 참조변수 = new Array();
// 참조변수[0] = 값1; 참조변수[1] = 값2; 참조변수[2] = 값3; ... 참조변수[n-1] = 값n;
// 2번 var 참조변수 = new Array(값1, 값2, 값3, 값4, ...값n);
// 3번 var 참조 변수 = [값1, 값2, 값3, ... 값n];

// 배열 메소드
/*
join(연결문자) - 연결문자 기분으로 1개의 문자형 데이터로 반환합니다.
reverse() - 데이터 순서를 거꾸로 바꾼 후 반환합니다.
sort() - 오름차순으로 정렬
slice(index1, index2) - 원하는 인덱스 구간만큼 잘라서 배열 객체로 가져옵니다. index2 전까지 출력
splice() - 지정 데이터를 삭제하고 그 구간에 새 데이터를 삽입할 수 있습니다. 
예시 : 객체.splice(2, 1, '출력', '완료'); 2번부터 1개를 삭제하고 2개를 넣는다.
concat() - 2개의 배열 객체를 하나로 연결
pop() - 마지막 인덱스에 저장된 데이터를 삭제
push(new data) - 배열 객체에 마지막 인덱스에 저장된 데이터를 삽입 
shift() - 첫번째 인덱스에 저장된 데이터를 삭제
unshift(new data) - 가장 앞의 인덱스에 새 데이터를 삽입
length - 총 데이터의 갯수를 반환
*/

// 문자열 객체
// 기본형 : var 참조 변수 = new String(문자형 데이터)
// var 참조 변수 = 문자형 데이터
// var t = 'hello javascript'; // 문자열 객체 생성

/*
CharAt(index) : 문자열에서 인덱스 번호에 해당하는 문자를 반환
indexOf('찾을 문자') : 문자열에서 왼쪽부터 찾을 문자와 일치하는 문자를 찾아 제일 먼저 일치하는 문자의 인덱스 번호를 반환합니다.
없으면 -1 반환
lastIndexOf('찾을 문자') : 오른쪽부터 문자와 일치하는 문자를 찾아 인덱스를 반환, 없으면 -1
match('찾을문자') : 왼쪽부터 찾는 문자가 있는지 찾아보고 없으면 null 반환
replace('바꿀문자', '새문자') : 제일 먼저 찾은 문자를 새문자로 교체
search("찾을 문자") : 제일먼저 일치하는 문자를 찾아 인덱스 번호를 반환
slice(a, b) : a개의 문자를 자르고 b번째 이후에 문자를 자른 후 나머지를 반환
여기서 -1 은 뒤에서 첫 번째를 의미
substring(a, b) : a인덱스부터 b 인덱스 이전 구간의 문자를 반환합니다.
여기서 -3은 인덱스 0을 가르킨다. ex) 8부터 10 
substr(a, 문자개수) : a 인덱스부터 지정한 문자 개수만큼 문자열을 반환
// var str = str.substr(3, 3) 인덱스 3부터 3개만큼 반환 
split('문자') : 지정한 문자를 기준으로 문자 데이터를 나눠서 배열에 저장해서 반환
toLowerCase() : 영문 대문자를 소문자로 반환
toUpperCase() : 영문 소문자를 대문자로 반환
length : 문자열에서 문자의 개수 반환
concat('새로운 문자') : 문자열에 새로운 문자열 결합
charCodeAt(index) : 해당 index 문자의 아스키 코드값을 반환
fromCharCode : 아스키 코드값에 해당하는 문자를 반환
trim() : 문자열 앞과 뒤에 공백삭제

*/

// 연습문제
// var userName = prompt('당신의 영문 이름은?', '');

// // 소문자로 받았을때 대문자로 변환
// var upperName = userName.toUpperCase();
// document.write(upperName, "<br>");

// var userNum = prompt('당신의 전화번호는?', '');
// var result = userNum.substring(0, userNum.length - 4) + '****';
// document.write(result, "<br>");

// 이메일 유효성 검사 코드
var userEmail = prompt('이메일을 적어주세요.', '');
var arrUrl = ['.co.kr', '.com', '.net', '.or.kr', 'go.kr'];

var check1 = false;
var check2 = false;

if(userEmail.indexOf('@') > 0){
    check1 = true;
}

for(let i = 0; i < arrUrl.length; i++){
    if(userEmail.indexOf(arrUrl[i]) > 0){
        check2 = true;
    }
}

if(check1 && check2){
    document.write(userEmail);
}else{
    alert('이메일 형식이 잘못됬습니다.');
    location.reload();
}




