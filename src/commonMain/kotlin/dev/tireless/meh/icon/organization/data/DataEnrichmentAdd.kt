// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

val DataEnrichmentAdd: ImageVector
  get() {
    val current = _dataEnrichmentAdd
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataEnrichmentAdd",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
      }.build()
      .also { _dataEnrichmentAdd = it }
  }

@Suppress("ObjectPropertyName")
private var _dataEnrichmentAdd: ImageVector? = null
