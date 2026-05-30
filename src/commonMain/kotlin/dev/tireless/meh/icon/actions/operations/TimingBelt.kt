// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TimingBelt: ImageVector
  get() {
    val current = _timingBelt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TimingBelt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="16.0" cy="24.0" radius="1.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 16 24
          moveTo(x = 16.0f, y = 24.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
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
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M30 12 a4 4 0 0 0 -2.9 -3.83 L7.2 2.21 A4 4 0 0 0 6 2 a4 4 0 0 0 -3.62 5.68 l8.1 18.68 a6 6 0 0 0 10.76 .55 l8 -12.59 A4 4 0 0 0 30 12 m-14 6 a6 6 0 0 0 -5.45 3.5 L5.54 9.95 Q5.76 10 6 10 a4 4 0 0 0 3.88 -4.92 l13.39 4.01 a3.98 3.98 0 0 0 2.56 6.9 l-4.06 6.37 A6 6 0 0 0 16 18 m12 -6 a2 2 0 1 1 -4 0 2 2 0 0 1 4 0 M6 4 a2 2 0 1 1 0 4 2 2 0 0 1 0 -4 m10 24 a4 4 0 1 1 0 -8 4 4 0 0 1 0 8
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 12
          moveTo(x = 30.0f, y = 12.0f)
          // a 4 4 0 0 0 -2.9 -3.83
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.9f,
            dy1 = -3.83f,
          )
          // L 7.2 2.21
          lineTo(x = 7.2f, y = 2.21f)
          // A 4 4 0 0 0 6 2
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 2.0f,
          )
          // a 4 4 0 0 0 -3.62 5.68
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.62f,
            dy1 = 5.68f,
          )
          // l 8.1 18.68
          lineToRelative(dx = 8.1f, dy = 18.68f)
          // a 6 6 0 0 0 10.76 0.55
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 10.76f,
            dy1 = 0.55f,
          )
          // l 8 -12.59
          lineToRelative(dx = 8.0f, dy = -12.59f)
          // A 4 4 0 0 0 30 12
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 12.0f,
          )
          // m -14 6
          moveToRelative(dx = -14.0f, dy = 6.0f)
          // a 6 6 0 0 0 -5.45 3.5
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.45f,
            dy1 = 3.5f,
          )
          // L 5.54 9.95
          lineTo(x = 5.54f, y = 9.95f)
          // Q 5.76 10 6 10
          quadTo(
            x1 = 5.76f,
            y1 = 10.0f,
            x2 = 6.0f,
            y2 = 10.0f,
          )
          // a 4 4 0 0 0 3.88 -4.92
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.88f,
            dy1 = -4.92f,
          )
          // l 13.39 4.01
          lineToRelative(dx = 13.39f, dy = 4.01f)
          // a 3.98 3.98 0 0 0 2.56 6.9
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.56f,
            dy1 = 6.9f,
          )
          // l -4.06 6.37
          lineToRelative(dx = -4.06f, dy = 6.37f)
          // A 6 6 0 0 0 16 18
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 18.0f,
          )
          // m 12 -6
          moveToRelative(dx = 12.0f, dy = -6.0f)
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
          // M 6 4
          moveTo(x = 6.0f, y = 4.0f)
          // a 2 2 0 1 1 0 4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 4.0f,
          )
          // a 2 2 0 0 1 0 -4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -4.0f,
          )
          // m 10 24
          moveToRelative(dx = 10.0f, dy = 24.0f)
          // a 4 4 0 1 1 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // a 4 4 0 0 1 0 8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 8.0f,
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
      .also { _timingBelt = it }
  }

@Suppress("ObjectPropertyName")
private var _timingBelt: ImageVector? = null
