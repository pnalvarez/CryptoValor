package org.example.cryptovalor.designsystem.catalog

import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.example.cryptovalor.designsystem.components.ButtonType
import org.example.cryptovalor.designsystem.components.PrimaryButton
import org.example.cryptovalor.designsystem.components.SecondaryButton
import org.example.cryptovalor.designsystem.components.TertiaryButton
import org.example.cryptovalor.designsystem.tokens.Spacing

@Composable
fun DesignSystemComponentCatalogScreen() {
    val scrollableState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollableState)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        PrimaryButton(
            buttonType = ButtonType.Brand,
            text = "Text",
            action = { }
        )

        Spacer(modifier = Modifier.height(Spacing.xs))

        PrimaryButton(
            buttonType = ButtonType.Accent,
            text = "Text",
            action = { }
        )

        Spacer(modifier = Modifier.height(Spacing.xs))

        PrimaryButton(
            buttonType = ButtonType.Error,
            text = "Text",
            action = { }
        )

        Spacer(modifier = Modifier.height(Spacing.xs))

        SecondaryButton(
            buttonType = ButtonType.Brand,
            text = "Text",
            action = { }
        )

        Spacer(modifier = Modifier.height(Spacing.xs))

        SecondaryButton(
            buttonType = ButtonType.Accent,
            text = "Text",
            action = { }
        )

        Spacer(modifier = Modifier.height(Spacing.xs))

        SecondaryButton(
            buttonType = ButtonType.Error,
            text = "Text",
            action = { }
        )

        Spacer(modifier = Modifier.height(Spacing.xs))

        TertiaryButton(
            buttonType = ButtonType.Brand,
            text = "Text",
            action = { }
        )

        TertiaryButton(
            buttonType = ButtonType.Accent,
            text = "Text",
            action = { }
        )

        Spacer(modifier = Modifier.height(Spacing.xs))

        TertiaryButton(
            buttonType = ButtonType.Error,
            text = "Text",
            action = { }
        )
    }
}