// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataVis3: ImageVector
  get() {
    val current = _dataVis3
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataVis3",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 3 a3 3 0 0 0 -2.82 2 h-3.32 a3.98 3.98 0 0 0 -7.72 0 H9.86 A4 4 0 1 0 5 9.86 v4.28 a3.98 3.98 0 0 0 0 7.72 v3.32 a3 3 0 1 0 2 0 v-3.32 a4 4 0 0 0 1.67 -.9 l3.37 1.68 L12 23 a3.01 3.01 0 1 0 .92 -2.16 l-3.15 -1.57 A4 4 0 0 0 10 18 a4 4 0 0 0 -3 -3.86 V9.86 A4 4 0 0 0 9.86 7 h4.28 a3.94 3.94 0 0 0 4.78 2.88 l1.82 3.17 a3.05 3.05 0 1 0 1.73 -1 l-1.78 -3.1 A4 4 0 0 0 21.86 7 h3.32 A3 3 0 1 0 28 3 M8 18 a2 2 0 1 1 -2 -2 2 2 0 0 1 2 2 M6 8 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m10 -2 a2 2 0 1 1 2 2 2 2 0 0 1 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 3
          moveTo(x = 28.0f, y = 3.0f)
          // a 3 3 0 0 0 -2.82 2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.82f,
            dy1 = 2.0f,
          )
          // h -3.32
          horizontalLineToRelative(dx = -3.32f)
          // a 3.98 3.98 0 0 0 -7.72 0
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.72f,
            dy1 = 0.0f,
          )
          // H 9.86
          horizontalLineTo(x = 9.86f)
          // A 4 4 0 1 0 5 9.86
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 5.0f,
            y1 = 9.86f,
          )
          // v 4.28
          verticalLineToRelative(dy = 4.28f)
          // a 3.98 3.98 0 0 0 0 7.72
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 7.72f,
          )
          // v 3.32
          verticalLineToRelative(dy = 3.32f)
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
          // v -3.32
          verticalLineToRelative(dy = -3.32f)
          // a 4 4 0 0 0 1.67 -0.9
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.67f,
            dy1 = -0.9f,
          )
          // l 3.37 1.68
          lineToRelative(dx = 3.37f, dy = 1.68f)
          // L 12 23
          lineTo(x = 12.0f, y = 23.0f)
          // a 3.01 3.01 0 1 0 0.92 -2.16
          arcToRelative(
            a = 3.01f,
            b = 3.01f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.92f,
            dy1 = -2.16f,
          )
          // l -3.15 -1.57
          lineToRelative(dx = -3.15f, dy = -1.57f)
          // A 4 4 0 0 0 10 18
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.0f,
            y1 = 18.0f,
          )
          // a 4 4 0 0 0 -3 -3.86
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.86f,
          )
          // V 9.86
          verticalLineTo(y = 9.86f)
          // A 4 4 0 0 0 9.86 7
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.86f,
            y1 = 7.0f,
          )
          // h 4.28
          horizontalLineToRelative(dx = 4.28f)
          // a 3.94 3.94 0 0 0 4.78 2.88
          arcToRelative(
            a = 3.94f,
            b = 3.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.78f,
            dy1 = 2.88f,
          )
          // l 1.82 3.17
          lineToRelative(dx = 1.82f, dy = 3.17f)
          // a 3.05 3.05 0 1 0 1.73 -1
          arcToRelative(
            a = 3.05f,
            b = 3.05f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.73f,
            dy1 = -1.0f,
          )
          // l -1.78 -3.1
          lineToRelative(dx = -1.78f, dy = -3.1f)
          // A 4 4 0 0 0 21.86 7
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.86f,
            y1 = 7.0f,
          )
          // h 3.32
          horizontalLineToRelative(dx = 3.32f)
          // A 3 3 0 1 0 28 3
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 3.0f,
          )
          // M 8 18
          moveTo(x = 8.0f, y = 18.0f)
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
          // M 6 8
          moveTo(x = 6.0f, y = 8.0f)
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
          // m 10 -2
          moveToRelative(dx = 10.0f, dy = -2.0f)
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
      .also { _dataVis3 = it }
  }

@Suppress("ObjectPropertyName")
private var _dataVis3: ImageVector? = null
