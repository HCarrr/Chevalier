import java.util.Scanner

fun tampilMenu(){
    println("------------ Hitung Luas Bangun Ruang ------------")
    println("1. Persegi")
    println("2. Persegi Panjang")
    println("3. Segitiga")
    println("0. Exit")
}

fun hitungPersegi(sisi: Int) {
    val luas = sisi * sisi
    println("Hasil Luas Persegi: $luas")
}

fun hitungPersegiPanjang(p: Int, l: Int, t: Int) {
    val luas = p * l * t
    println("Hasil Luas Persegi Panjang: $luas")
}

fun hitungSegitiga(a: Double, t: Double) {
    val luas = (a * t) / 2
    println("Hasil Luas Segitiga: $luas")
}

fun main() {
    val sc = Scanner(System.`in`)
    var pilih: Int

    do {
        tampilMenu()
        print("Pilih Menu: ")
        pilih = sc.nextInt()

        when (pilih) {
            1 -> {
                print("Masukkan panjang sisi: ")
                val sisi = sc.nextInt()
                hitungPersegi(sisi)
            }
            2 -> {
                print("Masukkan panjang: ")
                val p = sc.nextInt()
                print("Masukkan lebar: ")
                val l = sc.nextInt()
                print("Masukkan tinggi: ")
                val t = sc.nextInt()
                hitungPersegiPanjang(p, l, t)
            }
            3 -> {
                print("Masukkan alas: ")
                val a = sc.nextDouble()
                print("Masukkan tinggi: ")
                val t = sc.nextDouble()
                hitungSegitiga(a, t)
            }
            0 -> println("Program keluar. Terima kasih!")
            else -> println("Pilihan tidak valid. Coba lagi.")
        }

        println()
    } while (pilih != 0)
}
