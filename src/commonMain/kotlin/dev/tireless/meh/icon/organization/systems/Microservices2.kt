// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

val Microservices2: ImageVector
  get() {
    val current = _microservices2
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Microservices2",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
      }.build()
      .also { _microservices2 = it }
  }

@Suppress("ObjectPropertyName")
private var _microservices2: ImageVector? = null
