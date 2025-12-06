// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReplyAll: ImageVector
  get() {
    val current = _replyAll
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ReplyAll",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M19 29 a1 1 0 0 1 -.77 -.36 l-10 -12 a1 1 0 0 1 0 -1.28 l10 -12 A1 1 0 0 1 20 4 v7.03 C27 11.5 31 16.9 31 26 a1 1 0 0 1 -1.8 .6 c-2.82 -3.76 -5.4 -5.35 -9.2 -5.57 V28 a1 1 0 0 1 -1 1 m-8.7 -13 7.7 9.24 V20 a1 1 0 0 1 1 -1 12.7 12.7 0 0 1 9.84 4.1 C28.1 16.55 24.66 13 19 13 a1 1 0 0 1 -1 -1 V6.76Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 29
          moveTo(x = 19.0f, y = 29.0f)
          // a 1 1 0 0 1 -0.77 -0.36
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.77f,
            dy1 = -0.36f,
          )
          // l -10 -12
          lineToRelative(dx = -10.0f, dy = -12.0f)
          // a 1 1 0 0 1 0 -1.28
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -1.28f,
          )
          // l 10 -12
          lineToRelative(dx = 10.0f, dy = -12.0f)
          // A 1 1 0 0 1 20 4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 20.0f,
            y1 = 4.0f,
          )
          // v 7.03
          verticalLineToRelative(dy = 7.03f)
          // C 27 11.5 31 16.9 31 26
          curveTo(
            x1 = 27.0f,
            y1 = 11.5f,
            x2 = 31.0f,
            y2 = 16.9f,
            x3 = 31.0f,
            y3 = 26.0f,
          )
          // a 1 1 0 0 1 -1.8 0.6
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.8f,
            dy1 = 0.6f,
          )
          // c -2.82 -3.76 -5.4 -5.35 -9.2 -5.57
          curveToRelative(
            dx1 = -2.82f,
            dy1 = -3.76f,
            dx2 = -5.4f,
            dy2 = -5.35f,
            dx3 = -9.2f,
            dy3 = -5.57f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // m -8.7 -13
          moveToRelative(dx = -8.7f, dy = -13.0f)
          // l 7.7 9.24
          lineToRelative(dx = 7.7f, dy = 9.24f)
          // V 20
          verticalLineTo(y = 20.0f)
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // a 12.7 12.7 0 0 1 9.84 4.1
          arcToRelative(
            a = 12.7f,
            b = 12.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 9.84f,
            dy1 = 4.1f,
          )
          // C 28.1 16.55 24.66 13 19 13
          curveTo(
            x1 = 28.1f,
            y1 = 16.55f,
            x2 = 24.66f,
            y2 = 13.0f,
            x3 = 19.0f,
            y3 = 13.0f,
          )
          // a 1 1 0 0 1 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // V 6.76z
          verticalLineTo(y = 6.76f)
          close()
        }
        // M11.46 28.92 1.23 16.64 a1 1 0 0 1 0 -1.28 L11.46 3.08 13 4.36 3.3 16 13 27.64Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.46 28.92
          moveTo(x = 11.46f, y = 28.92f)
          // L 1.23 16.64
          lineTo(x = 1.23f, y = 16.64f)
          // a 1 1 0 0 1 0 -1.28
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -1.28f,
          )
          // L 11.46 3.08
          lineTo(x = 11.46f, y = 3.08f)
          // L 13 4.36
          lineTo(x = 13.0f, y = 4.36f)
          // L 3.3 16
          lineTo(x = 3.3f, y = 16.0f)
          // L 13 27.64z
          lineTo(x = 13.0f, y = 27.64f)
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
      .also { _replyAll = it }
  }

@Suppress("ObjectPropertyName")
private var _replyAll: ImageVector? = null
