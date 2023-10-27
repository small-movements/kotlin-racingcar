import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PersonTest : StringSpec({
    "Person 객체 테스트" {
        val person = Person("taewoo", 26, "stitch")
        person.name shouldBe "taewoo"
        person.age shouldBe 26
        person.nickname shouldBe "stitch"
        person.nickname = null
        person.nickname shouldBe null
    }

    "Person 객체 비교 테스트" {
        val person1 = Person("taewoo", 26, "stitch")
        val person2 = Person("taewoo", 26, "stitch")
        person1 shouldBe person2
    }
})