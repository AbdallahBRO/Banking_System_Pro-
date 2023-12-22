fun main() {
    login()
    login@ while (true) {
        println("what you want do Next?\n 1_End \n 2_login again")
        var whatDo = readln()
        when (whatDo) {
            "1" -> {
                login()
            }
            "2" -> {
                break
            }
            else -> {
                println("you must select 1/2")
                continue@login
            }
        }
    }
}
