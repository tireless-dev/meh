// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.ibm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bee: ImageVector
  get() {
    val current = _bee
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Bee",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 10 a6 6 0 0 0 -6 6 v8 a6 6 0 0 0 12 0 v-8 a6 6 0 0 0 -6 -6 m-4.25 7.87 h8.5 v4.25 h-8.5Z M16 28.25 A4.27 4.27 0 0 1 11.75 24 v-.13 h8.5 V24 A4.27 4.27 0 0 1 16 28.25 m4.25 -12.13 h-8.5 V16 a4.25 4.25 0 0 1 8.5 0Z m10.41 3.09 L24 13 v9.1 a4 4 0 0 0 8 0 3.8 3.8 0 0 0 -1.34 -2.89 M28 24.35 a2.25 2.25 0 0 1 -2.25 -2.25 V17 l3.72 3.47 A2 2 0 0 1 30.2 22 a2.25 2.25 0 0 1 -2.2 2.35 M0 22.1 a4 4 0 0 0 8 0 V13 l-6.66 6.21 A3.9 3.9 0 0 0 0 22.1 m2.48 -1.56 L6.25 17 v5.1 a2.25 2.25 0 0 1 -4.5 0 2 2 0 0 1 .73 -1.56 M15 5.5 A3.5 3.5 0 1 0 11.5 9 3.5 3.5 0 0 0 15 5.5 m-5.25 0 a1.75 1.75 0 1 1 1.75 1.75 A1.77 1.77 0 0 1 9.75 5.5 M20.5 2 A3.5 3.5 0 1 0 24 5.5 3.5 3.5 0 0 0 20.5 2 m0 5.25 a1.75 1.75 0 1 1 1.75 -1.75 1.77 1.77 0 0 1 -1.75 1.75
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 10
          moveTo(x = 16.0f, y = 10.0f)
          // a 6 6 0 0 0 -6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = 6.0f,
          )
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // a 6 6 0 0 0 12 0
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 12.0f,
            dy1 = 0.0f,
          )
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // a 6 6 0 0 0 -6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = -6.0f,
          )
          // m -4.25 7.87
          moveToRelative(dx = -4.25f, dy = 7.87f)
          // h 8.5
          horizontalLineToRelative(dx = 8.5f)
          // v 4.25
          verticalLineToRelative(dy = 4.25f)
          // h -8.5z
          horizontalLineToRelative(dx = -8.5f)
          close()
          // M 16 28.25
          moveTo(x = 16.0f, y = 28.25f)
          // A 4.27 4.27 0 0 1 11.75 24
          arcTo(
            horizontalEllipseRadius = 4.27f,
            verticalEllipseRadius = 4.27f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 11.75f,
            y1 = 24.0f,
          )
          // v -0.13
          verticalLineToRelative(dy = -0.13f)
          // h 8.5
          horizontalLineToRelative(dx = 8.5f)
          // V 24
          verticalLineTo(y = 24.0f)
          // A 4.27 4.27 0 0 1 16 28.25
          arcTo(
            horizontalEllipseRadius = 4.27f,
            verticalEllipseRadius = 4.27f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 28.25f,
          )
          // m 4.25 -12.13
          moveToRelative(dx = 4.25f, dy = -12.13f)
          // h -8.5
          horizontalLineToRelative(dx = -8.5f)
          // V 16
          verticalLineTo(y = 16.0f)
          // a 4.25 4.25 0 0 1 8.5 0z
          arcToRelative(
            a = 4.25f,
            b = 4.25f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.5f,
            dy1 = 0.0f,
          )
          close()
          // m 10.41 3.09
          moveToRelative(dx = 10.41f, dy = 3.09f)
          // L 24 13
          lineTo(x = 24.0f, y = 13.0f)
          // v 9.1
          verticalLineToRelative(dy = 9.1f)
          // a 4 4 0 0 0 8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          // a 3.8 3.8 0 0 0 -1.34 -2.89
          arcToRelative(
            a = 3.8f,
            b = 3.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.34f,
            dy1 = -2.89f,
          )
          // M 28 24.35
          moveTo(x = 28.0f, y = 24.35f)
          // a 2.25 2.25 0 0 1 -2.25 -2.25
          arcToRelative(
            a = 2.25f,
            b = 2.25f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.25f,
            dy1 = -2.25f,
          )
          // V 17
          verticalLineTo(y = 17.0f)
          // l 3.72 3.47
          lineToRelative(dx = 3.72f, dy = 3.47f)
          // A 2 2 0 0 1 30.2 22
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 30.2f,
            y1 = 22.0f,
          )
          // a 2.25 2.25 0 0 1 -2.2 2.35
          arcToRelative(
            a = 2.25f,
            b = 2.25f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.2f,
            dy1 = 2.35f,
          )
          // M 0 22.1
          moveTo(x = 0.0f, y = 22.1f)
          // a 4 4 0 0 0 8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          // V 13
          verticalLineTo(y = 13.0f)
          // l -6.66 6.21
          lineToRelative(dx = -6.66f, dy = 6.21f)
          // A 3.9 3.9 0 0 0 0 22.1
          arcTo(
            horizontalEllipseRadius = 3.9f,
            verticalEllipseRadius = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 0.0f,
            y1 = 22.1f,
          )
          // m 2.48 -1.56
          moveToRelative(dx = 2.48f, dy = -1.56f)
          // L 6.25 17
          lineTo(x = 6.25f, y = 17.0f)
          // v 5.1
          verticalLineToRelative(dy = 5.1f)
          // a 2.25 2.25 0 0 1 -4.5 0
          arcToRelative(
            a = 2.25f,
            b = 2.25f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.5f,
            dy1 = 0.0f,
          )
          // a 2 2 0 0 1 0.73 -1.56
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.73f,
            dy1 = -1.56f,
          )
          // M 15 5.5
          moveTo(x = 15.0f, y = 5.5f)
          // A 3.5 3.5 0 1 0 11.5 9
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 11.5f,
            y1 = 9.0f,
          )
          // A 3.5 3.5 0 0 0 15 5.5
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 5.5f,
          )
          // m -5.25 0
          moveToRelative(dx = -5.25f, dy = 0.0f)
          // a 1.75 1.75 0 1 1 1.75 1.75
          arcToRelative(
            a = 1.75f,
            b = 1.75f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.75f,
            dy1 = 1.75f,
          )
          // A 1.77 1.77 0 0 1 9.75 5.5
          arcTo(
            horizontalEllipseRadius = 1.77f,
            verticalEllipseRadius = 1.77f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.75f,
            y1 = 5.5f,
          )
          // M 20.5 2
          moveTo(x = 20.5f, y = 2.0f)
          // A 3.5 3.5 0 1 0 24 5.5
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 5.5f,
          )
          // A 3.5 3.5 0 0 0 20.5 2
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.5f,
            y1 = 2.0f,
          )
          // m 0 5.25
          moveToRelative(dx = 0.0f, dy = 5.25f)
          // a 1.75 1.75 0 1 1 1.75 -1.75
          arcToRelative(
            a = 1.75f,
            b = 1.75f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.75f,
            dy1 = -1.75f,
          )
          // a 1.77 1.77 0 0 1 -1.75 1.75
          arcToRelative(
            a = 1.77f,
            b = 1.77f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.75f,
            dy1 = 1.75f,
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
      .also { _bee = it }
  }

@Suppress("ObjectPropertyName")
private var _bee: ImageVector? = null
