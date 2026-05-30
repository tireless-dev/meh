// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Marginal: ImageVector
  get() {
    val current = _marginal
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Marginal",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M10.56 23 9 21.44 21.44 9 23 10.56z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.56 23
          moveTo(x = 10.56f, y = 23.0f)
          // L 9 21.44
          lineTo(x = 9.0f, y = 21.44f)
          // L 21.44 9
          lineTo(x = 21.44f, y = 9.0f)
          // L 23 10.56z
          lineTo(x = 23.0f, y = 10.56f)
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
      .also { _marginal = it }
  }

@Suppress("ObjectPropertyName")
private var _marginal: ImageVector? = null
