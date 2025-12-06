// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ScanDisabled: ImageVector
  get() {
    val current = _scanDisabled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ScanDisabled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.38 2.08 a1 1 0 0 0 -1.09 .21 l-26 26 A1 1 0 0 0 3 30 h8 v-2 H5.41 l4 -4 H22 a2 2 0 0 0 2 -2 V9.41 l4 -4 V11 h2 V3 a1 1 0 0 0 -.62 -.92 M22 22 H11.41 L22 11.41Z m-12 -4.24 V10 h7.76 l2 -2 H10 a2 2 0 0 0 -2 2 v9.76Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.38 2.08
          moveTo(x = 29.38f, y = 2.08f)
          // a 1 1 0 0 0 -1.09 0.21
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.09f,
            dy1 = 0.21f,
          )
          // l -26 26
          lineToRelative(dx = -26.0f, dy = 26.0f)
          // A 1 1 0 0 0 3 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.0f,
            y1 = 30.0f,
          )
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 5.41
          horizontalLineTo(x = 5.41f)
          // l 4 -4
          lineToRelative(dx = 4.0f, dy = -4.0f)
          // H 22
          horizontalLineTo(x = 22.0f)
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
          // V 9.41
          verticalLineTo(y = 9.41f)
          // l 4 -4
          lineToRelative(dx = 4.0f, dy = -4.0f)
          // V 11
          verticalLineTo(y = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 3
          verticalLineTo(y = 3.0f)
          // a 1 1 0 0 0 -0.62 -0.92
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.62f,
            dy1 = -0.92f,
          )
          // M 22 22
          moveTo(x = 22.0f, y = 22.0f)
          // H 11.41
          horizontalLineTo(x = 11.41f)
          // L 22 11.41z
          lineTo(x = 22.0f, y = 11.41f)
          close()
          // m -12 -4.24
          moveToRelative(dx = -12.0f, dy = -4.24f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 7.76
          horizontalLineToRelative(dx = 7.76f)
          // l 2 -2
          lineToRelative(dx = 2.0f, dy = -2.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
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
          // v 9.76z
          verticalLineToRelative(dy = 9.76f)
          close()
        }
        // <polygon points="11.0 2.0 2.0 2.0 2.0 11.0 4.0 11.0 4.0 4.0 11.0 4.0 11.0 2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 2
          moveTo(x = 11.0f, y = 2.0f)
          // L 2 2
          lineTo(x = 2.0f, y = 2.0f)
          // L 2 11
          lineTo(x = 2.0f, y = 11.0f)
          // L 4 11
          lineTo(x = 4.0f, y = 11.0f)
          // L 4 4
          lineTo(x = 4.0f, y = 4.0f)
          // L 11 4
          lineTo(x = 11.0f, y = 4.0f)
          // L 11 2z
          lineTo(x = 11.0f, y = 2.0f)
          close()
        }
        // <polygon points="21.0 30.0 30.0 30.0 30.0 21.0 28.0 21.0 28.0 28.0 21.0 28.0 21.0 30.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 30
          moveTo(x = 21.0f, y = 30.0f)
          // L 30 30
          lineTo(x = 30.0f, y = 30.0f)
          // L 30 21
          lineTo(x = 30.0f, y = 21.0f)
          // L 28 21
          lineTo(x = 28.0f, y = 21.0f)
          // L 28 28
          lineTo(x = 28.0f, y = 28.0f)
          // L 21 28
          lineTo(x = 21.0f, y = 28.0f)
          // L 21 30z
          lineTo(x = 21.0f, y = 30.0f)
          close()
        }
        // <polygon points="4.0 23.755 4.0 21.0 2.0 21.0 2.0 25.754 4.0 23.755" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 23.755
          moveTo(x = 4.0f, y = 23.755f)
          // L 4 21
          lineTo(x = 4.0f, y = 21.0f)
          // L 2 21
          lineTo(x = 2.0f, y = 21.0f)
          // L 2 25.754
          lineTo(x = 2.0f, y = 25.754f)
          // L 4 23.755z
          lineTo(x = 4.0f, y = 23.755f)
          close()
        }
        // <polygon points="25.755 2.0 21.0 2.0 21.0 4.0 23.755 4.0 25.755 2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.755 2
          moveTo(x = 25.755f, y = 2.0f)
          // L 21 2
          lineTo(x = 21.0f, y = 2.0f)
          // L 21 4
          lineTo(x = 21.0f, y = 4.0f)
          // L 23.755 4
          lineTo(x = 23.755f, y = 4.0f)
          // L 25.755 2z
          lineTo(x = 25.755f, y = 2.0f)
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
      .also { _scanDisabled = it }
  }

@Suppress("ObjectPropertyName")
private var _scanDisabled: ImageVector? = null
