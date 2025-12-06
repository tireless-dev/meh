// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Swim: ImageVector
  get() {
    val current = _swim
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Swim",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 26 h-2 a5 5 0 0 1 -4 -1.99 5.02 5.02 0 0 1 -8 0 5.02 5.02 0 0 1 -8 0 A5 5 0 0 1 4 26 H2 v-2 h2 a3.4 3.4 0 0 0 3.05 -2.32 A1 1 0 0 1 8 21 a1 1 0 0 1 .95 .68 A3.4 3.4 0 0 0 12 24 a3.4 3.4 0 0 0 3.05 -2.32 A1 1 0 0 1 16 21 a1 1 0 0 1 .95 .68 A3.4 3.4 0 0 0 20 24 a3.4 3.4 0 0 0 3.05 -2.32 1 1 0 0 1 1.9 0 A3.4 3.4 0 0 0 28 24 h2Z m-7 -8.41 -8.7 -8.71 A3 3 0 0 0 12.16 8 H4 v2 h8.17 a1 1 0 0 1 .7 .3 L15.6 13 10 18.59 11.41 20 17 14.41 21.59 19Z M20 10 a4 4 0 1 1 4 4 4 4 0 0 1 -4 -4 m2 0 a2 2 0 1 0 2 -2 2 2 0 0 0 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 26
          moveTo(x = 30.0f, y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 5 5 0 0 1 -4 -1.99
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -1.99f,
          )
          // a 5.02 5.02 0 0 1 -8 0
          arcToRelative(
            a = 5.02f,
            b = 5.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
          // a 5.02 5.02 0 0 1 -8 0
          arcToRelative(
            a = 5.02f,
            b = 5.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
          // A 5 5 0 0 1 4 26
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 26.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 3.4 3.4 0 0 0 3.05 -2.32
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.05f,
            dy1 = -2.32f,
          )
          // A 1 1 0 0 1 8 21
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 8.0f,
            y1 = 21.0f,
          )
          // a 1 1 0 0 1 0.95 0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.95f,
            dy1 = 0.68f,
          )
          // A 3.4 3.4 0 0 0 12 24
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 24.0f,
          )
          // a 3.4 3.4 0 0 0 3.05 -2.32
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.05f,
            dy1 = -2.32f,
          )
          // A 1 1 0 0 1 16 21
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 21.0f,
          )
          // a 1 1 0 0 1 0.95 0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.95f,
            dy1 = 0.68f,
          )
          // A 3.4 3.4 0 0 0 20 24
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 24.0f,
          )
          // a 3.4 3.4 0 0 0 3.05 -2.32
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.05f,
            dy1 = -2.32f,
          )
          // a 1 1 0 0 1 1.9 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.9f,
            dy1 = 0.0f,
          )
          // A 3.4 3.4 0 0 0 28 24
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 24.0f,
          )
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m -7 -8.41
          moveToRelative(dx = -7.0f, dy = -8.41f)
          // l -8.7 -8.71
          lineToRelative(dx = -8.7f, dy = -8.71f)
          // A 3 3 0 0 0 12.16 8
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.16f,
            y1 = 8.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 8.17
          horizontalLineToRelative(dx = 8.17f)
          // a 1 1 0 0 1 0.7 0.3
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.7f,
            dy1 = 0.3f,
          )
          // L 15.6 13
          lineTo(x = 15.6f, y = 13.0f)
          // L 10 18.59
          lineTo(x = 10.0f, y = 18.59f)
          // L 11.41 20
          lineTo(x = 11.41f, y = 20.0f)
          // L 17 14.41
          lineTo(x = 17.0f, y = 14.41f)
          // L 21.59 19z
          lineTo(x = 21.59f, y = 19.0f)
          close()
          // M 20 10
          moveTo(x = 20.0f, y = 10.0f)
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
          // m 2 0
          moveToRelative(dx = 2.0f, dy = 0.0f)
          // a 2 2 0 1 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
          dx1 = -2.0f,
          dy1 = 2.0f,
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
      .also { _swim = it }
  }

@Suppress("ObjectPropertyName")
private var _swim: ImageVector? = null
