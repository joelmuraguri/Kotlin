package polymorphism

interface BandaskiInfo{
    fun getInfo()
}

data class MealDetails(val title : String, val description : String) : BandaskiInfo {
    override fun getInfo() {
        println("\nFETCH MEAL DETAILS")
        println("Title : $title, Description : $description")
        repeat(50) {
            print("-")
        }
    }
}

data class Categories(val title : String) : BandaskiInfo{
    override fun getInfo() {
        println("\nFETCH A CATEGORY")
        println("title : $title")
        repeat(50) {
            print("-")
        }
    }

}
data class MealList(val meals  : List<Meal>) : BandaskiInfo{
    override fun getInfo() {
        println("\nFETCH MEAL LIST")
        println("meals : $meals")
        repeat(50) {
            print("-")
        }
    }
}
data class CategoriesList(val categories  : List<Categories>) : BandaskiInfo{
    override fun getInfo() {
        println("\nFETCH CATEGORIES LIST")
        println("categories : $categories")
        repeat(50) {
            print("-")
        }
    }

}
data class Meal(val title: String, val id : Int) : BandaskiInfo{
    override fun getInfo() {
        println("\nFETCH A MEAL")
        println("title : $title id :$id")
    }
}

fun main(){
    val details = MealDetails("Pilau Njeri", description = "hii ni pilau kienyeji")
    val category = Categories("Lunch")
    val meals = MealList(meals = listOf(Meal(title = "Githeri", id = 1), Meal(title = "Mhogo", id = 2), Meal(title = "Ugali", id = 3), Meal(title = "Fish", id = 4), Meal(title = "Pilau", id = 5)))
    val categories = CategoriesList(categories = listOf( Categories("breakfast"), Categories("seafood"), Categories("breakfast")))
    val meal = Meal("Chapati", 6)
    details.getInfo()
    category.getInfo()
    meals.getInfo()
    categories.getInfo()
    meal.getInfo()

}
