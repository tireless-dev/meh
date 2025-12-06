// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionSharpTurn: ImageVector
  get() {
    val current = _directionSharpTurn
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionSharpTurn",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 18 v6.59 L7.7 6.29 A1 1 0 0 0 6 7 v21 h2 V9.41 L24.59 26 H18 v2 h10 V18Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 18
          moveTo(x = 26.0f, y = 18.0f)
          // v 6.59
          verticalLineToRelative(dy = 6.59f)
          // L 7.7 6.29
          lineTo(x = 7.7f, y = 6.29f)
          // A 1 1 0 0 0 6 7
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 7.0f,
          )
          // v 21
          verticalLineToRelative(dy = 21.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 9.41
          verticalLineTo(y = 9.41f)
          // L 24.59 26
          lineTo(x = 24.59f, y = 26.0f)
          // H 18
          horizontalLineTo(x = 18.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // V 18z
          verticalLineTo(y = 18.0f)
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
      .also { _directionSharpTurn = it }
  }

@Suppress("ObjectPropertyName")
private var _directionSharpTurn: ImageVector? = null
