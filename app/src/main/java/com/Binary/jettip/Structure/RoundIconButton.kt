package com.example.jettipapp.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val IconButtonSizeModifier = Modifier.size(30.dp)

@Composable
fun RoundIconButton(
    modifier: Modifier = Modifier,
    imageVector: ImageVector,
    onClick: () -> Unit,
    tint: Color = Color.Black.copy(alpha = 0.8f),
    backgroundColor: Color = MaterialTheme.colorScheme.background,
    elevation: Dp = 5.dp,
    border: BorderStroke = BorderStroke(
        0.5.dp,
        Color(0xFF003049),

        )
) {
    Card(
        modifier = modifier
            .padding(all = 5.dp)
            .clickable {
                onClick.invoke()
            }
            .then(IconButtonSizeModifier)
            .background(backgroundColor), // Set background color using background modifier
        shape = CircleShape,
        elevation = CardDefaults.cardElevation(defaultElevation = elevation),
        border = border

    ) {
        Box(
            modifier = Modifier.fillMaxSize(), // Fill the entire Box with the Icon
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = imageVector,
                contentDescription = "Plus or minus icon",
                tint = tint
            )
        }
    }
}
