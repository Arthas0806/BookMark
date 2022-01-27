// getElementById() - id 값을 이용해 문서 객체(태그)를 선택하는 메서드입니다.

// var color = ['white', 'yellow', 'black', 'purple'];

// var i = 0;
// function changeColor(){

//     i++;
//     // i의 값이 4이상일때 실행
//     if(i >= color.length){
//         i = 0;
//     }

//     var bodytag = document.getElementById("bodyid");
//     bodytag.style.backgroundColor = color[i];

// }

// onclick - 클릭시 실행
// setAttribute('속성명', '새 값') : 선택한 태그의 지정한 속성을 새 값으로 바꿉니다.

// arguments 변수 : 매개변수 없이 함수 호출문에서 숫자형 데이터를 전달하는 예
function fn1(){
    var sum = arguments[0] + arguments[1] + arguments[2];

    document.write(sum);
}

fn1(8, 10, 3)






