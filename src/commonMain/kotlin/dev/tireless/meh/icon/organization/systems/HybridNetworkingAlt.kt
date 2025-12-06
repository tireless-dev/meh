// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HybridNetworkingAlt: ImageVector
  get() {
    val current = _hybridNetworkingAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.HybridNetworkingAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 22 a4 4 0 0 0 -2.02 .57 L17.41 16 l6.57 -6.57 A4 4 0 0 0 26 10 a4 4 0 1 0 -4 -4 4 4 0 0 0 .57 2.02 L16 14.59 9.43 8.02 A4 4 0 0 0 10 6 a4 4 0 1 0 -4 4 4 4 0 0 0 2.02 -.57 L14.59 16 l-6.57 6.57 A4 4 0 0 0 6 22 a4 4 0 1 0 4 4 4 4 0 0 0 -.57 -2.02 L16 17.41 l6.57 6.57 A4 4 0 0 0 22 26 a4 4 0 1 0 4 -4 m0 -18 a2 2 0 1 1 -2 2 2 2 0 0 1 2 -2 M6 28 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 22
          moveTo(x = 26.0f, y = 22.0f)
          // a 4 4 0 0 0 -2.02 0.57
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.02f,
            dy1 = 0.57f,
          )
          // L 17.41 16
          lineTo(x = 17.41f, y = 16.0f)
          // l 6.57 -6.57
          lineToRelative(dx = 6.57f, dy = -6.57f)
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
          // a 4 4 0 0 0 0.57 2.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.57f,
            dy1 = 2.02f,
          )
          // L 16 14.59
          lineTo(x = 16.0f, y = 14.59f)
          // L 9.43 8.02
          lineTo(x = 9.43f, y = 8.02f)
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
          // a 4 4 0 0 0 2.02 -0.57
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.02f,
            dy1 = -0.57f,
          )
          // L 14.59 16
          lineTo(x = 14.59f, y = 16.0f)
          // l -6.57 6.57
          lineToRelative(dx = -6.57f, dy = 6.57f)
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
          // a 4 4 0 0 0 -0.57 -2.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.57f,
            dy1 = -2.02f,
          )
          // L 16 17.41
          lineTo(x = 16.0f, y = 17.41f)
          // l 6.57 6.57
          lineToRelative(dx = 6.57f, dy = 6.57f)
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
          // M 6 28
          moveTo(x = 6.0f, y = 28.0f)
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
      .also { _hybridNetworkingAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _hybridNetworkingAlt: ImageVector? = null
