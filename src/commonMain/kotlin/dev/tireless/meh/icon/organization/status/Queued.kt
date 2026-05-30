// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Queued: ImageVector
  get() {
    val current = _queued
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Queued",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="8" height="2" x="22.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 20
          moveTo(x = 22.0f, y = 20.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // <rect width="8" height="2" x="22.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 24
          moveTo(x = 22.0f, y = 24.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // <rect width="8" height="2" x="22.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 28
          moveTo(x = 22.0f, y = 28.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // <rect width="2" height="2" x="18.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 24
          moveTo(x = 18.0f, y = 24.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="18.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 20
          moveTo(x = 18.0f, y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="18.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 28
          moveTo(x = 18.0f, y = 28.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M6.81 8.3 a12 12 0 0 1 3.2 -2.68 L9 3.89 a14 14 0 0 0 -3.73 3.12Z m18.38 0 L26.72 7 a14 14 0 0 0 -3.73 -3.11 l-1 1.73 a12 12 0 0 1 3.2 2.67 M4.74 11.9 l-1.88 -.68 A14 14 0 0 0 2 16 h2 a12 12 0 0 1 .74 -4.1 M6.8 23.7 a12 12 0 0 1 -2.07 -3.6 l-1.88 .68 A14 14 0 0 0 5.28 25Z m20.45 -11.8 A12 12 0 0 1 28 16 h2 a14 14 0 0 0 -.86 -4.78Z M13.92 27.8 A12 12 0 0 1 10 26.39 l-1 1.73 a14 14 0 0 0 4.56 1.66Z m0 -23.6 a11 11 0 0 1 4.16 0 l.35 -1.97 a13 13 0 0 0 -4.86 0Z
        path(
          fill = SolidColor(Color(0xFF090909)),
        ) {
          // M 6.81 8.3
          moveTo(x = 6.81f, y = 8.3f)
          // a 12 12 0 0 1 3.2 -2.68
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.2f,
            dy1 = -2.68f,
          )
          // L 9 3.89
          lineTo(x = 9.0f, y = 3.89f)
          // a 14 14 0 0 0 -3.73 3.12z
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.73f,
            dy1 = 3.12f,
          )
          close()
          // m 18.38 0
          moveToRelative(dx = 18.38f, dy = 0.0f)
          // L 26.72 7
          lineTo(x = 26.72f, y = 7.0f)
          // a 14 14 0 0 0 -3.73 -3.11
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.73f,
            dy1 = -3.11f,
          )
          // l -1 1.73
          lineToRelative(dx = -1.0f, dy = 1.73f)
          // a 12 12 0 0 1 3.2 2.67
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.2f,
            dy1 = 2.67f,
          )
          // M 4.74 11.9
          moveTo(x = 4.74f, y = 11.9f)
          // l -1.88 -0.68
          lineToRelative(dx = -1.88f, dy = -0.68f)
          // A 14 14 0 0 0 2 16
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 16.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 12 12 0 0 1 0.74 -4.1
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.74f,
            dy1 = -4.1f,
          )
          // M 6.8 23.7
          moveTo(x = 6.8f, y = 23.7f)
          // a 12 12 0 0 1 -2.07 -3.6
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.07f,
            dy1 = -3.6f,
          )
          // l -1.88 0.68
          lineToRelative(dx = -1.88f, dy = 0.68f)
          // A 14 14 0 0 0 5.28 25z
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 5.28f,
            y1 = 25.0f,
          )
          close()
          // m 20.45 -11.8
          moveToRelative(dx = 20.45f, dy = -11.8f)
          // A 12 12 0 0 1 28 16
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.0f,
            y1 = 16.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 14 14 0 0 0 -0.86 -4.78z
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.86f,
            dy1 = -4.78f,
          )
          close()
          // M 13.92 27.8
          moveTo(x = 13.92f, y = 27.8f)
          // A 12 12 0 0 1 10 26.39
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 10.0f,
            y1 = 26.39f,
          )
          // l -1 1.73
          lineToRelative(dx = -1.0f, dy = 1.73f)
          // a 14 14 0 0 0 4.56 1.66z
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.56f,
            dy1 = 1.66f,
          )
          close()
          // m 0 -23.6
          moveToRelative(dx = 0.0f, dy = -23.6f)
          // a 11 11 0 0 1 4.16 0
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.16f,
            dy1 = 0.0f,
          )
          // l 0.35 -1.97
          lineToRelative(dx = 0.35f, dy = -1.97f)
          // a 13 13 0 0 0 -4.86 0z
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.86f,
            dy1 = 0.0f,
          )
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
      .also { _queued = it }
  }

@Suppress("ObjectPropertyName")
private var _queued: ImageVector? = null
