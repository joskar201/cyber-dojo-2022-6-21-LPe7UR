// [X] See please-help.txt 

package hiker /*[X]*/

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe

class HikerTest /*[X]*/ : StringSpec() {

    init {
        "minimum value" {
            hiker.minimum(arrayOf(6, 9, 15, -2, 92, 11)) shouldBe -2.toDouble()
            hiker.minimum(arrayOf(6, 9, 15, 3, 92, 11)) shouldBe 3.toDouble()
        }
        
        "maximum value" {
            hiker.maximum(arrayOf(6, 9, 15, -2, 92, 11)) shouldBe 92.toDouble()
            hiker.maximum(arrayOf(6, 9, 15, -2, 98, 11)) shouldBe 98.toDouble()
        }
        
        "number of elements in the sequence" {
            hiker.count(arrayOf(6, 9, 15, -2, 92, 11)) shouldBe 6
            hiker.count(arrayOf(6, 9, 15, -2, 92, 11, 23)) shouldBe 7
        }
        
        "average value" {
            hiker.average(arrayOf(6, 9, 15, -2, 92, 11)) shouldBe 21.833333.toFloat()
            hiker.average(arrayOf(3, 3, 3, 3, 3, 3)) shouldBe 3.toFloat()
        }
    }
}
