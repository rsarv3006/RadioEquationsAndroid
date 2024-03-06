package models

import androidx.annotation.StringRes
import com.example.radioequations_android.R

enum class RadioEquationsScreen(@StringRes val title: Int) {
    WELCOME(title = R.string.app_name),
    EQUATION(title = R.string.equation_screen)
}
