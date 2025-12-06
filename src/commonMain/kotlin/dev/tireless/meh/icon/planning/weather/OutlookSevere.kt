// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val OutlookSevere: ImageVector
  get() {
    val current = _outlookSevere
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.OutlookSevere",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M15.12 19 h1.75 v5.5 h-1.75Z M17 27 a1 1 0 1 0 -1 1 1 1 0 0 0 1 -1
        path {
          // M 15.12 19
          moveTo(x = 15.12f, y = 19.0f)
          // h 1.75
          horizontalLineToRelative(dx = 1.75f)
          // v 5.5
          verticalLineToRelative(dy = 5.5f)
          // h -1.75z
          horizontalLineToRelative(dx = -1.75f)
          close()
          // M 17 27
          moveTo(x = 17.0f, y = 27.0f)
          // a 1 1 0 1 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
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
        }
        // m24.9 28.94 -8.07 -14.45 a.95 .95 0 0 0 -1.66 0 L7.09 28.94 A.71 .71 0 0 0 7.71 30 H24.3 a.71 .71 0 0 0 .62 -1.06 M15.14 19 h1.74 v5.5 h-1.75Z M16 28 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.9 28.94
          moveTo(x = 24.9f, y = 28.94f)
          // l -8.07 -14.45
          lineToRelative(dx = -8.07f, dy = -14.45f)
          // a 0.95 0.95 0 0 0 -1.66 0
          arcToRelative(
            a = 0.95f,
            b = 0.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.66f,
            dy1 = 0.0f,
          )
          // L 7.09 28.94
          lineTo(x = 7.09f, y = 28.94f)
          // A 0.71 0.71 0 0 0 7.71 30
          arcTo(
            horizontalEllipseRadius = 0.71f,
            verticalEllipseRadius = 0.71f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.71f,
            y1 = 30.0f,
          )
          // H 24.3
          horizontalLineTo(x = 24.3f)
          // a 0.71 0.71 0 0 0 0.62 -1.06
          arcToRelative(
            a = 0.71f,
            b = 0.71f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.62f,
            dy1 = -1.06f,
          )
          // M 15.14 19
          moveTo(x = 15.14f, y = 19.0f)
          // h 1.74
          horizontalLineToRelative(dx = 1.74f)
          // v 5.5
          verticalLineToRelative(dy = 5.5f)
          // h -1.75z
          horizontalLineToRelative(dx = -1.75f)
          close()
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
        }
        // M24.8 9.14 a9 9 0 0 0 -17.6 0 6.5 6.5 0 0 0 .92 12.84 L9.22 20 H8.5 a4.48 4.48 0 0 1 -3.37 -7.46 l5.3 5.3 1.01 -1.81 -4.66 -4.66 a4 4 0 0 1 1.36 -.35 l.82 -.06 .1 -.82 .1 -.57 3.78 3.78 1.01 -1.81 -4.01 -4.02 a7 7 0 0 1 1.97 -2.2 L25.9 19.3 A4.5 4.5 0 0 1 23.5 20 h-.72 l1.1 1.98 A6.5 6.5 0 0 0 24.8 9.14 m2.5 8.75 L13.78 4.37 a6.97 6.97 0 0 1 9.16 5.77 l.1 .82 .82 .06 A4.5 4.5 0 0 1 28 15.5 a4.5 4.5 0 0 1 -.7 2.39
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.8 9.14
          moveTo(x = 24.8f, y = 9.14f)
          // a 9 9 0 0 0 -17.6 0
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -17.6f,
            dy1 = 0.0f,
          )
          // a 6.5 6.5 0 0 0 0.92 12.84
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.92f,
            dy1 = 12.84f,
          )
          // L 9.22 20
          lineTo(x = 9.22f, y = 20.0f)
          // H 8.5
          horizontalLineTo(x = 8.5f)
          // a 4.48 4.48 0 0 1 -3.37 -7.46
          arcToRelative(
            a = 4.48f,
            b = 4.48f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.37f,
            dy1 = -7.46f,
          )
          // l 5.3 5.3
          lineToRelative(dx = 5.3f, dy = 5.3f)
          // l 1.01 -1.81
          lineToRelative(dx = 1.01f, dy = -1.81f)
          // l -4.66 -4.66
          lineToRelative(dx = -4.66f, dy = -4.66f)
          // a 4 4 0 0 1 1.36 -0.35
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.36f,
            dy1 = -0.35f,
          )
          // l 0.82 -0.06
          lineToRelative(dx = 0.82f, dy = -0.06f)
          // l 0.1 -0.82
          lineToRelative(dx = 0.1f, dy = -0.82f)
          // l 0.1 -0.57
          lineToRelative(dx = 0.1f, dy = -0.57f)
          // l 3.78 3.78
          lineToRelative(dx = 3.78f, dy = 3.78f)
          // l 1.01 -1.81
          lineToRelative(dx = 1.01f, dy = -1.81f)
          // l -4.01 -4.02
          lineToRelative(dx = -4.01f, dy = -4.02f)
          // a 7 7 0 0 1 1.97 -2.2
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.97f,
            dy1 = -2.2f,
          )
          // L 25.9 19.3
          lineTo(x = 25.9f, y = 19.3f)
          // A 4.5 4.5 0 0 1 23.5 20
          arcTo(
            horizontalEllipseRadius = 4.5f,
            verticalEllipseRadius = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.5f,
            y1 = 20.0f,
          )
          // h -0.72
          horizontalLineToRelative(dx = -0.72f)
          // l 1.1 1.98
          lineToRelative(dx = 1.1f, dy = 1.98f)
          // A 6.5 6.5 0 0 0 24.8 9.14
          arcTo(
            horizontalEllipseRadius = 6.5f,
            verticalEllipseRadius = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.8f,
            y1 = 9.14f,
          )
          // m 2.5 8.75
          moveToRelative(dx = 2.5f, dy = 8.75f)
          // L 13.78 4.37
          lineTo(x = 13.78f, y = 4.37f)
          // a 6.97 6.97 0 0 1 9.16 5.77
          arcToRelative(
            a = 6.97f,
            b = 6.97f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 9.16f,
            dy1 = 5.77f,
          )
          // l 0.1 0.82
          lineToRelative(dx = 0.1f, dy = 0.82f)
          // l 0.82 0.06
          lineToRelative(dx = 0.82f, dy = 0.06f)
          // A 4.5 4.5 0 0 1 28 15.5
          arcTo(
            horizontalEllipseRadius = 4.5f,
            verticalEllipseRadius = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.0f,
            y1 = 15.5f,
          )
          // a 4.5 4.5 0 0 1 -0.7 2.39
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
          dx1 = -0.7f,
          dy1 = 2.39f,
        )
      }
      // <rect width="32" height="32" fill="#000" />
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
      .also { _outlookSevere = it }
  }

@Suppress("ObjectPropertyName")
private var _outlookSevere: ImageVector? = null
