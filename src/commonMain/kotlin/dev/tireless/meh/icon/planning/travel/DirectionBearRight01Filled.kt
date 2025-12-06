// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionBearRight01Filled: ImageVector
  get() {
    val current = _directionBearRight01Filled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionBearRight01Filled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m-6 14 h-2 V9.41 l-6.54 6.54 A5 5 0 0 0 12 19.49 V26 h-2 v-6.51 a7 7 0 0 1 2.05 -4.95 L18.59 8 H12 V6 h10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m -6 14
          moveToRelative(dx = -6.0f, dy = 14.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 9.41
          verticalLineTo(y = 9.41f)
          // l -6.54 6.54
          lineToRelative(dx = -6.54f, dy = 6.54f)
          // A 5 5 0 0 0 12 19.49
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 19.49f,
          )
          // V 26
          verticalLineTo(y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -6.51
          verticalLineToRelative(dy = -6.51f)
          // a 7 7 0 0 1 2.05 -4.95
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.05f,
            dy1 = -4.95f,
          )
          // L 18.59 8
          lineTo(x = 18.59f, y = 8.0f)
          // H 12
          horizontalLineTo(x = 12.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
        }
        // M22 16 h-2 V9.41 l-6.54 6.54 A5 5 0 0 0 12 19.49 V26 h-2 v-6.51 a7 7 0 0 1 2.05 -4.95 L18.59 8 H12 V6 h10Z
        path {
          // M 22 16
          moveTo(x = 22.0f, y = 16.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 9.41
          verticalLineTo(y = 9.41f)
          // l -6.54 6.54
          lineToRelative(dx = -6.54f, dy = 6.54f)
          // A 5 5 0 0 0 12 19.49
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 19.49f,
          )
          // V 26
          verticalLineTo(y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -6.51
          verticalLineToRelative(dy = -6.51f)
          // a 7 7 0 0 1 2.05 -4.95
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.05f,
            dy1 = -4.95f,
          )
          // L 18.59 8
          lineTo(x = 18.59f, y = 8.0f)
          // H 12
          horizontalLineTo(x = 12.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" />
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
      .also { _directionBearRight01Filled = it }
  }

@Suppress("ObjectPropertyName")
private var _directionBearRight01Filled: ImageVector? = null
