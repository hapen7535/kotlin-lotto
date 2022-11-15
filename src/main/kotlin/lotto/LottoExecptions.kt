package lotto

import javax.swing.JOptionPane

class LottoExecptions {

    fun getInputLottoPriceException(input : String) : Boolean{
        if(input.toIntOrNull() is Int){
            return true
        }
        throw IllegalArgumentException(JOptionPane.ERROR_MESSAGE.toString() + LOTTO_PURCHASE_TYPE_ERROR)
    }


    companion object{
        const val LOTTO_SIZE_ERROR = "로또 번호는 총 6개여야 합니다"
        const val LOTTO_RANGE_ERROR = "로또 번호는 1부터 45 사이의 숫자여야 합니다"
        const val LOTTO_DUPLICATE_ERROR = "로또 번호는 서로 중복되는 숫자가 아니어야 합니다"

        const val LOTTO_NUM_ERROR = "로또 번호는 숫자여야 합니다"
        const val LOTTO_PURCHASE_TYPE_ERROR ="로또 구입 금액은 숫자로 입력해주세요"
        const val LOTTO_PURCHASE_ERROR = "로또는 1,000원 단위로 구입할 수 있습니다"

        const val LOTTO_WINNUM_COMMA_ERROR = "당첨 번호는 쉼표로 구분될 수 있도록 입력해주세요"
        const val LOTTO_WINNUM_TYPE_ERROR = "당첨 번호는 숫자만 입력해주세요"

        const val BONUS_TYPE_ERROR = "보너스 번호는 숫자여야 합니다"
        const val BONUS_LENGTH_ERROR = "보너스 번호는 1개만 입력할 수 있습니다"
        const val BONUS_DUPLICATE_WINNUM = "보너스 번호는 6개의 당첨 번호와 중복될 수 없습니다"
    }

}