package com.example.businesscard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCard(
                logo = R.drawable.free_icon_android_226770,
                name = "Ksenia Groznaya",
                title = "Android Developer",
                number = "+7-920-761-70-05",
                handle = "@ksenia0koiama",
                email = "groznaaksenia@gmail.com",
                Color(0xFFa6d864)
            )
        }
    }
}

@Composable
fun LogoNameTitle(
    logo: Int,
    name: String,
    title: String,
    textColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(logo),
            contentDescription = null
        )
        Text(
            text = name,
            color = textColor,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = title,
            color = textColor,
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Composable
fun ContactInformation(
    number: String,
    handle: String,
    email: String,
    textColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row {
            Icon(
                MyAppIcons.Call,
                contentDescription = null,
                tint = textColor,
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = number,
                color = textColor,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .align(Alignment.CenterVertically)
            )
        }
        Row {
            Icon(
                Icons.AutoMirrored.Filled.Send,
                contentDescription = null,
                tint = textColor,
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = handle,
                color = textColor,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .align(Alignment.CenterVertically)
            )
        }
        Row {
            Icon(
                MyAppIcons.Email,
                contentDescription = null,
                tint = textColor,
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = email,
                color = textColor,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .align(Alignment.CenterVertically)
            )
        }
    }
}

@Composable
fun BusinessCard(
    logo: Int,
    name: String,
    title: String,
    number: String,
    handle: String,
    email: String,
    textColor: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(bottom = 30.dp),
        contentAlignment = Alignment.Center
    ) {
        LogoNameTitle(logo, name, title, textColor, modifier.padding(bottom = 50.dp))

        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ContactInformation(number, handle, email, textColor)
        }
    }
}

val MyAppIcons = Icons.Filled

@Preview(showBackground = true, backgroundColor = 0xFF9664d8)
@Composable
fun BusinessCardPreview() {
    BusinessCard(
        logo = R.drawable.free_icon_android_226770,
        name = "Ksenia Groznaya",
        title = "Android Developer",
        number = "+7-920-761-70-05",
        handle = "@ksenia0koiama",
        email = "groznaaksenia@gmail.com",
        Color(0xFFa6d864)
    )
}
