// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReadingGlasses: ImageVector
  get() {
    val current = _readingGlasses
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ReadingGlasses",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29.41 7 -4 -4 L24 4.41 l4 4 V19 h-7 a3 3 0 0 0 -2.95 2.46 Q17.1 21.01 16 21 c-1.09 -.01 -1.42 .17 -2.05 .46 A3 3 0 0 0 11 19 H4 V8.41 l4 -4 L6.59 3 l-4 4 A2 2 0 0 0 2 8.4 V25 a4 4 0 0 0 4 4 h3 a5 5 0 0 0 5 -5 v-.21 A3 3 0 0 1 16 23 a3 3 0 0 1 2 .79 V24 a5 5 0 0 0 5 5 h3 a4 4 0 0 0 4 -4 V8.41 c0 -.53 -.2 -1.04 -.59 -1.41 M12 24 a3 3 0 0 1 -3 3 H6 a2 2 0 0 1 -2 -2 v-4 h7 a1 1 0 0 1 1 1z m16 1 a2 2 0 0 1 -2 2 h-3 a3 3 0 0 1 -3 -3 v-2 a1 1 0 0 1 1 -1 h7z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.41 7
          moveTo(x = 29.41f, y = 7.0f)
          // l -4 -4
          lineToRelative(dx = -4.0f, dy = -4.0f)
          // L 24 4.41
          lineTo(x = 24.0f, y = 4.41f)
          // l 4 4
          lineToRelative(dx = 4.0f, dy = 4.0f)
          // V 19
          verticalLineTo(y = 19.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // a 3 3 0 0 0 -2.95 2.46
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.95f,
            dy1 = 2.46f,
          )
          // Q 17.1 21.01 16 21
          quadTo(
            x1 = 17.1f,
            y1 = 21.01f,
            x2 = 16.0f,
            y2 = 21.0f,
          )
          // c -1.09 -0.01 -1.42 0.17 -2.05 0.46
          curveToRelative(
            dx1 = -1.09f,
            dy1 = -0.01f,
            dx2 = -1.42f,
            dy2 = 0.17f,
            dx3 = -2.05f,
            dy3 = 0.46f,
          )
          // A 3 3 0 0 0 11 19
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.0f,
            y1 = 19.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 8.41
          verticalLineTo(y = 8.41f)
          // l 4 -4
          lineToRelative(dx = 4.0f, dy = -4.0f)
          // L 6.59 3
          lineTo(x = 6.59f, y = 3.0f)
          // l -4 4
          lineToRelative(dx = -4.0f, dy = 4.0f)
          // A 2 2 0 0 0 2 8.4
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 8.4f,
          )
          // V 25
          verticalLineTo(y = 25.0f)
          // a 4 4 0 0 0 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 5 5 0 0 0 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // v -0.21
          verticalLineToRelative(dy = -0.21f)
          // A 3 3 0 0 1 16 23
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 23.0f,
          )
          // a 3 3 0 0 1 2 0.79
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.79f,
          )
          // V 24
          verticalLineTo(y = 24.0f)
          // a 5 5 0 0 0 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 4 4 0 0 0 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // V 8.41
          verticalLineTo(y = 8.41f)
          // c 0 -0.53 -0.2 -1.04 -0.59 -1.41
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.53f,
            dx2 = -0.2f,
            dy2 = -1.04f,
            dx3 = -0.59f,
            dy3 = -1.41f,
          )
          // M 12 24
          moveTo(x = 12.0f, y = 24.0f)
          // a 3 3 0 0 1 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // a 1 1 0 0 1 1 1z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          close()
          // m 16 1
          moveToRelative(dx = 16.0f, dy = 1.0f)
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
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // a 3 3 0 0 1 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // h 7z
          horizontalLineToRelative(dx = 7.0f)
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
      .also { _readingGlasses = it }
  }

@Suppress("ObjectPropertyName")
private var _readingGlasses: ImageVector? = null
