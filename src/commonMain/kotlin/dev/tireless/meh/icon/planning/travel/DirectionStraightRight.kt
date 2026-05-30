// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionStraightRight: ImageVector
  get() {
    val current = _directionStraightRight
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionStraightRight",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="28.0 16.0 21.0 9.0 19.586 10.414 24.172 15.0 4.0 15.0 4.0 17.0 24.172 17.0 19.586 21.586 21.0 23.0 28.0 16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 16
          moveTo(x = 28.0f, y = 16.0f)
          // L 21 9
          lineTo(x = 21.0f, y = 9.0f)
          // L 19.586 10.414
          lineTo(x = 19.586f, y = 10.414f)
          // L 24.172 15
          lineTo(x = 24.172f, y = 15.0f)
          // L 4 15
          lineTo(x = 4.0f, y = 15.0f)
          // L 4 17
          lineTo(x = 4.0f, y = 17.0f)
          // L 24.172 17
          lineTo(x = 24.172f, y = 17.0f)
          // L 19.586 21.586
          lineTo(x = 19.586f, y = 21.586f)
          // L 21 23
          lineTo(x = 21.0f, y = 23.0f)
          // L 28 16z
          lineTo(x = 28.0f, y = 16.0f)
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
      .also { _directionStraightRight = it }
  }

@Suppress("ObjectPropertyName")
private var _directionStraightRight: ImageVector? = null
