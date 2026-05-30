// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Api: ImageVector
  get() {
    val current = _api
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Api",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 22 a4 4 0 0 0 -2 .57 l-3.09 -3.1 a6 6 0 0 0 0 -6.94 L24 9.43 A4 4 0 0 0 26 10 a4 4 0 1 0 -4 -4 4 4 0 0 0 .57 2 l-3.1 3.09 a6 6 0 0 0 -6.94 0 L9.43 8 A4 4 0 0 0 10 6 a4 4 0 1 0 -4 4 4 4 0 0 0 2 -.57 l3.09 3.1 a6 6 0 0 0 0 6.94 L8 22.57 A4 4 0 0 0 6 22 a4 4 0 1 0 4 4 4 4 0 0 0 -.57 -2 l3.1 -3.09 a6 6 0 0 0 6.94 0 l3.1 3.09 A4 4 0 0 0 22 26 a4 4 0 1 0 4 -4 m0 -18 a2 2 0 1 1 -2 2 2 2 0 0 1 2 -2 M4 6 a2 2 0 1 1 2 2 2 2 0 0 1 -2 -2 m2 22 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m10 -8 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m10 8 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 22
          moveTo(x = 26.0f, y = 22.0f)
          // a 4 4 0 0 0 -2 0.57
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 0.57f,
          )
          // l -3.09 -3.1
          lineToRelative(dx = -3.09f, dy = -3.1f)
          // a 6 6 0 0 0 0 -6.94
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -6.94f,
          )
          // L 24 9.43
          lineTo(x = 24.0f, y = 9.43f)
          // A 4 4 0 0 0 26 10
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 10.0f,
          )
          // a 4 4 0 1 0 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 0 0.57 2
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.57f,
            dy1 = 2.0f,
          )
          // l -3.1 3.09
          lineToRelative(dx = -3.1f, dy = 3.09f)
          // a 6 6 0 0 0 -6.94 0
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.94f,
            dy1 = 0.0f,
          )
          // L 9.43 8
          lineTo(x = 9.43f, y = 8.0f)
          // A 4 4 0 0 0 10 6
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.0f,
            y1 = 6.0f,
          )
          // a 4 4 0 1 0 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // a 4 4 0 0 0 2 -0.57
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -0.57f,
          )
          // l 3.09 3.1
          lineToRelative(dx = 3.09f, dy = 3.1f)
          // a 6 6 0 0 0 0 6.94
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 6.94f,
          )
          // L 8 22.57
          lineTo(x = 8.0f, y = 22.57f)
          // A 4 4 0 0 0 6 22
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 22.0f,
          )
          // a 4 4 0 1 0 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // a 4 4 0 0 0 -0.57 -2
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.57f,
            dy1 = -2.0f,
          )
          // l 3.1 -3.09
          lineToRelative(dx = 3.1f, dy = -3.09f)
          // a 6 6 0 0 0 6.94 0
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.94f,
            dy1 = 0.0f,
          )
          // l 3.1 3.09
          lineToRelative(dx = 3.1f, dy = 3.09f)
          // A 4 4 0 0 0 22 26
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 26.0f,
          )
          // a 4 4 0 1 0 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // m 0 -18
          moveToRelative(dx = 0.0f, dy = -18.0f)
          // a 2 2 0 1 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // M 4 6
          moveTo(x = 4.0f, y = 6.0f)
          // a 2 2 0 1 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m 2 22
          moveToRelative(dx = 2.0f, dy = 22.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // m 10 -8
          moveToRelative(dx = 10.0f, dy = -8.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m 10 8
          moveToRelative(dx = 10.0f, dy = 8.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
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
      .also { _api = it }
  }

@Suppress("ObjectPropertyName")
private var _api: ImageVector? = null
