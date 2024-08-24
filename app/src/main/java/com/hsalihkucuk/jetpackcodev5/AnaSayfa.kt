package com.hsalihkucuk.jetpackcodev5

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hsalihkucuk.jetpackcodev5.ui.theme.BgColor
import com.hsalihkucuk.jetpackcodev5.ui.theme.OperatorBtnColor

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AnaSayfa(){
    var sayi1 = remember  {mutableStateOf(0)}
    var sayi2 = remember  {mutableStateOf(0)}
    var sonucText = remember  {mutableStateOf("0")}
    var operator = remember  {mutableStateOf(' ')}
    var sayiState = remember  {mutableStateOf(false)}

    fun say(sayi : Int){
        if (!sayiState.value){
            sayi1.value = (sayi1.value * 10) + sayi
            sonucText.value = sayi1.value.toString()
        }
        else {
            sayi2.value = (sayi2.value * 10) + sayi
            sonucText.value = sayi2.value.toString()
        }
    }

    Scaffold(topBar = { TopAppBar(title = { Text(text = "Hesap Makinesi") }) }) { paddingValues ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .background(color = BgColor), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Box(Modifier.padding(10.dp)) {
                    Text(text = sonucText.value, fontSize = 52.sp, color = Color.White)
                }
            }
            Row(modifier = Modifier
                .fillMaxWidth()) {
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(Color.Gray)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {
                            sayi1.value = 0
                            sayi2.value = 0
                            sayiState.value = false
                            sonucText.value = "0"
                            operator.value = ' '
                        },contentAlignment = Alignment.Center) {
                    Text(text = "C", fontSize = 48.sp, color = Color.Black)
                }
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(Color.Gray)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {

                        },contentAlignment = Alignment.Center) {
                    Text(text = "+/-", fontSize = 48.sp, color = Color.Black)
                }
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(Color.Gray)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {
                            operator.value = '%'
                        },contentAlignment = Alignment.Center) {
                    Text(text = "%", fontSize = 48.sp, color = Color.Black)
                }
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(color = OperatorBtnColor)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {
                            operator.value = '÷'
                        },contentAlignment = Alignment.Center) {
                    Text(text = "÷", fontSize = 48.sp, color = Color.White)
                }
            }
            Row(modifier = Modifier
                .fillMaxWidth()) {
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(Color.LightGray)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {
                            say(7)
                        },contentAlignment = Alignment.Center) {
                    Text(text = "7", fontSize = 48.sp, color = Color.Black)
                }
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(Color.LightGray)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {
                            say(8)
                        },contentAlignment = Alignment.Center) {
                    Text(text = "8", fontSize = 48.sp, color = Color.Black)
                }
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(Color.LightGray)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {
                            say(9)
                        },contentAlignment = Alignment.Center) {
                    Text(text = "9", fontSize = 48.sp, color = Color.Black)
                }
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(color = OperatorBtnColor)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {
                            operator.value = 'x'
                        },contentAlignment = Alignment.Center) {
                    Text(text = "x", fontSize = 48.sp, color = Color.White)
                }
            }
            Row(modifier = Modifier
                .fillMaxWidth()) {
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(Color.LightGray)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {
                            say(4)
                        },contentAlignment = Alignment.Center) {
                    Text(text = "4", fontSize = 48.sp, color = Color.Black)
                }
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(Color.LightGray)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {
                            say(5)
                        },contentAlignment = Alignment.Center) {
                    Text(text = "5", fontSize = 48.sp, color = Color.Black)
                }
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(Color.LightGray)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {
                            say(6)
                        },contentAlignment = Alignment.Center) {
                    Text(text = "6", fontSize = 48.sp, color = Color.Black)
                }
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(color = OperatorBtnColor)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {
                            operator.value = '-'
                        },contentAlignment = Alignment.Center) {
                    Text(text = "-", fontSize = 48.sp, color = Color.White)
                }
            }
            Row(modifier = Modifier
                .fillMaxWidth()) {
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(Color.LightGray)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {
                            say(1)
                        },contentAlignment = Alignment.Center) {
                    Text(text = "1", fontSize = 48.sp, color = Color.Black)
                }
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(Color.LightGray)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {
                            say(2)
                        },contentAlignment = Alignment.Center) {
                    Text(text = "2", fontSize = 48.sp, color = Color.Black)
                }
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(Color.LightGray)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {
                            say(3)
                        },contentAlignment = Alignment.Center) {
                    Text(text = "3", fontSize = 48.sp, color = Color.Black)
                }
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(color = OperatorBtnColor)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {
                            sayiState.value = true
                            operator.value = '+'
                        },contentAlignment = Alignment.Center) {
                    Text(text = "+", fontSize = 48.sp, color = Color.White)
                }
            }
            Row(modifier = Modifier
                .fillMaxWidth()) {
                Box(
                    Modifier
                        .size(200.dp, 100.dp)
                        .background(Color.LightGray)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .padding(10.dp)
                        .clickable {
                            say(0)
                        },contentAlignment = Alignment.CenterStart) {
                    Text(text = "0", fontSize = 48.sp, color = Color.Black)
                }
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(Color.LightGray)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {

                        },contentAlignment = Alignment.Center) {
                    Text(text = ".", fontSize = 48.sp, color = Color.Black)
                }
                Box(
                    Modifier
                        .size(100.dp, 100.dp)
                        .background(color = OperatorBtnColor)
                        .border(border = BorderStroke(0.5.dp, Color.Black))
                        .clickable {
                            when (operator.value) {
                                '%' -> { /* Mod     işlemi */ }
                                '÷' -> { /* Bölme   işlemi */ }
                                'x' -> { /* Çarpma  işlemi */ }
                                '-' -> { /* Çıkarma işlemi */ }
                                '+' -> {
                                    sayi1.value += sayi2.value
                                    sonucText.value = sayi1.value.toString()
                                }
                            }
                            sayi2.value = 0
                            sayiState.value = false
                            operator.value = ' '
                        },contentAlignment = Alignment.Center) {
                    Text(text = "=", fontSize = 48.sp, color = Color.White)
                }
            }
        }
    }
}