// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Crossroads: ImageVector
  get() {
    val current = _crossroads
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Crossroads",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26.59 6.59 A2 2 0 0 0 25.17 6 H17 V2 h-2 v10 H6.83 a2 2 0 0 0 -1.42 .59 L2 16 l3.41 3.41 A2 2 0 0 0 6.83 20 H15 v10 h2 V14 h8.17 a2 2 0 0 0 1.42 -.59 L30 10Z M6.83 18 l-2 -2 2 -2 H15 v4Z m18.34 -6 H17 V8 h8.17 l2 2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26.59 6.59
          moveTo(x = 26.59f, y = 6.59f)
          // A 2 2 0 0 0 25.17 6
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.17f,
            y1 = 6.0f,
          )
          // H 17
          horizontalLineTo(x = 17.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // H 6.83
          horizontalLineTo(x = 6.83f)
          // a 2 2 0 0 0 -1.42 0.59
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.42f,
            dy1 = 0.59f,
          )
          // L 2 16
          lineTo(x = 2.0f, y = 16.0f)
          // l 3.41 3.41
          lineToRelative(dx = 3.41f, dy = 3.41f)
          // A 2 2 0 0 0 6.83 20
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.83f,
            y1 = 20.0f,
          )
          // H 15
          horizontalLineTo(x = 15.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 14
          verticalLineTo(y = 14.0f)
          // h 8.17
          horizontalLineToRelative(dx = 8.17f)
          // a 2 2 0 0 0 1.42 -0.59
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.42f,
            dy1 = -0.59f,
          )
          // L 30 10z
          lineTo(x = 30.0f, y = 10.0f)
          close()
          // M 6.83 18
          moveTo(x = 6.83f, y = 18.0f)
          // l -2 -2
          lineToRelative(dx = -2.0f, dy = -2.0f)
          // l 2 -2
          lineToRelative(dx = 2.0f, dy = -2.0f)
          // H 15
          horizontalLineTo(x = 15.0f)
          // v 4z
          verticalLineToRelative(dy = 4.0f)
          close()
          // m 18.34 -6
          moveToRelative(dx = 18.34f, dy = -6.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 8.17
          horizontalLineToRelative(dx = 8.17f)
          // l 2 2z
          lineToRelative(dx = 2.0f, dy = 2.0f)
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
      .also { _crossroads = it }
  }

@Suppress("ObjectPropertyName")
private var _crossroads: ImageVector? = null
