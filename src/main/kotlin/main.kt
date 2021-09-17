fun main() {
    val sum = 10100
    val purchase = 100
    val userIsMusiclover = true
    var discount = if (sum >= 10001) {
        purchase * 0.05
    } else if (sum >= 1001) {
        100.0
    } else {
        0.0
    }
    var sumDiscount = discount
    if(userIsMusiclover) sumDiscount = (purchase - discount) * 0.01 + discount
    println("Сумма скидки: $sumDiscount")
}