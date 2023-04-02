fun calculateProfit(
    numberOfShares: Int, 
    purchasePricePerShare: Double, 
    purchaseCommissionPaid: Double, 
    salePricePerShare: Double, 
    saleCommissionPaid: Double
): Double {
    val profit = (numberOfShares * salePricePerShare - saleCommissionPaid) 
                    - (numberOfShares * purchasePricePerShare + purchaseCommissionPaid)
    return profit
}

fun main() {
    println("Enter the necessary data:")
    print("Number of shares: ")
    val numberOfShares = readLine()?.toInt() ?: 0

    print("Purchase price per share: ")
    val purchasePricePerShare = readLine()?.toDouble() ?: 0.0

    print("Purchase commission paid: ")
    val purchaseCommissionPaid = readLine()?.toDouble() ?: 0.0

    print("Sale price per share: ")
    val salePricePerShare = readLine()?.toDouble() ?: 0.0

    print("Sale commission paid: ")
    val saleCommissionPaid = readLine()?.toDouble() ?: 0.0

    val profit = calculateProfit(numberOfShares, purchasePricePerShare, purchaseCommissionPaid, salePricePerShare, saleCommissionPaid)

    if (profit > 0) {
        println("You made a profit of $$profit.")
    } else if (profit < 0) {
        println("You suffered a loss of $$profit.")
    } else {
        println("You broke even.")
    }
}
