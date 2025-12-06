// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Construction: ImageVector
  get() {
    val current = _construction
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Construction",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.34 16.06 a1 1 0 0 0 -1.1 .3 l-3.78 4.53 -5.44 -1 -3.6 -8.94 A3 3 0 0 0 12.62 9 H8.54 a3 3 0 0 0 -1.54 .43 l-5.01 3 v6.4 l5 .91 V30 h2 v-9.9 l3.57 .66 L14 24.2 V30 h2 v-6.2 l-1.1 -2.62 L23 22.65 l-4.76 5.71 A1 1 0 0 0 19 30 h10 a1 1 0 0 0 1 -1 V17 a1 1 0 0 0 -.66 -.94 M4 17.16 v-3.6 l3 -1.8 v5.95Z m5 .91 V11 h3.61 a1 1 0 0 1 .95 .67 l3.14 7.8Z M28 28 h-6.86 L28 19.76Z M12.5 8 A3.5 3.5 0 1 1 16 4.5 3.5 3.5 0 0 1 12.5 8 m0 -5 A1.5 1.5 0 1 0 14 4.5 1.5 1.5 0 0 0 12.5 3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.34 16.06
          moveTo(x = 29.34f, y = 16.06f)
          // a 1 1 0 0 0 -1.1 0.3
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.1f,
            dy1 = 0.3f,
          )
          // l -3.78 4.53
          lineToRelative(dx = -3.78f, dy = 4.53f)
          // l -5.44 -1
          lineToRelative(dx = -5.44f, dy = -1.0f)
          // l -3.6 -8.94
          lineToRelative(dx = -3.6f, dy = -8.94f)
          // A 3 3 0 0 0 12.62 9
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.62f,
            y1 = 9.0f,
          )
          // H 8.54
          horizontalLineTo(x = 8.54f)
          // a 3 3 0 0 0 -1.54 0.43
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.54f,
            dy1 = 0.43f,
          )
          // l -5.01 3
          lineToRelative(dx = -5.01f, dy = 3.0f)
          // v 6.4
          verticalLineToRelative(dy = 6.4f)
          // l 5 0.91
          lineToRelative(dx = 5.0f, dy = 0.91f)
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -9.9
          verticalLineToRelative(dy = -9.9f)
          // l 3.57 0.66
          lineToRelative(dx = 3.57f, dy = 0.66f)
          // L 14 24.2
          lineTo(x = 14.0f, y = 24.2f)
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6.2
          verticalLineToRelative(dy = -6.2f)
          // l -1.1 -2.62
          lineToRelative(dx = -1.1f, dy = -2.62f)
          // L 23 22.65
          lineTo(x = 23.0f, y = 22.65f)
          // l -4.76 5.71
          lineToRelative(dx = -4.76f, dy = 5.71f)
          // A 1 1 0 0 0 19 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 30.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // V 17
          verticalLineTo(y = 17.0f)
          // a 1 1 0 0 0 -0.66 -0.94
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.66f,
            dy1 = -0.94f,
          )
          // M 4 17.16
          moveTo(x = 4.0f, y = 17.16f)
          // v -3.6
          verticalLineToRelative(dy = -3.6f)
          // l 3 -1.8
          lineToRelative(dx = 3.0f, dy = -1.8f)
          // v 5.95z
          verticalLineToRelative(dy = 5.95f)
          close()
          // m 5 0.91
          moveToRelative(dx = 5.0f, dy = 0.91f)
          // V 11
          verticalLineTo(y = 11.0f)
          // h 3.61
          horizontalLineToRelative(dx = 3.61f)
          // a 1 1 0 0 1 0.95 0.67
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.95f,
            dy1 = 0.67f,
          )
          // l 3.14 7.8z
          lineToRelative(dx = 3.14f, dy = 7.8f)
          close()
          // M 28 28
          moveTo(x = 28.0f, y = 28.0f)
          // h -6.86
          horizontalLineToRelative(dx = -6.86f)
          // L 28 19.76z
          lineTo(x = 28.0f, y = 19.76f)
          close()
          // M 12.5 8
          moveTo(x = 12.5f, y = 8.0f)
          // A 3.5 3.5 0 1 1 16 4.5
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 4.5f,
          )
          // A 3.5 3.5 0 0 1 12.5 8
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.5f,
            y1 = 8.0f,
          )
          // m 0 -5
          moveToRelative(dx = 0.0f, dy = -5.0f)
          // A 1.5 1.5 0 1 0 14 4.5
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 4.5f,
          )
          // A 1.5 1.5 0 0 0 12.5 3
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.5f,
            y1 = 3.0f,
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
      .also { _construction = it }
  }

@Suppress("ObjectPropertyName")
private var _construction: ImageVector? = null
