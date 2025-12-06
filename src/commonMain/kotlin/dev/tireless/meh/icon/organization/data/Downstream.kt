// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Downstream: ImageVector
  get() {
    val current = _downstream
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Downstream",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M5 24 a3 3 0 1 0 0 6 3 3 0 0 0 0 -6 m0 4 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 m11 -4 a3 3 0 1 0 0 6 3 3 0 0 0 0 -6 m0 4 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 m11 -4 a3 3 0 1 0 0 6 3 3 0 0 0 0 -6 m0 4 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 m2.59 -10.41 L28 19.17 V16 a7 7 0 0 0 -6.1 -6.94 6 6 0 1 0 -11.8 0 A7 7 0 0 0 4 16 v3.17 L2.41 17.6 1 19 l4 4 4 -4 -1.41 -1.41 L6 19.17 V16 a5 5 0 0 1 4.82 -4.98 A6 6 0 0 0 15 13.9 v5.26 l-1.59 -1.58 L12 19 l4 4 4 -4 -1.41 -1.41 L17 19.17 v-5.26 a6 6 0 0 0 4.18 -2.9 A5 5 0 0 1 26 16 v3.17 l-1.59 -1.58 L23 19 l4 4 4 -4z M16 12 a4 4 0 1 1 0 -8 4 4 0 0 1 0 8
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 5 24
          moveTo(x = 5.0f, y = 24.0f)
          // a 3 3 0 1 0 0 6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 6.0f,
          )
          // a 3 3 0 0 0 0 -6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -6.0f,
          )
          // m 0 4
          moveToRelative(dx = 0.0f, dy = 4.0f)
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
          // m 11 -4
          moveToRelative(dx = 11.0f, dy = -4.0f)
          // a 3 3 0 1 0 0 6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 6.0f,
          )
          // a 3 3 0 0 0 0 -6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -6.0f,
          )
          // m 0 4
          moveToRelative(dx = 0.0f, dy = 4.0f)
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
          // m 11 -4
          moveToRelative(dx = 11.0f, dy = -4.0f)
          // a 3 3 0 1 0 0 6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 6.0f,
          )
          // a 3 3 0 0 0 0 -6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -6.0f,
          )
          // m 0 4
          moveToRelative(dx = 0.0f, dy = 4.0f)
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
          // m 2.59 -10.41
          moveToRelative(dx = 2.59f, dy = -10.41f)
          // L 28 19.17
          lineTo(x = 28.0f, y = 19.17f)
          // V 16
          verticalLineTo(y = 16.0f)
          // a 7 7 0 0 0 -6.1 -6.94
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.1f,
            dy1 = -6.94f,
          )
          // a 6 6 0 1 0 -11.8 0
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -11.8f,
            dy1 = 0.0f,
          )
          // A 7 7 0 0 0 4 16
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 16.0f,
          )
          // v 3.17
          verticalLineToRelative(dy = 3.17f)
          // L 2.41 17.6
          lineTo(x = 2.41f, y = 17.6f)
          // L 1 19
          lineTo(x = 1.0f, y = 19.0f)
          // l 4 4
          lineToRelative(dx = 4.0f, dy = 4.0f)
          // l 4 -4
          lineToRelative(dx = 4.0f, dy = -4.0f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // L 6 19.17
          lineTo(x = 6.0f, y = 19.17f)
          // V 16
          verticalLineTo(y = 16.0f)
          // a 5 5 0 0 1 4.82 -4.98
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.82f,
            dy1 = -4.98f,
          )
          // A 6 6 0 0 0 15 13.9
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 13.9f,
          )
          // v 5.26
          verticalLineToRelative(dy = 5.26f)
          // l -1.59 -1.58
          lineToRelative(dx = -1.59f, dy = -1.58f)
          // L 12 19
          lineTo(x = 12.0f, y = 19.0f)
          // l 4 4
          lineToRelative(dx = 4.0f, dy = 4.0f)
          // l 4 -4
          lineToRelative(dx = 4.0f, dy = -4.0f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // L 17 19.17
          lineTo(x = 17.0f, y = 19.17f)
          // v -5.26
          verticalLineToRelative(dy = -5.26f)
          // a 6 6 0 0 0 4.18 -2.9
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.18f,
            dy1 = -2.9f,
          )
          // A 5 5 0 0 1 26 16
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 26.0f,
            y1 = 16.0f,
          )
          // v 3.17
          verticalLineToRelative(dy = 3.17f)
          // l -1.59 -1.58
          lineToRelative(dx = -1.59f, dy = -1.58f)
          // L 23 19
          lineTo(x = 23.0f, y = 19.0f)
          // l 4 4
          lineToRelative(dx = 4.0f, dy = 4.0f)
          // l 4 -4z
          lineToRelative(dx = 4.0f, dy = -4.0f)
          close()
          // M 16 12
          moveTo(x = 16.0f, y = 12.0f)
          // a 4 4 0 1 1 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // a 4 4 0 0 1 0 8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
          isPositiveArc = true,
          dx1 = 0.0f,
          dy1 = 8.0f,
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
      .also { _downstream = it }
  }

@Suppress("ObjectPropertyName")
private var _downstream: ImageVector? = null
