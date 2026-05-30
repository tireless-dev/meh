// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VlanIbm: ImageVector
  get() {
    val current = _vlanIbm
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VlanIbm",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 22 a4 4 0 1 0 4 4 4 4 0 0 0 -4 -4 m0 6 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 M30 5 a3 3 0 1 0 -4 2.82 V15 h-9 V9 h-2 v6 H6 V7.82 a3 3 0 1 0 -2 0 V15 a2 2 0 0 0 2 2 h9 v3 h2 v-3 h9 a2 2 0 0 0 2 -2 V7.82 A3 3 0 0 0 30 5 M5 4 a1 1 0 1 1 -1 1 1 1 0 0 1 1 -1 m22 2 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 22
          moveTo(x = 16.0f, y = 22.0f)
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
          // m 0 6
          moveToRelative(dx = 0.0f, dy = 6.0f)
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
          // M 30 5
          moveTo(x = 30.0f, y = 5.0f)
          // a 3 3 0 1 0 -4 2.82
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 2.82f,
          )
          // V 15
          verticalLineTo(y = 15.0f)
          // h -9
          horizontalLineToRelative(dx = -9.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 7.82
          verticalLineTo(y = 7.82f)
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
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 7.82
          verticalLineTo(y = 7.82f)
          // A 3 3 0 0 0 30 5
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 5.0f,
          )
          // M 5 4
          moveTo(x = 5.0f, y = 4.0f)
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
          // m 22 2
          moveToRelative(dx = 22.0f, dy = 2.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
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
        }
        // <circle cx="16.0" cy="5.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 5
          moveTo(x = 16.0f, y = 5.0f)
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
      .also { _vlanIbm = it }
  }

@Suppress("ObjectPropertyName")
private var _vlanIbm: ImageVector? = null
