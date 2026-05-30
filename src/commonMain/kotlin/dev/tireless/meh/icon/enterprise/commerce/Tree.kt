// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tree: ImageVector
  get() {
    val current = _tree
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Tree",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M12 30 H9 v-2 h3 V15.57 l-3.51 -2.11 1.02 -1.72 3.52 2.11 A2 2 0 0 1 14 15.57 V28 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 30
          moveTo(x = 12.0f, y = 30.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // V 15.57
          verticalLineTo(y = 15.57f)
          // l -3.51 -2.11
          lineToRelative(dx = -3.51f, dy = -2.11f)
          // l 1.02 -1.72
          lineToRelative(dx = 1.02f, dy = -1.72f)
          // l 3.52 2.11
          lineToRelative(dx = 3.52f, dy = 2.11f)
          // A 2 2 0 0 1 14 15.57
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.0f,
            y1 = 15.57f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
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
        }
        // M22 30 h-3 a2 2 0 0 1 -2 -2 V17 h6 a4 4 0 0 0 3.98 -4.4 4.15 4.15 0 0 0 -4.2 -3.6 H21.2 l-.18 -.78 C20.45 5.7 18.03 4 15 4 a6 6 0 0 0 -5.44 3.49 L9.25 8.15 8.39 8.04 8 8 a4 4 0 1 0 0 8 v2 A6 6 0 1 1 8 6 h.08 A8 8 0 0 1 15 2 c3.68 0 6.7 1.98 7.75 5 h.04 a6.16 6.16 0 0 1 6.18 5.41 A6 6 0 0 1 23 19 h-4 v9 h3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 30
          moveTo(x = 22.0f, y = 30.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
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
          // V 17
          verticalLineTo(y = 17.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 4 4 0 0 0 3.98 -4.4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.98f,
            dy1 = -4.4f,
          )
          // a 4.15 4.15 0 0 0 -4.2 -3.6
          arcToRelative(
            a = 4.15f,
            b = 4.15f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.2f,
            dy1 = -3.6f,
          )
          // H 21.2
          horizontalLineTo(x = 21.2f)
          // l -0.18 -0.78
          lineToRelative(dx = -0.18f, dy = -0.78f)
          // C 20.45 5.7 18.03 4 15 4
          curveTo(
            x1 = 20.45f,
            y1 = 5.7f,
            x2 = 18.03f,
            y2 = 4.0f,
            x3 = 15.0f,
            y3 = 4.0f,
          )
          // a 6 6 0 0 0 -5.44 3.49
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.44f,
            dy1 = 3.49f,
          )
          // L 9.25 8.15
          lineTo(x = 9.25f, y = 8.15f)
          // L 8.39 8.04
          lineTo(x = 8.39f, y = 8.04f)
          // L 8 8
          lineTo(x = 8.0f, y = 8.0f)
          // a 4 4 0 1 0 0 8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 8.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // A 6 6 0 1 1 8 6
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 8.0f,
            y1 = 6.0f,
          )
          // h 0.08
          horizontalLineToRelative(dx = 0.08f)
          // A 8 8 0 0 1 15 2
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.0f,
            y1 = 2.0f,
          )
          // c 3.68 0 6.7 1.98 7.75 5
          curveToRelative(
            dx1 = 3.68f,
            dy1 = 0.0f,
            dx2 = 6.7f,
            dy2 = 1.98f,
            dx3 = 7.75f,
            dy3 = 5.0f,
          )
          // h 0.04
          horizontalLineToRelative(dx = 0.04f)
          // a 6.16 6.16 0 0 1 6.18 5.41
          arcToRelative(
            a = 6.16f,
            b = 6.16f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.18f,
            dy1 = 5.41f,
          )
          // A 6 6 0 0 1 23 19
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.0f,
            y1 = 19.0f,
          )
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
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
      .also { _tree = it }
  }

@Suppress("ObjectPropertyName")
private var _tree: ImageVector? = null
