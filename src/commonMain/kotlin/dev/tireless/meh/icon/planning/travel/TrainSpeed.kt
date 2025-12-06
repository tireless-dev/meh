// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrainSpeed: ImageVector
  get() {
    val current = _trainSpeed
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TrainSpeed",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 25.0 2.0 25.0 2.0 27.0 4.0 27.0 4.0 29.0 6.0 29.0 6.0 27.0 11.0 27.0 11.0 29.0 13.0 29.0 13.0 27.0 18.0 27.0 18.0 29.0 20.0 29.0 20.0 27.0 25.0 27.0 25.0 29.0 27.0 29.0 27.0 27.0 30.0 27.0 30.0 25.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 25
          moveTo(x = 30.0f, y = 25.0f)
          // L 2 25
          lineTo(x = 2.0f, y = 25.0f)
          // L 2 27
          lineTo(x = 2.0f, y = 27.0f)
          // L 4 27
          lineTo(x = 4.0f, y = 27.0f)
          // L 4 29
          lineTo(x = 4.0f, y = 29.0f)
          // L 6 29
          lineTo(x = 6.0f, y = 29.0f)
          // L 6 27
          lineTo(x = 6.0f, y = 27.0f)
          // L 11 27
          lineTo(x = 11.0f, y = 27.0f)
          // L 11 29
          lineTo(x = 11.0f, y = 29.0f)
          // L 13 29
          lineTo(x = 13.0f, y = 29.0f)
          // L 13 27
          lineTo(x = 13.0f, y = 27.0f)
          // L 18 27
          lineTo(x = 18.0f, y = 27.0f)
          // L 18 29
          lineTo(x = 18.0f, y = 29.0f)
          // L 20 29
          lineTo(x = 20.0f, y = 29.0f)
          // L 20 27
          lineTo(x = 20.0f, y = 27.0f)
          // L 25 27
          lineTo(x = 25.0f, y = 27.0f)
          // L 25 29
          lineTo(x = 25.0f, y = 29.0f)
          // L 27 29
          lineTo(x = 27.0f, y = 29.0f)
          // L 27 27
          lineTo(x = 27.0f, y = 27.0f)
          // L 30 27
          lineTo(x = 30.0f, y = 27.0f)
          // L 30 25z
          lineTo(x = 30.0f, y = 25.0f)
          close()
        }
        // M29.71 16.59 18.15 8.64 A15 15 0 0 0 9.65 6 H2 v2 h7.65 a13 13 0 0 1 7.37 2.29 L18.05 11 H9 v2 h11.96 l7.62 5.24 A.97 .97 0 0 1 28.03 20 H2 v2 h26.03 a2.97 2.97 0 0 0 1.68 -5.41
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.71 16.59
          moveTo(x = 29.71f, y = 16.59f)
          // L 18.15 8.64
          lineTo(x = 18.15f, y = 8.64f)
          // A 15 15 0 0 0 9.65 6
          arcTo(
            horizontalEllipseRadius = 15.0f,
            verticalEllipseRadius = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.65f,
            y1 = 6.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 7.65
          horizontalLineToRelative(dx = 7.65f)
          // a 13 13 0 0 1 7.37 2.29
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.37f,
            dy1 = 2.29f,
          )
          // L 18.05 11
          lineTo(x = 18.05f, y = 11.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 11.96
          horizontalLineToRelative(dx = 11.96f)
          // l 7.62 5.24
          lineToRelative(dx = 7.62f, dy = 5.24f)
          // A 0.97 0.97 0 0 1 28.03 20
          arcTo(
            horizontalEllipseRadius = 0.97f,
            verticalEllipseRadius = 0.97f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.03f,
            y1 = 20.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 26.03
          horizontalLineToRelative(dx = 26.03f)
          // a 2.97 2.97 0 0 0 1.68 -5.41
          arcToRelative(
            a = 2.97f,
            b = 2.97f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.68f,
            dy1 = -5.41f,
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
      .also { _trainSpeed = it }
  }

@Suppress("ObjectPropertyName")
private var _trainSpeed: ImageVector? = null
