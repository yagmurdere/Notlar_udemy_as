package com.example.notlar_udemy_as.UDEMY

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.notlar_udemy_as.R
import com.example.notlar_udemy_as.ui.theme.Notlar_udemy_asTheme


@Composable
fun exercise(){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = stringResource(id = R.string.text_yazi), fontSize = 50.sp)
        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
            containerColor = Color.Magenta,
            contentColor = Color.Green
        )) {
            Text(text= stringResource(id = R.string.button_yazı), fontSize = 24.sp)
        }
        }

    }
@Composable
fun kırmızıkare(){
    Box(modifier = Modifier
        .size(100.dp)
        .background(color = Color.Red)){
    }
}
@Composable
fun yesilkare(){
    Box(modifier = Modifier
        .size(100.dp)
        .background(color = Color.Green)){
    }
}
@Composable
fun yazı(içerik:String){
    Text(text = içerik, fontSize =50.sp)
}
@Preview(showBackground = true, locale ="tr")
@Composable
fun exPre(){
    Notlar_udemy_asTheme{
        exercise()
    }
}

