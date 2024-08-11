package org.example.cryptovalor.designsystem.components

import androidx.compose.ui.graphics.Color
import org.example.cryptovalor.designsystem.tokens.Colors

sealed class ButtonType(val color: Color) {
    data object Brand : ButtonType(color = Colors.brandColor)
    data object Accent : ButtonType(color = Colors.accentColor)
    data object Error : ButtonType(color = Colors.errorColor)
}