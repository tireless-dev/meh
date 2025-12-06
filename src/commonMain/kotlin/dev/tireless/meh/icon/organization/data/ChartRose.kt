// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartRose: ImageVector
  get() {
    val current = _chartRose
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartRose",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 17 A15 15 0 0 0 15 2 h-1 v6.06 A9 9 0 0 0 6.06 16 H4 v1 a11 11 0 0 0 10 10.95 V30 h1 a13 13 0 0 0 12.95 -12 H30Z M16 4.04 A13 13 0 0 1 27.96 16 H16Z m-2 6.04 V16 H8.08 A7 7 0 0 1 14 10.08 M6.06 18 H14 v7.94 A9 9 0 0 1 6.06 18 M16 27.96 V18 h9.96 A11 11 0 0 1 16 27.96
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 17
          moveTo(x = 30.0f, y = 17.0f)
          // A 15 15 0 0 0 15 2
          arcTo(
            horizontalEllipseRadius = 15.0f,
            verticalEllipseRadius = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 2.0f,
          )
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // v 6.06
          verticalLineToRelative(dy = 6.06f)
          // A 9 9 0 0 0 6.06 16
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.06f,
            y1 = 16.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 11 11 0 0 0 10 10.95
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 10.0f,
            dy1 = 10.95f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // a 13 13 0 0 0 12.95 -12
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 12.95f,
            dy1 = -12.0f,
          )
          // H 30z
          horizontalLineTo(x = 30.0f)
          close()
          // M 16 4.04
          moveTo(x = 16.0f, y = 4.04f)
          // A 13 13 0 0 1 27.96 16
          arcTo(
            horizontalEllipseRadius = 13.0f,
            verticalEllipseRadius = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.96f,
            y1 = 16.0f,
          )
          // H 16z
          horizontalLineTo(x = 16.0f)
          close()
          // m -2 6.04
          moveToRelative(dx = -2.0f, dy = 6.04f)
          // V 16
          verticalLineTo(y = 16.0f)
          // H 8.08
          horizontalLineTo(x = 8.08f)
          // A 7 7 0 0 1 14 10.08
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.0f,
            y1 = 10.08f,
          )
          // M 6.06 18
          moveTo(x = 6.06f, y = 18.0f)
          // H 14
          horizontalLineTo(x = 14.0f)
          // v 7.94
          verticalLineToRelative(dy = 7.94f)
          // A 9 9 0 0 1 6.06 18
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.06f,
            y1 = 18.0f,
          )
          // M 16 27.96
          moveTo(x = 16.0f, y = 27.96f)
          // V 18
          verticalLineTo(y = 18.0f)
          // h 9.96
          horizontalLineToRelative(dx = 9.96f)
          // A 11 11 0 0 1 16 27.96
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 27.96f,
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
      .also { _chartRose = it }
  }

@Suppress("ObjectPropertyName")
private var _chartRose: ImageVector? = null
