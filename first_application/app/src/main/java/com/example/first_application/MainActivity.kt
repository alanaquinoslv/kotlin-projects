package com.example.first_application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first_application.ui.theme.First_applicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            First_applicationTheme {
                App()
            }
        }
    }
}

@Composable
fun App() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    )
    {
        Text(
            text = "Calculadora IMC SPTECH",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                //  .border(3.dp, Color.Red)
                .fillMaxWidth(1f)
                .padding(
                    vertical = 30.dp
                )
        )
        var nome by remember {
            mutableStateOf(value = "")
        }
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = nome,
            onValueChange = {
                nome = it
            },
            label = {
                Text(text = "Nome")
            },
            placeholder = {
                Text(text = "Digite o seu nome completo")
            }
        )


        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            var altura by remember {
                mutableStateOf("")
            }
            OutlinedTextField(
                modifier = Modifier
                    .weight(.5f),
                value = altura,
                onValueChange = {
                    altura = it
                },
                label = {
                    Text(text = "Altura (cm)")
                },
                placeholder = {
                    Text(text = "Digite a sua altura")
                }
            )
            Spacer(modifier = Modifier.width(16.dp))
            var peso by remember {
                mutableStateOf("")
            }
            OutlinedTextField(
                modifier = Modifier
                    .weight(.5f),
                value = nome,
                onValueChange = {
                    peso = it
                },
                label = {
                    Text(text = "Peso (kg)")
                },
                placeholder = {
                    Text(text = "Digite o seu peso")
                }
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            modifier = Modifier.align(Alignment.End),
            onClick = { /*TODO*/ }) {
            Text(text = "Calcular")
        }
        var isBoxOpen by remember {
            mutableStateOf(false)
        }
        Text(
            text = if (isBoxOpen)
                "Esconder resultado" else "Ver resultado",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clickable {
                    isBoxOpen = !isBoxOpen
                }
        )
        if (isBoxOpen) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(
                        Color.Green,
                        RoundedCornerShape(10.dp)
                    )

            ) {
                Text(
                    text = "Aluno da silva, seu IMC é 22.40",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    First_applicationTheme {
        App()
    }
}