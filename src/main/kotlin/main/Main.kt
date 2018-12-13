package main

data class Vector(var x: Int, var y: Int) {
    operator fun plus(vector: Vector) = Vector(x + vector.x, y + vector.y)

    operator fun times(factor: Int) = Vector(x * factor, y * factor)
}

fun main(args: Array<String>) {
    val v = Vector(1, 1)

    println(v + Vector(3, 0))
    println(v * 8)
}