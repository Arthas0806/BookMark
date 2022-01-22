// Rectangle
// function Rectangle(w, h){
//     // this.width = width;
//     // this.height = height;

//     var width = w;
//     var height = h;

//     this.getArea = function(){
//         return width * height;
//     }
// }

// Rectangle.prototype.getArea = function(){
//     return this.width * this.height;
// }

// var rec = new Rectangle(5, 7);

// rec.width = -10;

// console.log(rec.getArea());

///////////////////////////

// var primitiveNumber = 100;
// var objectNumber = new Number(100);

// console.log('primitiveNumber', typeof(primitiveNumber), primitiveNumber);
// console.log('objectNumber', typeof(objectNumber), objectNumber.toString()); 

// // 기본 객체 생성

// var obj1 = {};
// var obj2 = new Object();

// console.log(typeof(obj1));
// console.log(typeof(obj2));


// var person = {
//     name : '손흥민',
//     age : 30,
//     toString : function(){
//         return this.name + ':' + this.age;
//     }
// };

// alert(person);
// console.log('person' ,person);

// window.location.href = "http://www.naver.com"; // 참조 주소(href)의 속성을 바꿨다.

// 날짜정보를 제공하는 Date 객체
// var t = new Date();

// // 특정날짜를 알아보는법

// var t1 = new Date('2002/5/31');
// var t2 = new Date(2000,4,31);

// // Date 메서드를 활용
// // Get 날짜 정보를 가져올때, Set은 날짜 정보를 수정할때

// var day = t.getDate(); //일 정보를 가져온다.
// day = t.getTime(); // 1970년 1월 1일부터 경과된 시간을 밀리초로 표기함.


