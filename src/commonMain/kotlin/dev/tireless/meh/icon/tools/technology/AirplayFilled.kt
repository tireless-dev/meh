// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AirplayFilled: ImageVector
  get() {
    val current = _airplayFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AirplayFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 30 H9 a1 1 0 0 1 -.82 -1.58 l7 -10 a1 1 0 0 1 1.64 0 l7 10 A1 1 0 0 1 23 30
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 30
          moveTo(x = 23.0f, y = 30.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // a 1 1 0 0 1 -0.82 -1.58
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.82f,
            dy1 = -1.58f,
          )
          // l 7 -10
          lineToRelative(dx = 7.0f, dy = -10.0f)
          // a 1 1 0 0 1 1.64 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.64f,
            dy1 = 0.0f,
          )
          // l 7 10
          lineToRelative(dx = 7.0f, dy = 10.0f)
          // A 1 1 0 0 1 23 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.0f,
            y1 = 30.0f,
          )
        }
        // M28 24 h-4 v-2 h4 V6 H4 v16 h4 v2 H4 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v16 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 24
          moveTo(x = 28.0f, y = 24.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
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
      .also { _airplayFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _airplayFilled: ImageVector? = null
