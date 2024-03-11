package com.razdarr.tugas3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.razdarr.tugas3.ui.theme.Tugas3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tugas3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TampilanUtama()
                }
            }
        }
    }
}

@Composable
fun TampilanUtama(modifier: Modifier = Modifier){
    Box(modifier = modifier
        .fillMaxSize()
        .background(Color.White)) {
        Image(
            painter = painterResource(id = R.drawable.th),
            contentDescription = null,
            modifier = modifier
                .fillMaxSize()
                .padding(bottom = 650.dp)
        )

        Spacer(modifier = modifier.height(10.dp))

        Row {
            Spacer(modifier = modifier.width(20.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(vertical = 252.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.instagram),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Text(
                    text = "Aset",
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            Spacer(modifier = modifier.width(50.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(vertical = 252.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.asset),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Text(
                    text = "Asset",
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            Spacer(modifier = modifier.width(50.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(vertical = 252.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.asset),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Text(
                    text = "Asset",
                    modifier = Modifier.padding(top = 10.dp)
                )
                Spacer(modifier = modifier.width(50.dp))
            }
            Spacer(modifier = modifier.width(50.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(vertical = 252.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.asset),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Text(
                    text = "Asset",
                    modifier = Modifier.padding(top = 10.dp)
                )
                Spacer(modifier = modifier.width(50.dp))
            }
            // Add more columns with images and corresponding text as needed
        }
        Spacer(modifier = modifier.height(10.dp))

        Row{
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(vertical = 252.dp)
            ) {
                Spacer(modifier = modifier.height(100.dp))
                Image(
                    painter = painterResource(id = R.drawable.instagram),
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .offset(x = 20.dp)
                )
                Text(
                    text = "Aset",
                    modifier = Modifier.padding(top = 8.dp).offset(x = 20.dp)
                )
            }
            Spacer(modifier = modifier.width(20.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(vertical = 252.dp)
            ) {
                Spacer(modifier = modifier.height(100.dp))
                Image(
                    painter = painterResource(id = R.drawable.instagram),
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .offset(x = 50.dp)
                )
                Text(
                    text = "Aset",
                    modifier = Modifier.padding(top = 8.dp).offset(x = 50.dp)
                )
            }
            Spacer(modifier = modifier.width(50.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(vertical = 252.dp)
            ) {
                Spacer(modifier = modifier.height(100.dp))
                Image(
                    painter = painterResource(id = R.drawable.instagram),
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .offset(x = 50.dp)
                )
                Text(
                    text = "Aset",
                    modifier = Modifier.padding(top = 8.dp).offset(x = 50.dp)
                )
            }

            Spacer(modifier = modifier.width(50.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(vertical = 252.dp)
            ) {
                Spacer(modifier = modifier.height(100.dp))
                Image(
                    painter = painterResource(id = R.drawable.instagram),
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .offset(x = 50.dp)
                )
                Text(
                    text = "Aset",
                    modifier = Modifier.padding(top = 8.dp).offset(x = 50.dp)
                )
            }

        }


    }


    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom // Menempatkan konten di bagian bawah layar
    ) {
        Row {
            Spacer(modifier = modifier.width(20.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.asset),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Text(
                    text = "Asset 1",
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            Spacer(modifier = modifier.width(70.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.asset),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Text(
                    text = "Asset 2",
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            Spacer(modifier = modifier.width(70.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.asset),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Text(
                    text = "Asset 2",
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tugas3Theme {
        TampilanUtama()
    }
}
