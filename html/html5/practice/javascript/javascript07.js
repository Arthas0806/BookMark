// Rectangle
function Rectangle(w, h){
    // this.width = width;
    // this.height = height;

    var width = w;
    var height = h;

    this.getArea = function(){
        return width * height;
    }
}

// Rectangle.prototype.getArea = function(){
//     return this.width * this.height;
// }

var rec = new Rectangle(5, 7);

rec.width = -10;

console.log(rec.getArea());