// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Coronavirus: ImageVector
  get() {
    val current = _coronavirus
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Coronavirus",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="15.5" cy="11.5" radius="1.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15.5 11.5
          moveTo(x = 15.5f, y = 11.5f)
          // m -1.5 0
          moveToRelative(dx = -1.5f, dy = 0.0f)
          // a 1.5 1.5 0 1 1 3 0
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 0.0f,
          )
          // a 1.5 1.5 0 1 1 -3 0z
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="20.5" cy="15.5" radius="1.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.5 15.5
          moveTo(x = 20.5f, y = 15.5f)
          // m -1.5 0
          moveToRelative(dx = -1.5f, dy = 0.0f)
          // a 1.5 1.5 0 1 1 3 0
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 0.0f,
          )
          // a 1.5 1.5 0 1 1 -3 0z
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="16.0" cy="16.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 16
          moveTo(x = 16.0f, y = 16.0f)
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
        // <circle cx="16.5" cy="20.5" radius="1.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16.5 20.5
          moveTo(x = 16.5f, y = 20.5f)
          // m -1.5 0
          moveToRelative(dx = -1.5f, dy = 0.0f)
          // a 1.5 1.5 0 1 1 3 0
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 0.0f,
          )
          // a 1.5 1.5 0 1 1 -3 0z
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="11.5" cy="16.5" radius="1.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.5 16.5
          moveTo(x = 11.5f, y = 16.5f)
          // m -1.5 0
          moveToRelative(dx = -1.5f, dy = 0.0f)
          // a 1.5 1.5 0 1 1 3 0
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 0.0f,
          )
          // a 1.5 1.5 0 1 1 -3 0z
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M28 13 v2 h-2.05 a10 10 0 0 0 -2.22 -5.32 l1.44 -1.44 1.42 1.42 L28 8.24 23.76 4 l-1.42 1.41 1.42 1.42 -1.44 1.43 A10 10 0 0 0 17 6.06 V4 h2 V2 h-6 v2 h2 v2.05 a10 10 0 0 0 -5.32 2.21 L8.24 6.83 9.66 5.4 8.24 4 4 8.24 l1.41 1.42 1.42 -1.42 1.44 1.44 A10 10 0 0 0 6.05 15 H4 v-2 H2 v6 h2 v-2 h2.05 a10 10 0 0 0 2.22 5.32 l-1.44 1.44 -1.42 -1.42 L4 23.76 8.24 28 l1.42 -1.41 -1.42 -1.42 1.44 -1.43 a10 10 0 0 0 5.32 2.2 V28 h-2 v2 h6 v-2 h-2 v-2.05 a10 10 0 0 0 5.32 -2.21 l1.44 1.43 -1.42 1.42 L23.76 28 28 23.76 l-1.41 -1.42 -1.42 1.42 -1.44 -1.44 A10 10 0 0 0 25.95 17 H28 v2 h2 v-6Z M16 24 a8 8 0 1 1 8 -8 8 8 0 0 1 -8 8
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 13
          moveTo(x = 28.0f, y = 13.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2.05
          horizontalLineToRelative(dx = -2.05f)
          // a 10 10 0 0 0 -2.22 -5.32
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.22f,
            dy1 = -5.32f,
          )
          // l 1.44 -1.44
          lineToRelative(dx = 1.44f, dy = -1.44f)
          // l 1.42 1.42
          lineToRelative(dx = 1.42f, dy = 1.42f)
          // L 28 8.24
          lineTo(x = 28.0f, y = 8.24f)
          // L 23.76 4
          lineTo(x = 23.76f, y = 4.0f)
          // l -1.42 1.41
          lineToRelative(dx = -1.42f, dy = 1.41f)
          // l 1.42 1.42
          lineToRelative(dx = 1.42f, dy = 1.42f)
          // l -1.44 1.43
          lineToRelative(dx = -1.44f, dy = 1.43f)
          // A 10 10 0 0 0 17 6.06
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 6.06f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2.05
          verticalLineToRelative(dy = 2.05f)
          // a 10 10 0 0 0 -5.32 2.21
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.32f,
            dy1 = 2.21f,
          )
          // L 8.24 6.83
          lineTo(x = 8.24f, y = 6.83f)
          // L 9.66 5.4
          lineTo(x = 9.66f, y = 5.4f)
          // L 8.24 4
          lineTo(x = 8.24f, y = 4.0f)
          // L 4 8.24
          lineTo(x = 4.0f, y = 8.24f)
          // l 1.41 1.42
          lineToRelative(dx = 1.41f, dy = 1.42f)
          // l 1.42 -1.42
          lineToRelative(dx = 1.42f, dy = -1.42f)
          // l 1.44 1.44
          lineToRelative(dx = 1.44f, dy = 1.44f)
          // A 10 10 0 0 0 6.05 15
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.05f,
            y1 = 15.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2.05
          horizontalLineToRelative(dx = 2.05f)
          // a 10 10 0 0 0 2.22 5.32
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.22f,
            dy1 = 5.32f,
          )
          // l -1.44 1.44
          lineToRelative(dx = -1.44f, dy = 1.44f)
          // l -1.42 -1.42
          lineToRelative(dx = -1.42f, dy = -1.42f)
          // L 4 23.76
          lineTo(x = 4.0f, y = 23.76f)
          // L 8.24 28
          lineTo(x = 8.24f, y = 28.0f)
          // l 1.42 -1.41
          lineToRelative(dx = 1.42f, dy = -1.41f)
          // l -1.42 -1.42
          lineToRelative(dx = -1.42f, dy = -1.42f)
          // l 1.44 -1.43
          lineToRelative(dx = 1.44f, dy = -1.43f)
          // a 10 10 0 0 0 5.32 2.2
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.32f,
            dy1 = 2.2f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -2.05
          verticalLineToRelative(dy = -2.05f)
          // a 10 10 0 0 0 5.32 -2.21
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.32f,
            dy1 = -2.21f,
          )
          // l 1.44 1.43
          lineToRelative(dx = 1.44f, dy = 1.43f)
          // l -1.42 1.42
          lineToRelative(dx = -1.42f, dy = 1.42f)
          // L 23.76 28
          lineTo(x = 23.76f, y = 28.0f)
          // L 28 23.76
          lineTo(x = 28.0f, y = 23.76f)
          // l -1.41 -1.42
          lineToRelative(dx = -1.41f, dy = -1.42f)
          // l -1.42 1.42
          lineToRelative(dx = -1.42f, dy = 1.42f)
          // l -1.44 -1.44
          lineToRelative(dx = -1.44f, dy = -1.44f)
          // A 10 10 0 0 0 25.95 17
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.95f,
            y1 = 17.0f,
          )
          // H 28
          horizontalLineTo(x = 28.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6z
          verticalLineToRelative(dy = -6.0f)
          close()
          // M 16 24
          moveTo(x = 16.0f, y = 24.0f)
          // a 8 8 0 1 1 8 -8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = -8.0f,
          )
          // a 8 8 0 0 1 -8 8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -8.0f,
            dy1 = 8.0f,
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
      .also { _coronavirus = it }
  }

@Suppress("ObjectPropertyName")
private var _coronavirus: ImageVector? = null
