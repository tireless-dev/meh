// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PlayOutline: ImageVector
  get() {
    val current = _playOutline
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PlayOutline",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M11 23 a1 1 0 0 1 -1 -1 V10 a1 1 0 0 1 1.45 -.9 l12 6 a1 1 0 0 1 0 1.8 l-12 6 A1 1 0 0 1 11 23 m1 -11.38 v8.76 L20.76 16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 23
          moveTo(x = 11.0f, y = 23.0f)
          // a 1 1 0 0 1 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // V 10
          verticalLineTo(y = 10.0f)
          // a 1 1 0 0 1 1.45 -0.9
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.45f,
            dy1 = -0.9f,
          )
          // l 12 6
          lineToRelative(dx = 12.0f, dy = 6.0f)
          // a 1 1 0 0 1 0 1.8
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 1.8f,
          )
          // l -12 6
          lineToRelative(dx = -12.0f, dy = 6.0f)
          // A 1 1 0 0 1 11 23
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 11.0f,
            y1 = 23.0f,
          )
          // m 1 -11.38
          moveToRelative(dx = 1.0f, dy = -11.38f)
          // v 8.76
          verticalLineToRelative(dy = 8.76f)
          // L 20.76 16z
          lineTo(x = 20.76f, y = 16.0f)
          close()
        }
        // M16 4 A12 12 0 1 1 4 16 12 12 0 0 1 16 4 m0 -2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 4
          moveTo(x = 16.0f, y = 4.0f)
          // A 12 12 0 1 1 4 16
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 16.0f,
          )
          // A 12 12 0 0 1 16 4
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 4.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 14 14 0 1 0 14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 14.0f,
          )
          // A 14 14 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
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
      .also { _playOutline = it }
  }

@Suppress("ObjectPropertyName")
private var _playOutline: ImageVector? = null
