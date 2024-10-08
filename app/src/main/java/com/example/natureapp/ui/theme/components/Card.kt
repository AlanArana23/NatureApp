package com.example.natureapp.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.natureapp.R

@Composable
fun CardImage(image: String, title: String, description: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .placeholder(R.drawable.parque)
                .data(image)
                .build(),
            contentDescription = "CardImage",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )
        Column (
            modifier = Modifier
                .padding(20.dp)
        ){
            Text(
                text = title,
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = description,
                fontSize = 15.sp,
            )
        }

    }
}

@Preview
@Composable
fun CardImagePreview() {
    CardImage(
        image = "https://www.gob.mx/cms/uploads/image/file/647478/SAN_PEDRO_MARTIR.jpg",
        title = "Parques Nacionales",
        description = "Un parque nacional es un área natural protegida que preserva ecosistemas, biodiversidad, y ofrece recreación responsable al público."
    )
}