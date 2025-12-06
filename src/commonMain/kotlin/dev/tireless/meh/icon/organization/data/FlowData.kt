// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlowData: ImageVector
  get() {
    val current = _flowData
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FlowData",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 23 h-8.14 a4 4 0 0 0 -.43 -1 L22 11.43 A4 4 0 0 0 24 12 a4 4 0 1 0 -3.86 -5 h-8.28 a4 4 0 1 0 0 2 h8.28 a4 4 0 0 0 .43 1 L10 20.57 A4 4 0 0 0 8 20 a4 4 0 1 0 3.86 5 H20 v3 h8 v-8 h-8Z M8 10 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m16 -4 a2 2 0 1 1 -2 2 2 2 0 0 1 2 -2 M8 26 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m14 -4 h4 v4 h-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 23
          moveTo(x = 20.0f, y = 23.0f)
          // h -8.14
          horizontalLineToRelative(dx = -8.14f)
          // a 4 4 0 0 0 -0.43 -1
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.43f,
            dy1 = -1.0f,
          )
          // L 22 11.43
          lineTo(x = 22.0f, y = 11.43f)
          // A 4 4 0 0 0 24 12
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 12.0f,
          )
          // a 4 4 0 1 0 -3.86 -5
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -3.86f,
            dy1 = -5.0f,
          )
          // h -8.28
          horizontalLineToRelative(dx = -8.28f)
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
          // h 8.28
          horizontalLineToRelative(dx = 8.28f)
          // a 4 4 0 0 0 0.43 1
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.43f,
            dy1 = 1.0f,
          )
          // L 10 20.57
          lineTo(x = 10.0f, y = 20.57f)
          // A 4 4 0 0 0 8 20
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 20.0f,
          )
          // a 4 4 0 1 0 3.86 5
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 3.86f,
            dy1 = 5.0f,
          )
          // H 20
          horizontalLineTo(x = 20.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
          // M 8 10
          moveTo(x = 8.0f, y = 10.0f)
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
          // m 16 -4
          moveToRelative(dx = 16.0f, dy = -4.0f)
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
          // M 8 26
          moveTo(x = 8.0f, y = 26.0f)
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
          // m 14 -4
          moveToRelative(dx = 14.0f, dy = -4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
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
      .also { _flowData = it }
  }

@Suppress("ObjectPropertyName")
private var _flowData: ImageVector? = null
