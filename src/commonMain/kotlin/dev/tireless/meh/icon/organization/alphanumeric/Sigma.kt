// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sigma: ImageVector
  get() {
    val current = _sigma
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Sigma",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="24.0 5.0 7.0 5.0 7.0 7.414 15.586 16.0 7.0 24.586 7.0 27.0 24.0 27.0 24.0 25.0 9.414 25.0 18.414 16.0 9.414 7.0 24.0 7.0 24.0 5.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 5
          moveTo(x = 24.0f, y = 5.0f)
          // L 7 5
          lineTo(x = 7.0f, y = 5.0f)
          // L 7 7.414
          lineTo(x = 7.0f, y = 7.414f)
          // L 15.586 16
          lineTo(x = 15.586f, y = 16.0f)
          // L 7 24.586
          lineTo(x = 7.0f, y = 24.586f)
          // L 7 27
          lineTo(x = 7.0f, y = 27.0f)
          // L 24 27
          lineTo(x = 24.0f, y = 27.0f)
          // L 24 25
          lineTo(x = 24.0f, y = 25.0f)
          // L 9.414 25
          lineTo(x = 9.414f, y = 25.0f)
          // L 18.414 16
          lineTo(x = 18.414f, y = 16.0f)
          // L 9.414 7
          lineTo(x = 9.414f, y = 7.0f)
          // L 24 7
          lineTo(x = 24.0f, y = 7.0f)
          // L 24 5z
          lineTo(x = 24.0f, y = 5.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _sigma = it }
  }

@Suppress("ObjectPropertyName")
private var _sigma: ImageVector? = null
