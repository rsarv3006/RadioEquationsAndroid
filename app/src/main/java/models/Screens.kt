package models

import androidx.annotation.StringRes
import com.rjs_app_dev.radioequations_android.R

enum class RadioEquationsScreen(@StringRes val title: Int) {
    WELCOME(title = R.string.app_name),
    EQUATION(title = R.string.equation_screen),
    SETTINGS(title = R.string.settings_screen)
}
