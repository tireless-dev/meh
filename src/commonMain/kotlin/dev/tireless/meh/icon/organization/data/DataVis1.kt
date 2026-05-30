// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataVis1: ImageVector
  get() {
    val current = _dataVis1
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataVis1",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 22 a4 4 0 0 0 -2.02 .57 l-3.81 -3.82 a5 5 0 0 0 0 -5.5 l2.54 -2.55 a3.03 3.03 0 1 0 -1.41 -1.41 l-2.55 2.54 a5 5 0 0 0 -5.5 0 L9.43 8.02 A4 4 0 0 0 10 6 a4 4 0 1 0 -4 4 4 4 0 0 0 2.02 -.57 l3.81 3.82 a5 5 0 0 0 0 5.5 l-3.81 3.82 A4 4 0 0 0 6 22 a4 4 0 1 0 4 4 4 4 0 0 0 -.57 -2.02 l3.82 -3.81 A5 5 0 0 0 15 20.9 v3.28 a3 3 0 1 0 2 0 V20.9 a5 5 0 0 0 1.75 -.73 l3.82 3.81 A4 4 0 0 0 22 26 a4 4 0 1 0 4 -4 m-10 -9 a3 3 0 1 1 -3 3 3 3 0 0 1 3 -3 M4 6 a2 2 0 1 1 2 2 2 2 0 0 1 -2 -2 m2 22 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m20 0 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
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
          // l -3.81 -3.82
          lineToRelative(dx = -3.81f, dy = -3.82f)
          // a 5 5 0 0 0 0 -5.5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -5.5f,
          )
          // l 2.54 -2.55
          lineToRelative(dx = 2.54f, dy = -2.55f)
          // a 3.03 3.03 0 1 0 -1.41 -1.41
          arcToRelative(
            a = 3.03f,
            b = 3.03f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -1.41f,
            dy1 = -1.41f,
          )
          // l -2.55 2.54
          lineToRelative(dx = -2.55f, dy = 2.54f)
          // a 5 5 0 0 0 -5.5 0
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.5f,
            dy1 = 0.0f,
          )
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
          // l 3.81 3.82
          lineToRelative(dx = 3.81f, dy = 3.82f)
          // a 5 5 0 0 0 0 5.5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 5.5f,
          )
          // l -3.81 3.82
          lineToRelative(dx = -3.81f, dy = 3.82f)
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
          // l 3.82 -3.81
          lineToRelative(dx = 3.82f, dy = -3.81f)
          // A 5 5 0 0 0 15 20.9
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 20.9f,
          )
          // v 3.28
          verticalLineToRelative(dy = 3.28f)
          // a 3 3 0 1 0 2 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // V 20.9
          verticalLineTo(y = 20.9f)
          // a 5 5 0 0 0 1.75 -0.73
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.75f,
            dy1 = -0.73f,
          )
          // l 3.82 3.81
          lineToRelative(dx = 3.82f, dy = 3.81f)
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
          // m -10 -9
          moveToRelative(dx = -10.0f, dy = -9.0f)
          // a 3 3 0 1 1 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
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
          // m 20 0
          moveToRelative(dx = 20.0f, dy = 0.0f)
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
      .also { _dataVis1 = it }
  }

@Suppress("ObjectPropertyName")
private var _dataVis1: ImageVector? = null
