package com.example.intentandintentactivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.intentandintentactivity.ui.theme.IntentAndIntentActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IntentAndIntentActivityTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Button(modifier = Modifier.wrapContentSize(),
                        onClick = {
                            /*Intent(applicationContext, SecondActivity::class.java).also {
                                startActivity(it)
                            }*/
                            /*Intent(Intent.ACTION_MAIN).also {
                                it.`package` = "com.google.android.youtube"
                                try {
                                    startActivity(it)
                                } catch (e:ActivityNotFoundException){
                                    e.printStackTrace()
                                }

                            }*/

                            val intent = Intent(Intent.ACTION_SEND).apply {
                                type = "text/plain"
                                putExtra(Intent.EXTRA_EMAIL, "nk2921930@gmail.com")
                                putExtra(Intent.EXTRA_SUBJECT, "This is my subject")
                                putExtra(Intent.EXTRA_TEXT, "Hi How are you")
                            }

                            if (intent.resolveActivity(packageManager) !=null){
                                startActivity(intent)
                            }
                        }) {
                        Text(text = "Click me")
                    }
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IntentAndIntentActivityTheme {
        Greeting("Android")
    }
}