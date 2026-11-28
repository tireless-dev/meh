// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.StructuredList
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun StructuredListPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)

    val headers = listOf("Plan", "Region", "Description")
    val rows = listOf(
      listOf("Lite", "US South", "Free tier for prototyping and personal apps."),
      listOf("Standard", "EU Central", "Production workloads with automatic failover."),
      listOf("Enterprise", "Global", "Dedicated clusters with 99.99% SLA."),
    )

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Default Structured List", style = sectionStyle)
      StructuredList(headers = headers, rows = rows)

      BasicText(text = "Selectable & Condensed Structured List", style = sectionStyle)
      StructuredList(
        headers = headers,
        rows = rows,
        selectedIndex = 1,
        onRowSelect = {},
        isCondensed = true,
      )
    }
  }
}
