// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Snow: ImageVector
  get() {
    val current = _snow
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Snow",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23.5 22 h-15 A6.5 6.5 0 0 1 7.2 9.14 a9 9 0 0 1 17.6 0 A6.5 6.5 0 0 1 23.5 22 M16 4 a7 7 0 0 0 -6.94 6.14 L9 11 H8.14 a4.5 4.5 0 0 0 .36 9 h15 a4.5 4.5 0 0 0 .36 -9 H23 l-.1 -.82 A7 7 0 0 0 16 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.5 22
          moveTo(x = 23.5f, y = 22.0f)
          // h -15
          horizontalLineToRelative(dx = -15.0f)
          // A 6.5 6.5 0 0 1 7.2 9.14
          arcTo(
            horizontalEllipseRadius = 6.5f,
            verticalEllipseRadius = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 7.2f,
            y1 = 9.14f,
          )
          // a 9 9 0 0 1 17.6 0
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 17.6f,
            dy1 = 0.0f,
          )
          // A 6.5 6.5 0 0 1 23.5 22
          arcTo(
            horizontalEllipseRadius = 6.5f,
            verticalEllipseRadius = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.5f,
            y1 = 22.0f,
          )
          // M 16 4
          moveTo(x = 16.0f, y = 4.0f)
          // a 7 7 0 0 0 -6.94 6.14
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.94f,
            dy1 = 6.14f,
          )
          // L 9 11
          lineTo(x = 9.0f, y = 11.0f)
          // H 8.14
          horizontalLineTo(x = 8.14f)
          // a 4.5 4.5 0 0 0 0.36 9
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.36f,
            dy1 = 9.0f,
          )
          // h 15
          horizontalLineToRelative(dx = 15.0f)
          // a 4.5 4.5 0 0 0 0.36 -9
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.36f,
            dy1 = -9.0f,
          )
          // H 23
          horizontalLineTo(x = 23.0f)
          // l -0.1 -0.82
          lineToRelative(dx = -0.1f, dy = -0.82f)
          // A 7 7 0 0 0 16 4
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 4.0f,
          )
        }
        // <polygon points="12.0 25.05 10.95 24.0 9.5 25.45 8.05 24.0 7.0 25.05 8.45 26.5 7.0 27.95 8.05 29.0 9.5 27.55 10.95 29.0 12.0 27.95 10.55 26.5 12.0 25.05" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 25.05
          moveTo(x = 12.0f, y = 25.05f)
          // L 10.95 24
          lineTo(x = 10.95f, y = 24.0f)
          // L 9.5 25.45
          lineTo(x = 9.5f, y = 25.45f)
          // L 8.05 24
          lineTo(x = 8.05f, y = 24.0f)
          // L 7 25.05
          lineTo(x = 7.0f, y = 25.05f)
          // L 8.45 26.5
          lineTo(x = 8.45f, y = 26.5f)
          // L 7 27.95
          lineTo(x = 7.0f, y = 27.95f)
          // L 8.05 29
          lineTo(x = 8.05f, y = 29.0f)
          // L 9.5 27.55
          lineTo(x = 9.5f, y = 27.55f)
          // L 10.95 29
          lineTo(x = 10.95f, y = 29.0f)
          // L 12 27.95
          lineTo(x = 12.0f, y = 27.95f)
          // L 10.55 26.5
          lineTo(x = 10.55f, y = 26.5f)
          // L 12 25.05z
          lineTo(x = 12.0f, y = 25.05f)
          close()
        }
        // <polygon points="26.0 25.05 24.95 24.0 23.5 25.45 22.05 24.0 21.0 25.05 22.45 26.5 21.0 27.95 22.05 29.0 23.5 27.55 24.95 29.0 26.0 27.95 24.55 26.5 26.0 25.05" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 25.05
          moveTo(x = 26.0f, y = 25.05f)
          // L 24.95 24
          lineTo(x = 24.95f, y = 24.0f)
          // L 23.5 25.45
          lineTo(x = 23.5f, y = 25.45f)
          // L 22.05 24
          lineTo(x = 22.05f, y = 24.0f)
          // L 21 25.05
          lineTo(x = 21.0f, y = 25.05f)
          // L 22.45 26.5
          lineTo(x = 22.45f, y = 26.5f)
          // L 21 27.95
          lineTo(x = 21.0f, y = 27.95f)
          // L 22.05 29
          lineTo(x = 22.05f, y = 29.0f)
          // L 23.5 27.55
          lineTo(x = 23.5f, y = 27.55f)
          // L 24.95 29
          lineTo(x = 24.95f, y = 29.0f)
          // L 26 27.95
          lineTo(x = 26.0f, y = 27.95f)
          // L 24.55 26.5
          lineTo(x = 24.55f, y = 26.5f)
          // L 26 25.05z
          lineTo(x = 26.0f, y = 25.05f)
          close()
        }
        // <polygon points="19.0 27.05 17.95 26.0 16.5 27.45 15.05 26.0 14.0 27.05 15.45 28.5 14.0 29.95 15.05 31.0 16.5 29.55 17.95 31.0 19.0 29.95 17.55 28.5 19.0 27.05" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 27.05
          moveTo(x = 19.0f, y = 27.05f)
          // L 17.95 26
          lineTo(x = 17.95f, y = 26.0f)
          // L 16.5 27.45
          lineTo(x = 16.5f, y = 27.45f)
          // L 15.05 26
          lineTo(x = 15.05f, y = 26.0f)
          // L 14 27.05
          lineTo(x = 14.0f, y = 27.05f)
          // L 15.45 28.5
          lineTo(x = 15.45f, y = 28.5f)
          // L 14 29.95
          lineTo(x = 14.0f, y = 29.95f)
          // L 15.05 31
          lineTo(x = 15.05f, y = 31.0f)
          // L 16.5 29.55
          lineTo(x = 16.5f, y = 29.55f)
          // L 17.95 31
          lineTo(x = 17.95f, y = 31.0f)
          // L 19 29.95
          lineTo(x = 19.0f, y = 29.95f)
          // L 17.55 28.5
          lineTo(x = 17.55f, y = 28.5f)
          // L 19 27.05z
          lineTo(x = 19.0f, y = 27.05f)
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
      .also { _snow = it }
  }

@Suppress("ObjectPropertyName")
private var _snow: ImageVector? = null
