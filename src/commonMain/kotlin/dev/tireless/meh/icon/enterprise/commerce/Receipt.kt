// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Receipt: ImageVector
  get() {
    val current = _receipt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Receipt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="2" x="21.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 16
          moveTo(x = 21.0f, y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="8" height="2" x="9.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 16
          moveTo(x = 9.0f, y = 16.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // <rect width="2" height="2" x="21.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 12
          moveTo(x = 21.0f, y = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="8" height="2" x="9.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 12
          moveTo(x = 9.0f, y = 12.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // <rect width="14" height="2" x="9.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 8
          moveTo(x = 9.0f, y = 8.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // M25 2 H7 a2 2 0 0 0 -2 2 v25 a1 1 0 0 0 1 1 h1 a1 1 0 0 0 .8 -.4 l2.2 -2.93 2.2 2.93 a1.04 1.04 0 0 0 1.6 0 l2.2 -2.93 2.2 2.93 a1.04 1.04 0 0 0 1.6 0 l2.2 -2.93 2.2 2.93 A1 1 0 0 0 25 30 h1 a1 1 0 0 0 1 -1 V4 a2 2 0 0 0 -2 -2 m0 25.33 -2.2 -2.93 a1.04 1.04 0 0 0 -1.6 0 L19 27.33 l-2.2 -2.93 a1.04 1.04 0 0 0 -1.6 0 L13 27.33 l-2.2 -2.93 a1.04 1.04 0 0 0 -1.6 0 L7 27.33 V4 h18Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 2
          moveTo(x = 25.0f, y = 2.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
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
          // v 25
          verticalLineToRelative(dy = 25.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // a 1 1 0 0 0 0.8 -0.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.8f,
            dy1 = -0.4f,
          )
          // l 2.2 -2.93
          lineToRelative(dx = 2.2f, dy = -2.93f)
          // l 2.2 2.93
          lineToRelative(dx = 2.2f, dy = 2.93f)
          // a 1.04 1.04 0 0 0 1.6 0
          arcToRelative(
            a = 1.04f,
            b = 1.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.6f,
            dy1 = 0.0f,
          )
          // l 2.2 -2.93
          lineToRelative(dx = 2.2f, dy = -2.93f)
          // l 2.2 2.93
          lineToRelative(dx = 2.2f, dy = 2.93f)
          // a 1.04 1.04 0 0 0 1.6 0
          arcToRelative(
            a = 1.04f,
            b = 1.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.6f,
            dy1 = 0.0f,
          )
          // l 2.2 -2.93
          lineToRelative(dx = 2.2f, dy = -2.93f)
          // l 2.2 2.93
          lineToRelative(dx = 2.2f, dy = 2.93f)
          // A 1 1 0 0 0 25 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 30.0f,
          )
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
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
          // m 0 25.33
          moveToRelative(dx = 0.0f, dy = 25.33f)
          // l -2.2 -2.93
          lineToRelative(dx = -2.2f, dy = -2.93f)
          // a 1.04 1.04 0 0 0 -1.6 0
          arcToRelative(
            a = 1.04f,
            b = 1.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.6f,
            dy1 = 0.0f,
          )
          // L 19 27.33
          lineTo(x = 19.0f, y = 27.33f)
          // l -2.2 -2.93
          lineToRelative(dx = -2.2f, dy = -2.93f)
          // a 1.04 1.04 0 0 0 -1.6 0
          arcToRelative(
            a = 1.04f,
            b = 1.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.6f,
            dy1 = 0.0f,
          )
          // L 13 27.33
          lineTo(x = 13.0f, y = 27.33f)
          // l -2.2 -2.93
          lineToRelative(dx = -2.2f, dy = -2.93f)
          // a 1.04 1.04 0 0 0 -1.6 0
          arcToRelative(
            a = 1.04f,
            b = 1.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.6f,
            dy1 = 0.0f,
          )
          // L 7 27.33
          lineTo(x = 7.0f, y = 27.33f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 18z
          horizontalLineToRelative(dx = 18.0f)
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
      .also { _receipt = it }
  }

@Suppress("ObjectPropertyName")
private var _receipt: ImageVector? = null
