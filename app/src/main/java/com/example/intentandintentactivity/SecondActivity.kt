package com.example.intentandintentactivity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.intentandintentactivity.ui.theme.IntentAndIntentActivityTheme

class SecondActivity:ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            enableEdgeToEdge()
            IntentAndIntentActivityTheme {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(WindowInsets.systemBars.asPaddingValues())) {
                    Text(text = "Second Activity", modifier = Modifier.wrapContentSize(), color = Color.Black,
                        fontSize = 20.sp)
                    text(text = "Second Activity text")
                }

            }
        }


    }

    @Composable
    fun text(text:String){
        Text(text = text,color = Color.Black, modifier = Modifier.wrapContentSize(), fontSize = 20.sp)
    }
}