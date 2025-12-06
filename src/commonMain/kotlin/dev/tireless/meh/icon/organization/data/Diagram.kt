// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Diagram: ImageVector
  get() {
    val current = _diagram
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Diagram",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M13 30 a11 11 0 0 1 0 -22 1 1 0 0 1 1 1 v9 h9 a1 1 0 0 1 1 1 11 11 0 0 1 -11 11 m-1 -19.94 A9 9 0 1 0 21.94 20 H14 a2 2 0 0 1 -2 -2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 30
          moveTo(x = 13.0f, y = 30.0f)
          // a 11 11 0 0 1 0 -22
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -22.0f,
          )
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // a 11 11 0 0 1 -11 11
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -11.0f,
            dy1 = 11.0f,
          )
          // m -1 -19.94
          moveToRelative(dx = -1.0f, dy = -19.94f)
          // A 9 9 0 1 0 21.94 20
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 21.94f,
            y1 = 20.0f,
          )
          // H 14
          horizontalLineTo(x = 14.0f)
          // a 2 2 0 0 1 -2 -2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          close()
        }
        // M28 14 h-9 a2 2 0 0 1 -2 -2 V3 a1 1 0 0 1 1 -1 11 11 0 0 1 11 11 1 1 0 0 1 -1 1 m-9 -2 h7.94 A9 9 0 0 0 19 4.06Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 14
          moveTo(x = 28.0f, y = 14.0f)
          // h -9
          horizontalLineToRelative(dx = -9.0f)
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
          // V 3
          verticalLineTo(y = 3.0f)
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
          // a 11 11 0 0 1 11 11
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 11.0f,
            dy1 = 11.0f,
          )
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
          // m -9 -2
          moveToRelative(dx = -9.0f, dy = -2.0f)
          // h 7.94
          horizontalLineToRelative(dx = 7.94f)
          // A 9 9 0 0 0 19 4.06z
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 4.06f,
          )
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
      .also { _diagram = it }
  }

@Suppress("ObjectPropertyName")
private var _diagram: ImageVector? = null
