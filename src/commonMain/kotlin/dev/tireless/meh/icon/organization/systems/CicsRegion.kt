// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CicsRegion: ImageVector
  get() {
    val current = _cicsRegion
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CicsRegion",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="23.5 18.0 21.0 18.7 21.0 16.0 19.0 16.0 19.0 18.7 16.5 18.0 16.0 19.9 18.4 20.6 17.0 23.0 18.7 24.0 20.0 21.8 21.3 24.0 23.0 23.0 21.6 20.6 24.0 19.9 23.5 18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.5 18
          moveTo(x = 23.5f, y = 18.0f)
          // L 21 18.7
          lineTo(x = 21.0f, y = 18.7f)
          // L 21 16
          lineTo(x = 21.0f, y = 16.0f)
          // L 19 16
          lineTo(x = 19.0f, y = 16.0f)
          // L 19 18.7
          lineTo(x = 19.0f, y = 18.7f)
          // L 16.5 18
          lineTo(x = 16.5f, y = 18.0f)
          // L 16 19.9
          lineTo(x = 16.0f, y = 19.9f)
          // L 18.4 20.6
          lineTo(x = 18.4f, y = 20.6f)
          // L 17 23
          lineTo(x = 17.0f, y = 23.0f)
          // L 18.7 24
          lineTo(x = 18.7f, y = 24.0f)
          // L 20 21.8
          lineTo(x = 20.0f, y = 21.8f)
          // L 21.3 24
          lineTo(x = 21.3f, y = 24.0f)
          // L 23 23
          lineTo(x = 23.0f, y = 23.0f)
          // L 21.6 20.6
          lineTo(x = 21.6f, y = 20.6f)
          // L 24 19.9
          lineTo(x = 24.0f, y = 19.9f)
          // L 23.5 18z
          lineTo(x = 23.5f, y = 18.0f)
          close()
        }
        // <polygon points="16.0 13.0 16.0 11.0 13.0 11.0 13.0 8.0 11.0 8.0 11.0 11.0 8.0 11.0 8.0 13.0 11.0 13.0 11.0 16.0 13.0 16.0 13.0 13.0 16.0 13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 13
          moveTo(x = 16.0f, y = 13.0f)
          // L 16 11
          lineTo(x = 16.0f, y = 11.0f)
          // L 13 11
          lineTo(x = 13.0f, y = 11.0f)
          // L 13 8
          lineTo(x = 13.0f, y = 8.0f)
          // L 11 8
          lineTo(x = 11.0f, y = 8.0f)
          // L 11 11
          lineTo(x = 11.0f, y = 11.0f)
          // L 8 11
          lineTo(x = 8.0f, y = 11.0f)
          // L 8 13
          lineTo(x = 8.0f, y = 13.0f)
          // L 11 13
          lineTo(x = 11.0f, y = 13.0f)
          // L 11 16
          lineTo(x = 11.0f, y = 16.0f)
          // L 13 16
          lineTo(x = 13.0f, y = 16.0f)
          // L 13 13
          lineTo(x = 13.0f, y = 13.0f)
          // L 16 13z
          lineTo(x = 16.0f, y = 13.0f)
          close()
        }
        // M26 4 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 M6 26 V6 h20 v20Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 4
          moveTo(x = 26.0f, y = 4.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // M 6 26
          moveTo(x = 6.0f, y = 26.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 20z
          verticalLineToRelative(dy = 20.0f)
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
      .also { _cicsRegion = it }
  }

@Suppress("ObjectPropertyName")
private var _cicsRegion: ImageVector? = null
