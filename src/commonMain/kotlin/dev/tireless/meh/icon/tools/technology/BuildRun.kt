// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BuildRun: ImageVector
  get() {
    val current = _buildRun
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BuildRun",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m30 24 -6 6 -1.4 -1.4 3.6 -3.6 H17 v-2 h9.2 l-3.6 -3.6 L24 18z M21.49 7.13 l-9 -5 a1 1 0 0 0 -.98 0 l-9 5 A1 1 0 0 0 2 8 v10 a1 1 0 0 0 .51 .87 l9 5 A1 1 0 0 0 13 23 v-9.41 l7 -3.9 V14 h2 V8 a1 1 0 0 0 -.51 -.87 M12 4.14 18.94 8 12 11.86 5.06 8z M4 17.41 V9.7 l7 3.89 v7.71z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 24
          moveTo(x = 30.0f, y = 24.0f)
          // l -6 6
          lineToRelative(dx = -6.0f, dy = 6.0f)
          // l -1.4 -1.4
          lineToRelative(dx = -1.4f, dy = -1.4f)
          // l 3.6 -3.6
          lineToRelative(dx = 3.6f, dy = -3.6f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 9.2
          horizontalLineToRelative(dx = 9.2f)
          // l -3.6 -3.6
          lineToRelative(dx = -3.6f, dy = -3.6f)
          // L 24 18z
          lineTo(x = 24.0f, y = 18.0f)
          close()
          // M 21.49 7.13
          moveTo(x = 21.49f, y = 7.13f)
          // l -9 -5
          lineToRelative(dx = -9.0f, dy = -5.0f)
          // a 1 1 0 0 0 -0.98 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.98f,
            dy1 = 0.0f,
          )
          // l -9 5
          lineToRelative(dx = -9.0f, dy = 5.0f)
          // A 1 1 0 0 0 2 8
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 8.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // a 1 1 0 0 0 0.51 0.87
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.51f,
            dy1 = 0.87f,
          )
          // l 9 5
          lineToRelative(dx = 9.0f, dy = 5.0f)
          // A 1 1 0 0 0 13 23
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.0f,
            y1 = 23.0f,
          )
          // v -9.41
          verticalLineToRelative(dy = -9.41f)
          // l 7 -3.9
          lineToRelative(dx = 7.0f, dy = -3.9f)
          // V 14
          verticalLineTo(y = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // a 1 1 0 0 0 -0.51 -0.87
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.51f,
            dy1 = -0.87f,
          )
          // M 12 4.14
          moveTo(x = 12.0f, y = 4.14f)
          // L 18.94 8
          lineTo(x = 18.94f, y = 8.0f)
          // L 12 11.86
          lineTo(x = 12.0f, y = 11.86f)
          // L 5.06 8z
          lineTo(x = 5.06f, y = 8.0f)
          close()
          // M 4 17.41
          moveTo(x = 4.0f, y = 17.41f)
          // V 9.7
          verticalLineTo(y = 9.7f)
          // l 7 3.89
          lineToRelative(dx = 7.0f, dy = 3.89f)
          // v 7.71z
          verticalLineToRelative(dy = 7.71f)
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
      .also { _buildRun = it }
  }

@Suppress("ObjectPropertyName")
private var _buildRun: ImageVector? = null
