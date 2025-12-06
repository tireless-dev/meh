// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bluetooth: ImageVector
  get() {
    val current = _bluetooth
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Bluetooth",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 30 a1 1 0 0 1 -.42 -.09 A1 1 0 0 1 15 29 V18.41 L8.41 25 7 23.59 14.59 16 7 8.41 8.41 7 15 13.59 V3 a1 1 0 0 1 .58 -.91 1 1 0 0 1 1.07 .15 l7 6 A1 1 0 0 1 24 9 a1 1 0 0 1 -.29 .75 L17.41 16 l6.3 6.29 A1 1 0 0 1 24 23 a1 1 0 0 1 -.35 .72 l-7 6 A1 1 0 0 1 16 30 m1 -11.59 v8.42 l4.53 -3.89Z m0 -13.24 v8.42 l4.53 -4.53Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // a 1 1 0 0 1 -0.42 -0.09
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.42f,
            dy1 = -0.09f,
          )
          // A 1 1 0 0 1 15 29
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.0f,
            y1 = 29.0f,
          )
          // V 18.41
          verticalLineTo(y = 18.41f)
          // L 8.41 25
          lineTo(x = 8.41f, y = 25.0f)
          // L 7 23.59
          lineTo(x = 7.0f, y = 23.59f)
          // L 14.59 16
          lineTo(x = 14.59f, y = 16.0f)
          // L 7 8.41
          lineTo(x = 7.0f, y = 8.41f)
          // L 8.41 7
          lineTo(x = 8.41f, y = 7.0f)
          // L 15 13.59
          lineTo(x = 15.0f, y = 13.59f)
          // V 3
          verticalLineTo(y = 3.0f)
          // a 1 1 0 0 1 0.58 -0.91
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.58f,
            dy1 = -0.91f,
          )
          // a 1 1 0 0 1 1.07 0.15
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.07f,
            dy1 = 0.15f,
          )
          // l 7 6
          lineToRelative(dx = 7.0f, dy = 6.0f)
          // A 1 1 0 0 1 24 9
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 9.0f,
          )
          // a 1 1 0 0 1 -0.29 0.75
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.29f,
            dy1 = 0.75f,
          )
          // L 17.41 16
          lineTo(x = 17.41f, y = 16.0f)
          // l 6.3 6.29
          lineToRelative(dx = 6.3f, dy = 6.29f)
          // A 1 1 0 0 1 24 23
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 23.0f,
          )
          // a 1 1 0 0 1 -0.35 0.72
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.35f,
            dy1 = 0.72f,
          )
          // l -7 6
          lineToRelative(dx = -7.0f, dy = 6.0f)
          // A 1 1 0 0 1 16 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 30.0f,
          )
          // m 1 -11.59
          moveToRelative(dx = 1.0f, dy = -11.59f)
          // v 8.42
          verticalLineToRelative(dy = 8.42f)
          // l 4.53 -3.89z
          lineToRelative(dx = 4.53f, dy = -3.89f)
          close()
          // m 0 -13.24
          moveToRelative(dx = 0.0f, dy = -13.24f)
          // v 8.42
          verticalLineToRelative(dy = 8.42f)
          // l 4.53 -4.53z
          lineToRelative(dx = 4.53f, dy = -4.53f)
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
      .also { _bluetooth = it }
  }

@Suppress("ObjectPropertyName")
private var _bluetooth: ImageVector? = null
