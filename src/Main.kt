// https://www.codewars.com/kata/566fc12495810954b1000030/train/kotlin

fun nbDig(n: Int, d: Int): Int = (0..n).map { it * it }.joinToString(separator = "").count { (it - '0') == d }

fun main() {
    println(nbDig(5750, 0))
    println(nbDig(11011, 2))
}