fun main() {
    var number: Int? = 0
    var i = 0
    var sum: Int = 0
    while (i < 2){
        val value = requestUserInput()

        if (value == "Q") {
            println("Termination")
            break
        }

        number = convertToInt(value)
        if (number != null) {
            println("You entered the number $number")
            sum += number
            i++
        } else {
            println("Invalid input. Please enter a valid number or type Q to terminate the application.")
        }        
    }
    println("The sum of the numbers are $sum")
    
}

fun requestUserInput() : String? {
    while (true) {

        print("Enter a number (or press Q to terminate): ")
        val value = readLine()
        
        if (!value.isNullOrEmpty()) {
            return value
        } else {
            println("Input can not be empty. Please try again.")
        }
    }

}

fun convertToInt(value: String?) : Int? {
    return value?.toIntOrNull()
}