// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ConnectionSignalOff: ImageVector
  get() {
    val current = _connectionSignalOff
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ConnectionSignalOff",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 13 a9 9 0 0 1 -2.52 6.23 l1.4 1.42 A10.98 10.98 0 0 0 23.6 4.2 l-1.2 1.6 A9 9 0 0 1 26 13
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 13
          moveTo(x = 26.0f, y = 13.0f)
          // a 9 9 0 0 1 -2.52 6.23
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.52f,
            dy1 = 6.23f,
          )
          // l 1.4 1.42
          lineToRelative(dx = 1.4f, dy = 1.42f)
          // A 10.98 10.98 0 0 0 23.6 4.2
          arcTo(
            horizontalEllipseRadius = 10.98f,
            verticalEllipseRadius = 10.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.6f,
            y1 = 4.2f,
          )
          // l -1.2 1.6
          lineToRelative(dx = -1.2f, dy = 1.6f)
          // A 9 9 0 0 1 26 13
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 26.0f,
            y1 = 13.0f,
          )
        }
        // M21 13 a5 5 0 0 1 -.9 2.86 l1.43 1.42 a7 7 0 0 0 -.86 -9.5 l-1.34 1.5 A5 5 0 0 1 21 13 m9 15.59 L3.41 2 2 3.41 l3.71 3.71 A11 11 0 0 0 8.4 21.8 l1.2 -1.6 A9 9 0 0 1 7.17 8.6 l2.2 2.2 a7 7 0 0 0 1.96 7.43 l1.34 -1.5 A5 5 0 0 1 11 13 l.04 -.55 L15 16.41 V30 h2 V18.41 L28.59 30Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 13
          moveTo(x = 21.0f, y = 13.0f)
          // a 5 5 0 0 1 -0.9 2.86
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.9f,
            dy1 = 2.86f,
          )
          // l 1.43 1.42
          lineToRelative(dx = 1.43f, dy = 1.42f)
          // a 7 7 0 0 0 -0.86 -9.5
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.86f,
            dy1 = -9.5f,
          )
          // l -1.34 1.5
          lineToRelative(dx = -1.34f, dy = 1.5f)
          // A 5 5 0 0 1 21 13
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 21.0f,
            y1 = 13.0f,
          )
          // m 9 15.59
          moveToRelative(dx = 9.0f, dy = 15.59f)
          // L 3.41 2
          lineTo(x = 3.41f, y = 2.0f)
          // L 2 3.41
          lineTo(x = 2.0f, y = 3.41f)
          // l 3.71 3.71
          lineToRelative(dx = 3.71f, dy = 3.71f)
          // A 11 11 0 0 0 8.4 21.8
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.4f,
            y1 = 21.8f,
          )
          // l 1.2 -1.6
          lineToRelative(dx = 1.2f, dy = -1.6f)
          // A 9 9 0 0 1 7.17 8.6
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 7.17f,
            y1 = 8.6f,
          )
          // l 2.2 2.2
          lineToRelative(dx = 2.2f, dy = 2.2f)
          // a 7 7 0 0 0 1.96 7.43
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.96f,
            dy1 = 7.43f,
          )
          // l 1.34 -1.5
          lineToRelative(dx = 1.34f, dy = -1.5f)
          // A 5 5 0 0 1 11 13
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 11.0f,
            y1 = 13.0f,
          )
          // l 0.04 -0.55
          lineToRelative(dx = 0.04f, dy = -0.55f)
          // L 15 16.41
          lineTo(x = 15.0f, y = 16.41f)
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 18.41
          verticalLineTo(y = 18.41f)
          // L 28.59 30z
          lineTo(x = 28.59f, y = 30.0f)
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
      .also { _connectionSignalOff = it }
  }

@Suppress("ObjectPropertyName")
private var _connectionSignalOff: ImageVector? = null
