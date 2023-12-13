package com.example.notlar_udemy_as.UDEMY

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.notlar_udemy_as.R
import com.example.notlar_udemy_as.ui.theme.Notlar_udemy_asTheme

@Composable
@ExperimentalMaterial3Api
fun Yemek(){
    Column (modifier = Modifier.fillMaxSize()){
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Magenta)
            .padding(16.dp))
        {
            Text(text = "YEMEK TARİFLERİ",
                color = colorResource(id = R.color.white),
                modifier = Modifier.align(alignment = Alignment.Center),
                style = MaterialTheme.typography.headlineMedium)
        }
        Image(painter = painterResource(id = R.drawable.hatay_kagit_kebabi_resimli_yemek_tarifi_16_), contentDescription = "",
            modifier = Modifier.size(400.dp,300.dp))
        Row {
            Button(onClick = { Log.e("mesaj", "çalıştı") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.runk2orange),
                    contentColor = colorResource(id = R.color.white)
                ),
                modifier = Modifier.weight(50f),
                shape = RoundedCornerShape(10.dp)
            )
            {
                Text(text = "Beğen")
            }
            Button(onClick = { Log.e("mesaj", "çalıştı") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.runk2orange),
                    contentColor = colorResource(id = R.color.purple_200)
                ),
                modifier = Modifier.weight(50f),
                shape = RoundedCornerShape(10.dp))
            {
                Text(text = "Yorum")
            }
        }
    }

}
@ExperimentalMaterial3Api
@Preview (showBackground = true)
@Composable
fun previewYemek(){
    Notlar_udemy_asTheme{
        Yemek()
    }
}