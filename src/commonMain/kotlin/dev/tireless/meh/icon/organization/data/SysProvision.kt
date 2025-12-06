// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SysProvision: ImageVector
  get() {
    val current = _sysProvision
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SysProvision",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="21.0 20.0 21.0 30.0 30.0 25.0 21.0 20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 20
          moveTo(x = 21.0f, y = 20.0f)
          // L 21 30
          lineTo(x = 21.0f, y = 30.0f)
          // L 30 25
          lineTo(x = 30.0f, y = 25.0f)
          // L 21 20z
          lineTo(x = 21.0f, y = 20.0f)
          close()
        }
        // <circle cx="14.0" cy="14.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 14
          moveTo(x = 14.0f, y = 14.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
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
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M14 20 a6 6 0 1 1 6 -6 6 6 0 0 1 -6 6 m0 -10 a4 4 0 1 0 4 4 4 4 0 0 0 -4 -4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 20
          moveTo(x = 14.0f, y = 20.0f)
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
        // M25.95 12.91 A12.05 12.05 0 1 0 17 25.61 v-2.07 a9.98 9.98 0 1 1 6.62 -6.81 l1.93 .54 A12 12 0 0 0 26 14 q0 -.55 -.05 -1.09
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.95 12.91
          moveTo(x = 25.95f, y = 12.91f)
          // A 12.05 12.05 0 1 0 17 25.61
          arcTo(
            horizontalEllipseRadius = 12.05f,
            verticalEllipseRadius = 12.05f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 25.61f,
          )
          // v -2.07
          verticalLineToRelative(dy = -2.07f)
          // a 9.98 9.98 0 1 1 6.62 -6.81
          arcToRelative(
            a = 9.98f,
            b = 9.98f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 6.62f,
            dy1 = -6.81f,
          )
          // l 1.93 0.54
          lineToRelative(dx = 1.93f, dy = 0.54f)
          // A 12 12 0 0 0 26 14
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 14.0f,
          )
          // q 0 -0.55 -0.05 -1.09
          quadToRelative(
            dx1 = 0.0f,
            dy1 = -0.55f,
            dx2 = -0.05f,
            dy2 = -1.09f,
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
      .also { _sysProvision = it }
  }

@Suppress("ObjectPropertyName")
private var _sysProvision: ImageVector? = null
