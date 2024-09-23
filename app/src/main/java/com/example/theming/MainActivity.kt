package com.example.theming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.theming.ui.theme.ThemingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThemingTheme {
                Surface(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    MyApp()
                }
            }
        }
    }
}


@Composable
fun MyApp() {
    Column()
    {
    
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ThemingTheme {
        MyApp()
    }
}