// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.person.senses

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Need: ImageVector
  get() {
    val current = _need
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Need",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.12 16.88 A3 3 0 0 0 27.01 16 H27 a3 3 0 0 0 -2.12 .88 l-4.9 4.9 A3 3 0 0 0 17 19 h-7 a5 5 0 0 0 -5 5 v.67 l-3 4 1.6 1.2 L7 25.32 V24 a3 3 0 0 1 3 -3 h7 a1 1 0 0 1 0 2 h-4 v2 h4.93 a4 4 0 0 0 2.83 -1.17 l5.53 -5.54 A1 1 0 0 1 27 18 a1 1 0 0 1 .7 1.7 l-7.4 7.42 A3 3 0 0 1 18.16 28 H11 v2 h7.17 a5 5 0 0 0 3.54 -1.46 l7.41 -7.42 a3 3 0 0 0 0 -4.24
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.12 16.88
          moveTo(x = 29.12f, y = 16.88f)
          // A 3 3 0 0 0 27.01 16
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 27.01f,
            y1 = 16.0f,
          )
          // H 27
          horizontalLineTo(x = 27.0f)
          // a 3 3 0 0 0 -2.12 0.88
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.12f,
            dy1 = 0.88f,
          )
          // l -4.9 4.9
          lineToRelative(dx = -4.9f, dy = 4.9f)
          // A 3 3 0 0 0 17 19
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 19.0f,
          )
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // a 5 5 0 0 0 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // v 0.67
          verticalLineToRelative(dy = 0.67f)
          // l -3 4
          lineToRelative(dx = -3.0f, dy = 4.0f)
          // l 1.6 1.2
          lineToRelative(dx = 1.6f, dy = 1.2f)
          // L 7 25.32
          lineTo(x = 7.0f, y = 25.32f)
          // V 24
          verticalLineTo(y = 24.0f)
          // a 3 3 0 0 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // h 7
          horizontalLineToRelative(dx = 7.0f)
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
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4.93
          horizontalLineToRelative(dx = 4.93f)
          // a 4 4 0 0 0 2.83 -1.17
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.83f,
            dy1 = -1.17f,
          )
          // l 5.53 -5.54
          lineToRelative(dx = 5.53f, dy = -5.54f)
          // A 1 1 0 0 1 27 18
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.0f,
            y1 = 18.0f,
          )
          // a 1 1 0 0 1 0.7 1.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.7f,
            dy1 = 1.7f,
          )
          // l -7.4 7.42
          lineToRelative(dx = -7.4f, dy = 7.42f)
          // A 3 3 0 0 1 18.16 28
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 18.16f,
            y1 = 28.0f,
          )
          // H 11
          horizontalLineTo(x = 11.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 7.17
          horizontalLineToRelative(dx = 7.17f)
          // a 5 5 0 0 0 3.54 -1.46
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.54f,
            dy1 = -1.46f,
          )
          // l 7.41 -7.42
          lineToRelative(dx = 7.41f, dy = -7.42f)
          // a 3 3 0 0 0 0 -4.24
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -4.24f,
          )
        }
        // <polygon points="21.586 8.586 18.0 12.0 18.0 2.0 16.0 2.0 16.0 12.0 12.414 8.586 11.0 10.0 17.0 16.0 23.0 10.0 21.586 8.586" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.586 8.586
          moveTo(x = 21.586f, y = 8.586f)
          // L 18 12
          lineTo(x = 18.0f, y = 12.0f)
          // L 18 2
          lineTo(x = 18.0f, y = 2.0f)
          // L 16 2
          lineTo(x = 16.0f, y = 2.0f)
          // L 16 12
          lineTo(x = 16.0f, y = 12.0f)
          // L 12.414 8.586
          lineTo(x = 12.414f, y = 8.586f)
          // L 11 10
          lineTo(x = 11.0f, y = 10.0f)
          // L 17 16
          lineTo(x = 17.0f, y = 16.0f)
          // L 23 10
          lineTo(x = 23.0f, y = 10.0f)
          // L 21.586 8.586z
          lineTo(x = 21.586f, y = 8.586f)
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
      .also { _need = it }
  }

@Suppress("ObjectPropertyName")
private var _need: ImageVector? = null
