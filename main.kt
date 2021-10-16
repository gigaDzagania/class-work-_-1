//                       დავალება N1

//fun main() {
//
//    var f1 = Point()
//    f1.x = 5
//    f1.y = 7
//    println(f1)
//    println(f1 == f1)
// }
//
//class Point(){
//    var x = 0
//    var y = 0
//    override fun toString(): String {
//        return "$x , $y"
//    }
//    override fun equals(other: Any?): Boolean {
//        return x == y
//    }
//}




//                      დავალება N2

//fun main(){
//
//    var f1 = Wiladebi()
//    f1.mricxveli = 4.0
//    f1.mnishvneli = 6.0
//
//    var f2 = Wiladebi()
//    f1.mricxveli = 2.0
//    f2.mnishvneli = 8.0
//
////              წილადების გამოკლება
//    println(f1.gamokleba(x = 4.0, y = 2.0, a = 6.0, b = 8.0))
//
////               წილადის გაყოფა
//    println(f1.gayofa(4.0, 2.0, 6.0, 8.0))
//
//}
//
//
//class Wiladebi() {
//
//    var mricxveli: Double = 0.0
//    var mnishvneli: Double = 0.0
//
//    fun print_wiladebi() {
//        println("${this.mricxveli} / ${this.mnishvneli}")
//    }
//
//    override fun toString(): String {
//        return "$mricxveli / $mnishvneli"
//    }
//
//    //              წილადების გამოკლება
////                   x/a   -  y/b
//    fun gamokleba(x: Double, y: Double, a: Double, b: Double): String {
//        if (a == b) {
//            return "${x - y} / $a"
//        } else {
//            return "${x * b - y * a} / ${a * b}"
//        }
//    }
//
//    //                 წილადების გაყოფა
////                  x/a   /   y/b
//    fun gayofa(x: Double, y: Double, a: Double, b: Double): String {
//        return "${x * b} / ${y * a}"
//    }
//}


