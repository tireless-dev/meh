// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Share: ImageVector
  get() {
    val current = _share
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Share",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 20 a5 5 0 0 0 -3.89 1.89 l-7.31 -4.57 a4.5 4.5 0 0 0 0 -2.64 l7.31 -4.57 A5 5 0 1 0 18 7 a5 5 0 0 0 .2 1.32 l-7.31 4.57 a5 5 0 1 0 0 6.22 l7.31 4.57 A5 5 0 0 0 18 25 a5 5 0 1 0 5 -5 m0 -16 a3 3 0 1 1 -3 3 3 3 0 0 1 3 -3 M7 19 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3 m16 9 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 20
          moveTo(x = 23.0f, y = 20.0f)
          // a 5 5 0 0 0 -3.89 1.89
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.89f,
            dy1 = 1.89f,
          )
          // l -7.31 -4.57
          lineToRelative(dx = -7.31f, dy = -4.57f)
          // a 4.5 4.5 0 0 0 0 -2.64
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.64f,
          )
          // l 7.31 -4.57
          lineToRelative(dx = 7.31f, dy = -4.57f)
          // A 5 5 0 1 0 18 7
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 7.0f,
          )
          // a 5 5 0 0 0 0.2 1.32
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.2f,
            dy1 = 1.32f,
          )
          // l -7.31 4.57
          lineToRelative(dx = -7.31f, dy = 4.57f)
          // a 5 5 0 1 0 0 6.22
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 6.22f,
          )
          // l 7.31 4.57
          lineToRelative(dx = 7.31f, dy = 4.57f)
          // A 5 5 0 0 0 18 25
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 25.0f,
          )
          // a 5 5 0 1 0 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // m 0 -16
          moveToRelative(dx = 0.0f, dy = -16.0f)
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
          // M 7 19
          moveTo(x = 7.0f, y = 19.0f)
          // a 3 3 0 1 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // a 3 3 0 0 1 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // m 16 9
          moveToRelative(dx = 16.0f, dy = 9.0f)
          // a 3 3 0 1 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // a 3 3 0 0 1 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 32
          moveTo(x = 0.0f, y = 32.0f)
          // l -1.3987644E-6 -32
          lineToRelative(dx = -1.3987644E-6f, dy = -32.0f)
          // l 32 -1.3987644E-6
          lineToRelative(dx = 32.0f, dy = -1.3987644E-6f)
          // l 1.3987644E-6 32z
          lineToRelative(dx = 1.3987644E-6f, dy = 32.0f)
          close()
        }
      }.build()
      .also { _share = it }
  }

@Suppress("ObjectPropertyName")
private var _share: ImageVector? = null
