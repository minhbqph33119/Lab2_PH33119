package com.example.lab2_ph33119


fun main(){
    println("Giải phương trình bậc 1: ax + b = 0")
    var a = 0.0
    var b = 0.0
    println("Nhập a: ")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b: ")
    s = readLine()
    if (s != null) b = s.toDouble()
    println("Phương trình ${a}x + $b = 0")
    if (a == 0.0 && b == 0.0) {
        println("Có vô số nghiệm")
    } else if(a == 0.0 && b != 0.0) {
        println("Vô nghiệm")
    } else {
        println("Có nghiệm x = ${-b/a}")
    }



}
class Bai1 {
}