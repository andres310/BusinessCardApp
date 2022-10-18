package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                }
            }
        }
    }
}

@Composable
fun BusisnessCardApp() {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(color = Color(0xFF003a4a))
    ) {
        Presentation(fullName = "Jennifer Doe", title = "Android Developer Extraordinaire")
        ContactInfo(phoneNumber = "+503 1234-5678", email = "exmaple@hotmail.com")
    }
}

@Composable
fun ContactInfo(phoneNumber: String, email: String) {
//    Column(
//        horizontalAlignment = Alignment.Start,
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier.fillMaxWidth()
//    ) {}
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(
                start = 60.dp,
                bottom = 10.dp
            )
            .fillMaxWidth()
    ) {
        Icon(
            Icons.Filled.Phone,
            contentDescription = null,
            tint = Color(0xFF3ddc84),
            modifier = Modifier
                .padding(end = 18.dp)
        )
        Text(text = phoneNumber, color = Color.White)
    }
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(
                start = 60.dp,
                bottom = 10.dp
            )
            .fillMaxWidth()
    ) {
        Icon(
            Icons.Filled.Email,
            contentDescription = null,
            tint = Color(0xFF3ddc84),
            modifier = Modifier
                .padding(end = 18.dp)
        )
        Text(text = email, color = Color.White)
    }
}

@Composable
fun Presentation(fullName: String, title: String) {
    val img = painterResource(id = R.drawable.android_logo)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = img,
            contentDescription = null,
            modifier = Modifier
                .size(130.dp)
        )
        Text(
            text = fullName,
            fontSize = 48.sp,
            fontWeight = FontWeight.Light,
            color = Color.White
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = Color(0xFF3ddc84)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        BusisnessCardApp()
    }
}