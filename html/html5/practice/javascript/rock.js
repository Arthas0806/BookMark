document.write('<h1>가위 바위 보 맞추기 게임!!!</h1>');

var player = prompt('가위 바위 보!!!', '보');
var getNum;

switch(player){
    case '가위':
        getNum = 1;
        break;
    case '바위':
        getNum = 2;
        break;
    case '보':
        getNum = 3;
        break;
    default:
        alert('잘못 작성했습니다.');
        location.reload();
}

var computer = Math.ceil(Math.random() * 3); //celi 첫째 자리에서 무조건 올림.

document.write('컴퓨터 : ', computer, '<br>', ' 나 : ', player);


if(getNum == computer){
    document.write('<br>맞췃습니다!!!');
}else{
    document.write('<h1>까비~~~~</h1>');
}

