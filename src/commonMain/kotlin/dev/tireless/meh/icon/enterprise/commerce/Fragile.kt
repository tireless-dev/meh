// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fragile: ImageVector
  get() {
    val current = _fragile
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Fragile",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 12 V6 h-2 v6 a5 5 0 0 1 -10 0 V4 h5.59 l-2.3 2.3 a1 1 0 0 0 0 1.4 L15.6 9 l-2.3 2.3 1.42 1.4 3 -3 a1 1 0 0 0 0 -1.4 L16.4 7 l3.3 -3.3 A1 1 0 0 0 19 2 h-9 a1 1 0 0 0 -1 1 v9 a7 7 0 0 0 6 6.92 V28 h-5 v2 h12 v-2 h-5 v-9.08 A7 7 0 0 0 23 12
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 12
          moveTo(x = 23.0f, y = 12.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 5 5 0 0 1 -10 0
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -10.0f,
            dy1 = 0.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // h 5.59
          horizontalLineToRelative(dx = 5.59f)
          // l -2.3 2.3
          lineToRelative(dx = -2.3f, dy = 2.3f)
          // a 1 1 0 0 0 0 1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.4f,
          )
          // L 15.6 9
          lineTo(x = 15.6f, y = 9.0f)
          // l -2.3 2.3
          lineToRelative(dx = -2.3f, dy = 2.3f)
          // l 1.42 1.4
          lineToRelative(dx = 1.42f, dy = 1.4f)
          // l 3 -3
          lineToRelative(dx = 3.0f, dy = -3.0f)
          // a 1 1 0 0 0 0 -1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.4f,
          )
          // L 16.4 7
          lineTo(x = 16.4f, y = 7.0f)
          // l 3.3 -3.3
          lineToRelative(dx = 3.3f, dy = -3.3f)
          // A 1 1 0 0 0 19 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 2.0f,
          )
          // h -9
          horizontalLineToRelative(dx = -9.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // a 7 7 0 0 0 6 6.92
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = 6.92f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v -9.08
          verticalLineToRelative(dy = -9.08f)
          // A 7 7 0 0 0 23 12
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.0f,
            y1 = 12.0f,
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
      .also { _fragile = it }
  }

@Suppress("ObjectPropertyName")
private var _fragile: ImageVector? = null
