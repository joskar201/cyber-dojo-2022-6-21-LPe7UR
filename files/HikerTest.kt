// [X] See please-help.txt 

package hiker /*[X]*/

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe

class HikerTest /*[X]*/ : StringSpec() {

    init {
        "minimum value" {
            hiker.minimum(arrayOf(6, 9, 15, -2, 92, 11)) shouldBe -2
        }

        "Other example test" {
            "a" shouldNotBe "b"
        }
    }
}
