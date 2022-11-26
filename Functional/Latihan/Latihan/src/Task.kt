/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {
    val kotlin = "Kotlin".getFirstAndLast()
    val dicoding = "Dicoding".getFirstAndLast()

    val kotlinFirst = kotlin["first"]
    val kotlinLast = kotlin["last"]

    val dicodingFirst = dicoding["first"]
    val dicodingLast = dicoding["last"]

    println("First char Kotlin is $kotlinFirst and $kotlinLast for second letter")

    println("First char Dicoding is $dicodingFirst and $dicodingLast for second letter")

}

// TODO\
fun String.getFirstAndLast(): Map<String, Char>{
    return mapOf(
        "first" to this.first(),
        "last" to this.last()
    )
}