// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Integration: ImageVector
  get() {
    val current = _integration
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Integration",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29.88 15.52 -6 -11 A1 1 0 0 0 23 4 H9 a1 1 0 0 0 -.88 .52 l-6 11 a1 1 0 0 0 0 1 l6 11 A1 1 0 0 0 9 28 h14 a1 1 0 0 0 .88 -.52 l6 -11 a1 1 0 0 0 0 -.96 M22.93 7 l4.39 8 h-9.5Z M16 14.14 10.82 6 h10.36Z M9.07 7 l5.11 8 h-9.5Z M4.68 17 h9.5 l-5.11 8Z M16 17.86 21.18 26 H10.82Z M22.93 25 l-5.11 -8 h9.5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.88 15.52
          moveTo(x = 29.88f, y = 15.52f)
          // l -6 -11
          lineToRelative(dx = -6.0f, dy = -11.0f)
          // A 1 1 0 0 0 23 4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.0f,
            y1 = 4.0f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // a 1 1 0 0 0 -0.88 0.52
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.88f,
            dy1 = 0.52f,
          )
          // l -6 11
          lineToRelative(dx = -6.0f, dy = 11.0f)
          // a 1 1 0 0 0 0 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.0f,
          )
          // l 6 11
          lineToRelative(dx = 6.0f, dy = 11.0f)
          // A 1 1 0 0 0 9 28
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 28.0f,
          )
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // a 1 1 0 0 0 0.88 -0.52
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.88f,
            dy1 = -0.52f,
          )
          // l 6 -11
          lineToRelative(dx = 6.0f, dy = -11.0f)
          // a 1 1 0 0 0 0 -0.96
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -0.96f,
          )
          // M 22.93 7
          moveTo(x = 22.93f, y = 7.0f)
          // l 4.39 8
          lineToRelative(dx = 4.39f, dy = 8.0f)
          // h -9.5z
          horizontalLineToRelative(dx = -9.5f)
          close()
          // M 16 14.14
          moveTo(x = 16.0f, y = 14.14f)
          // L 10.82 6
          lineTo(x = 10.82f, y = 6.0f)
          // h 10.36z
          horizontalLineToRelative(dx = 10.36f)
          close()
          // M 9.07 7
          moveTo(x = 9.07f, y = 7.0f)
          // l 5.11 8
          lineToRelative(dx = 5.11f, dy = 8.0f)
          // h -9.5z
          horizontalLineToRelative(dx = -9.5f)
          close()
          // M 4.68 17
          moveTo(x = 4.68f, y = 17.0f)
          // h 9.5
          horizontalLineToRelative(dx = 9.5f)
          // l -5.11 8z
          lineToRelative(dx = -5.11f, dy = 8.0f)
          close()
          // M 16 17.86
          moveTo(x = 16.0f, y = 17.86f)
          // L 21.18 26
          lineTo(x = 21.18f, y = 26.0f)
          // H 10.82z
          horizontalLineTo(x = 10.82f)
          close()
          // M 22.93 25
          moveTo(x = 22.93f, y = 25.0f)
          // l -5.11 -8
          lineToRelative(dx = -5.11f, dy = -8.0f)
          // h 9.5z
          horizontalLineToRelative(dx = 9.5f)
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
      .also { _integration = it }
  }

@Suppress("ObjectPropertyName")
private var _integration: ImageVector? = null
