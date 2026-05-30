// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ModelReference: ImageVector
  get() {
    val current = _modelReference
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ModelReference",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="4.0 20.0 4.0 22.0 8.5859 22.0 2.0 28.5859 3.4141 30.0 10.0 23.4141 10.0 28.0 12.0 28.0 12.0 20.0 4.0 20.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 4 20
          moveTo(x = 4.0f, y = 20.0f)
          // L 4 22
          lineTo(x = 4.0f, y = 22.0f)
          // L 8.5859 22
          lineTo(x = 8.5859f, y = 22.0f)
          // L 2 28.5859
          lineTo(x = 2.0f, y = 28.5859f)
          // L 3.4141 30
          lineTo(x = 3.4141f, y = 30.0f)
          // L 10 23.4141
          lineTo(x = 10.0f, y = 23.4141f)
          // L 10 28
          lineTo(x = 10.0f, y = 28.0f)
          // L 12 28
          lineTo(x = 12.0f, y = 28.0f)
          // L 12 20
          lineTo(x = 12.0f, y = 20.0f)
          // L 4 20z
          lineTo(x = 4.0f, y = 20.0f)
          close()
        }
        // M27 19 a3 3 0 0 0 0 -6 3 3 0 0 0 -2.82 2 h-5.77 l7.3 -7.3 A3 3 0 1 0 27 2 a3 3 0 0 0 -2.82 2 H7.82 a3 3 0 1 0 -1.53 3.7 l7.3 7.3 H7.82 A3 3 0 0 0 2 16 v1 h2 v-1 a1 1 0 0 1 2 0 v1 h9.59 l8.71 8.71 L24.18 26 H14 v2 h10.18 a3 3 0 1 0 1.53 -3.7 l-7.3 -7.3 h5.77 A3 3 0 0 0 27 19 m1 8 a1 1 0 1 1 -2 0 1 1 0 0 1 2 0 m-1 -12 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2 M7.82 6 h16.36 l.12 .29 -8.3 8.3 -8.3 -8.3z M27 4 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2 M4 5 a1 1 0 1 1 2 0 1 1 0 0 1 -2 0
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 19
          moveTo(x = 27.0f, y = 19.0f)
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
          // a 3 3 0 0 0 -2.82 2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.82f,
            dy1 = 2.0f,
          )
          // h -5.77
          horizontalLineToRelative(dx = -5.77f)
          // l 7.3 -7.3
          lineToRelative(dx = 7.3f, dy = -7.3f)
          // A 3 3 0 1 0 27 2
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 27.0f,
            y1 = 2.0f,
          )
          // a 3 3 0 0 0 -2.82 2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.82f,
            dy1 = 2.0f,
          )
          // H 7.82
          horizontalLineTo(x = 7.82f)
          // a 3 3 0 1 0 -1.53 3.7
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -1.53f,
            dy1 = 3.7f,
          )
          // l 7.3 7.3
          lineToRelative(dx = 7.3f, dy = 7.3f)
          // H 7.82
          horizontalLineTo(x = 7.82f)
          // A 3 3 0 0 0 2 16
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 16.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 1 1 0 0 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h 9.59
          horizontalLineToRelative(dx = 9.59f)
          // l 8.71 8.71
          lineToRelative(dx = 8.71f, dy = 8.71f)
          // L 24.18 26
          lineTo(x = 24.18f, y = 26.0f)
          // H 14
          horizontalLineTo(x = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 10.18
          horizontalLineToRelative(dx = 10.18f)
          // a 3 3 0 1 0 1.53 -3.7
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.53f,
            dy1 = -3.7f,
          )
          // l -7.3 -7.3
          lineToRelative(dx = -7.3f, dy = -7.3f)
          // h 5.77
          horizontalLineToRelative(dx = 5.77f)
          // A 3 3 0 0 0 27 19
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 27.0f,
            y1 = 19.0f,
          )
          // m 1 8
          moveToRelative(dx = 1.0f, dy = 8.0f)
          // a 1 1 0 1 1 -2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 0 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // m -1 -12
          moveToRelative(dx = -1.0f, dy = -12.0f)
          // a 1 1 0 1 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
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
          // M 7.82 6
          moveTo(x = 7.82f, y = 6.0f)
          // h 16.36
          horizontalLineToRelative(dx = 16.36f)
          // l 0.12 0.29
          lineToRelative(dx = 0.12f, dy = 0.29f)
          // l -8.3 8.3
          lineToRelative(dx = -8.3f, dy = 8.3f)
          // l -8.3 -8.3z
          lineToRelative(dx = -8.3f, dy = -8.3f)
          close()
          // M 27 4
          moveTo(x = 27.0f, y = 4.0f)
          // a 1 1 0 1 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
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
          // M 4 5
          moveTo(x = 4.0f, y = 5.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 0 1 -2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
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
      .also { _modelReference = it }
  }

@Suppress("ObjectPropertyName")
private var _modelReference: ImageVector? = null
