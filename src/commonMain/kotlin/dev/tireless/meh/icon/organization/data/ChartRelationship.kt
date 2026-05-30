// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartRelationship: ImageVector
  get() {
    val current = _chartRelationship
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartRelationship",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 6 a4 4 0 0 0 -3.86 3 h-4.21 A8 8 0 1 0 9 17.93 v4.21 a4 4 0 1 0 2 0 v-4.2 a8 8 0 0 0 3.9 -1.63 l3.67 3.67 A4 4 0 0 0 18 22 a4 4 0 1 0 4 -4 4 4 0 0 0 -2.02 .57 l-3.67 -3.67 a8 8 0 0 0 1.62 -3.9 h4.21 A4 4 0 1 0 26 6 M12 26 a2 2 0 1 1 -2 -2 2 2 0 0 1 2 2 m-2 -10 a6 6 0 1 1 6 -6 6 6 0 0 1 -6 6 m14 6 a2 2 0 1 1 -2 -2 2 2 0 0 1 2 2 m2 -10 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 6
          moveTo(x = 26.0f, y = 6.0f)
          // a 4 4 0 0 0 -3.86 3
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.86f,
            dy1 = 3.0f,
          )
          // h -4.21
          horizontalLineToRelative(dx = -4.21f)
          // A 8 8 0 1 0 9 17.93
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 17.93f,
          )
          // v 4.21
          verticalLineToRelative(dy = 4.21f)
          // a 4 4 0 1 0 2 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // v -4.2
          verticalLineToRelative(dy = -4.2f)
          // a 8 8 0 0 0 3.9 -1.63
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.9f,
            dy1 = -1.63f,
          )
          // l 3.67 3.67
          lineToRelative(dx = 3.67f, dy = 3.67f)
          // A 4 4 0 0 0 18 22
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 22.0f,
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
          // l -3.67 -3.67
          lineToRelative(dx = -3.67f, dy = -3.67f)
          // a 8 8 0 0 0 1.62 -3.9
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.62f,
            dy1 = -3.9f,
          )
          // h 4.21
          horizontalLineToRelative(dx = 4.21f)
          // A 4 4 0 1 0 26 6
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 6.0f,
          )
          // M 12 26
          moveTo(x = 12.0f, y = 26.0f)
          // a 2 2 0 1 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // m -2 -10
          moveToRelative(dx = -2.0f, dy = -10.0f)
          // a 6 6 0 1 1 6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = -6.0f,
          )
          // a 6 6 0 0 1 -6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 6.0f,
          )
          // m 14 6
          moveToRelative(dx = 14.0f, dy = 6.0f)
          // a 2 2 0 1 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // m 2 -10
          moveToRelative(dx = 2.0f, dy = -10.0f)
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
      .also { _chartRelationship = it }
  }

@Suppress("ObjectPropertyName")
private var _chartRelationship: ImageVector? = null
