// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartRadial: ImageVector
  get() {
    val current = _chartRadial
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartRadial",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 30 A14 14 0 0 1 2 16 h2 A12 12 0 1 0 16 4 V2 a14 14 0 0 1 0 28
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // A 14 14 0 0 1 2 16
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 2.0f,
            y1 = 16.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // A 12 12 0 1 0 16 4
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 4.0f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // a 14 14 0 0 1 0 28
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 28.0f,
          )
        }
        // M16 26 A10 10 0 0 1 6 16 h2 a8 8 0 1 0 8 -8 V6 a10 10 0 0 1 0 20
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 26
          moveTo(x = 16.0f, y = 26.0f)
          // A 10 10 0 0 1 6 16
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.0f,
            y1 = 16.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 8 8 0 1 0 8 -8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 8.0f,
            dy1 = -8.0f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
          // a 10 10 0 0 1 0 20
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 20.0f,
          )
        }
        // M16 22 a6 6 0 0 1 -6 -6 h2 a4 4 0 1 0 4 -4 v-2 a6 6 0 0 1 0 12
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 22
          moveTo(x = 16.0f, y = 22.0f)
          // a 6 6 0 0 1 -6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = -6.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 6 6 0 0 1 0 12
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 12.0f,
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
      .also { _chartRadial = it }
  }

@Suppress("ObjectPropertyName")
private var _chartRadial: ImageVector? = null
