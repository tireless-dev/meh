// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ImageSearchAlt: ImageVector
  get() {
    val current = _imageSearchAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ImageSearchAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M10 16 a6 6 0 0 0 9.47 4.89 L24.6 26 26 24.59 l-5.11 -5.12 A6 6 0 1 0 10 16 m2 0 a4 4 0 1 1 4 4 4 4 0 0 1 -4 -4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 16
          moveTo(x = 10.0f, y = 16.0f)
          // a 6 6 0 0 0 9.47 4.89
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 9.47f,
            dy1 = 4.89f,
          )
          // L 24.6 26
          lineTo(x = 24.6f, y = 26.0f)
          // L 26 24.59
          lineTo(x = 26.0f, y = 24.59f)
          // l -5.11 -5.12
          lineToRelative(dx = -5.11f, dy = -5.12f)
          // A 6 6 0 1 0 10 16
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 10.0f,
            y1 = 16.0f,
          )
          // m 2 0
          moveToRelative(dx = 2.0f, dy = 0.0f)
          // a 4 4 0 1 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // a 4 4 0 0 1 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
        }
        // M29 7 h-6.46 l-1.71 -2.55 A1 1 0 0 0 20 4 h-8 a1 1 0 0 0 -.83 .45 L9.46 7 H3 a1 1 0 0 0 -1 1 v17 a1 1 0 0 0 1 1 h9 v-2 H4 V9 h6 a1 1 0 0 0 .83 -.45 L12.54 6 h6.92 l1.71 2.55 A1 1 0 0 0 22 9 h6 v12 h2 V8 a1 1 0 0 0 -1 -1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 7
          moveTo(x = 29.0f, y = 7.0f)
          // h -6.46
          horizontalLineToRelative(dx = -6.46f)
          // l -1.71 -2.55
          lineToRelative(dx = -1.71f, dy = -2.55f)
          // A 1 1 0 0 0 20 4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 4.0f,
          )
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // a 1 1 0 0 0 -0.83 0.45
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.83f,
            dy1 = 0.45f,
          )
          // L 9.46 7
          lineTo(x = 9.46f, y = 7.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 17
          verticalLineToRelative(dy = 17.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 1 1 0 0 0 0.83 -0.45
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.83f,
            dy1 = -0.45f,
          )
          // L 12.54 6
          lineTo(x = 12.54f, y = 6.0f)
          // h 6.92
          horizontalLineToRelative(dx = 6.92f)
          // l 1.71 2.55
          lineToRelative(dx = 1.71f, dy = 2.55f)
          // A 1 1 0 0 0 22 9
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 9.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
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
      .also { _imageSearchAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _imageSearchAlt: ImageVector? = null
