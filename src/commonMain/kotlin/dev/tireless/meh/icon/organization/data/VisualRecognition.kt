// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VisualRecognition: ImageVector
  get() {
    val current = _visualRecognition
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VisualRecognition",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="23.0" cy="12.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 12
          moveTo(x = 23.0f, y = 12.0f)
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
        // M28 5 H16.24 A8 8 0 1 0 6 16.92 V27 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V7 a2 2 0 0 0 -2 -2 M4 10 a6 6 0 0 1 11.19 -3 H8 v2 h7.91 A7 7 0 0 1 16 10 a7 7 0 0 1 -.09 1 H10 v2 h5.19 A6 6 0 0 1 4 10 m24 17 H8 l5 -5 1.59 1.59 a2 2 0 0 0 2.82 0 L23 18 l5 5Z m0 -6.83 -3.59 -3.59 a2 2 0 0 0 -2.82 0 L16 22.17 l-1.59 -1.59 a2 2 0 0 0 -2.82 0 L8 24.17 v-6.43 A8 8 0 0 0 10 18 a8 8 0 0 0 8 -8 8 8 0 0 0 -.59 -3 H28Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 5
          moveTo(x = 28.0f, y = 5.0f)
          // H 16.24
          horizontalLineTo(x = 16.24f)
          // A 8 8 0 1 0 6 16.92
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 16.92f,
          )
          // V 27
          verticalLineTo(y = 27.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 7
          verticalLineTo(y = 7.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // M 4 10
          moveTo(x = 4.0f, y = 10.0f)
          // a 6 6 0 0 1 11.19 -3
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 11.19f,
            dy1 = -3.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 7.91
          horizontalLineToRelative(dx = 7.91f)
          // A 7 7 0 0 1 16 10
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 10.0f,
          )
          // a 7 7 0 0 1 -0.09 1
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.09f,
            dy1 = 1.0f,
          )
          // H 10
          horizontalLineTo(x = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 5.19
          horizontalLineToRelative(dx = 5.19f)
          // A 6 6 0 0 1 4 10
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 10.0f,
          )
          // m 24 17
          moveToRelative(dx = 24.0f, dy = 17.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // l 1.59 1.59
          lineToRelative(dx = 1.59f, dy = 1.59f)
          // a 2 2 0 0 0 2.82 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.82f,
            dy1 = 0.0f,
          )
          // L 23 18
          lineTo(x = 23.0f, y = 18.0f)
          // l 5 5z
          lineToRelative(dx = 5.0f, dy = 5.0f)
          close()
          // m 0 -6.83
          moveToRelative(dx = 0.0f, dy = -6.83f)
          // l -3.59 -3.59
          lineToRelative(dx = -3.59f, dy = -3.59f)
          // a 2 2 0 0 0 -2.82 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.82f,
            dy1 = 0.0f,
          )
          // L 16 22.17
          lineTo(x = 16.0f, y = 22.17f)
          // l -1.59 -1.59
          lineToRelative(dx = -1.59f, dy = -1.59f)
          // a 2 2 0 0 0 -2.82 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.82f,
            dy1 = 0.0f,
          )
          // L 8 24.17
          lineTo(x = 8.0f, y = 24.17f)
          // v -6.43
          verticalLineToRelative(dy = -6.43f)
          // A 8 8 0 0 0 10 18
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.0f,
            y1 = 18.0f,
          )
          // a 8 8 0 0 0 8 -8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 8.0f,
            dy1 = -8.0f,
          )
          // a 8 8 0 0 0 -0.59 -3
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.59f,
            dy1 = -3.0f,
          )
          // H 28z
          horizontalLineTo(x = 28.0f)
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
      .also { _visualRecognition = it }
  }

@Suppress("ObjectPropertyName")
private var _visualRecognition: ImageVector? = null
