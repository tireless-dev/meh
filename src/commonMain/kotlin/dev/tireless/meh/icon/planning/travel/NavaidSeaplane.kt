// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NavaidSeaplane: ImageVector
  get() {
    val current = _navaidSeaplane
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NavaidSeaplane",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 18 a4 4 0 0 1 -3 3.86 V17 h2 v-2 h-2 v-1.18 a3 3 0 1 0 -2 0 V15 h-2 v2 h2 v4.86 A4 4 0 0 1 12 18 h-2 a6 6 0 0 0 12 0Z m-4 -8 a1 1 0 1 1 -1 1 1 1 0 0 1 1 -1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 18
          moveTo(x = 20.0f, y = 18.0f)
          // a 4 4 0 0 1 -3 3.86
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 3.86f,
          )
          // V 17
          verticalLineTo(y = 17.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -1.18
          verticalLineToRelative(dy = -1.18f)
          // a 3 3 0 1 0 -2 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          // V 15
          verticalLineTo(y = 15.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4.86
          verticalLineToRelative(dy = 4.86f)
          // A 4 4 0 0 1 12 18
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.0f,
            y1 = 18.0f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 6 6 0 0 0 12 0z
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 12.0f,
            dy1 = 0.0f,
          )
          close()
          // m -4 -8
          moveToRelative(dx = -4.0f, dy = -8.0f)
          // a 1 1 0 1 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
        }
        // M30 14 h-2.18 A12 12 0 0 0 18 4.18 V2 h-4 v2.18 A12 12 0 0 0 4.18 14 H2 v4 h2.18 A12 12 0 0 0 14 27.82 V30 h4 v-2.18 A12 12 0 0 0 27.82 18 H30Z M16 26 a10 10 0 1 1 10 -10 10 10 0 0 1 -10 10
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 14
          moveTo(x = 30.0f, y = 14.0f)
          // h -2.18
          horizontalLineToRelative(dx = -2.18f)
          // A 12 12 0 0 0 18 4.18
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 4.18f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2.18
          verticalLineToRelative(dy = 2.18f)
          // A 12 12 0 0 0 4.18 14
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.18f,
            y1 = 14.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2.18
          horizontalLineToRelative(dx = 2.18f)
          // A 12 12 0 0 0 14 27.82
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 27.82f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2.18
          verticalLineToRelative(dy = -2.18f)
          // A 12 12 0 0 0 27.82 18
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 27.82f,
            y1 = 18.0f,
          )
          // H 30z
          horizontalLineTo(x = 30.0f)
          close()
          // M 16 26
          moveTo(x = 16.0f, y = 26.0f)
          // a 10 10 0 1 1 10 -10
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 10.0f,
            dy1 = -10.0f,
          )
          // a 10 10 0 0 1 -10 10
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -10.0f,
            dy1 = 10.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 32 32
          moveTo(x = 32.0f, y = 32.0f)
          // l -32 0
          lineToRelative(dx = -32.0f, dy = 0.0f)
          // l 0 -32
          lineToRelative(dx = 0.0f, dy = -32.0f)
          // l 32 -0z
          lineToRelative(dx = 32.0f, dy = -0.0f)
          close()
        }
      }.build()
      .also { _navaidSeaplane = it }
  }

@Suppress("ObjectPropertyName")
private var _navaidSeaplane: ImageVector? = null
