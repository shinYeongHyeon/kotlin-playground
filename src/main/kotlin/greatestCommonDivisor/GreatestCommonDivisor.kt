package greatestCommonDivisor

class GreatestCommonDivisor {
    fun exec(a: Int, b: Int): Int {
        if (a < 1 || b < 1) {
            throw IllegalArgumentException("Arguments must be bigger than 0")
        }

        return getFactor(a, b)
    }

    private fun getFactor(a: Int, b: Int): Int {
        var factor: Int = 1
        for (iterator: Int in 1..a) {
            if (isExactlyDividedByIterator(a, b, iterator)) {
                factor = iterator
            }
        }
        return factor
    }

    private fun isExactlyDividedByIterator(a: Int, b: Int, i: Int) = a % i == 0 && b % i == 0
}
