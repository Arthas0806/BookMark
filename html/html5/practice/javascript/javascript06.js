// 생성자 함수 -> new 키워드를 이용해서 객체를 만들어주는 함수
// 함수의 이름은 대문자로 시작

// function Student(){

// }

// // 객체 생성
// var st = new Student();
// console.log(typeof(st));

function Student(name, kor, eng, math){
    // 객체의 속성 정의, 초기화
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;

    // // 총점을 구하는 메소드
    // this.getSum = function(){
    //     return this.kor + this.eng + this.math;

    // }

    // // 평균점수를 구하는 메소드
    // this.getAvg = function(){
    //     return this.getSum() / 3;
    // }
    // // html 문자열을 반환하는 메소드
    // this.makeHtml = function(){
    //     var rowHtml = '';
    //     rowHtml += '    <tr>\n';
    //     rowHtml += '        <td>' + this.name + '</td>\n';
    //     rowHtml += '        <td>' + this.kor + '</td>\n';
    //     rowHtml += '        <td>' + this.eng + '</td>\n';
    //     rowHtml += '        <td>' + this.math + '</td>\n';
    //     rowHtml += '        <td>' + this.getSum() + '</td>\n';
    //     rowHtml += '        <td>' + this.getAvg() + '</td>\n';
    //     rowHtml += '    </tr>\n';

    //     return rowHtml;
    // }
}

// prototype을 이용해서 공통 메소드를 정의
Student.prototype.getSum = function(){
    return this.kor + this.eng + this.math;
}

Student.prototype.getAvg = function(){
    return this.getSum() / 3;
}

Student.prototype.makeHtml = function(){
    var rowHtml = '';
        rowHtml += '    <tr>\n';
        rowHtml += '        <td>' + this.name + '</td>\n';
        rowHtml += '        <td>' + this.kor + '</td>\n';
        rowHtml += '        <td>' + this.eng + '</td>\n';
        rowHtml += '        <td>' + this.math + '</td>\n';
        rowHtml += '        <td>' + this.getSum() + '</td>\n';
        rowHtml += '        <td>' + this.getAvg() + '</td>\n';
        rowHtml += '    </tr>\n';

        return rowHtml;
}

var st = new Student('a', 100, 90, 80);
console.log(st);
console.log(st.makeHtml());

window.onload = function(){
    var students = [];
    // 요소들을 입력
    students.push(new Student('a', 50, 90, 80));
    students.push(new Student('b', 40, 90, 20));
    students.push(new Student('c', 60, 10, 20));
    students.push(new Student('d', 70, 50, 40));
    students.push(new Student('e', 80, 70, 20));
    students.push(new Student('f', 90, 20, 30));
    students.push(new Student('g', 30, 50, 50));
    students.push(new Student('h', 50, 30, 30));
    students.push(new Student('i', 20, 50, 50));
    students.push(new Student('j', 60, 30, 70));

    // 전체 리스트 출력

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

    // 학생들의 정보를 출력
    for(let i = 0; i < students.length; i++){
        newHtml += students[i].makeHtml();
    }

    newHtml += '</table>';

    // 웹 문서 body태그 안에 위에서 정의한 html 문자열을 적용
    document.body.innerHTML = newHtml;

}