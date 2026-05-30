// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Milestone: ImageVector
  get() {
    val current = _milestone
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Milestone",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24.59 6.59 A2 2 0 0 0 23.17 6 H16 V2 h-2 v4 H6 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h8 v14 h2 V16 h7.17 a2 2 0 0 0 1.42 -.59 L29 11Z M23.17 14 H6 V8 h17.17 l3 3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.59 6.59
          moveTo(x = 24.59f, y = 6.59f)
          // A 2 2 0 0 0 23.17 6
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.17f,
            y1 = 6.0f,
          )
          // H 16
          horizontalLineTo(x = 16.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 7.17
          horizontalLineToRelative(dx = 7.17f)
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
          // L 29 11z
          lineTo(x = 29.0f, y = 11.0f)
          close()
          // M 23.17 14
          moveTo(x = 23.17f, y = 14.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 17.17
          horizontalLineToRelative(dx = 17.17f)
          // l 3 3z
          lineToRelative(dx = 3.0f, dy = 3.0f)
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
      .also { _milestone = it }
  }

@Suppress("ObjectPropertyName")
private var _milestone: ImageVector? = null
