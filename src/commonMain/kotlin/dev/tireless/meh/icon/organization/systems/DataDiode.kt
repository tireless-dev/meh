// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataDiode: ImageVector
  get() {
    val current = _dataDiode
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataDiode",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 15 h-3 V7 h-2 v8 h-3 V7 h-2 v7.83 L7.52 7.15 A1 1 0 0 0 6 8 v7 H2 v2 h4 v7 a1 1 0 0 0 1.52 .85 L20 17.17 V25 h2 v-8 h3 v8 h2 v-8 h3Z M8 22.21 V9.79 L18.1 16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 15
          moveTo(x = 30.0f, y = 15.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 7.83
          verticalLineToRelative(dy = 7.83f)
          // L 7.52 7.15
          lineTo(x = 7.52f, y = 7.15f)
          // A 1 1 0 0 0 6 8
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 8.0f,
          )
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // a 1 1 0 0 0 1.52 0.85
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.52f,
            dy1 = 0.85f,
          )
          // L 20 17.17
          lineTo(x = 20.0f, y = 17.17f)
          // V 25
          verticalLineTo(y = 25.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
          close()
          // M 8 22.21
          moveTo(x = 8.0f, y = 22.21f)
          // V 9.79
          verticalLineTo(y = 9.79f)
          // L 18.1 16z
          lineTo(x = 18.1f, y = 16.0f)
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
      .also { _dataDiode = it }
  }

@Suppress("ObjectPropertyName")
private var _dataDiode: ImageVector? = null
