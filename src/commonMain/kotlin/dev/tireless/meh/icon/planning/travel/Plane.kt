// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Plane: ImageVector
  get() {
    val current = _plane
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Plane",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.37 14.75 20 10 V6 a4 4 0 0 0 -8 0 v4 l-9.37 4.75 A1 1 0 0 0 2 15.68 v5 a1 1 0 0 0 1 1 1 1 0 0 0 .29 -.05 L12 18 v5 l-3.45 1.72 A1 1 0 0 0 8 25.62 V29 a1 1 0 0 0 1 1 1 1 0 0 0 .28 0 L16 28 l6.72 2 A1 1 0 0 0 23 30 a1 1 0 0 0 1 -1 v-3.38 a1 1 0 0 0 -.55 -.9 L20 23 v-5 l8.71 3.61 A1 1 0 0 0 29 21.66 a1 1 0 0 0 1 -1 v-5 a1 1 0 0 0 -.63 -.91 M28 19.15 18 15 v9.24 l4 2 v1.43 l-6 -1.75 -6 1.75 v-1.43 l4 -2 V15 L4 19.15 V16.3 l10 -5.07 V6 a2 2 0 0 1 4 0 v5.23 l10 5.07Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.37 14.75
          moveTo(x = 29.37f, y = 14.75f)
          // L 20 10
          lineTo(x = 20.0f, y = 10.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // a 4 4 0 0 0 -8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // l -9.37 4.75
          lineToRelative(dx = -9.37f, dy = 4.75f)
          // A 1 1 0 0 0 2 15.68
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 15.68f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 0 0.29 -0.05
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.29f,
            dy1 = -0.05f,
          )
          // L 12 18
          lineTo(x = 12.0f, y = 18.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // l -3.45 1.72
          lineToRelative(dx = -3.45f, dy = 1.72f)
          // A 1 1 0 0 0 8 25.62
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 25.62f,
          )
          // V 29
          verticalLineTo(y = 29.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 0 0.28 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.28f,
            dy1 = 0.0f,
          )
          // L 16 28
          lineTo(x = 16.0f, y = 28.0f)
          // l 6.72 2
          lineToRelative(dx = 6.72f, dy = 2.0f)
          // A 1 1 0 0 0 23 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.0f,
            y1 = 30.0f,
          )
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // v -3.38
          verticalLineToRelative(dy = -3.38f)
          // a 1 1 0 0 0 -0.55 -0.9
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.55f,
            dy1 = -0.9f,
          )
          // L 20 23
          lineTo(x = 20.0f, y = 23.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // l 8.71 3.61
          lineToRelative(dx = 8.71f, dy = 3.61f)
          // A 1 1 0 0 0 29 21.66
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 29.0f,
            y1 = 21.66f,
          )
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 1 1 0 0 0 -0.63 -0.91
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.63f,
            dy1 = -0.91f,
          )
          // M 28 19.15
          moveTo(x = 28.0f, y = 19.15f)
          // L 18 15
          lineTo(x = 18.0f, y = 15.0f)
          // v 9.24
          verticalLineToRelative(dy = 9.24f)
          // l 4 2
          lineToRelative(dx = 4.0f, dy = 2.0f)
          // v 1.43
          verticalLineToRelative(dy = 1.43f)
          // l -6 -1.75
          lineToRelative(dx = -6.0f, dy = -1.75f)
          // l -6 1.75
          lineToRelative(dx = -6.0f, dy = 1.75f)
          // v -1.43
          verticalLineToRelative(dy = -1.43f)
          // l 4 -2
          lineToRelative(dx = 4.0f, dy = -2.0f)
          // V 15
          verticalLineTo(y = 15.0f)
          // L 4 19.15
          lineTo(x = 4.0f, y = 19.15f)
          // V 16.3
          verticalLineTo(y = 16.3f)
          // l 10 -5.07
          lineToRelative(dx = 10.0f, dy = -5.07f)
          // V 6
          verticalLineTo(y = 6.0f)
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
          // v 5.23
          verticalLineToRelative(dy = 5.23f)
          // l 10 5.07z
          lineToRelative(dx = 10.0f, dy = 5.07f)
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
      .also { _plane = it }
  }

@Suppress("ObjectPropertyName")
private var _plane: ImageVector? = null
