// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NoodleBowl: ImageVector
  get() {
    val current = _noodleBowl
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NoodleBowl",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m11.41 15 -8 -8 L2 8.41 8.59 15 H2 v1 a14 14 0 0 0 28 0 v-1Z M16 28 A12 12 0 0 1 4.04 17 h23.92 A12 12 0 0 1 16 28
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.41 15
          moveTo(x = 11.41f, y = 15.0f)
          // l -8 -8
          lineToRelative(dx = -8.0f, dy = -8.0f)
          // L 2 8.41
          lineTo(x = 2.0f, y = 8.41f)
          // L 8.59 15
          lineTo(x = 8.59f, y = 15.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 14 14 0 0 0 28 0
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 28.0f,
            dy1 = 0.0f,
          )
          // v -1z
          verticalLineToRelative(dy = -1.0f)
          close()
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // A 12 12 0 0 1 4.04 17
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.04f,
            y1 = 17.0f,
          )
          // h 23.92
          horizontalLineToRelative(dx = 23.92f)
          // A 12 12 0 0 1 16 28
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 28.0f,
          )
        }
        // M22 8 a5 5 0 0 0 -1.57 .26 A8 8 0 0 0 14 5 a8 8 0 0 0 -4.9 1.68 L4.4 2 3 3.41 l6.05 6.05 .7 -.7 A6 6 0 0 1 14 7 a6 6 0 0 1 4.69 2.26 5 5 0 0 0 -.6 .61 A3 3 0 0 1 15.76 11 H12 v2 h3.75 a5 5 0 0 0 3.9 -1.87 A3 3 0 0 1 25 13 h2 a5 5 0 0 0 -5 -5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 8
          moveTo(x = 22.0f, y = 8.0f)
          // a 5 5 0 0 0 -1.57 0.26
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.57f,
            dy1 = 0.26f,
          )
          // A 8 8 0 0 0 14 5
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 5.0f,
          )
          // a 8 8 0 0 0 -4.9 1.68
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.9f,
            dy1 = 1.68f,
          )
          // L 4.4 2
          lineTo(x = 4.4f, y = 2.0f)
          // L 3 3.41
          lineTo(x = 3.0f, y = 3.41f)
          // l 6.05 6.05
          lineToRelative(dx = 6.05f, dy = 6.05f)
          // l 0.7 -0.7
          lineToRelative(dx = 0.7f, dy = -0.7f)
          // A 6 6 0 0 1 14 7
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.0f,
            y1 = 7.0f,
          )
          // a 6 6 0 0 1 4.69 2.26
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.69f,
            dy1 = 2.26f,
          )
          // a 5 5 0 0 0 -0.6 0.61
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.6f,
            dy1 = 0.61f,
          )
          // A 3 3 0 0 1 15.76 11
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.76f,
            y1 = 11.0f,
          )
          // H 12
          horizontalLineTo(x = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3.75
          horizontalLineToRelative(dx = 3.75f)
          // a 5 5 0 0 0 3.9 -1.87
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.9f,
            dy1 = -1.87f,
          )
          // A 3 3 0 0 1 25 13
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 25.0f,
            y1 = 13.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 5 5 0 0 0 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = -5.0f,
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
      .also { _noodleBowl = it }
  }

@Suppress("ObjectPropertyName")
private var _noodleBowl: ImageVector? = null
