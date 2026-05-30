// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MediaLibrary: ImageVector
  get() {
    val current = _mediaLibrary
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MediaLibrary",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="13.0 15.0 13.0 23.0 13.0 23.0 20.0 19.0 13.0 15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 15
          moveTo(x = 13.0f, y = 15.0f)
          // L 13 23
          lineTo(x = 13.0f, y = 23.0f)
          // L 13 23
          lineTo(x = 13.0f, y = 23.0f)
          // L 20 19
          lineTo(x = 20.0f, y = 19.0f)
          // L 13 15z
          lineTo(x = 13.0f, y = 15.0f)
          close()
        }
        // M26 28 H6 a2 2 0 0 1 -2 -2 V12 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v14 a2 2 0 0 1 -2 2 M6 12 v14 h20 V12Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 28
          moveTo(x = 26.0f, y = 28.0f)
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
          // V 12
          verticalLineTo(y = 12.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // v 14
          verticalLineToRelative(dy = 14.0f)
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
          // M 6 12
          moveTo(x = 6.0f, y = 12.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // V 12z
          verticalLineTo(y = 12.0f)
          close()
        }
        // <rect width="20" height="2" x="6.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 6
          moveTo(x = 6.0f, y = 6.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -20z
          horizontalLineToRelative(dx = -20.0f)
          close()
        }
        // <rect width="16" height="2" x="8.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 2
          moveTo(x = 8.0f, y = 2.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -16z
          horizontalLineToRelative(dx = -16.0f)
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
      .also { _mediaLibrary = it }
  }

@Suppress("ObjectPropertyName")
private var _mediaLibrary: ImageVector? = null
