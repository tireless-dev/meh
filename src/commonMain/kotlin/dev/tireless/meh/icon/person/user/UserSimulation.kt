// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserSimulation: ImageVector
  get() {
    val current = _userSimulation
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UserSimulation",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="4" height="2" x="25.232" y="12.866" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.99995 11.999973
          moveTo(x = 25.99995f, y = 11.999973f)
          // l 3.4641016 2
          lineToRelative(dx = 3.4641016f, dy = 2.0f)
          // l -1 1.7320508
          lineToRelative(dx = -1.0f, dy = 1.7320508f)
          // l -3.4641016 -2z
          lineToRelative(dx = -3.4641016f, dy = -2.0f)
          close()
        }
        // <rect width="4" height="2" x="26.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 8
          moveTo(x = 26.0f, y = 8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="2.768" y="12.866" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7.0000505 13.732026
          moveTo(x = 7.0000505f, y = 13.732026f)
          // l -3.464102 1.9999993
          lineToRelative(dx = -3.464102f, dy = 1.9999993f)
          // l -0.99999964 -1.732051
          lineToRelative(dx = -0.99999964f, dy = -1.732051f)
          // l 3.464102 -1.9999993z
          lineToRelative(dx = 3.464102f, dy = -1.9999993f)
          close()
        }
        // M26 30 h-2 v-5 a5 5 0 0 0 -5 -5 h-6 a5 5 0 0 0 -5 5 v5 H6 v-5 a7 7 0 0 1 7 -7 h6 a7 7 0 0 1 7 7Z M16 4 a5 5 0 1 1 -5 5 5 5 0 0 1 5 -5 m0 -2 a7 7 0 1 0 7 7 7 7 0 0 0 -7 -7
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 30
          moveTo(x = 26.0f, y = 30.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 5 5 0 0 0 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // a 5 5 0 0 0 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 7 7 0 0 1 7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.0f,
            dy1 = -7.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 7 7 0 0 1 7 7z
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.0f,
            dy1 = 7.0f,
          )
          close()
          // M 16 4
          moveTo(x = 16.0f, y = 4.0f)
          // a 5 5 0 1 1 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // a 5 5 0 0 1 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 7 7 0 1 0 7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 7.0f,
            dy1 = 7.0f,
          )
          // a 7 7 0 0 0 -7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = -7.0f,
          )
        }
        // <rect width="4" height="2" x="25.232" y="3.134" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.999949 4.267975
          moveTo(x = 24.999949f, y = 4.267975f)
          // l 3.4641016 -2
          lineToRelative(dx = 3.4641016f, dy = -2.0f)
          // l 1 1.7320508
          lineToRelative(dx = 1.0f, dy = 1.7320508f)
          // l -3.4641016 2z
          lineToRelative(dx = -3.4641016f, dy = 2.0f)
          close()
        }
        // <rect width="4" height="2" x="2.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 8
          moveTo(x = 2.0f, y = 8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="2.768" y="3.134" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6.0000505 6.0000257
          moveTo(x = 6.0000505f, y = 6.0000257f)
          // l -3.464101 -2.0000007
          lineToRelative(dx = -3.464101f, dy = -2.0000007f)
          // l 1.0000004 -1.7320505
          lineToRelative(dx = 1.0000004f, dy = -1.7320505f)
          // l 3.464101 2.0000007z
          lineToRelative(dx = 3.464101f, dy = 2.0000007f)
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
      .also { _userSimulation = it }
  }

@Suppress("ObjectPropertyName")
private var _userSimulation: ImageVector? = null
