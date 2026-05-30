// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Airport01: ImageVector
  get() {
    val current = _airport01
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Airport01",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m17 14.5 6 2.5 v-2 l-6 -3 V9 a1 1 0 0 0 -2 0 v3 l-6 3 v2 l6 -2.5 V20 l-3 2 v1 l4 -1 4 1 v-1 l-3 -2Z
        path(
          pathFillType = PathFillType.EvenOdd,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 14.5
          moveTo(x = 17.0f, y = 14.5f)
          // l 6 2.5
          lineToRelative(dx = 6.0f, dy = 2.5f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // l -6 -3
          lineToRelative(dx = -6.0f, dy = -3.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // a 1 1 0 0 0 -2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // l -6 3
          lineToRelative(dx = -6.0f, dy = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // l 6 -2.5
          lineToRelative(dx = 6.0f, dy = -2.5f)
          // V 20
          verticalLineTo(y = 20.0f)
          // l -3 2
          lineToRelative(dx = -3.0f, dy = 2.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // l 4 -1
          lineToRelative(dx = 4.0f, dy = -1.0f)
          // l 4 1
          lineToRelative(dx = 4.0f, dy = 1.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // l -3 -2z
          lineToRelative(dx = -3.0f, dy = -2.0f)
          close()
        }
        // M16 30 a14 14 0 1 1 14 -14 14 14 0 0 1 -14 14 m0 -26 a12 12 0 1 0 12 12 A12 12 0 0 0 16 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // a 14 14 0 1 1 14 -14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 14.0f,
            dy1 = -14.0f,
          )
          // a 14 14 0 0 1 -14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -14.0f,
            dy1 = 14.0f,
          )
          // m 0 -26
          moveToRelative(dx = 0.0f, dy = -26.0f)
          // a 12 12 0 1 0 12 12
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 12.0f,
            dy1 = 12.0f,
          )
          // A 12 12 0 0 0 16 4
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 4.0f,
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
      .also { _airport01 = it }
  }

@Suppress("ObjectPropertyName")
private var _airport01: ImageVector? = null
