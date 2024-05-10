package com.example.lab2_ph33119


fun main(){
    var list:ArrayList<SinhVien> = ArrayList();
    //Thêm
    var sv1: SinhVien = SinhVien("minh","PH33119",8.9,true,20)
    var sv2: SinhVien = SinhVien("quynh anh","PH57484",9.9,true,19)
    var sv3: SinhVien = SinhVien("manh","PH16192",7.5,true,32)
    var sv4: SinhVien = SinhVien("phu","PH00000",3.9,false,20)
    list.add(sv1)
    list.add(sv2)
    list.add(sv3)
    list.add(sv4)
    //Xóa
    list.remove(sv2)
    //Sửa
    list[0]=(SinhVien("minh bùi","PH22024",10.0,true,21))
    for (i in 0 until list.size){
        println("Sinh viên thứ $i")
        println(list[i].toString())
        println("---------------------------------------")
    }


}

class SinhVien {
    private var tenSv : String? = null
    private var mSSV : String? = null
    private var diemTB : Double? = null
    private var daTotNghiep : Boolean? = null
    private var tuoi : Int? = null

    constructor(tenSv: String?, mSSV: String?, diemTB: Double?, daTotNghiep: Boolean?, tuoi: Int?) {
        this.tenSv = tenSv
        this.mSSV = mSSV
        this.diemTB = diemTB
        this.daTotNghiep = daTotNghiep
        this.tuoi = tuoi
    }

    public fun getTenSv() : String?{
        return tenSv
    }

    override fun toString(): String {
        return "Tên sinh viên: $tenSv | Mã số sinh viên: $mSSV | Điểm trung bình: $diemTB | Đã tốt nghiệp: $daTotNghiep | Tuổi: $tuoi"
    }


}