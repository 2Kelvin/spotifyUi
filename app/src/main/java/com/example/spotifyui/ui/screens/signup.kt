package com.example.spotifyui.ui.screens

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spotifyui.R

@Composable
fun SignUpScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF121212))
    ) {
        Column {
            // spotify signup background image
            Image(
                painter = painterResource(id = R.drawable.spotify_signup),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 12.dp),
                contentScale = ContentScale.Crop
            )

            // texts & signup buttons
            ReusableGreyText(txt = "Millions of Songs.")
            ReusableGreyText(txt = "Free on Spotify.")
            Spacer(modifier = Modifier.height(12.dp))
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color.Green),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp, start = 28.dp, end = 28.dp, top = 10.dp)
                    .height(50.dp)
            ) {
                Text(
                    text = "Sign up for free",
                    fontSize = 18.sp,
                    color = Color.Black,
                )
            }

            ReusableOutlinedButton(
                iconResourceId = R.drawable.google_svg,
                btnText = "Google"
            )
            ReusableOutlinedButton(
                iconResourceId = R.drawable.fb_svg,
                btnText = "Facebook"
            )
            ReusableOutlinedButton(
                iconResourceId = R.drawable.mac_svg,
                btnText = "Apple"
            )
            Text(
                text = "Log In",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                textAlign = TextAlign.Center,
                color = Color(0xFFF5F5F5),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun ReusableGreyText(txt: String) {
    Text(
        text = txt,
        modifier = Modifier.fillMaxWidth(),
        color = Color(0xFFF5F5F5),
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        fontSize = 28.sp,
    )
}

@Composable
fun ReusableOutlinedButton(iconResourceId: Int, btnText: String) {
    OutlinedButton(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp, start = 28.dp, end = 28.dp, top = 0.dp)
            .height(50.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(), // take up all the button's width
            verticalAlignment = Alignment.CenterVertically, // center vertically
            horizontalArrangement = Arrangement.Start, // place at the start
        ) {
            Icon(
                painter = painterResource(id = iconResourceId),
                contentDescription = null,
                tint = Color.Unspecified, // remove automatic tint color
                modifier = Modifier
                    .padding(end = 12.dp)
                    .size(22.dp)
            )
            Text(
                text = "Continue with $btnText",
                textAlign = TextAlign.Center,
                color = Color(0xFFF5F5F5),
                fontSize = 18.sp,
                // to take up all the rest of the space & place itself in the middle
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
@Preview
fun SignUpScreenPreview(showBackground: Boolean = true) {
    SignUpScreen()
}