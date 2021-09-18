package greatestCommonDivisor

class GreatestCommonDivisor {
    fun exec(a: Int, b: Int): Int {
        if (a < 1) {
            throw IllegalArgumentException("Arguments must be bigger than 0")
        }

        return 1;
    }
}