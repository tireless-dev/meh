// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thunderstorm: ImageVector
  get() {
    val current = _thunderstorm
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Thunderstorm",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23.5 22 H23 v-2 h.5 a4.5 4.5 0 0 0 .36 -9 H23 l-.1 -.82 a7 7 0 0 0 -13.88 0 L9 11 H8.14 a4.5 4.5 0 0 0 .36 9 H9 v2 H8.5 A6.5 6.5 0 0 1 7.2 9.14 a9 9 0 0 1 17.6 0 A6.5 6.5 0 0 1 23.5 22
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.5 22
          moveTo(x = 23.5f, y = 22.0f)
          // H 23
          horizontalLineTo(x = 23.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 0.5
          horizontalLineToRelative(dx = 0.5f)
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
          // a 7 7 0 0 0 -13.88 0
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -13.88f,
            dy1 = 0.0f,
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
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 8.5
          horizontalLineTo(x = 8.5f)
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
        }
        // <polygon points="15.87 30.5 14.13 29.5 17.28 24.0 11.28 24.0 16.13 15.5 17.87 16.5 14.72 22.0 20.72 22.0 15.87 30.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15.87 30.5
          moveTo(x = 15.87f, y = 30.5f)
          // L 14.13 29.5
          lineTo(x = 14.13f, y = 29.5f)
          // L 17.28 24
          lineTo(x = 17.28f, y = 24.0f)
          // L 11.28 24
          lineTo(x = 11.28f, y = 24.0f)
          // L 16.13 15.5
          lineTo(x = 16.13f, y = 15.5f)
          // L 17.87 16.5
          lineTo(x = 17.87f, y = 16.5f)
          // L 14.72 22
          lineTo(x = 14.72f, y = 22.0f)
          // L 20.72 22
          lineTo(x = 20.72f, y = 22.0f)
          // L 15.87 30.5z
          lineTo(x = 15.87f, y = 30.5f)
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
      .also { _thunderstorm = it }
  }

@Suppress("ObjectPropertyName")
private var _thunderstorm: ImageVector? = null
