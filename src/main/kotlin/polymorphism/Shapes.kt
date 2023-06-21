package polymorphism

interface RectangleCalculator{
    fun calculateDimensions() : Double
}

interface Info{
    fun getInfo()
}

class Area(private val length : Double, private val width : Double) : RectangleCalculator, Info {
    override fun calculateDimensions(): Double {
        return length * width
    }

    override fun getInfo() {
        println("The dimensions are length of $length & width of $width")
        println("Area of Rectangle : ${calculateDimensions()}")
    }
}

class Perimeter(private val length: Double, private val width: Double) : RectangleCalculator, Info {
    override fun calculateDimensions(): Double {
        return (length+width)*2
    }

    override fun getInfo() {
        println("The dimensions are length of $length & width of $width")
        println("Perimeter of Rectangle : ${calculateDimensions()}")
    }
}

fun main(){
    val perimeter = Perimeter(2.0,4.0)
    val area = Area(2.0,4.0)
    perimeter.getInfo()
    area.getInfo()

}