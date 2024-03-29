package com.example.terceiro_projeto.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.adsb_aula_07_03.ui.theme.White10


@Preview
@Composable
fun AppBarLayoutPreview() {
    AppBarLayout()
}

@Composable
fun AppBarLayout(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(
                White10
            )
            .padding(vertical = 8.dp),
        horizontalArrangement =
        Arrangement.Center,
        verticalAlignment =
        Alignment.CenterVertically
    ) {

    }
}