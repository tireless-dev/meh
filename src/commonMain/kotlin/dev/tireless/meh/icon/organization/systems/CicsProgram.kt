// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CicsProgram: ImageVector
  get() {
    val current = _cicsProgram
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CicsProgram",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="20.17 19.0 17.58 21.59 19.0 23.0 23.0 19.0 19.0 15.0 17.58 16.41 20.17 19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.17 19
          moveTo(x = 20.17f, y = 19.0f)
          // L 17.58 21.59
          lineTo(x = 17.58f, y = 21.59f)
          // L 19 23
          lineTo(x = 19.0f, y = 23.0f)
          // L 23 19
          lineTo(x = 23.0f, y = 19.0f)
          // L 19 15
          lineTo(x = 19.0f, y = 15.0f)
          // L 17.58 16.41
          lineTo(x = 17.58f, y = 16.41f)
          // L 20.17 19z
          lineTo(x = 20.17f, y = 19.0f)
          close()
        }
        // <polygon points="11.83 19.0 14.42 16.41 13.0 15.0 9.0 19.0 13.0 23.0 14.42 21.59 11.83 19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.83 19
          moveTo(x = 11.83f, y = 19.0f)
          // L 14.42 16.41
          lineTo(x = 14.42f, y = 16.41f)
          // L 13 15
          lineTo(x = 13.0f, y = 15.0f)
          // L 9 19
          lineTo(x = 9.0f, y = 19.0f)
          // L 13 23
          lineTo(x = 13.0f, y = 23.0f)
          // L 14.42 21.59
          lineTo(x = 14.42f, y = 21.59f)
          // L 11.83 19z
          lineTo(x = 11.83f, y = 19.0f)
          close()
        }
        // <circle cx="9.0" cy="8.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 8
          moveTo(x = 9.0f, y = 8.0f)
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
        // <circle cx="6.0" cy="8.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 8
          moveTo(x = 6.0f, y = 8.0f)
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
        // M28 4 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 m0 2 v4 H4 V6z M4 26 V12 h24 v14z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 4
          moveTo(x = 28.0f, y = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // V 6
          verticalLineTo(y = 6.0f)
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
          // m 0 2
          moveToRelative(dx = 0.0f, dy = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // M 4 26
          moveTo(x = 4.0f, y = 26.0f)
          // V 12
          verticalLineTo(y = 12.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v 14z
          verticalLineToRelative(dy = 14.0f)
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
      .also { _cicsProgram = it }
  }

@Suppress("ObjectPropertyName")
private var _cicsProgram: ImageVector? = null
