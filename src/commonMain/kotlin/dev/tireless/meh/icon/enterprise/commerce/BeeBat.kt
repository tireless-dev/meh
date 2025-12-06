// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BeeBat: ImageVector
  get() {
    val current = _beeBat
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BeeBat",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="13.0" cy="8.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 8
          moveTo(x = 13.0f, y = 8.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="19.0" cy="8.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 8
          moveTo(x = 19.0f, y = 8.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M31.8 8.66 A.9 .9 0 0 0 31 8.13 h-2 c-4.21 0 -7.72 2 -9.16 4.9 a4.82 4.82 0 0 0 -7.67 0 c-1.45 -2.9 -4.96 -4.9 -9.17 -4.9 H1 a.87 .87 0 0 0 -.62 1.5 l.1 .1 a5.4 5.4 0 0 1 1.68 6.03 A.88 .88 0 0 0 3 16.88 a3 3 0 0 1 2.16 .72 c.98 .98 .97 2.89 .97 4.15 V22 A.9 .9 0 0 0 7 22.88 h4.13 V23 a4.88 4.88 0 0 0 9.74 0 v-.12 H25 A.9 .9 0 0 0 25.88 22 v-.25 c-.01 -1.26 -.02 -3.17 .96 -4.15 A3 3 0 0 1 29 16.87 a.88 .88 0 0 0 .84 -1.12 5.4 5.4 0 0 1 1.68 -6.03 l.1 -.1 a.9 .9 0 0 0 .19 -.95 M16 12.88 A3.13 3.13 0 0 1 19.13 16 v.13 h-6.25 V16 A3.13 3.13 0 0 1 16 12.88 m-3.12 5 h6.24 v3.25 h-6.25Z m-5 3.25 c-.02 -1.46 -.19 -3.47 -1.48 -4.76 a4.2 4.2 0 0 0 -2.31 -1.16 6.7 6.7 0 0 0 -1.14 -5.34 H3 c4.56 0 8.13 2.7 8.13 6.13 v5.13Z M19.12 23 a3.13 3.13 0 0 1 -6.25 0 v-.12 h6.24Z m8.78 -7.79 a4.2 4.2 0 0 0 -2.3 1.16 c-1.3 1.3 -1.47 3.3 -1.48 4.76 h-3.25 V16 c0 -3.43 3.56 -6.12 8.12 -6.12 h.05 a6.7 6.7 0 0 0 -1.14 5.33
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 31.8 8.66
          moveTo(x = 31.8f, y = 8.66f)
          // A 0.9 0.9 0 0 0 31 8.13
          arcTo(
            horizontalEllipseRadius = 0.9f,
            verticalEllipseRadius = 0.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 31.0f,
            y1 = 8.13f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // c -4.21 0 -7.72 2 -9.16 4.9
          curveToRelative(
            dx1 = -4.21f,
            dy1 = 0.0f,
            dx2 = -7.72f,
            dy2 = 2.0f,
            dx3 = -9.16f,
            dy3 = 4.9f,
          )
          // a 4.82 4.82 0 0 0 -7.67 0
          arcToRelative(
            a = 4.82f,
            b = 4.82f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.67f,
            dy1 = 0.0f,
          )
          // c -1.45 -2.9 -4.96 -4.9 -9.17 -4.9
          curveToRelative(
            dx1 = -1.45f,
            dy1 = -2.9f,
            dx2 = -4.96f,
            dy2 = -4.9f,
            dx3 = -9.17f,
            dy3 = -4.9f,
          )
          // H 1
          horizontalLineTo(x = 1.0f)
          // a 0.87 0.87 0 0 0 -0.62 1.5
          arcToRelative(
            a = 0.87f,
            b = 0.87f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.62f,
            dy1 = 1.5f,
          )
          // l 0.1 0.1
          lineToRelative(dx = 0.1f, dy = 0.1f)
          // a 5.4 5.4 0 0 1 1.68 6.03
          arcToRelative(
            a = 5.4f,
            b = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.68f,
            dy1 = 6.03f,
          )
          // A 0.88 0.88 0 0 0 3 16.88
          arcTo(
            horizontalEllipseRadius = 0.88f,
            verticalEllipseRadius = 0.88f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.0f,
            y1 = 16.88f,
          )
          // a 3 3 0 0 1 2.16 0.72
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.16f,
            dy1 = 0.72f,
          )
          // c 0.98 0.98 0.97 2.89 0.97 4.15
          curveToRelative(
            dx1 = 0.98f,
            dy1 = 0.98f,
            dx2 = 0.97f,
            dy2 = 2.89f,
            dx3 = 0.97f,
            dy3 = 4.15f,
          )
          // V 22
          verticalLineTo(y = 22.0f)
          // A 0.9 0.9 0 0 0 7 22.88
          arcTo(
            horizontalEllipseRadius = 0.9f,
            verticalEllipseRadius = 0.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.0f,
            y1 = 22.88f,
          )
          // h 4.13
          horizontalLineToRelative(dx = 4.13f)
          // V 23
          verticalLineTo(y = 23.0f)
          // a 4.88 4.88 0 0 0 9.74 0
          arcToRelative(
            a = 4.88f,
            b = 4.88f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 9.74f,
            dy1 = 0.0f,
          )
          // v -0.12
          verticalLineToRelative(dy = -0.12f)
          // H 25
          horizontalLineTo(x = 25.0f)
          // A 0.9 0.9 0 0 0 25.88 22
          arcTo(
            horizontalEllipseRadius = 0.9f,
            verticalEllipseRadius = 0.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.88f,
            y1 = 22.0f,
          )
          // v -0.25
          verticalLineToRelative(dy = -0.25f)
          // c -0.01 -1.26 -0.02 -3.17 0.96 -4.15
          curveToRelative(
            dx1 = -0.01f,
            dy1 = -1.26f,
            dx2 = -0.02f,
            dy2 = -3.17f,
            dx3 = 0.96f,
            dy3 = -4.15f,
          )
          // A 3 3 0 0 1 29 16.87
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 29.0f,
            y1 = 16.87f,
          )
          // a 0.88 0.88 0 0 0 0.84 -1.12
          arcToRelative(
            a = 0.88f,
            b = 0.88f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.84f,
            dy1 = -1.12f,
          )
          // a 5.4 5.4 0 0 1 1.68 -6.03
          arcToRelative(
            a = 5.4f,
            b = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.68f,
            dy1 = -6.03f,
          )
          // l 0.1 -0.1
          lineToRelative(dx = 0.1f, dy = -0.1f)
          // a 0.9 0.9 0 0 0 0.19 -0.95
          arcToRelative(
            a = 0.9f,
            b = 0.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.19f,
            dy1 = -0.95f,
          )
          // M 16 12.88
          moveTo(x = 16.0f, y = 12.88f)
          // A 3.13 3.13 0 0 1 19.13 16
          arcTo(
            horizontalEllipseRadius = 3.13f,
            verticalEllipseRadius = 3.13f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 19.13f,
            y1 = 16.0f,
          )
          // v 0.13
          verticalLineToRelative(dy = 0.13f)
          // h -6.25
          horizontalLineToRelative(dx = -6.25f)
          // V 16
          verticalLineTo(y = 16.0f)
          // A 3.13 3.13 0 0 1 16 12.88
          arcTo(
            horizontalEllipseRadius = 3.13f,
            verticalEllipseRadius = 3.13f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 12.88f,
          )
          // m -3.12 5
          moveToRelative(dx = -3.12f, dy = 5.0f)
          // h 6.24
          horizontalLineToRelative(dx = 6.24f)
          // v 3.25
          verticalLineToRelative(dy = 3.25f)
          // h -6.25z
          horizontalLineToRelative(dx = -6.25f)
          close()
          // m -5 3.25
          moveToRelative(dx = -5.0f, dy = 3.25f)
          // c -0.02 -1.46 -0.19 -3.47 -1.48 -4.76
          curveToRelative(
            dx1 = -0.02f,
            dy1 = -1.46f,
            dx2 = -0.19f,
            dy2 = -3.47f,
            dx3 = -1.48f,
            dy3 = -4.76f,
          )
          // a 4.2 4.2 0 0 0 -2.31 -1.16
          arcToRelative(
            a = 4.2f,
            b = 4.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.31f,
            dy1 = -1.16f,
          )
          // a 6.7 6.7 0 0 0 -1.14 -5.34
          arcToRelative(
            a = 6.7f,
            b = 6.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.14f,
            dy1 = -5.34f,
          )
          // H 3
          horizontalLineTo(x = 3.0f)
          // c 4.56 0 8.13 2.7 8.13 6.13
          curveToRelative(
            dx1 = 4.56f,
            dy1 = 0.0f,
            dx2 = 8.13f,
            dy2 = 2.7f,
            dx3 = 8.13f,
            dy3 = 6.13f,
          )
          // v 5.13z
          verticalLineToRelative(dy = 5.13f)
          close()
          // M 19.12 23
          moveTo(x = 19.12f, y = 23.0f)
          // a 3.13 3.13 0 0 1 -6.25 0
          arcToRelative(
            a = 3.13f,
            b = 3.13f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.25f,
            dy1 = 0.0f,
          )
          // v -0.12
          verticalLineToRelative(dy = -0.12f)
          // h 6.24z
          horizontalLineToRelative(dx = 6.24f)
          close()
          // m 8.78 -7.79
          moveToRelative(dx = 8.78f, dy = -7.79f)
          // a 4.2 4.2 0 0 0 -2.3 1.16
          arcToRelative(
            a = 4.2f,
            b = 4.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.3f,
            dy1 = 1.16f,
          )
          // c -1.3 1.3 -1.47 3.3 -1.48 4.76
          curveToRelative(
            dx1 = -1.3f,
            dy1 = 1.3f,
            dx2 = -1.47f,
            dy2 = 3.3f,
            dx3 = -1.48f,
            dy3 = 4.76f,
          )
          // h -3.25
          horizontalLineToRelative(dx = -3.25f)
          // V 16
          verticalLineTo(y = 16.0f)
          // c 0 -3.43 3.56 -6.12 8.12 -6.12
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.43f,
            dx2 = 3.56f,
            dy2 = -6.12f,
            dx3 = 8.12f,
            dy3 = -6.12f,
        )
        // h 0.05
        horizontalLineToRelative(dx = 0.05f)
        // a 6.7 6.7 0 0 0 -1.14 5.33
        arcToRelative(
          a = 6.7f,
          b = 6.7f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          dx1 = -1.14f,
          dy1 = 5.33f,
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
      .also { _beeBat = it }
  }

@Suppress("ObjectPropertyName")
private var _beeBat: ImageVector? = null
