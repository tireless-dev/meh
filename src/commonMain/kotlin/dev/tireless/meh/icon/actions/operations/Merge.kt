// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Merge: ImageVector
  get() {
    val current = _merge
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Merge",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 13 a4 4 0 0 0 -3.86 3 H14 a5 5 0 0 1 -5 -5 V9.86 a4 4 0 1 0 -2 0 v12.28 a4 4 0 1 0 2 0 V15.9 A7 7 0 0 0 14 18 h6.14 A4 4 0 1 0 24 13 M10 26 a2 2 0 1 1 -4 0 2 2 0 0 1 4 0 M6 6 a2 2 0 1 1 4 0 2 2 0 0 1 -4 0 m18 13 a2 2 0 1 1 0 -4 2 2 0 0 1 0 4
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 13
          moveTo(x = 24.0f, y = 13.0f)
          // a 4 4 0 0 0 -3.86 3
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.86f,
            dy1 = 3.0f,
          )
          // H 14
          horizontalLineTo(x = 14.0f)
          // a 5 5 0 0 1 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // V 9.86
          verticalLineTo(y = 9.86f)
          // a 4 4 0 1 0 -2 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          // v 12.28
          verticalLineToRelative(dy = 12.28f)
          // a 4 4 0 1 0 2 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // V 15.9
          verticalLineTo(y = 15.9f)
          // A 7 7 0 0 0 14 18
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 18.0f,
          )
          // h 6.14
          horizontalLineToRelative(dx = 6.14f)
          // A 4 4 0 1 0 24 13
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 13.0f,
          )
          // M 10 26
          moveTo(x = 10.0f, y = 26.0f)
          // a 2 2 0 1 1 -4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 0 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // M 6 6
          moveTo(x = 6.0f, y = 6.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 0 1 -4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          // m 18 13
          moveToRelative(dx = 18.0f, dy = 13.0f)
          // a 2 2 0 1 1 0 -4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -4.0f,
          )
          // a 2 2 0 0 1 0 4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 4.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _merge = it }
  }

@Suppress("ObjectPropertyName")
private var _merge: ImageVector? = null
