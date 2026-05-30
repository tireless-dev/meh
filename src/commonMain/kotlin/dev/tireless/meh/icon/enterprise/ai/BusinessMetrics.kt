// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BusinessMetrics: ImageVector
  get() {
    val current = _businessMetrics
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BusinessMetrics",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22 30 a1 1 0 0 1 -.9 -.55 L19.39 26 H16 v-2 h4 a1 1 0 0 1 .9 .55 l1.1 2.21 3.1 -6.2 C25.3 20.17 25.65 20 26 20 s.71 .18 .9 .55 L28.61 24 H32 v2 h-4 a1 1 0 0 1 -.9 -.55 L26 23.24 l-3.1 6.2 A1 1 0 0 1 22 30 m1.41 -20 L22 8.59 l-4.71 4.71 A3 3 0 1 0 19 16 q0 -.7 -.3 -1.29z M16 17 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 m10 -1 a10 10 0 0 0 -1.14 -4.62 l-1.5 1.5 A8 8 0 0 1 24 16z M16 8 q1.66 .01 3.12 .64 l1.5 -1.5 A10.01 10.01 0 0 0 6 16 h2 a8 8 0 0 1 8 -8
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 30
          moveTo(x = 22.0f, y = 30.0f)
          // a 1 1 0 0 1 -0.9 -0.55
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.9f,
            dy1 = -0.55f,
          )
          // L 19.39 26
          lineTo(x = 19.39f, y = 26.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 1 1 0 0 1 0.9 0.55
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.9f,
            dy1 = 0.55f,
          )
          // l 1.1 2.21
          lineToRelative(dx = 1.1f, dy = 2.21f)
          // l 3.1 -6.2
          lineToRelative(dx = 3.1f, dy = -6.2f)
          // C 25.3 20.17 25.65 20 26 20
          curveTo(
            x1 = 25.3f,
            y1 = 20.17f,
            x2 = 25.65f,
            y2 = 20.0f,
            x3 = 26.0f,
            y3 = 20.0f,
          )
          // s 0.71 0.18 0.9 0.55
          reflectiveCurveToRelative(
            dx1 = 0.71f,
            dy1 = 0.18f,
            dx2 = 0.9f,
            dy2 = 0.55f,
          )
          // L 28.61 24
          lineTo(x = 28.61f, y = 24.0f)
          // H 32
          horizontalLineTo(x = 32.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // a 1 1 0 0 1 -0.9 -0.55
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.9f,
            dy1 = -0.55f,
          )
          // L 26 23.24
          lineTo(x = 26.0f, y = 23.24f)
          // l -3.1 6.2
          lineToRelative(dx = -3.1f, dy = 6.2f)
          // A 1 1 0 0 1 22 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.0f,
            y1 = 30.0f,
          )
          // m 1.41 -20
          moveToRelative(dx = 1.41f, dy = -20.0f)
          // L 22 8.59
          lineTo(x = 22.0f, y = 8.59f)
          // l -4.71 4.71
          lineToRelative(dx = -4.71f, dy = 4.71f)
          // A 3 3 0 1 0 19 16
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 16.0f,
          )
          // q 0 -0.7 -0.3 -1.29z
          quadToRelative(
            dx1 = 0.0f,
            dy1 = -0.7f,
            dx2 = -0.3f,
            dy2 = -1.29f,
          )
          close()
          // M 16 17
          moveTo(x = 16.0f, y = 17.0f)
          // a 1 1 0 1 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // m 10 -1
          moveToRelative(dx = 10.0f, dy = -1.0f)
          // a 10 10 0 0 0 -1.14 -4.62
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.14f,
            dy1 = -4.62f,
          )
          // l -1.5 1.5
          lineToRelative(dx = -1.5f, dy = 1.5f)
          // A 8 8 0 0 1 24 16z
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 16.0f,
          )
          close()
          // M 16 8
          moveTo(x = 16.0f, y = 8.0f)
          // q 1.66 0.01 3.12 0.64
          quadToRelative(
            dx1 = 1.66f,
            dy1 = 0.01f,
            dx2 = 3.12f,
            dy2 = 0.64f,
          )
          // l 1.5 -1.5
          lineToRelative(dx = 1.5f, dy = -1.5f)
          // A 10.01 10.01 0 0 0 6 16
          arcTo(
            horizontalEllipseRadius = 10.01f,
            verticalEllipseRadius = 10.01f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 16.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 8 8 0 0 1 8 -8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = -8.0f,
          )
        }
        // M7.51 24.49 A12 12 0 1 1 28 16 h2 a14 14 0 1 0 -23.9 9.9z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7.51 24.49
          moveTo(x = 7.51f, y = 24.49f)
          // A 12 12 0 1 1 28 16
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 28.0f,
            y1 = 16.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 14 14 0 1 0 -23.9 9.9z
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -23.9f,
            dy1 = 9.9f,
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
      .also { _businessMetrics = it }
  }

@Suppress("ObjectPropertyName")
private var _businessMetrics: ImageVector? = null
