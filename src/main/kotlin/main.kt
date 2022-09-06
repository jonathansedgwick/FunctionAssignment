fun main() {
        var choice = 0
        var length = 0.0
        var width = 0.0
        var height = 0.0
        var radius = 0.0
    do {
        println("1) Calculate a rectangle's area\n" +
                "2) Calculate a triangle's area\n" +
                "3) Calculate a circle's area\n" +
                "4) Calculate a semicircle's area\n" +
                "5) Exit")
        print("Enter a number: ")
            choice = readln()!!.toInt()
        println("--------------------")
        if (choice == 1) {
            print("Enter length: ")
            length = readln()!!.toDouble()
            print("Enter width: ")
            width = readln()!!.toDouble()
            println("Area is ${square(length, width)}")
        }
        else if (choice == 2) {
            print("Enter length: ")
            length = readln()!!.toDouble()
            print("Enter height: ")
            height = readln()!!.toDouble()
            println("Area is ${triangle(length, height)}")
        }
        else if (choice == 3) {
            print("Enter radius: ")
            radius = readln()!!.toDouble()
            println("Area is ${circle(radius)}")
        }
        else if (choice == 4) {
            print("Enter radius: ")
            radius = readln()!!.toDouble()
            println("Area is ${semicircle(radius)}")
        }
        else if (choice == 5)
            println("Goodbye")
        else
            println("Enter a valid number")


    println("--------------------")
    } while (choice != 5)
}

fun square(length: Double, width: Double): Double {
    return length * width
}

fun triangle(length: Double, height: Double): Double {
    return (length * height) / 2.0
}

fun circle(radius: Double): Double {
    return (radius * radius) * Math.PI
}

fun semicircle(radius: Double): Double {
    return circle(radius) / 2.0
}