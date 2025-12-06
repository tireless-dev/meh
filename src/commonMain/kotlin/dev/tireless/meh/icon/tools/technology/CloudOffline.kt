// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudOffline: ImageVector
  get() {
    val current = _cloudOffline
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CloudOffline",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24.8 12.14 a9 9 0 0 0 -.98 -2.55 L30 3.41 28.59 2 2 28.59 3.41 30 l5 -5 H23.5 a6.5 6.5 0 0 0 1.3 -12.86 M23.5 23 H10.41 l11.93 -11.93 a7 7 0 0 1 .6 2.07 l.1 .82 .82 .06 A4.5 4.5 0 0 1 23.5 23 M4.3 23.45 l1.43 -1.43 a4.48 4.48 0 0 1 2.41 -8 l.82 -.06 .1 -.82 a7 7 0 0 1 10.63 -5.08 l1.44 -1.45 A9 9 0 0 0 7.2 12.14 a6.49 6.49 0 0 0 -2.9 11.3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.8 12.14
          moveTo(x = 24.8f, y = 12.14f)
          // a 9 9 0 0 0 -0.98 -2.55
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.98f,
            dy1 = -2.55f,
          )
          // L 30 3.41
          lineTo(x = 30.0f, y = 3.41f)
          // L 28.59 2
          lineTo(x = 28.59f, y = 2.0f)
          // L 2 28.59
          lineTo(x = 2.0f, y = 28.59f)
          // L 3.41 30
          lineTo(x = 3.41f, y = 30.0f)
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // H 23.5
          horizontalLineTo(x = 23.5f)
          // a 6.5 6.5 0 0 0 1.3 -12.86
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.3f,
            dy1 = -12.86f,
          )
          // M 23.5 23
          moveTo(x = 23.5f, y = 23.0f)
          // H 10.41
          horizontalLineTo(x = 10.41f)
          // l 11.93 -11.93
          lineToRelative(dx = 11.93f, dy = -11.93f)
          // a 7 7 0 0 1 0.6 2.07
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.6f,
            dy1 = 2.07f,
          )
          // l 0.1 0.82
          lineToRelative(dx = 0.1f, dy = 0.82f)
          // l 0.82 0.06
          lineToRelative(dx = 0.82f, dy = 0.06f)
          // A 4.5 4.5 0 0 1 23.5 23
          arcTo(
            horizontalEllipseRadius = 4.5f,
            verticalEllipseRadius = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.5f,
            y1 = 23.0f,
          )
          // M 4.3 23.45
          moveTo(x = 4.3f, y = 23.45f)
          // l 1.43 -1.43
          lineToRelative(dx = 1.43f, dy = -1.43f)
          // a 4.48 4.48 0 0 1 2.41 -8
          arcToRelative(
            a = 4.48f,
            b = 4.48f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.41f,
            dy1 = -8.0f,
          )
          // l 0.82 -0.06
          lineToRelative(dx = 0.82f, dy = -0.06f)
          // l 0.1 -0.82
          lineToRelative(dx = 0.1f, dy = -0.82f)
          // a 7 7 0 0 1 10.63 -5.08
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 10.63f,
            dy1 = -5.08f,
          )
          // l 1.44 -1.45
          lineToRelative(dx = 1.44f, dy = -1.45f)
          // A 9 9 0 0 0 7.2 12.14
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.2f,
            y1 = 12.14f,
          )
          // a 6.49 6.49 0 0 0 -2.9 11.3
          arcToRelative(
            a = 6.49f,
            b = 6.49f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.9f,
            dy1 = 11.3f,
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
      .also { _cloudOffline = it }
  }

@Suppress("ObjectPropertyName")
private var _cloudOffline: ImageVector? = null
