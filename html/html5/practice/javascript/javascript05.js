// 객체 생성 => {}

var obj = {};
console.log(typeof(obj));

//속성이 있는 객체 정의
var person = {
    // 속성 정의 => 속성 이름 : 속성 값(데이터: 자바스크립트에서 지원하는 타입의 데이터)
    name : '손흥민',    // 여러 개의 속성은 , 를 이용해서 추가
    age : 30,
    hello : function(){
        alert('안녕하세요. 저는 ' + this.name + '입니다. 나이는 ' + this.age + '입니다.');
    },
    like : ['축구', '게임', '음악']
};

// 객체의 속성 참조
console.log(person.name);
console.log(person.age);

// person.hello();

for(let i = 0; i < person.like.length; i++){
    console.log(person.like[i]);
}

console.log('--------------------------------------');

////////////////////////////////////////

// 객체에 동적으로 속성을 추가
var player = {};

console.log(player);

// 속성 추가
player.name = '손흥민';
player.team = "Tot";
player.number = 7;
player.play = function(){
    console.log(this.name + ' 이 앞으로 뛰어갑니다. 그리고 골을 넣습니다.')
}

player.play();


////////////////////////

// 객체를 저장하는 배열

// 학생들의 과목 점수를 저장하는 배열
var students = [];

// 학생멸 과목 점수들을 저장하는 객체를 생성 -> 배열에 추가
students.push({name: 'aaa', kor: 100, eng: 100, math: 100});
students.push({name: 'b', kor: 60, eng: 90, math: 76});
students.push({name: 'c', kor: 70, eng: 80, math: 54});
students.push({name: 'D', kor: 80, eng: 60, math: 33});
students.push({name: 'F', kor: 90, eng: 70, math: 26});
students.push({name: 'G', kor: 50, eng: 99, math: 77});
students.push({name: 'Q', kor: 70, eng: 57, math: 98});
students.push({name: 'S', kor: 80, eng: 35, math: 67});
students.push({name: 'W', kor: 40, eng: 78, math: 57});
students.push({name: 'Z', kor: 20, eng: 35, math: 88});

// 각 요소 (students 객체)에 메소드를 동적 추가
// 총점을 구해서 반환하는 메소드
for(let i = 0; i < students.length; i++){
    // 총점을 구해서 반환하는 메소드
    students[i].getSum = function(){
        return this.kor + this.eng + this.math;
    };
}


// 평균 점수를 구해서 반환하는 메소드
for(let i =0; i< students.length; i++){
    students[i].getAvg = function(){
        return this.getSum() / 3;
    };
}

console.log(students);
window.onload = function(){

    var newHtml = '';
    newHtml += '<table border = "1">';
    newHtml += '    <tr>';
    newHtml += '    <th>이름</th>';
    newHtml += '    <th>국어</th>';
    newHtml += '    <th>영어</th>';
    newHtml += '    <th>수학</th>';
    newHtml += '    <th>총점</th>';
    newHtml += '    <th>평균점수</th>';
    newHtml += '    </tr>';

    for(let i = 0; i < students.length; i++){
        newHtml += '    <tr>';
        newHtml += '        <td>' + students[i].name + '</td>';
        newHtml += '        <td>' + students[i].kor + '</td>';
        newHtml += '        <td>' + students[i].eng + '</td>';
        newHtml += '        <td>' + students[i].math + '</td>';
        newHtml += '        <td>' + students[i].getSum() + '</td>';
        newHtml += '        <td>' + students[i].getAvg() + '</td>';
        newHtml += '    </tr>';
    };
    

    newHtml += '</table>';

    document.body.innerHTML = newHtml;
}



console.log('--------------------------------------');




