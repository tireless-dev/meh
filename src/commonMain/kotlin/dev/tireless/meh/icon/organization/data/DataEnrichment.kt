// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

val DataEnrichment: ImageVector
  get() {
    val current = _dataEnrichment
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataEnrichment",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
      }.build()
      .also { _dataEnrichment = it }
  }

@Suppress("ObjectPropertyName")
private var _dataEnrichment: ImageVector? = null
