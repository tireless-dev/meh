// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EdgeCluster: ImageVector
  get() {
    val current = _edgeCluster
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.EdgeCluster",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 7 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3 m0 -4 a1 1 0 1 0 1 1 1 1 0 0 0 -1 -1 m-5 27 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3 m0 -4 a1 1 0 1 0 1 1 1 1 0 0 0 -1 -1 M7 11 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3 m0 -4 a1 1 0 1 0 1 1 1 1 0 0 0 -1 -1 m14 23 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3 m0 -4 a1 1 0 1 0 1 1 1 1 0 0 0 -1 -1 m4 -15 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3 m0 -4 a1 1 0 1 0 1 1 1 1 0 0 0 -1 -1 M4 21 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3 m0 -4 a1 1 0 1 0 1 1 1 1 0 0 0 -1 -1 m24 4 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3 m0 -4 a1 1 0 1 0 1 1 1 1 0 0 0 -1 -1 m-12 5 a6 6 0 1 1 6 -6 6 6 0 0 1 -6 6 m0 -10 a4 4 0 1 0 4 4 4 4 0 0 0 -4 -4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 7
          moveTo(x = 16.0f, y = 7.0f)
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
          // m 0 -4
          moveToRelative(dx = 0.0f, dy = -4.0f)
          // a 1 1 0 1 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // m -5 27
          moveToRelative(dx = -5.0f, dy = 27.0f)
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
          // m 0 -4
          moveToRelative(dx = 0.0f, dy = -4.0f)
          // a 1 1 0 1 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // M 7 11
          moveTo(x = 7.0f, y = 11.0f)
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
          // m 0 -4
          moveToRelative(dx = 0.0f, dy = -4.0f)
          // a 1 1 0 1 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // m 14 23
          moveToRelative(dx = 14.0f, dy = 23.0f)
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
          // m 0 -4
          moveToRelative(dx = 0.0f, dy = -4.0f)
          // a 1 1 0 1 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // m 4 -15
          moveToRelative(dx = 4.0f, dy = -15.0f)
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
          // m 0 -4
          moveToRelative(dx = 0.0f, dy = -4.0f)
          // a 1 1 0 1 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // M 4 21
          moveTo(x = 4.0f, y = 21.0f)
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
          // m 0 -4
          moveToRelative(dx = 0.0f, dy = -4.0f)
          // a 1 1 0 1 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // m 24 4
          moveToRelative(dx = 24.0f, dy = 4.0f)
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
          // m 0 -4
          moveToRelative(dx = 0.0f, dy = -4.0f)
          // a 1 1 0 1 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // m -12 5
          moveToRelative(dx = -12.0f, dy = 5.0f)
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
          // m 0 -10
          moveToRelative(dx = 0.0f, dy = -10.0f)
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
          // a 4 4 0 0 0 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = -4.0f,
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
      .also { _edgeCluster = it }
  }

@Suppress("ObjectPropertyName")
private var _edgeCluster: ImageVector? = null
