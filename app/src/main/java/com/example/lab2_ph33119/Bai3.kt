package com.example.lab2_ph33119


fun main(){
    println("Chương triình kiểm tra năm nhuận")
    var year = 0
    var s : String?
    do {
        println("Nhập năm: ")
        s = readLine()
        while (s == null || s.toInt()<0){
            println("Năm không hợp lệ, mời nhập lại năm: ")
            s = readLine()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            println("Năm $year là năm nhuận")
        } else {
            println("Năm $year không phải là năm nhuận")
        }
        println("Bạn có muốn tiếp tục không? (Y/N): ")
        s = readLine()
        if(s == "N" || s=="n")
            break;
    } while (true)
    println("Kết thúc")
}
class Bai3 {
}