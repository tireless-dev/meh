// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Parameter: ImageVector
  get() {
    val current = _parameter
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Parameter",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 13 V8 a2 2 0 0 0 -2 -2 h-3 v2 h3 v5 a4 4 0 0 0 1.38 3 A4 4 0 0 0 26 19 v5 h-3 v2 h3 a2 2 0 0 0 2 -2 v-5 a2 2 0 0 1 2 -2 v-2 a2 2 0 0 1 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 13
          moveTo(x = 28.0f, y = 13.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // a 4 4 0 0 0 1.38 3
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.38f,
            dy1 = 3.0f,
          )
          // A 4 4 0 0 0 26 19
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 19.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
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
          // v -5
          verticalLineToRelative(dy = -5.0f)
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
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
        }
        // m17 9 -.86 3 h2 L19 9 h2 l-.86 3 H22 v2 h-2.43 l-1.14 4 H21 v2 h-3.14 L17 23 h-2 l.86 -3 h-2 L13 23 h-2 l.86 -3 H10 v-2 h2.43 l1.14 -4 H11 v-2 h3.14 L15 9Z m.57 5 h-2 l-1.14 4 h2Z
        path(
          pathFillType = PathFillType.EvenOdd,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 9
          moveTo(x = 17.0f, y = 9.0f)
          // l -0.86 3
          lineToRelative(dx = -0.86f, dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // L 19 9
          lineTo(x = 19.0f, y = 9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // l -0.86 3
          lineToRelative(dx = -0.86f, dy = 3.0f)
          // H 22
          horizontalLineTo(x = 22.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2.43
          horizontalLineToRelative(dx = -2.43f)
          // l -1.14 4
          lineToRelative(dx = -1.14f, dy = 4.0f)
          // H 21
          horizontalLineTo(x = 21.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -3.14
          horizontalLineToRelative(dx = -3.14f)
          // L 17 23
          lineTo(x = 17.0f, y = 23.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // l 0.86 -3
          lineToRelative(dx = 0.86f, dy = -3.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // L 13 23
          lineTo(x = 13.0f, y = 23.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // l 0.86 -3
          lineToRelative(dx = 0.86f, dy = -3.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2.43
          horizontalLineToRelative(dx = 2.43f)
          // l 1.14 -4
          lineToRelative(dx = 1.14f, dy = -4.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3.14
          horizontalLineToRelative(dx = 3.14f)
          // L 15 9z
          lineTo(x = 15.0f, y = 9.0f)
          close()
          // m 0.57 5
          moveToRelative(dx = 0.57f, dy = 5.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // l -1.14 4
          lineToRelative(dx = -1.14f, dy = 4.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
        }
        // M6 13 V8 h3 V6 H6 a2 2 0 0 0 -2 2 v5 a2 2 0 0 1 -2 2 v2 a2 2 0 0 1 2 2 v5 a2 2 0 0 0 2 2 h3 v-2 H6 v-5 a4 4 0 0 0 -1.38 -3 A4 4 0 0 0 6 13
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 13
          moveTo(x = 6.0f, y = 13.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
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
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
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
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 4 4 0 0 0 -1.38 -3
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.38f,
            dy1 = -3.0f,
          )
          // A 4 4 0 0 0 6 13
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 13.0f,
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
      .also { _parameter = it }
  }

@Suppress("ObjectPropertyName")
private var _parameter: ImageVector? = null
