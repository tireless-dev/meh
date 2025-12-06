// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Incomplete: ImageVector
  get() {
    val current = _incomplete
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Incomplete",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m23.76 6.86 1.29 -1.53 a14 14 0 0 0 -4.18 -2.44 l-.69 1.87 a12 12 0 0 1 3.58 2.1 M27.81 14 l1.97 -.41 a14 14 0 0 0 -1.64 -4.54 L26.41 10 a13 13 0 0 1 1.4 4 m-7.63 13.24 .69 1.87 a14 14 0 0 0 4.18 -2.44 l-1.29 -1.53 a12 12 0 0 1 -3.58 2.1 M26.41 22 l1.73 1 a14 14 0 0 0 1.64 -4.59 l-1.97 -.34 a12 12 0 0 1 -1.4 3.93 M16 30 V2 a14 14 0 0 0 0 28
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.76 6.86
          moveTo(x = 23.76f, y = 6.86f)
          // l 1.29 -1.53
          lineToRelative(dx = 1.29f, dy = -1.53f)
          // a 14 14 0 0 0 -4.18 -2.44
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.18f,
            dy1 = -2.44f,
          )
          // l -0.69 1.87
          lineToRelative(dx = -0.69f, dy = 1.87f)
          // a 12 12 0 0 1 3.58 2.1
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.58f,
            dy1 = 2.1f,
          )
          // M 27.81 14
          moveTo(x = 27.81f, y = 14.0f)
          // l 1.97 -0.41
          lineToRelative(dx = 1.97f, dy = -0.41f)
          // a 14 14 0 0 0 -1.64 -4.54
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.64f,
            dy1 = -4.54f,
          )
          // L 26.41 10
          lineTo(x = 26.41f, y = 10.0f)
          // a 13 13 0 0 1 1.4 4
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.4f,
            dy1 = 4.0f,
          )
          // m -7.63 13.24
          moveToRelative(dx = -7.63f, dy = 13.24f)
          // l 0.69 1.87
          lineToRelative(dx = 0.69f, dy = 1.87f)
          // a 14 14 0 0 0 4.18 -2.44
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.18f,
            dy1 = -2.44f,
          )
          // l -1.29 -1.53
          lineToRelative(dx = -1.29f, dy = -1.53f)
          // a 12 12 0 0 1 -3.58 2.1
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.58f,
            dy1 = 2.1f,
          )
          // M 26.41 22
          moveTo(x = 26.41f, y = 22.0f)
          // l 1.73 1
          lineToRelative(dx = 1.73f, dy = 1.0f)
          // a 14 14 0 0 0 1.64 -4.59
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.64f,
            dy1 = -4.59f,
          )
          // l -1.97 -0.34
          lineToRelative(dx = -1.97f, dy = -0.34f)
          // a 12 12 0 0 1 -1.4 3.93
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.4f,
            dy1 = 3.93f,
          )
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // a 14 14 0 0 0 0 28
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 28.0f,
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
      .also { _incomplete = it }
  }

@Suppress("ObjectPropertyName")
private var _incomplete: ImageVector? = null
