// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EnergyRenewable: ImageVector
  get() {
    val current = _energyRenewable
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.EnergyRenewable",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 14 h-1 v-4 h-2 v4 h-2 v-4 h-2 v4 h-1 a1 1 0 0 0 -1 1 v4 a5 5 0 0 0 4 4.9 V27 a1 1 0 0 1 -1 1 H5 a1 1 0 0 1 0 -2 h5 a3 3 0 0 0 0 -6 H5 a1 1 0 0 1 0 -2 h5 a3 3 0 0 0 3 -3 v-4 h1 a4 4 0 0 0 4 -4 V4 h-3 a4 4 0 0 0 -2.75 1.1 A6 6 0 0 0 7 2 H4 v3 a6 6 0 0 0 6 6 h1 v4 a1 1 0 0 1 -1 1 H5 a3 3 0 0 0 0 6 h5 a1 1 0 0 1 0 2 H5 a3 3 0 0 0 0 6 h18 a3 3 0 0 0 3 -3 v-3.1 a5 5 0 0 0 4 -4.9 v-4 a1 1 0 0 0 -1 -1 M13 8 a2 2 0 0 1 2 -2 h1 v1 a2 2 0 0 1 -2 2 h-1Z m-3 1 a4 4 0 0 1 -4 -4 V4 h1 a4 4 0 0 1 4 4 v1Z m18 10 a3 3 0 0 1 -6 0 v-3 h6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 14
          moveTo(x = 29.0f, y = 14.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // a 5 5 0 0 0 4 4.9
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 4.9f,
          )
          // V 27
          verticalLineTo(y = 27.0f)
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // H 5
          horizontalLineTo(x = 5.0f)
          // a 1 1 0 0 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // a 3 3 0 0 0 0 -6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -6.0f,
          )
          // H 5
          horizontalLineTo(x = 5.0f)
          // a 1 1 0 0 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // a 3 3 0 0 0 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // a 4 4 0 0 0 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // a 4 4 0 0 0 -2.75 1.1
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.75f,
            dy1 = 1.1f,
          )
          // A 6 6 0 0 0 7 2
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.0f,
            y1 = 2.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 6 6 0 0 0 6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = 6.0f,
          )
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // H 5
          horizontalLineTo(x = 5.0f)
          // a 3 3 0 0 0 0 6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 6.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // H 5
          horizontalLineTo(x = 5.0f)
          // a 3 3 0 0 0 0 6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 6.0f,
          )
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // a 3 3 0 0 0 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // v -3.1
          verticalLineToRelative(dy = -3.1f)
          // a 5 5 0 0 0 4 -4.9
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = -4.9f,
          )
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // M 13 8
          moveTo(x = 13.0f, y = 8.0f)
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
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
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
          // h -1z
          horizontalLineToRelative(dx = -1.0f)
          close()
          // m -3 1
          moveToRelative(dx = -3.0f, dy = 1.0f)
          // a 4 4 0 0 1 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // a 4 4 0 0 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // v 1z
          verticalLineToRelative(dy = 1.0f)
          close()
          // m 18 10
          moveToRelative(dx = 18.0f, dy = 10.0f)
          // a 3 3 0 0 1 -6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
          dy1 = 0.0f,
        )
        // v -3
        verticalLineToRelative(dy = -3.0f)
        // h 6z
        horizontalLineToRelative(dx = 6.0f)
        close()
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
      .also { _energyRenewable = it }
  }

@Suppress("ObjectPropertyName")
private var _energyRenewable: ImageVector? = null
