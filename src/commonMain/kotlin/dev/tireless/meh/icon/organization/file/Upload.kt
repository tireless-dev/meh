// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Upload: ImageVector
  get() {
    val current = _upload
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Upload",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="6.0 18.0 7.41 19.41 15.0 11.83 15.0 30.0 17.0 30.0 17.0 11.83 24.59 19.41 26.0 18.0 16.0 8.0 6.0 18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 18
          moveTo(x = 6.0f, y = 18.0f)
          // L 7.41 19.41
          lineTo(x = 7.41f, y = 19.41f)
          // L 15 11.83
          lineTo(x = 15.0f, y = 11.83f)
          // L 15 30
          lineTo(x = 15.0f, y = 30.0f)
          // L 17 30
          lineTo(x = 17.0f, y = 30.0f)
          // L 17 11.83
          lineTo(x = 17.0f, y = 11.83f)
          // L 24.59 19.41
          lineTo(x = 24.59f, y = 19.41f)
          // L 26 18
          lineTo(x = 26.0f, y = 18.0f)
          // L 16 8
          lineTo(x = 16.0f, y = 8.0f)
          // L 6 18z
          lineTo(x = 6.0f, y = 18.0f)
          close()
        }
        // M6 8 V4 h20 v4 h2 V4 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 8
          moveTo(x = 6.0f, y = 8.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // v 4z
          verticalLineToRelative(dy = 4.0f)
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
      .also { _upload = it }
  }

@Suppress("ObjectPropertyName")
private var _upload: ImageVector? = null
