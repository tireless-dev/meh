// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Schematics: ImageVector
  get() {
    val current = _schematics
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Schematics",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 19 a4 4 0 0 0 -4 -4 H9 a2 2 0 0 1 -2 -2 V9.86 A4 4 0 0 0 9.86 7 h12.28 a4 4 0 1 0 0 -2 H9.86 A4 4 0 1 0 5 9.86 V13 a4 4 0 0 0 4 4 h14 a2 2 0 0 1 2 2 v3 h-3 v3 H9.86 a4 4 0 1 0 0 2 H22 v3 h8 v-8 h-3Z M26 4 a2 2 0 1 1 -2 2 2 2 0 0 1 2 -2 M4 6 a2 2 0 1 1 2 2 2 2 0 0 1 -2 -2 m2 22 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m22 -4 v4 h-4 v-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 19
          moveTo(x = 27.0f, y = 19.0f)
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
          // H 9
          horizontalLineTo(x = 9.0f)
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
          // h 12.28
          horizontalLineToRelative(dx = 12.28f)
          // a 4 4 0 1 0 0 -2
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.0f,
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
          // V 13
          verticalLineTo(y = 13.0f)
          // a 4 4 0 0 0 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // h 14
          horizontalLineToRelative(dx = 14.0f)
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
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 9.86
          horizontalLineTo(x = 9.86f)
          // a 4 4 0 1 0 0 2
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // H 22
          horizontalLineTo(x = 22.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h -3z
          horizontalLineToRelative(dx = -3.0f)
          close()
          // M 26 4
          moveTo(x = 26.0f, y = 4.0f)
          // a 2 2 0 1 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
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
          // m 22 -4
          moveToRelative(dx = 22.0f, dy = -4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
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
      .also { _schematics = it }
  }

@Suppress("ObjectPropertyName")
private var _schematics: ImageVector? = null
