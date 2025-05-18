open class Animal(val food: String, val location: String) {
    open fun makeNoise() {
        println("Животное звучит.")
    }
    open fun eat() {
        println("Животное ест.")
    }
    open fun sleep() {
        println("Животное спит.")
    }
}

class Dog(food: String, location: String, val breed: String, val color: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Собака лает.")
    }
    override fun eat() {
        println("Собака ест $food.")
    }
    override fun sleep() {
        println("Собака спит.")
    }
}

class Cat(food: String, location: String, val breed: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Кошка мяукает.")
    }
    override fun eat() {
        println("Кошка ест $food.")
    }
    override fun sleep() {
        println("Кошка спит.")
    }
}

class Horse(food: String, location: String, val speed: Int) : Animal(food, location) {
    override fun makeNoise() {
        println("Лошадь ржет.")
    }
    override fun eat() {
        println("Лошадь ест $food.")
    }
    override fun sleep() {
        println("Лошадь спит.")
    }
}

class Veterinarian {
    fun treatAnimal(animal: Animal) {
        println("Еда - ${animal.food}, местонахождение - ${animal.location}")
    }
}

fun main() {
    val dog = Dog("мясо", "дом","такса","черная")
    val cat = Cat("кошачий корм", "квартира","сиамская")
    val horse = Horse("сено", "конюшня", 50)

    val animals: List<Animal> = listOf(dog, cat, horse)

    val vet = Veterinarian()
    for (animal in animals) {
        animal.makeNoise()
        animal.eat()
        animal.sleep()
        vet.treatAnimal(animal)
        println()
    }
}
