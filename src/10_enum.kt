enum class PaymentStatus(val label : String) {
    UNPAID("미지급") {
        override fun isPayable(): Boolean = true
    },
    PAID("지급 완료"){
        override fun isPayable(): Boolean = false
     },
    FAILED("지급 실패"){
        override fun isPayable(): Boolean = false
    },
    REFUNDED("환불") {
        override fun isPayable(): Boolean = false
    };

    // 함수를 정의할 때 이넘 끝에 세미콜론을 찍어줘야함

    abstract fun isPayable() : Boolean
}

interface Payable {
    fun isPayable() : Boolean
}

fun main() {
    //println("${PaymentStatus.UNPAID.label}")
    if(PaymentStatus.UNPAID.isPayable()) {
        println("결제가능상태")
    }

    val paymentStatus = PaymentStatus.valueOf("PAID")

    for (status in PaymentStatus.values()) {
        println("[${status.name}] (${status.label}) : ${status.ordinal}")
    }
}