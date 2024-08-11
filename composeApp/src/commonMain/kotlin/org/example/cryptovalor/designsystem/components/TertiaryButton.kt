package org.example.cryptovalor.designsystem.components

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TertiaryButton(
    modifier: Modifier = Modifier,
    buttonType: ButtonType,
    text: String,
    action: () -> Unit
) {
    Text(
        modifier = modifier
            .clickable { action() },
        text = text,
        style = TextStyle(
            color = buttonType.color,
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal
        )
    )
}