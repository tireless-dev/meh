// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sustainability: ImageVector
  get() {
    val current = _sustainability
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Sustainability",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21.57 27.75 A13.01 13.01 0 0 1 6 7.69 V10 h2 V4 H2 v2 h2.84 A15 15 0 0 0 1 16 a15.02 15.02 0 0 0 21.43 13.56z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.57 27.75
          moveTo(x = 21.57f, y = 27.75f)
          // A 13.01 13.01 0 0 1 6 7.69
          arcTo(
            horizontalEllipseRadius = 13.01f,
            verticalEllipseRadius = 13.01f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.0f,
            y1 = 7.69f,
          )
          // V 10
          verticalLineTo(y = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.84
          horizontalLineToRelative(dx = 2.84f)
          // A 15 15 0 0 0 1 16
          arcTo(
            horizontalEllipseRadius = 15.0f,
            verticalEllipseRadius = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 1.0f,
            y1 = 16.0f,
          )
          // a 15.02 15.02 0 0 0 21.43 13.56z
          arcToRelative(
            a = 15.02f,
            b = 15.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 21.43f,
            dy1 = 13.56f,
          )
          close()
        }
        // M21 9 a6 6 0 0 0 -5.98 5.56 A6 6 0 0 0 11 13 H7 v4 a6 6 0 0 0 6 6 h2 v4 h2 v-8 h2 a6 6 0 0 0 6 -6 V9z m-8 12 a4 4 0 0 1 -4 -4 v-2 h2 a4 4 0 0 1 4 4 v.59 l-2.3 -2.3 -1.4 1.42 L13.58 21z m10 -8 a4 4 0 0 1 -4 4 h-.59 l2.3 -2.3 -1.42 -1.4 L17 15.58 V15 a4 4 0 0 1 4 -4 h2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 9
          moveTo(x = 21.0f, y = 9.0f)
          // a 6 6 0 0 0 -5.98 5.56
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.98f,
            dy1 = 5.56f,
          )
          // A 6 6 0 0 0 11 13
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.0f,
            y1 = 13.0f,
          )
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // a 6 6 0 0 0 6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = 6.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 6 6 0 0 0 6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = -6.0f,
          )
          // V 9z
          verticalLineTo(y = 9.0f)
          close()
          // m -8 12
          moveToRelative(dx = -8.0f, dy = 12.0f)
          // a 4 4 0 0 1 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 4 4 0 0 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // v 0.59
          verticalLineToRelative(dy = 0.59f)
          // l -2.3 -2.3
          lineToRelative(dx = -2.3f, dy = -2.3f)
          // l -1.4 1.42
          lineToRelative(dx = -1.4f, dy = 1.42f)
          // L 13.58 21z
          lineTo(x = 13.58f, y = 21.0f)
          close()
          // m 10 -8
          moveToRelative(dx = 10.0f, dy = -8.0f)
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // h -0.59
          horizontalLineToRelative(dx = -0.59f)
          // l 2.3 -2.3
          lineToRelative(dx = 2.3f, dy = -2.3f)
          // l -1.42 -1.4
          lineToRelative(dx = -1.42f, dy = -1.4f)
          // L 17 15.58
          lineTo(x = 17.0f, y = 15.58f)
          // V 15
          verticalLineTo(y = 15.0f)
          // a 4 4 0 0 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
        }
        // M31 16 A15.02 15.02 0 0 0 9.57 2.44 l.86 1.81 A13.01 13.01 0 0 1 26 24.31 V22 h-2 v6 h6 v-2 h-2.84 A15 15 0 0 0 31 16
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 31 16
          moveTo(x = 31.0f, y = 16.0f)
          // A 15.02 15.02 0 0 0 9.57 2.44
          arcTo(
            horizontalEllipseRadius = 15.02f,
            verticalEllipseRadius = 15.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.57f,
            y1 = 2.44f,
          )
          // l 0.86 1.81
          lineToRelative(dx = 0.86f, dy = 1.81f)
          // A 13.01 13.01 0 0 1 26 24.31
          arcTo(
            horizontalEllipseRadius = 13.01f,
            verticalEllipseRadius = 13.01f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 26.0f,
            y1 = 24.31f,
          )
          // V 22
          verticalLineTo(y = 22.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2.84
          horizontalLineToRelative(dx = -2.84f)
          // A 15 15 0 0 0 31 16
          arcTo(
            horizontalEllipseRadius = 15.0f,
            verticalEllipseRadius = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 31.0f,
            y1 = 16.0f,
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
      .also { _sustainability = it }
  }

@Suppress("ObjectPropertyName")
private var _sustainability: ImageVector? = null
