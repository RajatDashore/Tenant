package com.example.tenant


import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.remember as remember1


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


            //Layout();
            // ActionBarForTop()
            Column(Modifier.padding(10.dp)) {
                CardLayout()
                EditText()
                ShowButton()
            }

        }

    }

    @Preview
    @Composable
    private fun EditText() {
        var textFieldValue by remember1 {
            mutableStateOf(TextFieldValue(""))
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(0.dp,5.dp,0.dp,0.dp)
                .background(Color.White)
        ) {
            TextField(
                value = textFieldValue,
                onValueChange = {
                    textFieldValue = it
                },
                placeholder = {Text(text = "Enter your name")},
                label = {Text(text = "Name")},
                maxLines = 1, modifier = Modifier.padding(20.dp, 0.dp),
                leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null)}
            )
        }

    }

    @Preview
    @Composable
    private fun CardLayout() {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(270.dp),
            border = BorderStroke(1.dp, Color.Cyan),
            elevation = CardDefaults.cardElevation(5.dp)
        ) {
            Column() {
                Image(
                    painter = painterResource(id = R.drawable.svcelogo),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                        .clip(RoundedCornerShape(30.dp)),
                    alignment = Alignment.Center,

                    )
            }
        }
    }

    @Preview
    @Composable
    private fun ShowButton() {
        Box(contentAlignment = Alignment.TopCenter) {
            val context = LocalContext.current
            Button(
                onClick = {
                    Toast.makeText(context, "Hello", Toast.LENGTH_LONG).show()
                }, modifier = Modifier
                    .fillMaxWidth(0.3f)
                    .height(40.dp)
                    .align(Alignment.CenterEnd)
            ) {
                Text(text = "Click me", textAlign = TextAlign.Center)

            }
        }
    }
}


@Composable
private fun Layout() {
    Column(
        modifier = Modifier
            .background(Color.Green)
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
    ) {

        for (i in 1..10) {
            Text(
                text = "Rajat",
                modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 0.dp),
                fontSize = 15.sp
            )
        }
    }
}









