

package com.example.sports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.sports.ui.SportsApp
import com.example.sports.ui.theme.SportsTheme
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass

/**
 * Activity for Sports app
 */
@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SportsTheme {
                val windowSize = calculateWindowSizeClass(activity = this)
                SportsApp(windowSize = windowSize.widthSizeClass)
            }
        }
    }


}
