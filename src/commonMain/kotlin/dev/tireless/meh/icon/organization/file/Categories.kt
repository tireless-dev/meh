// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Categories: ImageVector
  get() {
    val current = _categories
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Categories",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m6.76 6 .45 .89 L7.76 8 H12 v5 H4 V6z m.62 -2 H3 a1 1 0 0 0 -1 1 v9 a1 1 0 0 0 1 1 h10 a1 1 0 0 0 1 -1 V7 a1 1 0 0 0 -1 -1 H9 L8.28 4.55 A1 1 0 0 0 7.38 4 m15.38 2 .45 .89 L23.76 8 H28 v5 h-8 V6z m.62 -2 H19 a1 1 0 0 0 -1 1 v9 a1 1 0 0 0 1 1 h10 a1 1 0 0 0 1 -1 V7 a1 1 0 0 0 -1 -1 h-4 l-.72 -1.45 A1 1 0 0 0 23.38 4 M6.76 19 l.45 .89 L7.76 21 H12 v5 H4 v-7z m.62 -2 H3 a1 1 0 0 0 -1 1 v9 a1 1 0 0 0 1 1 h10 a1 1 0 0 0 1 -1 v-7 a1 1 0 0 0 -1 -1 H9 l-.72 -1.45 A1 1 0 0 0 7.38 17 m15.38 2 .45 .89 .55 1.11 H28 v5 h-8 v-7z m.62 -2 H19 a1 1 0 0 0 -1 1 v9 a1 1 0 0 0 1 1 h10 a1 1 0 0 0 1 -1 v-7 a1 1 0 0 0 -1 -1 h-4 l-.72 -1.45 a1 1 0 0 0 -.9 -.55
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6.76 6
          moveTo(x = 6.76f, y = 6.0f)
          // l 0.45 0.89
          lineToRelative(dx = 0.45f, dy = 0.89f)
          // L 7.76 8
          lineTo(x = 7.76f, y = 8.0f)
          // H 12
          horizontalLineTo(x = 12.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // m 0.62 -2
          moveToRelative(dx = 0.62f, dy = -2.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
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
          // h 10
          horizontalLineToRelative(dx = 10.0f)
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
          // V 7
          verticalLineTo(y = 7.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // L 8.28 4.55
          lineTo(x = 8.28f, y = 4.55f)
          // A 1 1 0 0 0 7.38 4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.38f,
            y1 = 4.0f,
          )
          // m 15.38 2
          moveToRelative(dx = 15.38f, dy = 2.0f)
          // l 0.45 0.89
          lineToRelative(dx = 0.45f, dy = 0.89f)
          // L 23.76 8
          lineTo(x = 23.76f, y = 8.0f)
          // H 28
          horizontalLineTo(x = 28.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // m 0.62 -2
          moveToRelative(dx = 0.62f, dy = -2.0f)
          // H 19
          horizontalLineTo(x = 19.0f)
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
          // h 10
          horizontalLineToRelative(dx = 10.0f)
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
          // V 7
          verticalLineTo(y = 7.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // l -0.72 -1.45
          lineToRelative(dx = -0.72f, dy = -1.45f)
          // A 1 1 0 0 0 23.38 4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.38f,
            y1 = 4.0f,
          )
          // M 6.76 19
          moveTo(x = 6.76f, y = 19.0f)
          // l 0.45 0.89
          lineToRelative(dx = 0.45f, dy = 0.89f)
          // L 7.76 21
          lineTo(x = 7.76f, y = 21.0f)
          // H 12
          horizontalLineTo(x = 12.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -7z
          verticalLineToRelative(dy = -7.0f)
          close()
          // m 0.62 -2
          moveToRelative(dx = 0.62f, dy = -2.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
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
          // h 10
          horizontalLineToRelative(dx = 10.0f)
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
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // l -0.72 -1.45
          lineToRelative(dx = -0.72f, dy = -1.45f)
          // A 1 1 0 0 0 7.38 17
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.38f,
            y1 = 17.0f,
          )
          // m 15.38 2
          moveToRelative(dx = 15.38f, dy = 2.0f)
          // l 0.45 0.89
          lineToRelative(dx = 0.45f, dy = 0.89f)
          // l 0.55 1.11
          lineToRelative(dx = 0.55f, dy = 1.11f)
          // H 28
          horizontalLineTo(x = 28.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -7z
          verticalLineToRelative(dy = -7.0f)
          close()
          // m 0.62 -2
          moveToRelative(dx = 0.62f, dy = -2.0f)
          // H 19
          horizontalLineTo(x = 19.0f)
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
          // h 10
          horizontalLineToRelative(dx = 10.0f)
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
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // l -0.72 -1.45
          lineToRelative(dx = -0.72f, dy = -1.45f)
          // a 1 1 0 0 0 -0.9 -0.55
          arcToRelative(
          a = 1.0f,
          b = 1.0f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          dx1 = -0.9f,
          dy1 = -0.55f,
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
      .also { _categories = it }
  }

@Suppress("ObjectPropertyName")
private var _categories: ImageVector? = null
