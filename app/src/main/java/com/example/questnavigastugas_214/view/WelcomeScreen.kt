package com.example.questnavigastugas_214.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigastugas_214.R

@Composable
fun WelcomeScreen(onSubmitClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEDE7F6)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Selamat Datang!",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF512DA8)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Andika Arya Putra",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            color = Color.DarkGray
        )

        Text(
            text = "20230140214",
            fontSize = 16.sp,
            color = Color.Gray
        )
    }
}