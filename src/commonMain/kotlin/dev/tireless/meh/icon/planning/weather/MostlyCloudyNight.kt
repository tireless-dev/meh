// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MostlyCloudyNight: ImageVector
  get() {
    val current = _mostlyCloudyNight
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MostlyCloudyNight",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.84 15.03 a1.5 1.5 0 0 0 -1.23 -.86 5.4 5.4 0 0 1 -3.4 -1.72 6.5 6.5 0 0 1 -1.3 -6.39 1.6 1.6 0 0 0 -.3 -1.55 1.5 1.5 0 0 0 -1.35 -.49 h-.02 a7.9 7.9 0 0 0 -6.22 7.44 A7 7 0 0 0 13.5 11 a7.55 7.55 0 0 0 -7.15 5.24 A6 6 0 0 0 8 28 h11 a5.98 5.98 0 0 0 5.61 -8.09 7.5 7.5 0 0 0 5.14 -3.36 1.5 1.5 0 0 0 .1 -1.52 M19 26 H8 a4 4 0 0 1 -.67 -7.93 l.66 -.11 .15 -.66 a5.5 5.5 0 0 1 10.72 0 l.15 .66 .66 .11 A4 4 0 0 1 19 26 m4.47 -8 h-.03 a6 6 0 0 0 -2.8 -1.76 7.5 7.5 0 0 0 -2.6 -3.67 l-.03 -.3 a6.1 6.1 0 0 1 3.79 -6.05 8.5 8.5 0 0 0 1.94 7.6 7.4 7.4 0 0 0 3.9 2.22 A5.4 5.4 0 0 1 23.47 18
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.84 15.03
          moveTo(x = 29.84f, y = 15.03f)
          // a 1.5 1.5 0 0 0 -1.23 -0.86
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.23f,
            dy1 = -0.86f,
          )
          // a 5.4 5.4 0 0 1 -3.4 -1.72
          arcToRelative(
            a = 5.4f,
            b = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.4f,
            dy1 = -1.72f,
          )
          // a 6.5 6.5 0 0 1 -1.3 -6.39
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.3f,
            dy1 = -6.39f,
          )
          // a 1.6 1.6 0 0 0 -0.3 -1.55
          arcToRelative(
            a = 1.6f,
            b = 1.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.3f,
            dy1 = -1.55f,
          )
          // a 1.5 1.5 0 0 0 -1.35 -0.49
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.35f,
            dy1 = -0.49f,
          )
          // h -0.02
          horizontalLineToRelative(dx = -0.02f)
          // a 7.9 7.9 0 0 0 -6.22 7.44
          arcToRelative(
            a = 7.9f,
            b = 7.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.22f,
            dy1 = 7.44f,
          )
          // A 7 7 0 0 0 13.5 11
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.5f,
            y1 = 11.0f,
          )
          // a 7.55 7.55 0 0 0 -7.15 5.24
          arcToRelative(
            a = 7.55f,
            b = 7.55f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.15f,
            dy1 = 5.24f,
          )
          // A 6 6 0 0 0 8 28
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 28.0f,
          )
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // a 5.98 5.98 0 0 0 5.61 -8.09
          arcToRelative(
            a = 5.98f,
            b = 5.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.61f,
            dy1 = -8.09f,
          )
          // a 7.5 7.5 0 0 0 5.14 -3.36
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.14f,
            dy1 = -3.36f,
          )
          // a 1.5 1.5 0 0 0 0.1 -1.52
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.1f,
            dy1 = -1.52f,
          )
          // M 19 26
          moveTo(x = 19.0f, y = 26.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 4 4 0 0 1 -0.67 -7.93
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.67f,
            dy1 = -7.93f,
          )
          // l 0.66 -0.11
          lineToRelative(dx = 0.66f, dy = -0.11f)
          // l 0.15 -0.66
          lineToRelative(dx = 0.15f, dy = -0.66f)
          // a 5.5 5.5 0 0 1 10.72 0
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 10.72f,
            dy1 = 0.0f,
          )
          // l 0.15 0.66
          lineToRelative(dx = 0.15f, dy = 0.66f)
          // l 0.66 0.11
          lineToRelative(dx = 0.66f, dy = 0.11f)
          // A 4 4 0 0 1 19 26
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 19.0f,
            y1 = 26.0f,
          )
          // m 4.47 -8
          moveToRelative(dx = 4.47f, dy = -8.0f)
          // h -0.03
          horizontalLineToRelative(dx = -0.03f)
          // a 6 6 0 0 0 -2.8 -1.76
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.8f,
            dy1 = -1.76f,
          )
          // a 7.5 7.5 0 0 0 -2.6 -3.67
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.6f,
            dy1 = -3.67f,
          )
          // l -0.03 -0.3
          lineToRelative(dx = -0.03f, dy = -0.3f)
          // a 6.1 6.1 0 0 1 3.79 -6.05
          arcToRelative(
            a = 6.1f,
            b = 6.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.79f,
            dy1 = -6.05f,
          )
          // a 8.5 8.5 0 0 0 1.94 7.6
          arcToRelative(
            a = 8.5f,
            b = 8.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.94f,
            dy1 = 7.6f,
          )
          // a 7.4 7.4 0 0 0 3.9 2.22
          arcToRelative(
            a = 7.4f,
            b = 7.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.9f,
            dy1 = 2.22f,
          )
          // A 5.4 5.4 0 0 1 23.47 18
          arcTo(
            horizontalEllipseRadius = 5.4f,
            verticalEllipseRadius = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.47f,
            y1 = 18.0f,
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
      .also { _mostlyCloudyNight = it }
  }

@Suppress("ObjectPropertyName")
private var _mostlyCloudyNight: ImageVector? = null
