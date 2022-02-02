fun main(args: Array<String>) {
    var valid_shape = 6
    intro(x = valid_shape)
    while (valid_shape != 5) {
        var valid = valid(valid_shape)
        if (valid == 1){
            println("Please enter the length of the Rectangle: ")
            var length = readLine()!!.toInt()
            println("Please enter the width of the Rectangle: ")
            var width = readLine()!!.toInt()
            var area = rect(x = width, y = length)
            println("Area of the Rectangle is " + area)
        }
        else if (valid == 2){
            println("Please enter the base of the Triangle: ")
            var base = readLine()!!.toInt()
            println("Please enter the height of the Triangle: ")
            var height = readLine()!!.toInt()
            var area = tri(x = base, y = height)
            println("Area of the Triangle is " + area)
        }
        else if (valid == 3){
            println("Please enter the side of the Square: ")
            var side = readLine()!!.toInt()
            var area = square(x = side)
            println("Area of the Square is " + area)
        }
        else if (valid == 4){
            println("Please enter the radius of the circle: ")
            var radius = readLine()!!.toInt()
            var area = circle(x = radius)
            println("Area of the Circle is " + area)
        }
    }
    bye()
}
fun intro(x: Int): Int{
    println("This program will find the area of a shape for you.\n1. Rectangle\n2. Triangle\n3. Square\n4. Circle\n5. Quit")
    var x = readLine()!!.toInt()
    return x
}
fun valid(x: Int): Int{
        var y = x
        while ((y < 1) or (y > 5)) {
            println("This is not a valid selection")
            println("This program will find the area of a shape for you.\n1. Rectangle\n2. Triangle\n3. Square\n4. Circle\n5. Quit")
            y = readLine()!!.toInt()
        }
    return y
}
fun rect(x: Int, y: Int): Int{
    var rect = (x * y)
    return rect
}
fun tri(x: Int, y: Int): Int{
    var tri = (0.5 * x * y)
    return tri.toInt()
}
fun square(x: Int): Int{
    var square = x * x
    return square

}
fun circle(x: Int): Int{
    var pi = 3.14
    var circle = x.toFloat() * x.toFloat() * pi
    return circle.toInt()
}
fun bye(){
    println("Goodbye")
}