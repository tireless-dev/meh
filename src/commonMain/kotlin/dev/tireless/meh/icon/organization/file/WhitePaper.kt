// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WhitePaper: ImageVector
  get() {
    val current = _whitePaper
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WhitePaper",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="22.0 27.1798 19.41 24.5899 18.0 26.0 22.0 30.0 30.0 22.0 28.5899 20.59 22.0 27.1798" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 27.1798
          moveTo(x = 22.0f, y = 27.1798f)
          // L 19.41 24.5899
          lineTo(x = 19.41f, y = 24.5899f)
          // L 18 26
          lineTo(x = 18.0f, y = 26.0f)
          // L 22 30
          lineTo(x = 22.0f, y = 30.0f)
          // L 30 22
          lineTo(x = 30.0f, y = 22.0f)
          // L 28.5899 20.59
          lineTo(x = 28.5899f, y = 20.59f)
          // L 22 27.1798z
          lineTo(x = 22.0f, y = 27.1798f)
          close()
        }
        // <rect width="7" height="2" x="9.0" y="17.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 17
          moveTo(x = 9.0f, y = 17.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // <rect width="12" height="2" x="9.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 12
          moveTo(x = 9.0f, y = 12.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // <rect width="12" height="2" x="9.0" y="7.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 7
          moveTo(x = 9.0f, y = 7.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // M16 30 H6 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h18 a2 2 0 0 1 2 2 v15 h-2 V4 H6 v24 h10z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
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
          // V 4
          verticalLineTo(y = 4.0f)
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
          // h 18
          horizontalLineToRelative(dx = 18.0f)
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
          // v 15
          verticalLineToRelative(dy = 15.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
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
      .also { _whitePaper = it }
  }

@Suppress("ObjectPropertyName")
private var _whitePaper: ImageVector? = null
