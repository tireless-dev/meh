// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SurrogateKeyFlatFile: ImageVector
  get() {
    val current = _surrogateKeyFlatFile
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SurrogateKeyFlatFile",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25 15 a5 5 0 0 0 -4.97 5.55 L15 25.6 V30 h4.41 l5.04 -5.03 A5 5 0 1 0 25 15 m2.99 5.67 a3.04 3.04 0 0 1 -3.66 2.25 l-.54 -.13 L18.6 28 H17 v-1.59 l5.2 -5.2 -.12 -.54 a3.03 3.03 0 1 1 5.9 0 M25.96 20 a1 1 0 1 1 -2 0 1 1 0 0 1 2 0 m-3.67 -8 a1.7 1.7 0 0 0 1.2 -2.91 l-6.78 -6.8 A1 1 0 0 0 16 2 H6 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h7.01 v-2 H6 V4 h8 v6 a2 2 0 0 0 2 2z M16 4.41 21.59 10 H16z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 15
          moveTo(x = 25.0f, y = 15.0f)
          // a 5 5 0 0 0 -4.97 5.55
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.97f,
            dy1 = 5.55f,
          )
          // L 15 25.6
          lineTo(x = 15.0f, y = 25.6f)
          // V 30
          verticalLineTo(y = 30.0f)
          // h 4.41
          horizontalLineToRelative(dx = 4.41f)
          // l 5.04 -5.03
          lineToRelative(dx = 5.04f, dy = -5.03f)
          // A 5 5 0 1 0 25 15
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 15.0f,
          )
          // m 2.99 5.67
          moveToRelative(dx = 2.99f, dy = 5.67f)
          // a 3.04 3.04 0 0 1 -3.66 2.25
          arcToRelative(
            a = 3.04f,
            b = 3.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.66f,
            dy1 = 2.25f,
          )
          // l -0.54 -0.13
          lineToRelative(dx = -0.54f, dy = -0.13f)
          // L 18.6 28
          lineTo(x = 18.6f, y = 28.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // v -1.59
          verticalLineToRelative(dy = -1.59f)
          // l 5.2 -5.2
          lineToRelative(dx = 5.2f, dy = -5.2f)
          // l -0.12 -0.54
          lineToRelative(dx = -0.12f, dy = -0.54f)
          // a 3.03 3.03 0 1 1 5.9 0
          arcToRelative(
            a = 3.03f,
            b = 3.03f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.9f,
            dy1 = 0.0f,
          )
          // M 25.96 20
          moveTo(x = 25.96f, y = 20.0f)
          // a 1 1 0 1 1 -2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 0 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // m -3.67 -8
          moveToRelative(dx = -3.67f, dy = -8.0f)
          // a 1.7 1.7 0 0 0 1.2 -2.91
          arcToRelative(
            a = 1.7f,
            b = 1.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.2f,
            dy1 = -2.91f,
          )
          // l -6.78 -6.8
          lineToRelative(dx = -6.78f, dy = -6.8f)
          // A 1 1 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
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
          // h 7.01
          horizontalLineToRelative(dx = 7.01f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 2 2 0 0 0 2 2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          close()
          // M 16 4.41
          moveTo(x = 16.0f, y = 4.41f)
          // L 21.59 10
          lineTo(x = 21.59f, y = 10.0f)
          // H 16z
          horizontalLineTo(x = 16.0f)
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
      .also { _surrogateKeyFlatFile = it }
  }

@Suppress("ObjectPropertyName")
private var _surrogateKeyFlatFile: ImageVector? = null
