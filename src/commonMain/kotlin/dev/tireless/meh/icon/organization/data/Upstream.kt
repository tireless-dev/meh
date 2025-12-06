// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Upstream: ImageVector
  get() {
    val current = _upstream
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Upstream",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M10 24 a6 6 0 1 0 12 0 6 6 0 0 0 -12 0 m2 0 a4 4 0 1 1 8 0 4 4 0 0 1 -8 0 M30 5 a3 3 0 1 0 -4 2.82 V13 a6 6 0 0 1 -2 4.47 V15 h-2 v6 h6 v-2 h-2.72 A8 8 0 0 0 28 13 V7.82 A3 3 0 0 0 30 5 m-3 1 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 m-8.41 5.59 L17 13.17 V7.82 A3 3 0 0 0 16 2 a3 3 0 0 0 -1 5.82 v5.35 l-1.59 -1.58 L12 13 l4 4 4 -4z M16 4 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2 M8 15 v2.47 A6 6 0 0 1 6 13 V7.82 A3 3 0 0 0 5 2 a3 3 0 0 0 -1 5.82 V13 c0 2.32 1.02 4.5 2.72 6 H4 v2 h6 v-6z M5 4 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 24
          moveTo(x = 10.0f, y = 24.0f)
          // a 6 6 0 1 0 12 0
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 12.0f,
            dy1 = 0.0f,
          )
          // a 6 6 0 0 0 -12 0
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -12.0f,
            dy1 = 0.0f,
          )
          // m 2 0
          moveToRelative(dx = 2.0f, dy = 0.0f)
          // a 4 4 0 1 1 8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          // a 4 4 0 0 1 -8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
          // M 30 5
          moveTo(x = 30.0f, y = 5.0f)
          // a 3 3 0 1 0 -4 2.82
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 2.82f,
          )
          // V 13
          verticalLineTo(y = 13.0f)
          // a 6 6 0 0 1 -2 4.47
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 4.47f,
          )
          // V 15
          verticalLineTo(y = 15.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2.72
          horizontalLineToRelative(dx = -2.72f)
          // A 8 8 0 0 0 28 13
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 13.0f,
          )
          // V 7.82
          verticalLineTo(y = 7.82f)
          // A 3 3 0 0 0 30 5
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 5.0f,
          )
          // m -3 1
          moveToRelative(dx = -3.0f, dy = 1.0f)
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
          // m -8.41 5.59
          moveToRelative(dx = -8.41f, dy = 5.59f)
          // L 17 13.17
          lineTo(x = 17.0f, y = 13.17f)
          // V 7.82
          verticalLineTo(y = 7.82f)
          // A 3 3 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // a 3 3 0 0 0 -1 5.82
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 5.82f,
          )
          // v 5.35
          verticalLineToRelative(dy = 5.35f)
          // l -1.59 -1.58
          lineToRelative(dx = -1.59f, dy = -1.58f)
          // L 12 13
          lineTo(x = 12.0f, y = 13.0f)
          // l 4 4
          lineToRelative(dx = 4.0f, dy = 4.0f)
          // l 4 -4z
          lineToRelative(dx = 4.0f, dy = -4.0f)
          close()
          // M 16 4
          moveTo(x = 16.0f, y = 4.0f)
          // a 1 1 0 1 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // a 1 1 0 0 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // M 8 15
          moveTo(x = 8.0f, y = 15.0f)
          // v 2.47
          verticalLineToRelative(dy = 2.47f)
          // A 6 6 0 0 1 6 13
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.0f,
            y1 = 13.0f,
          )
          // V 7.82
          verticalLineTo(y = 7.82f)
          // A 3 3 0 0 0 5 2
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 5.0f,
            y1 = 2.0f,
          )
          // a 3 3 0 0 0 -1 5.82
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 5.82f,
          )
          // V 13
          verticalLineTo(y = 13.0f)
          // c 0 2.32 1.02 4.5 2.72 6
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 2.32f,
            dx2 = 1.02f,
            dy2 = 4.5f,
            dx3 = 2.72f,
            dy3 = 6.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -6z
          verticalLineToRelative(dy = -6.0f)
          close()
          // M 5 4
          moveTo(x = 5.0f, y = 4.0f)
          // a 1 1 0 1 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // a 1 1 0 0 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
          isPositiveArc = true,
          dx1 = 0.0f,
          dy1 = -2.0f,
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
      .also { _upstream = it }
  }

@Suppress("ObjectPropertyName")
private var _upstream: ImageVector? = null
