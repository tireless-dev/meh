// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloseOutline: ImageVector
  get() {
    val current = _closeOutline
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CloseOutline",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 C8.2 2 2 8.2 2 16 s6.2 14 14 14 14 -6.2 14 -14 S23.8 2 16 2 m0 26 C9.4 28 4 22.6 4 16 S9.4 4 16 4 s12 5.4 12 12 -5.4 12 -12 12
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // C 8.2 2 2 8.2 2 16
          curveTo(
            x1 = 8.2f,
            y1 = 2.0f,
            x2 = 2.0f,
            y2 = 8.2f,
            x3 = 2.0f,
            y3 = 16.0f,
          )
          // s 6.2 14 14 14
          reflectiveCurveToRelative(
            dx1 = 6.2f,
            dy1 = 14.0f,
            dx2 = 14.0f,
            dy2 = 14.0f,
          )
          // s 14 -6.2 14 -14
          reflectiveCurveToRelative(
            dx1 = 14.0f,
            dy1 = -6.2f,
            dx2 = 14.0f,
            dy2 = -14.0f,
          )
          // S 23.8 2 16 2
          reflectiveCurveTo(
            x1 = 23.8f,
            y1 = 2.0f,
            x2 = 16.0f,
            y2 = 2.0f,
          )
          // m 0 26
          moveToRelative(dx = 0.0f, dy = 26.0f)
          // C 9.4 28 4 22.6 4 16
          curveTo(
            x1 = 9.4f,
            y1 = 28.0f,
            x2 = 4.0f,
            y2 = 22.6f,
            x3 = 4.0f,
            y3 = 16.0f,
          )
          // S 9.4 4 16 4
          reflectiveCurveTo(
            x1 = 9.4f,
            y1 = 4.0f,
            x2 = 16.0f,
            y2 = 4.0f,
          )
          // s 12 5.4 12 12
          reflectiveCurveToRelative(
            dx1 = 12.0f,
            dy1 = 5.4f,
            dx2 = 12.0f,
            dy2 = 12.0f,
          )
          // s -5.4 12 -12 12
          reflectiveCurveToRelative(
            dx1 = -5.4f,
            dy1 = 12.0f,
            dx2 = -12.0f,
            dy2 = 12.0f,
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
        // <polygon points="21.4 23.0 16.0 17.6 10.6 23.0 9.0 21.4 14.4 16.0 9.0 10.6 10.6 9.0 16.0 14.4 21.4 9.0 23.0 10.6 17.6 16.0 23.0 21.4" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.4 23
          moveTo(x = 21.4f, y = 23.0f)
          // L 16 17.6
          lineTo(x = 16.0f, y = 17.6f)
          // L 10.6 23
          lineTo(x = 10.6f, y = 23.0f)
          // L 9 21.4
          lineTo(x = 9.0f, y = 21.4f)
          // L 14.4 16
          lineTo(x = 14.4f, y = 16.0f)
          // L 9 10.6
          lineTo(x = 9.0f, y = 10.6f)
          // L 10.6 9
          lineTo(x = 10.6f, y = 9.0f)
          // L 16 14.4
          lineTo(x = 16.0f, y = 14.4f)
          // L 21.4 9
          lineTo(x = 21.4f, y = 9.0f)
          // L 23 10.6
          lineTo(x = 23.0f, y = 10.6f)
          // L 17.6 16
          lineTo(x = 17.6f, y = 16.0f)
          // L 23 21.4z
          lineTo(x = 23.0f, y = 21.4f)
          close()
        }
      }.build()
      .also { _closeOutline = it }
  }

@Suppress("ObjectPropertyName")
private var _closeOutline: ImageVector? = null
