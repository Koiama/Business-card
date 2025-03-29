package com.example.businesscard

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


        }
    }
}

@Composable
fun LogoNameTitle(logo: Int, name: String, title: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Image(
            painter =  painterResource(logo),
            contentDescription = null
        )
        Text(
            text = name,
            color = Color(0xFFe3977d),
            fontSize = 40.sp
         )
        Text(
            text = title,
            color = Color(0xFF8fb589)
        )
    }
}
@Composable
fun ContactInformation(number: String, handle: String, email: String, modifier: Modifier = Modifier){
    Column(modifier = modifier,){
        Text(
            text = number
        )
        Text(
            text = handle
        )
        Text(
            text = email
        )
    }
}

@Composable
fun BusinessCard(logo: Int, name: String, title: String, number: String, handle: String, email: String, modifier: Modifier = Modifier){
    Column(modifier = modifier) {
        LogoNameTitle(logo, name, title)
        ContactInformation(number, handle, email)
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFdfd8d0)
@Composable
fun BusinessCardPreview() {
    BusinessCard(
        logo = R.drawable.androidparty,
        name = "Ksenia Groznaya",
        title = "Android Developer",
        number = "+7-920-761-70-05",
        handle = "@ksenia0koiama",
        email = "groznaaksenia@gmail.com"
    )
}
