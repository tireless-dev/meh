// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Recommend: ImageVector
  get() {
    val current = _recommend
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Recommend",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a9 9 0 0 0 -6 15.69 V30 l6 -4 6 4 V17.69 A9 9 0 0 0 16 2 m4 24.26 -2.89 -1.92 L16 23.6 l-1.11 .74 L12 26.26 v-7.21 a8.9 8.9 0 0 0 8 0Z M20.89 16 A7 7 0 1 1 23 11 a7 7 0 0 1 -2.11 5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // a 9 9 0 0 0 -6 15.69
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = 15.69f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // l 6 -4
          lineToRelative(dx = 6.0f, dy = -4.0f)
          // l 6 4
          lineToRelative(dx = 6.0f, dy = 4.0f)
          // V 17.69
          verticalLineTo(y = 17.69f)
          // A 9 9 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // m 4 24.26
          moveToRelative(dx = 4.0f, dy = 24.26f)
          // l -2.89 -1.92
          lineToRelative(dx = -2.89f, dy = -1.92f)
          // L 16 23.6
          lineTo(x = 16.0f, y = 23.6f)
          // l -1.11 0.74
          lineToRelative(dx = -1.11f, dy = 0.74f)
          // L 12 26.26
          lineTo(x = 12.0f, y = 26.26f)
          // v -7.21
          verticalLineToRelative(dy = -7.21f)
          // a 8.9 8.9 0 0 0 8 0z
          arcToRelative(
            a = 8.9f,
            b = 8.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          close()
          // M 20.89 16
          moveTo(x = 20.89f, y = 16.0f)
          // A 7 7 0 1 1 23 11
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 23.0f,
            y1 = 11.0f,
          )
          // a 7 7 0 0 1 -2.11 5
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.11f,
            dy1 = 5.0f,
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
      .also { _recommend = it }
  }

@Suppress("ObjectPropertyName")
private var _recommend: ImageVector? = null
