fun main() {

    //Create a list of integers, transform it into a list of strings, and print them one by one

    var listOfNumbers = listOf(1,2,3,4,5,6,7,8,9,10)

    listOfNumbers.map{it -> it.toString()}.forEach{it -> println("$it")}
}

