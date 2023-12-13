package com.example.notlar_udemy_as.UDEMY

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.notlar_udemy_as.R
import com.example.notlar_udemy_as.ui.theme.Notlar_udemy_asTheme

@ExperimentalMaterial3Api
@Composable
fun mainFonk(){
    Surface (color= MaterialTheme.colorScheme.primary){
        var tfkullaniciAdi by rememberSaveable { mutableStateOf(" ") }
        var tfsıfre by rememberSaveable { mutableStateOf(" ") }
        Column (modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center)
        {
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = " ",
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape)
                    .border(
                        5.dp, Color.Magenta,
                        CircleShape
                    ))
            Spacer(modifier = Modifier.padding(10.dp))
            TextField(value = tfkullaniciAdi, 
                onValueChange = {tfkullaniciAdi = it},
                label = { Text(text = "kullanıcı adı", color = Color.Magenta)},
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Green
                )
            )
            Spacer(modifier = Modifier.padding(20.dp))
            TextField(value = tfsıfre,
                onValueChange = {tfsıfre = it},
                label = { Text(text = "şifre", color = colorResource(id = R.color.rank))},
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Green
                )
            )
            Spacer(modifier = Modifier.padding(40.dp))
            Button(onClick = { Log.e("buton","çalıştı") },
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Green,
                    containerColor = Color.Blue
                )
                ,modifier = Modifier.size(250.dp,50.dp)
            ) {
                Text(text = "enter")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
@ExperimentalMaterial3Api
fun mainFonkPreview(){
    Notlar_udemy_asTheme{
        mainFonk()
    }
}