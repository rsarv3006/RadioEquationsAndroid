package com.rjs_app_dev.radioequations_android

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.rjs_app_dev.radioequations_android.ui.theme.RadioEquationsAndroidTheme

@Composable
fun SettingsScreen() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
    ) {
        val context = LocalContext.current
        val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/hkfRLgizENk1Gji49")) }

        Button(onClick = { context.startActivity(intent) }) {
            Text(text = "Request New Equations")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SettingsScreenViewPreview() {
    RadioEquationsAndroidTheme {
        SettingsScreen()
    }
}