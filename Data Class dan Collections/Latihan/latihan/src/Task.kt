/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {

    // TODO 1
    val vehicle = mapOf<String, String>(
        "Type" to "Motorcycle",
        "Maximal Speed" to "230Km/s",
        "Maximal Tank" to "10Ltr"
    )

    // TODO 2
    val type  = vehicle.getValue("Type")
    val maxSpeed = vehicle.getValue("Maximal Speed")
    val maxTank = vehicle.getValue("Maximal Tank")


    // TODO 3
    println("Vehicle")

    for (key in vehicle.keys){
        println("$key: ${vehicle[key]}")
    }

}